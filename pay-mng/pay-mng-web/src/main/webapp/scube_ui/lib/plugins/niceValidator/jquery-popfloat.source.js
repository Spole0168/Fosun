/**
 * jquery-float.js jQuery div © by xiangsl 2015-2-01 v1.0.0 common float,now
 * only support single div on single HTML Element
 */
(function($) {
	var defaults = {
		width : "auto", // option params：inherit (px)
		offsets : {
			x : 0,
			y : 0
		},
		zIndex : 2100,
		targetMode : "common", // option params：ajax, list, remind,null
		target : null, // target object source，priority get，if null，get from
		// targetAttr
		targetAttr : "rel", // target object source
		container : null, // target contriner，if null or plugin，meaning use
		// default
		reverseSharp : false, // if use triangle
		position : "4-1", // trigger-target position
		edgeAdjust : false,
		bindType : null, //close function
		bindCall : null //close function
	};
	/**
	 * div remove
	 */
	$.fn.floatRemove = function() {
		return $(this).each(function() {
			if (this.o && null != this.o && this.o.s && null != this.o.s) {
				if(this.o.s.container&&null!=this.o.s.container){
					this.o.s.container.remove();
				}
			}
			if (this.o && null != this.o && this.o.corner && null != this.o.corner) {
				this.o.corner.remove();
			}
			if (this.o && null != this.o) {
				this.o = null;
			}
		})
	};
	$.fn.clearFloat = function(id){
		var temp=this;
		return $(this).each(function() {
			//如果没有传入id，则认为当前元素为form
			if(id&&null!=id&&""!=id){
			}else{
				id=$(temp).attr("id");
			}
			$("[relform="+id+"]").remove();
		})
	}
	/**
	 * div hidden
	 */
	$.fn.floatHidden = function() {
		return $(this).each(function() {
			if (this.o && null != this.o && this.o.s && null != this.o.s) {
				this.o.s.container.hide();
			}
			if (this.o && null != this.o && this.o.corner && null != this.o.corner) {
				this.o.corner.hide();
			}
		})
	};
	/**
	 * div pop
	 */
	$.fn.popFloat = function(options) {
		return $(this).each(function() {
			var s = $.extend({}, defaults, options || {});
			if (!this.o) {
				this.o = new floatFun();
				this.o.s = s;
				this.o.trigger = $(this);
				this.o.pform=$(this).parents("form").attr("id");
				this.o.relid=$(this).attr("id");
			}
			this.o.targetGet();
			$(document).unbind("mouseup").data("mouseupBind", false);
		});
	};
	/**
	 * floatFun fun define
	 */
	var floatFun = function() {
		this.targetGet = function() {
			if (!this.trigger) {
				return this;
			}
			var attr = this.trigger.attr(this.s.targetAttr);
			var target = typeof this.s.target == "function" ? this.s.target.call(this.trigger) : this.s.target;

			switch (this.s.targetMode) {
			case "common": {
				if (target) {
					var type = typeof (target);
					if (type === "object") {
						if (target.size()) {
							this.target = target.eq(0);
						}
					} else if (type === "string") {
						if ($(target).size()) {
							this.target = $(target).eq(0);
						}
					}
				} else {
					if (attr && $("#" + attr).size()) {
						this.target = $("#" + attr);
					}
				}
				if (this.target) {
					this.targetShow();
				} else {
					return this;
				}
				break;
			}
			case "ajax": {
				var url = target || attr;
				if (!url) {
					return;
				}
				if (!this.cacheData[url]) {
					this.loading();
				}
				var me = this;
				$.ajax({
					url : url,
					success : function(data) {
						if (typeof (data) === "string") {
							me.cacheData[url] = true;
							me.target = $('<div class="float_ajax_data">' + data + '</div>');
							me.targetShow();
						}
					},
					error : function() {
						me.target = $('<div class="float_ajax_error">数据没有加载成功。</div>');
						me.targetShow();
					}
				});
				break;
			}
			case "list": {
				// 下拉列表
				var targetHtml = '<ul class="float_list_ul">', arrLength;
				if ($.isArray(target) && (arrLength = target.length)) {
					$.each(target, function(i, obj) {
						var list = "", strClass = "", text, href;
						if (i === 0) {
							strClass = ' class="float_list_li_first"';
						}
						if (i === arrLength - 1) {
							strClass = ' class="float_list_li_last"';
						}
						if (typeof (obj) === "object" && (text = obj.text.toString())) {
							if (href = (obj.href || "javascript:")) {
								list = '<a href="' + href + '" class="float_list_a">' + text + '</a>';
							} else {
								list = text;
							}
						} else if (typeof (obj) === "string" && obj) {
							list = obj;
						}
						if (list) {
							targetHtml += '<li' + strClass + '>' + list + '</li>';
						}
					});
				} else {
					targetHtml += '<li class="float_list_null">列表无数据。</li>';
				}
				targetHtml += '</ul>';
				this.target = $(targetHtml);
				this.targetShow();
				break;
			}
			case "remind": {
				// 内容均是字符串
				var strRemind = target || attr;
				if (typeof (strRemind) === "string") {
					this.target = $('<span>' + strRemind + '</span>');
					this.targetShow();
				}
				break;
			}
			default: {
				var objOther = target || attr, type = typeof (objOther);
				if (objOther) {
					if (type === "string") {
						if (/^.[^:#\[\.,]*$/.test(objOther)) {
							if ($(objOther).size()) {
								this.target = $(objOther).eq(0);
								this.targetProtect = true;
							} else if ($("#" + objOther).size()) {
								this.target = $("#" + objOther).eq(0);
								this.targetProtect = true;
							} else {
								this.target = $('<div>' + objOther + '</div>');
								this.targetProtect = false;
							}
						} else {
							this.target = $('<div>' + objOther + '</div>');
							this.targetProtect = false;
						}
						this.targetShow();
					} else if (type === "object") {
						if (!$.isArray(objOther) && objOther.size()) {
							this.target = objOther.eq(0);
							this.targetProtect = true;
							this.targetShow();
						}
					}
				}
			}
			}
			return this;
		};
		this.container = function() {
			// 容器(如果有)重装target
			var cont = this.s.container, mode = this.s.targetMode || "mode";
			if (mode === "ajax" || mode === "remind") {
				// 显示三角
				this.s.sharpAngle = true;
			} else {
				this.s.sharpAngle = false;
			}
			// 是否反向
			if (this.s.reverseSharp) {
				this.s.sharpAngle = !this.s.sharpAngle;
			}

			// common模式无新容器装载
			if (cont === null) {
				cont = "plugin";
			}
			if (cont == "plugin") {
				var random = parseInt(Math.random() * 10000000 + 1);
				var contains = $("#floatBox_" + mode + random);
				while (contains.length > 0) {
					random = parseInt(Math.random() * 10000000 + 1);
					contains = $("#floatBox_" + mode + random);
				}
				cont = $('<div id="floatBox_' + mode + random + '" relform="'+this.pform+'" relid="'+this.relid+'" class="float_' + mode + '_box"></div>');
				cont.appendTo($("body")).hide();
				this.s.container = $("#floatBox_" + mode + random);
				if(null!=this.s.bindType&&null!=null!=this.s.bindCall){
					var bindCall=this.s.bindCall;
					var parent=this.trigger;
					this.s.container.bind(this.s.bindType,function(){
						bindCall(parent);
					})
				}
			}

			if (cont && typeof (cont) !== "string" && cont.size()) {
				this.target = cont.empty().append(this.target);
			}
			return this;
		};
		this.setWidth = function() {
			var w = this.s.width;
			if (w === "auto") {
				if (this.target.get(0).style.width) {
					this.target.css("width", "auto");
				}
			} else if (w === "inherit") {
				this.target.width(this.trigger.width());
			} else {
				this.target.css("width", w);
			}
			return this;
		};
		this.position = function() {
			if (!this.trigger || !this.target) {
				return this;
			}
			var pos, tri_h = 0, tri_w = 0, cor_w = 0, cor_h = 0, tri_l, tri_t, tar_l, tar_t, cor_l, cor_t, tar_h = this.target.data("height"), tar_w = this.target.data("width"), st = $(window).scrollTop(),

			off_x = parseInt(this.s.offsets.x, 10) || 0, off_y = parseInt(this.s.offsets.y, 10) || 0, mousePos = this.cacheData;

			// 缓存目标对象高度，宽度，提高鼠标跟随时显示性能，元素隐藏时缓存清除
			if (!tar_h) {
				tar_h = this.target.outerHeight();
			}
			if (!tar_w) {
				tar_w = this.target.outerWidth();
			}

			pos = this.trigger.offset();
			tri_h = this.trigger.outerHeight();
			tri_w = this.trigger.outerWidth();
			tri_l = pos.left;
			tri_t = pos.top;

			var funMouseL = function() {
				if (tri_l < 0) {
					tri_l = 0;
				} else if (tri_l + tri_h > $(window).width()) {
					tri_l = $(window).width() - tri_w;
				}
			}, funMouseT = function() {
				if (tri_t < 0) {
					tri_t = 0;
				} else if (tri_t + tri_h > $(document).height()) {
					tri_t = $(document).height() - tri_h;
				}
			};
			var arrLegalPos = [ "4-1", "1-4", "5-7", "2-3", "2-1", "6-8", "3-4", "4-3", "8-6", "1-2", "7-5", "3-2" ], align = this.s.position, alignMatch = false, strDirect;
			$.each(arrLegalPos, function(i, n) {
				if (n === align) {
					alignMatch = true;
					return;
				}
			});
			if (!alignMatch) {
				align = "4-1";
			}

			var funDirect = function(a) {
				var dir = "bottom";
				// 确定方向
				switch (a) {
				case "1-4":
				case "5-7":
				case "2-3": {
					dir = "top";
					break;
				}
				case "2-1":
				case "6-8":
				case "3-4": {
					dir = "right";
					break;
				}
				case "1-2":
				case "8-6":
				case "4-3": {
					dir = "left";
					break;
				}
				case "4-1":
				case "7-5":
				case "3-2": {
					dir = "bottom";
					break;
				}
				}
				return dir;
			};

			// 居中判断
			var funCenterJudge = function(a) {
				if (a === "5-7" || a === "6-8" || a === "8-6" || a === "7-5") {
					return true;
				}
				return false;
			};

			var funJudge = function(dir) {
				var totalHeight = 0, totalWidth = 0, flagCorner = (this.s.sharpAngle && this.corner) ? true : false;
				if (dir === "right") {
					totalWidth = tri_l + tri_w + tar_w + off_x;
					if (flagCorner) {
						totalWidth += this.corner.width();
					}
					if (totalWidth > $(window).width()) {
						return false;
					}
				} else if (dir === "bottom") {
					totalHeight = tri_t + tri_h + tar_h + off_y;
					if (flagCorner) {
						totalHeight += this.corner.height();
					}
					if (totalHeight > st + $(window).height()) {
						return false;
					}
				} else if (dir === "top") {
					totalHeight = tar_h + off_y;
					if (flagCorner) {
						totalHeight += this.corner.height();
					}
					if (totalHeight > tri_t - st) {
						return false;
					}
				} else if (dir === "left") {
					totalWidth = tar_w + off_x;
					if (flagCorner) {
						totalWidth += this.corner.width();
					}
					if (totalWidth > tri_l) {
						return false;
					}
				}
				return true;
			};
			// 此时的方向
			strDirect = funDirect(align);

			if (this.s.sharpAngle) {
				// 创建尖角
				this.createSharp(strDirect);
			}

			// 边缘过界判断
			if (this.s.edgeAdjust) {
				// 根据位置是否溢出显示界面重新判定定位
				if (funJudge.call(this, strDirect)) {
					// 该方向不溢出
					(function(thisObj) {
						if (funCenterJudge(align)) {
							return;
						}
						var obj = {
							top : {
								right : "2-3",
								left : "1-4"
							},
							right : {
								top : "2-1",
								bottom : "3-4"
							},
							bottom : {
								right : "3-2",
								left : "4-1"
							},
							left : {
								top : "1-2",
								bottom : "4-3"
							}
						};
						var o = obj[strDirect], name;
						if (o) {
							for (name in o) {
								if (!funJudge.call(thisObj, name)) {
									align = o[name];
								}
							}
						}
					})(this);
				} else {
					// 该方向溢出
					(function(thisObj) {
						if (funCenterJudge(align)) {
							var center = {
								"5-7" : "7-5",
								"7-5" : "5-7",
								"6-8" : "8-6",
								"8-6" : "6-8"
							};
							align = center[align];
						} else {
							var obj = {
								top : {
									left : "3-2",
									right : "4-1"
								},
								right : {
									bottom : "1-2",
									top : "4-3"
								},
								bottom : {
									left : "2-3",
									right : "1-4"
								},
								left : {
									bottom : "2-1",
									top : "3-4"
								}
							};
							var o = obj[strDirect], arr = [];
							for (name in o) {
								arr.push(name);
							}
							if (funJudge.call(thisObj, arr[0]) || !funJudge.call(thisObj, arr[1])) {
								align = o[arr[0]];
							} else {
								align = o[arr[1]];
							}
						}
					})(this);
				}
			}

			// 已确定的尖角
			var strNewDirect = funDirect(align), strFirst = align.split("-")[0];
			if (this.s.sharpAngle) {
				// 创建尖角
				this.createSharp(strNewDirect);
				cor_w = this.corner.width(), cor_h = this.corner.height();
			}

			// 确定left, top值

			switch (strNewDirect) {
			case "top": {
				tar_t = tri_t - off_y - tar_h - cor_h;
				if (strFirst == "1") {
					tar_l = tri_l - off_x;
				} else if (strFirst === "5") {
					tar_l = tri_l - (tar_w - tri_w) / 2 - off_x;
				} else {
					tar_l = tri_l - (tar_w - tri_w) - off_x;
				}
				cor_t = tri_t - cor_h - off_y - 1;
				cor_l = tri_l - (cor_w - tri_w) / 2;
				break;
			}
			case "right": {
				tar_l = tri_l + tri_w + off_x + cor_w;
				if (strFirst == "2") {
					tar_t = tri_t + off_y;
				} else if (strFirst === "6") {
					tar_t = tri_t - (tar_h - tri_h) / 2 + off_y;
				} else {
					tar_t = tri_t - (tar_h - tri_h) + off_y;
				}
				cor_l = tri_l + tri_w + off_x + 1;
				cor_t = tri_t - (cor_h - tri_h) / 2;
				break;
			}
			case "bottom": {
				tar_t = tri_t + tri_h + off_y + cor_h;
				if (strFirst == "4") {
					tar_l = tri_l + off_x;
				} else if (strFirst === "7") {
					tar_l = tri_l - (tar_w - tri_w) / 2 + off_x;
				} else {
					tar_l = tri_l - (tar_w - tri_w) + off_x;
				}
				cor_t = tri_t + tri_h + off_y + 1;
				cor_l = tri_l - (cor_w - tri_w) / 2;
				break;
			}
			case "left": {
				tar_l = tri_l - tar_w - off_x - cor_w;
				if (strFirst == "2") {
					tar_t = tri_t - off_y;
				} else if (strFirst === "6") {
					tar_t = tri_t - (tar_w - tri_w) / 2 - off_y;
				} else {
					tar_t = tri_t - (tar_h - tri_h) - off_y;
				}
				cor_l = tar_l + cor_w;
				cor_t = tri_t - (tar_w - cor_w) / 2;
				break;
			}
			}
			// 浮动框显示
			this.target.css({
				position : "absolute",
				left : tar_l,
				top : tar_t,
				zIndex : this.s.zIndex
			});
			tar_w = this.target.outerWidth();
			cor_w_t = this.corner.outerWidth();
			switch (strNewDirect) {
			   case "top": {
					// 尖角的显示
					if (cor_h && cor_w && this.corner) {
						this.corner.css({
							left : tar_l+tar_w/2-cor_w_t/2,
							top : cor_t,
							zIndex : this.s.zIndex + 1
						});
					}
					break;
			   }
			   case "bottom": {
					// 尖角的显示
					if (cor_h && cor_w && this.corner) {
						this.corner.css({
							left : tar_l+tar_w/2-cor_w_t/2,
							top : cor_t,
							zIndex : this.s.zIndex + 1
						});
					}
					break;
			   }
			   default: {
					// 尖角的显示
					if (cor_h && cor_w && this.corner) {
						this.corner.css({
							left : cor_l,
							top : cor_t,
							zIndex : this.s.zIndex + 1
						});
					}
			   }
			}
			return this;
		};
		this.createSharp = function(dir) {
			var bgColor, bdColor, color1 = "", color2 = "";
			var objReverse = {
				left : "right",
				right : "left",
				bottom : "top",
				top : "bottom"
			}, dirReverse = objReverse[dir] || "top";

			if (this.target) {
				bgColor = this.target.css("background-color");
				if (parseInt(this.target.css("border-" + dirReverse + "-width")) > 0) {
					bdColor = this.target.css("border-" + dirReverse + "-color");
				}

				if (bdColor && bdColor !== "transparent") {
					color1 = 'style="color:' + bdColor + ';"';
				} else {
					color1 = 'style="display:none;"';
				}
				if (bgColor && bgColor !== "transparent") {
					color2 = 'style="color:' + bgColor + ';"';
				} else {
					color2 = 'style="display:none;"';
				}
			}
			if (!this.corner || null == this.corner) {
				var random = parseInt(Math.random() * 10000000 + 1);
				var corners = $("#floatCorner_" + dir + random);
				while (corners.length > 0) {
					random = parseInt(Math.random() * 10000000 + 1);
					corners = $("#floatCorner_" + dir + random);
				}
				var html = '<div id="floatCorner_' + dir + random + '"'+' relform="'+this.pform+'" relid="'+this.relid+'" class="float_corner float_corner_' + dir + '">' + '<span class="corner corner_1" ' + color1 + '>◆</span>' + '<span class="corner corner_2" ' + color2 + '>◆</span>' + '</div>';
				$("body").append($(html));
				this.corner = $("#floatCorner_" + dir + random);
				;
			}
			return this;
		};
		this.loading = function() {
			this.target = $('<div class="float_loading"></div>');
			this.targetShow();
			this.target.removeData("width").removeData("height");
			return this;
		};
		this.targetShow = function() {
			this.container().setWidth().position();
			this.target.show();
			if(this.corner){
				this.corner.show();
			}
			return this;
		};
		this.target = null;
		this.trigger = null;
		this.s = {};
		this.cacheData = {};
	};
	$.popFloat = {};
})(jQuery);