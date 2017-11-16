/*
 * tH5.js 基于JS 自动创建影像浏览控件脚本
 * by TXH 2016-T2
*/

var TH5 = {
    /* 参数分界线 */
    buildStatus: false,             //控件是否创建完成
	buildPane: null,				//控件所在区域
    buildW: 600,                    //控件总宽度
    buildH: 600,                    //控件总高度
    //blW: 100,                       //控件左边浏览栏宽度
    brsH: 50,                       //控件右边搜索栏高度
    btW: 110,                       //控件标签栏宽
    btH: 100,                       //控件标签栏高
    btZ: 5,                         //控件标签栏间距
    btB: 50,                        //控件标签栏左右箭头宽度
    btNum: 0,                       //控件标签数
	fileFilter: [],					//过滤后的文件数组
	filter: function(files) {		//选择文件组的过滤方法
		return files;	
	},
	onSelect: function() {},		//文件选择后
	onDelete: function() {},		//文件删除后
    onActDevice: function(p){},		//激活设备
    onSwitch: function() {},        //切换事件

    activeName: "",                 //按钮名称 - 获取影像
    onAction: function(){},           //获取影像实践

    _h: null,
    /*
     url: "",						//ajax地址
	 onDragOver: function() {},		//文件拖拽到敏感区域时
	 onDragLeave: function() {},	//文件离开到敏感区域时
     onProgress: function() {},		//文件上传进度
     onSuccess: function() {},		//文件上传成功时
     onFailure: function() {},		//文件上传失败时,
     onComplete: function() {},		//文件全部上传完毕时
	*/


	/* 控件创建分界线 */

    /**
     * 对外接口 - 影像件浏览控件 - 创建
     * @param p 控件所创建区域
     * @param param - {w: 控件总宽, h: 控件总高}
     */
    createImgNav: function ( param, p) {
        var t = null;
        if(param){
            this.buildW = param.buildW || this.buildW;
            this.buildH = param.buildH || this.buildH;
            this.buildPane = param.buildPane || this.buildPane;
            this.brsH = param.brsH || this.brsH;
            this.btW = param.btW || this.btW;
            this.btH = param.btH || this.btH;
            this.btZ = param.btZ || this.btZ;
        }

        if (p) {
            t = document.getElementById(p);
        }else{
            if (this.buildPane) {
                t = this.buildPane;
            } else {
                t = document.getElementsByTagName('body')[0];
            }
        }
        if(t == null){
            return;
        }

        var hu = document.createElement("ul");
        var navgH = this.btZ*2 + this.btH;
        var navgW = this.buildW - (this.btB)*2;
        this.btNum = parseInt(navgW/this.btW);
        var navgW = this.btNum * (this.btW+10);
        var navgBW =  (this.buildW-navgW)/2 - 2;
        var h = document.createElement("div");
        h.className = "navg";
        h.style.width = navgW + "px";
        h.style.height = navgH + "px";
        h.appendChild(hu);
        /*
        var h = document.createElement("div");
        h.className = "history";
        h.style.width = this.blW + "px";
        h.style.height = this.buildH + "px";
        h.appendChild(hu);
        */
        this._h = hu;
        var bs = document.createElement("div");
        bs.className = "search";
        bs.style.height = this.brsH + "px";
        bs.innerHTML =
            "&nbsp;<span class='switch img' onclick=\"TH5.onSwitch()\"></span>" +
            "&nbsp;<span class='zoomin img' onclick=\"TH5.zoomIn()\"></span>" +
            "&nbsp;<span class='zoomout img' onclick=\"TH5.zoomOut()\"></span>" +
            "&nbsp;<span class='toR img' onclick=\"TH5.rotateChange()\"></span>" +
            "&nbsp;<span class='toL img' onclick=\"TH5.rotateChangeZ()\"></span>";//<button type=\"button\" class=\"rotate\" onclick=\"TH5.rotateChange()\">旋转</button>&nbsp;<button type=\"button\" onclick=\"TH5.zoomOut()\">放大</button>&nbsp;<button type=\"button\" onclick=\"TH5.zoomIn()\">缩小</button>&nbsp;<button type=\"button\" onclick=\"TH5.lastPage()\">上页</button>&nbsp;<button type=\"button\" onclick=\"TH5.nextPage()\">下页</button>";
        if(this.activeName != ""){
            bs.innerHTML += "<button type='button' class='rotate' onclick='TH5.onAction()'>"+this.activeName+"</button>";
        }
        /*
		var btr = document.createElement("canvas");
        btr.setAttribute("id", "canvasRotate");
        btr.className = "canvasRotate";
        btr.style.display = "none";
		*/
        var btm = document.createElement("div");
        btm.setAttribute("id", "canvasMain");
        btm.className = "canvasMain";
        btm.width = this.buildW - 10;
        btm.height = (this.buildH - this.brsH - 10 - 10 - 15 - navgH);//this.buildH - this.brsH - 10 - 10 - navgH;
		btm.ondblclick = this.onActDevice;

        //_START 影像拖动
        /*
         var selectIndex, _wX = 0, _wY = 0;
         var drag = false;
         var oPos = {};
         var canvasMainW = btm.width;
         var canvasMainH = btm.height;
         btm.onmousemove = function (e) {
         if (!drag) {
         return;
         }
         _wX += e.layerX - oPos.x;
         _wY += e.layerY - oPos.y;
         if(_wX > 0){_wX = 0;}
         if(_wY > 0){_wY = 0;}
         if(_wX == 0 && _wY == 0){return;}
         var obj = e.target;
         obj = TH5.getCanvas(obj);
         var cxt = obj.getContext("2d");
         var img = new Image();
         var imgRoate;
         if(TH5.seleImgRoate){
         img.src = TH5.seleImgRoate.src;
         }else{
         img.src = TH5.seleImg.src;
         }
         img.onload = function (e) {
         var w = img.width * TH5.zoom;
         var h = img.height * TH5.zoom;
         if(w > canvasMainW){
         if((_wX + w) < canvasMainW){
         _wX = canvasMainW - w;
         }
         }else{
         _wX = 0;
         }
         if(h > canvasMainH){
         if((_wY + h) < canvasMainH){
         _wY = canvasMainH - h;
         }
         }else{
         _wY = 0;
         }
         //console.log(_wX + "," + _wY + "," + w + "," + h + "," + (TH5.buildW - TH5.blW - 10) + "," + (TH5.buildH - TH5.brsH - 10 - 10));
         cxt.drawImage(img, _wX, _wY, w, h);
         };
         oPos = {
         x: e.layerX,
         y: e.layerY
         };
         };
         btm.onmousedown = function(e){
         if(selectIndex != TH5.selectIndex){
         selectIndex = TH5.selectIndex;
         _wX = 0;
         _wY = 0
         }
         drag = true;
         oPos = {
         x:e.layerX,
         y:e.layerY
         };
         };
         btm.onmouseup = function () {
         drag = false;
         };
         btm.onmouseout = function () {
         drag = false;
         };
         */
        //_END 影像拖动

        var bt = document.createElement("div");
        bt.className = "tuBody";
        //bt.style.width = this.buildW + "px";
        bt.style.height = (this.buildH - this.brsH - 10 - 5 - 5- navgH) + "px";
        //bt.appendChild(btr);
        bt.appendChild(btm);
        //bt.innerHTML = "<canvas class=\"canvasRotate\" id=\"canvasRotate\" style=\"DISPLAY: none\"></canvas><canvas class=\"canvasMain\" id=\"canvasMain\" width=\""+btm.width +"\" height=\""+btm.height+"\"></canvas>";
        var b = document.createElement("div");
        b.className = "body";
        b.style.width = this.buildW + "px";
        b.style.height = this.buildH + "px";
        b.appendChild(bs);
        b.appendChild(bt);

        var hbL = document.createElement("div");
        hbL.className = "navgButton";
        hbL.style.width = navgBW + "px";
        hbL.style.height = navgH + "px";
        var hbLm = document.createElement("div");
        hbLm.className = "imgL img";
        if(hbLm["attachEvent"] && typeof hbLm["attachEvent"] != "undefined"){
            hbLm.attachEvent("onclick",function(e){
                TH5.lastPage();
            });
        }else if(hbLm["onclick"] == null && typeof hbLm["onclick"] != "undefined"){
            hbLm.onclick = TH5.lastPage;
        }
        hbL.appendChild(hbLm);
        var hbR = document.createElement("div");
        hbR.className = "navgButton";
        hbR.style.width = navgBW + "px";
        hbR.style.height = navgH + "px";
        var hbRm = document.createElement("div");
        hbRm.className = "imgR img";
        if(hbRm["attachEvent"] && typeof hbRm["attachEvent"] != "undefined"){
            hbRm.attachEvent("onclick",function(e){
                TH5.nextPage();
            });
        }else if(hbRm["onclick"] == null && typeof hbRm["onclick"] != "undefined"){
            hbRm.onclick = TH5.nextPage;
        }
        hbR.appendChild(hbRm);

        b.appendChild(hbL);
        b.appendChild(h);
        b.appendChild(hbR);

        var n = document.createElement("div");
        n.className = "navImg";
        n.style.width = this.buildW + "px";
        n.style.height = this.buildH + "px";
        //n.appendChild(h);
        n.appendChild(b);

        t.appendChild(n);
        this.buildStatus = true;

		if (TH5.showCanvas == null) {
            TH5.showCanvas = Raphael("canvasMain", btm.width, btm.height);
        }
    },

    /**
     * 获取数组
     * @param p
     */
	getArry: function(p){
        var arrFiles = [], l = p.length;
        for (var i = 0, file; i < l; i++) {
            file = p[i];
            file["roate"] = file["roate"] || 0;
            arrFiles.push(file);
        }
        l = null;
        return arrFiles;
    },

    /**
     * 获取影像导航栏
     * @returns {*} 对象
     */
    getNavElement: function(){
        if(this._h == null) {
            return this._h;
        }else{
            return this._h;
        }
    },
	/**
     * 对外接口 - OCX - 传入图片数据
     * @param p
     */
    inFileOCX: function (f){
        if(f) {
            var h = this.getNavElement();
            if(h) {
                var fl = this.fileFilter.length;
                this.fileFilter = this.fileFilter.concat(this.getArry(f));
                var hW = 0, file, i = fl, l = this.fileFilter.length;
                for (; i < l; i++) {
                    file = this.fileFilter[i];
                    if (file) {
                        file["tabIndex"] = i;
                        var font = document.createElement("label");
                        font.innerHTML = "影像名";
                        var img = document.createElement("img");
                        img.tabIndex = i;
                        img.finished = false;
                        //img.crossOrigin = 'anonymous';
                        img.setAttribute('crossOrigin','anonymous');
                        img.roate = file["roate"] || 0;
                        img.style.width = (TH5.btW - 10) + "px";
                        img.style.height = (TH5.btH - 20) + "px";
                        /*img.src = e.target.result;*/
						if(img["attachEvent"] && typeof img["attachEvent"] != "undefined"){
							img.attachEvent("onclick",function(e){
								TH5.onImgSelect(e);
							});
						}else if(img["onclick"] == null && typeof img["onclick"] != "undefined"){
							img.onclick = TH5.onImgSelect;
						}
                        var li = document.createElement("li");
                        li.style.width = TH5.btW+ "px";
                        li.appendChild(img);
                        li.appendChild(font);
                        h.appendChild(li);
                        hW += (TH5.btW+10);

                        var reader = new FileReader();
                        reader.tuArm = img;
                        reader.onload = function (e) {
                            var t_t = e.target;
                            var t_a = t_t.tuArm;
                            t_a.src = t_t.result;
                            t_a.finished = true;
                            t_t = null;
                            t_a = null;
                        };
                        reader.readAsDataURL(file);
                    }
                }
                h.style.width = hW+20 + "px";
            }
            h = null;
        }
    },
	
	/**
     * 对外接口 - 在线模式 - 传入图片数据
     * @param p
     */
    inFileOnline: function (f){
        if(f) {
            var h = this.getNavElement();
            //debugger
            if(h) {
				var fl = this.fileFilter.length;
                this.fileFilter = this.fileFilter.concat(this.getArry(f));
                var hW = 0, file, i = fl, l = this.fileFilter.length;
                for (; i < l; i++) {
                    file = this.fileFilter[i];
                    if (file) {
                        file["tabIndex"] = i;
                        var font = document.createElement("label");
                        font.innerHTML = file["title"] || "";
                        var img = document.createElement("img");
                        img.tabIndex = i;
                        img.finished = false;
                        img.crossOrigin = 'anonymous';
                        //img.setAttribute('crossOrigin','anonymous');
                        img.roate = file["roate"] || 0;
                        img.style.width = (TH5.btW - 10) + "px";
                        img.style.height = (TH5.btH - 20) + "px";
                        img.src = file["img"] || "";
                        img.finished = true;
                        if(img["attachEvent"] && typeof img["attachEvent"] != "undefined"){
                            img.attachEvent("onclick",function(e){
                                TH5.onImgSelect(e);
                            });
                            img.attachEvent("onload", imgOnload);
                        }else if(img["onclick"] == null && typeof img["onclick"] != "undefined"){
                            img.onclick = TH5.onImgSelect;
                            img.onload = function(e){
                                var m = e.target;
                                if(m["roate"] && m["roate"] > 0) {
                                    //m.src = TH5.getRotateImg(m, m["roate"]);
                                    //m.onload = null;
                                    TH5.rotateChange(m["roate"]);
                                }
                            };
                        }
                        var li = document.createElement("li");
                        li.style.width = TH5.btW+ "px";
                        li.appendChild(img);
                        li.appendChild(font);
                        h.appendChild(li);
                        hW += (TH5.btW+10);
					/*
                        var reader = new FileReader();
                        reader.onload = function (e, n) {
                            var h = TH5.getNavElement();
                            var img = document.createElement("img");
                            img.tabIndex = n;
                            img.src = e.target.result;
                            img.onclick = TH5.onImgSelect;
                            var li = document.createElement("li");
                            li.appendChild(img);
                            h.appendChild(li);
                            h = null;
                        };
					*/
                    }
                }
                h.style.width = hW+20 + "px";
            }
            h = null;
        }
    },

    /**
     * 对外接口 - 在线模式 - 传入图片数据 - 先清除旧数据
     * @param p
     */
    inFileOnlineFireNew: function (f){
        if(f) {
            var h = this.getNavElement();
            if(h) {
                while (h.hasChildNodes()) {
                    h.removeChild(h.lastChild);
                }
                this.fileFilter = [];
                this.fileFilter = this.fileFilter.concat(this.getArry(f));
                var hW = 0, file, i = 0, l = this.fileFilter.length;
                for (; i < l; i++) {
                    file = this.fileFilter[i];
                    if (file) {
                        file["tabIndex"] = i;
                        var font = document.createElement("label");
                        font.innerHTML = file["title"] || "";
                        var img = document.createElement("img");
                        img.tabIndex = i;
                        img.finished = false;
                        img.crossOrigin = 'anonymous';
                        img.roate = file["roate"] || 0;
                        img.style.width = (TH5.btW - 10) + "px";
                        img.style.height = (TH5.btH - 20) + "px";
                        img.src = file["img"] || "";
                        img.finished = true;
                        if(img["attachEvent"] && typeof img["attachEvent"] != "undefined"){
                            img.attachEvent("onclick",function(e){
                                TH5.onImgSelect(e);
                            });
                            img.attachEvent("onload", imgOnload);
                        }else if(img["onclick"] == null && typeof img["onclick"] != "undefined"){
                            img.onclick = TH5.onImgSelect;
                            img.onload = function(e){
                                var m = e.target;
                                if(m["roate"] && m["roate"] > 0) {
                                    TH5.rotateChange(m["roate"]);
                                }
                            };
                        }
                        var li = document.createElement("li");
                        li.id = file["picId"];
                        li.style.width = TH5.btW+ "px";
                        li.appendChild(img);
                        li.appendChild(font);
                        h.appendChild(li);
                        hW += (TH5.btW+10);
                    }
                }
                h.style.width = hW+20 + "px";
            }
            h = null;
        }
    },

    /**
     * 清理标签
     */
    clearTabAll: function() {
        TH5.fileFilter = [];
        TH5.selectIndex= null;
        TH5.seleImg = null;
        TH5.seleCanvas= null;
        TH5.showCanvas = null;
        TH5.showContext = null;
        TH5.seleImgRoate = null;
        TH5.zoom = 1;
        TH5.rotate = 1;
        var _th = TH5._h;
        while(_th.childElementCount>0){
            _th.removeChild(_th.firstElementChild);
        }
        _th = null;
        if (TH5.showCanvas == null) {
			/*
            TH5.showCanvas = document.getElementById('canvasMain');
			TH5.showCanvas = TH5.getCanvas(TH5.showCanvas);
            TH5.showContext = TH5.showCanvas.getContext('2d');
			*/
        }
        TH5.showContext.fillStyle = "#fff";
        TH5.showContext.fillRect(0, 0, TH5.showCanvas.width, TH5.showCanvas.height);
    },

	/**
     * 对外接口 - 返回更改过的标签
     */
	getTabChanged: function(){
		var result=[], i=0, l=TH5.fileFilter.length;
		for(;i < l; i++){
			var obj = TH5.fileFilter[i];
			if(obj["rotateChanged"] == true){
                //delete obj["rotateChanged"];
                //delete obj["rChanged"];
                //if(obj["roate"] && obj["curRotate"]){
                //    obj["roate"] = obj["curRotate"];
                //}
				result.push(obj);
			}
		}
		return result;
	},
    getTabOnFocus: function(){
        var result=[], i=0, l=TH5.fileFilter.length;
        for(;i < l; i++){
            var obj = TH5.fileFilter[i];
            if(TH5.selectIndex == i){
                result.push(obj);
            }
        }
        return result;
    },
    /* 控件方法分界线 */

    selectIndex: null,
    seleImg: null,
    seleCanvas: null,
    showCanvas: null,
    showContext: null,
    seleImgRoate: null,
    zoom: 1,
    rotate: 1,

    /**
     * 点击浏览区中的影像件缩略图 触发的事件 - 原尺寸影像件出现在显示区
     * @param e
     */
    onImgSelect: function (e) {
        if(e == null){
            return;
        }
        var _parent = null;
        if(TH5.seleImg != null){
            TH5.seleImg.parentElement.className = "";
        }
        if(typeof e == "object"){
            _parent = e.target?e.target.parentElement:e.srcElement.parentElement;
            if(_parent) {
                _parent.className = "selection";
                TH5.seleImg = e.target || e.srcElement;
                TH5.selectIndex = TH5.seleImg.tabIndex;
            }else{
                return;
            }
        }else {
            var h = TH5.getNavElement();
            if(h.childNodes && h.childNodes.length>e) {
                _parent = h.childNodes.item(e);
                if (_parent) {
                    _parent.className = "selection";
                    TH5.seleImg = _parent.firstChild;
                    TH5.selectIndex = TH5.seleImg.tabIndex;
                    if(TH5.selectIndex > (this.btNum-1)) {
                        h.parentElement.scrollLeft = (TH5.selectIndex - (this.btNum-1)) *  (TH5.btW+10);
                    }else{
                        h.parentElement.scrollLeft = 0 ;
                    }
                }else{
                    return;
                }
            }
            h = null;
        }

        if(TH5.seleImg == null){
            return;
        }

        if(TH5.getImgFinished(TH5.seleImg) == false){
            alert("加载中..请稍候再查看！");
        }

        if (TH5.showCanvas == null) {
            return;
            /*
             TH5.showCanvas = document.getElementById('canvasMain');
             TH5.showCanvas = TH5.getCanvas(TH5.showCanvas);
             TH5.showContext = TH5.showCanvas.getContext('2d');
             */
        }
        TH5.seleImgRoate = null;
        TH5.zoom = 1;
        var zoomChange = function(m){
            var wZ = TH5.showCanvas.width / (m.naturalWidth || m.width);
            var hZ = TH5.showCanvas.height / (m.naturalHeight || m.height);
            if(wZ>=1 && hZ >= 1){
            }else {
                if (wZ > hZ) {
                    TH5.zoom = hZ;
                } else {
                    TH5.zoom = wZ;
                }
            }
            var x = (TH5.showCanvas.width - TH5.zoom * (m.naturalWidth || m.width) )/2;
            var y = (TH5.showCanvas.height - TH5.zoom * (m.naturalHeight || m.height) )/2;
            return {x: x, y: y};
        };
        //TH5.showContext.fillStyle = "#fff";
        //TH5.showContext.fillRect(0, 0, TH5.showCanvas.width, TH5.showCanvas.height);
        if(TH5.showContext){
            TH5.showContext.remove();
        }
        if(typeof TH5.seleImg.naturalWidth == "undefined") {
            var imgobj = TH5.getNaturalSize(TH5.seleImg);
            var p = zoomChange(imgobj);
            TH5.showContext = TH5.showCanvas.image(TH5.seleImg.src, p.x, p.y, imgobj.width * TH5.zoom, imgobj.height * TH5.zoom);
            imgobj = null;
        }else {
            var p = zoomChange(TH5.seleImg);
            TH5.showContext = TH5.showCanvas.image(TH5.seleImg.src, p.x, p.y, TH5.seleImg.naturalWidth * TH5.zoom, TH5.seleImg.naturalHeight * TH5.zoom);
        }
        if(TH5.seleImg["roate"] != 0){
            TH5.rotateChange(TH5.seleImg["roate"]);
        }

        TH5.showContext.mousedown(function(e){
            var obj = e.target;
            obj["drag"] = true;
            obj["layer"] = {
                x: e.clientX,//e.layerX,
                y: e.clientY//e.layerY
            };
            obj = null;
        });
        TH5.showContext.mouseup(function(e){
            var obj = e.target;
            obj["drag"] = null;
            obj["layer"] = null;
            obj = null;
        });
        TH5.showContext.mouseout(function(e){
            var obj = e.target;
            obj["drag"] = null;
            obj["layer"] = null;
            obj = null;
        });
        TH5.showContext.mousemove(function(e){
            var obj = e.target;
            if (typeof obj["drag"] == "undefined" || obj["drag"] != true) {
                return;
            }
            var layer = obj["layer"];
            if(typeof layer != "undefined"){
                //debugger
                var x = e.clientX - layer.x;
                var y = e.clientY - layer.y;
                //console.log("x: "+e.layerX +"_"+ layer.x+" , "+"y: "+e.layerY +"_"+ layer.y);
                //this.translate(y, 0-x);

                var oData = TH5.fileFilter[TH5.selectIndex];
                var degree;
                if(oData["curRotate"]){
                    degree = oData["curRotate"];
                }else if(oData["curRotate"]==0){
                    degree = 0;
                }else {
                    degree = oData["roate"];
                }
                switch (degree){
                    case 0:this.translate(x, y);break;
                    case 90:this.translate(y, 0-x);break;
                    case 180:this.translate(0-x, 0-y);break;
                    case 270:this.translate(0-y, x);break;
                }
                layer.x = e.clientX;
                layer.y = e.clientY;
            }
            layer = null;
            obj = null;
        });

        //TH5.seleImg = TH5.getRotateImg(TH5.seleImg, TH5.seleImg["roate"]);
    },
	
	/**
     * OCXH获取图片更新 触发的事件 - 原尺寸影像件出现在显示区
     * @param base64 image
     */
    mSeleOCXImg: function (base) {
        if(base == null){
            return;
        }

        if(TH5.seleImg == null){
            return;
        }

        if(TH5.getImgFinished(TH5.seleImg) == false){
            alert("加载中..请稍候再查看！");
        }

		TH5.seleImg.src = base;
		var tabIndex = TH5.seleImg.tabIndex;
		if(typeof tabIndex == "number"){
			var tabImg = TH5.fileFilter[tabIndex];
			if(tabImg) {
                tabImg["img"] = base;
                tabImg["rChanged"] = true;
                tabImg["rotateChanged"] = true;
            }
		}

        if (TH5.showCanvas == null) {
			return;
			/*
            TH5.showCanvas = document.getElementById('canvasMain');
			//TH5.showCanvas = TH5.getCanvas(TH5.showCanvas);
            TH5.showContext = TH5.showCanvas.getContext('2d');
			*/
        }
        TH5.seleImgRoate = null;
        TH5.zoom = 1;
        //TH5.showContext.fillStyle = "#fff";
        //TH5.showContext.fillRect(0, 0, TH5.showCanvas.width, TH5.showCanvas.height);
		if(TH5.showContext){
			TH5.showContext.remove();
		}
        if(typeof TH5.seleImg.naturalWidth == "undefined") {
            var imgobj = TH5.getNaturalSize(TH5.seleImg);
            TH5.showContext = TH5.showCanvas.image(TH5.seleImg.src, 0, 0, imgobj.width * TH5.zoom, imgobj.height * TH5.zoom);
            imgobj = null;
        }else {
            TH5.showContext = TH5.showCanvas.image(TH5.seleImg.src, 0, 0, TH5.seleImg.naturalWidth, TH5.seleImg.naturalHeight);
        }
    },

    rotateImg: function (img, direction){
        //最小与最大旋转方向，图片旋转4次后回到原方向
        var min_step = 0;
        var max_step = 3;
        if (img == null)return;
        //img的高度和宽度不能在img元素隐藏后获取，否则会出错
        var height = img.naturalHeight;
        var width = img.naturalWidth;
        if(typeof width == "undefined") {
            var imgobj = TH5.getNaturalSize(img);
            width = imgobj.width;
            height = imgobj.height;
            imgobj = null;
        }
        var step = img.getAttribute('roate')/90;    //img.getAttribute('step');
        if (step == null) {
            step = min_step;
        }
        if (direction == 'right') {
            step++;
            //旋转到原位置，即超过最大值
            step > max_step && (step = min_step);
        } else {
            step--;
            step < min_step && (step = max_step);
        }
        img.setAttribute('step', step);
        img.setAttribute('roate', step * 90);
        var canvas = document.getElementById('canvasRotate');
		canvas = TH5.getCanvas(canvas);
        //旋转角度以弧度值为参数
        var degree = step * 90 * Math.PI / 180;
        var ctx = canvas.getContext('2d');
        switch (step) {
            case 0:
                canvas.width = width;
                canvas.height = height;
                ctx.drawImage(img, 0, 0);
                break;
            case 1:
                canvas.width = height;
                canvas.height = width;
                ctx.rotate(degree);
                ctx.drawImage(img, 0, -height);
                break;
            case 2:
                canvas.width = width;
                canvas.height = height;
                ctx.rotate(degree);
                ctx.drawImage(img, -width, -height);
                break;
            case 3:
                canvas.width = height;
                canvas.height = width;
                ctx.rotate(degree);
                ctx.drawImage(img, -width, 0);
                break;
        }
        try {
            return canvas.toDataURL();
        }catch (e){
            return img.src;
        }
    },
    /**
     * 对微略尺寸影像件 - 进行旋转返回img base64图
     * @param r 指定角度
     */
    getRotateImg: function(imger, r){
        if(imger != null && r != null){
            if(typeof r != "number"){
                return imger.src;
            }
            if((r%90 !=0 && r%90 != 1)){
                return imger.src;
            }
            var step = r/90;
            var width = imger.naturalWidth;
            var height = imger.naturalHeight;
            if(typeof width == "undefined") {
                var imgobj = TH5.getNaturalSize(imger);
                width = imgobj.width;
                height = imgobj.height;
                imgobj = null;
            }
            var degree = step * 90 * Math.PI / 180;
            var canvas = document.getElementById('canvasRotate');
			canvas = TH5.getCanvas(canvas);
            var ctx = canvas.getContext('2d');
            switch (step) {
                case 0:
                    canvas.width = width;
                    canvas.height = height;
                    ctx.drawImage(imger, 0, 0);
                    break;
                case 1:
                    canvas.width = height;
                    canvas.height = width;
                    ctx.rotate(degree);
                    ctx.drawImage(imger, 0, -height);
                    break;
                case 2:
                    canvas.width = width;
                    canvas.height = height;
                    ctx.rotate(degree);
                    ctx.drawImage(imger, -width, -height);
                    break;
                case 3:
                    canvas.width = height;
                    canvas.height = width;
                    ctx.rotate(degree);
                    ctx.drawImage(imger, -width, 0);
                    break;
            }
            try {
                return canvas.toDataURL();
            }catch (e){
                return imger.src;
            }
        }
    },
    /**
     * 对显示区原尺寸影像件 - 进行旋转浏览
     * @param r 指定角度 type 特定类型
     * type = base64 则返回img base64图
     */
    rotateChange: function (r) {
        if (TH5.seleImg == null || TH5.showCanvas == null || TH5.showContext == null) {
            return;
        }

        var imger = TH5.seleImg;
        var roate = 90;
        if(r != null){
            if(typeof r != "number"){
                return;
            }
            if((r%90 !=0 && r%90 != 1)){
                return;
            }
            roate = r;
        }
        if(TH5.showContext){
            TH5.showContext.rotate(roate);
        }
        imger["curRotate"] = (typeof r == "undefined") ? ((imger["curRotate"] || 0)  + roate) : r;
        if(roate>=0) {
            if (imger["curRotate"] >= 360) {
                imger["curRotate"] = imger["curRotate"] - 360;
            }
        }else {
            if (imger["curRotate"] < 0) {
                imger["curRotate"] = imger["curRotate"] + 360;
            }
        }
        var index = imger.tabIndex, rotate = imger["curRotate"];
        var oData = TH5.fileFilter[index];
        if(oData) {
            if (oData["rChanged"] == true) {
                oData["rotateChanged"] = true;
                oData["curRotate"] = rotate;
            }else if (oData["roate"] != null) {
                if (oData["roate"] != rotate) {
                    oData["rotateChanged"] = true;
                    oData["curRotate"] = rotate;
                }else{
                    oData["rotateChanged"] = false;
                    oData["curRotate"] = rotate;
                }
            }
        }
/*
        try {
            var im = new Image();
            //var im = document.getElementById("tester");
            im.src = this.rotateImg(imger,"right");
            im.targetImg = imger;
            if(im["attachEvent"] && typeof im["attachEvent"] != "undefined"){
                im.attachEvent("onload", function(e){
                    TH5.showContext.fillStyle = "#fff";
                    TH5.showContext.fillRect(0, 0, TH5.showCanvas.width, TH5.showCanvas.height);
                    if(typeof im.naturalWidth == "undefined") {
                        var imgobj = TH5.getNaturalSize(im);
                        TH5.showContext.drawImage(im, 0, 0, imgobj.width * TH5.zoom, imgobj.height * TH5.zoom);
                        imgobj = null;
                    }else {
                        TH5.showContext.drawImage(im, 0, 0, im.naturalWidth * TH5.zoom, im.naturalHeight * TH5.zoom);
                    }
                    var img = imger;
                    var index = img.tabIndex, rotate = parseInt(img.getAttribute('roate')) + (img["roate"] || 0);
                    var oData = TH5.fileFilter[index];
                    if(oData) {
                        if (oData["rChanged"] == true) {
                            oData["rotateChanged"] = true;
                            oData["curRotate"] = rotate;
                        }else if (oData["roate"] != null) {
                            if (oData["roate"] != rotate) {
                                oData["rotateChanged"] = true;
                                oData["curRotate"] = rotate;
                            }else{
                                oData["rotateChanged"] = false;
                            }
                        }
                    }
                });
            }else {
                im.onload = function(e){
                    TH5.showContext.fillStyle = "#fff";
                    TH5.showContext.fillRect(0, 0, TH5.showCanvas.width, TH5.showCanvas.height);
                    if(typeof im.naturalWidth == "undefined") {
                        var imgobj = TH5.getNaturalSize(im);
                        TH5.showContext.drawImage(im, 0, 0, imgobj.width * TH5.zoom, imgobj.height * TH5.zoom);
                        imgobj = null;
                    }else {
                        TH5.showContext.drawImage(im, 0, 0, im.naturalWidth * TH5.zoom, im.naturalHeight * TH5.zoom);
                    }
                    var img = e.target.targetImg;
                    var index = img.tabIndex, rotate = parseInt(img.getAttribute('roate')) + (img["roate"] || 0);
                    var oData = TH5.fileFilter[index];
                    if(oData) {
                        if (oData["rChanged"] == true) {
                            oData["rotateChanged"] = true;
                            oData["curRotate"] = rotate;
                        }else if (oData["roate"] != null) {
                            if (oData["roate"] != rotate) {
                                oData["rotateChanged"] = true;
                                oData["curRotate"] = rotate;
                            }else{
                                oData["rotateChanged"] = false;
                            }
                        }
                    }
                };
            }
            TH5.seleImgRoate = im;
        }catch (e){}
 */
    },
    rotateChangeZ: function (r) {
        if (TH5.seleImg == null || TH5.showCanvas == null || TH5.showContext == null) {
            return;
        }

        var imger = TH5.seleImg;
        var roate = -90;
        if (r != null) {
            if (typeof r != "number") {
                return;
            }
            if ((r % 90 != 0 && r % 90 != 1)) {
                return;
            }
            roate = r;
        }
        if (TH5.showContext) {
            TH5.showContext.rotate(roate);
        }
        imger["curRotate"] = (typeof r == "undefined") ? ((imger["curRotate"] || 0) + roate) : r;
        if (imger["curRotate"] < 0) {
            imger["curRotate"] = imger["curRotate"] + 360;
        }
        var index = imger.tabIndex, rotate = imger["curRotate"];
        var oData = TH5.fileFilter[index];
        if (oData) {
            if (oData["rChanged"] == true) {
                oData["rotateChanged"] = true;
                oData["curRotate"] = rotate;
            } else if (oData["roate"] != null) {
                if (oData["roate"] != rotate) {
                    oData["rotateChanged"] = true;
                    oData["curRotate"] = rotate;
                } else {
                    oData["rotateChanged"] = false;
                    oData["curRotate"] = rotate;
                }
            }
        }
    },
/*
    rotateChange1: function (r){
        if(TH5.seleImg == null ||TH5.showCanvas == null || TH5.showContext == null){
            return;
        }
        if(r){
            if(typeof r != "number"){
                return;
            }
            if((r%90 !=0 && r%90 != 1) ||  r == (TH5.step* 90)){
                return;
            }
            TH5.step = r/90;
        }else {
            TH5.step++;
        }
        if(TH5.step>=4) {
            TH5.step = 0;
        }

        //_START 判断图片是否旋转过
        var index = TH5.seleImg.tabIndex;
        var oData = TH5.fileFilter[index];
        if(oData) {
            if (oData["roate"]) {
                if (oData["roate"] != (TH5.step * 90)) {
                    oData["rotateChanged"] = true;
                    oData["curRotate"] = (TH5.step * 90);
                } else {
                    if(oData["rChanged"]){}else {
                        oData["rotateChanged"] = false;
                    }
                }
            }else{
                if(TH5.step > 0){
                    oData["rotateChanged"] = true;
                    oData["curRotate"] = (TH5.step * 90);
                }else{
                    if(oData["rChanged"]){}else {
                        oData["rotateChanged"] = false;
                    }
                }
            }
        }
        //_END 判断图片是否旋转过

        var width = TH5.seleImg.naturalWidth;
        var height = TH5.seleImg.naturalHeight;
        var degree = TH5.step * 90 * Math.PI / 180;
        var canvas = document.getElementById('canvasRotate');
        var ctx = canvas.getContext('2d');
        switch (TH5.step) {
            case 0:
                canvas.width = width;
                canvas.height = height;
                ctx.drawImage(TH5.seleImg, 0, 0);
                break;
            case 1:
                canvas.width = height;
                canvas.height = width;
                ctx.rotate(degree);
                ctx.drawImage(TH5.seleImg, 0, -height);
                break;
            case 2:
                canvas.width = width;
                canvas.height = height;
                ctx.rotate(degree);
                ctx.drawImage(TH5.seleImg, -width, -height);
                break;
            case 3:
                canvas.width = height;
                canvas.height = width;
                ctx.rotate(degree);
                ctx.drawImage(TH5.seleImg, -width, 0);
                break;
        }

        try {
            var img = new Image();
            img.src = canvas.toDataURL();   //"image/png"
            img.onload = function () {
                TH5.showContext.fillStyle = "#fff";
                TH5.showContext.fillRect(0, 0, TH5.showCanvas.width, TH5.showCanvas.height);
                TH5.showContext.drawImage(img, 0, 0, img.naturalWidth * TH5.zoom, img.naturalHeight * TH5.zoom);
            };
            TH5.seleImg.src = img.src;
        }catch (e){}
    },
*/

    /**
     * 对显示区原尺寸影像件 - 进行缩放浏览
     */
    zoomChange: function (n){
        if(TH5.seleImg == null || TH5.showCanvas == null || TH5.showContext == null){
            return;
        }
        TH5.showContext.scale(n,n)
    },

    /**
     * 对显示区原尺寸影像件 - 进行缩小浏览
     */
    zoomIn: function (){
        TH5.zoom = TH5.zoom - 0.1;
        this.zoomChange(0.9);
    },

    /**
     * 对显示区原尺寸影像件 - 进行放大浏览
     */
    zoomOut: function (){
        TH5.zoom = TH5.zoom + 0.1;
        this.zoomChange(1.1);
    },

    /**
     * 翻页  上一页
     */
    lastPage: function (){
        if(TH5.selectIndex == null){
            TH5.onImgSelect(0);
        }else if(TH5.selectIndex > 0){
            TH5.onImgSelect(TH5.selectIndex - 1);
        }
    },

    /**
     * 翻页  下一页
     */
    nextPage: function (){
        if(TH5.selectIndex == null){
            TH5.onImgSelect(0);
        }else if((TH5.selectIndex+1) < TH5.fileFilter.length){
            TH5.onImgSelect(TH5.selectIndex + 1);
        }
    },

    /**
     * 翻页 指定
     */
    setPage: function (n){
        if(typeof n == "number"){
            TH5.onImgSelect(n);
        }
    },

    /**
     * 获取对象自定义finished 显示是否加载是否完成
     * @param a 自定义字段 finished
     * @returns {*} true false
     */
    getImgFinished: function (a){
        if(a && a["finished"]){
            return a["finished"];
        }else{
            return false;
        }
    },

	/**
	** 兼容ie8 获取canvas 获取getContent(2d")
	**/
	getCanvas: function (c){
		if(window["G_vmlCanvasManager"] && typeof window["G_vmlCanvasManager"] != "undefined"){
			return window["G_vmlCanvasManager"].initElement(c);
		}else{
			return c;
		}
	},

    /**
     *  兼容ie8 低版本获取 原图
     * @param Domlement
     * @returns {{width: (Number|number), height: (Number|number)}}
     */
    getNaturalSize: function (DomElement) {
        var img = new Image();
        img.src = DomElement.src;
        return {
            width: img.width,
            height: img.height
        };
    },
	
	/**
     *  兼容ie8 低版本获取 获取对象 默认 canvas
     * @param doc, id, tag (目标对象, 搜索对象的id, 搜索对象的标签 默认canvas)
     * @returns object
     */
	getIe8Element: function(doc, id, tag){
		if(doc == null || id == null){
			return null;
		}
		var col, tagName = "canvas";
		if(typeof tag != "undefined"){
			tagName = tag;
		}
		col = doc.getElementsByTagName(tagName);
		for(var obj in col){
			var ele = col[obj];
			if(typeof ele == "object"){
				if(ele["id"] == id){
					return ele;
				}
			}
		}
		return null;
	},

    /**
     * 获取当前显示区域内容
     * @returns {*}
     */
    getSelectImg: function(){
        if(TH5.selectIndex == null){
            return null;
        }else{
            return TH5.fileFilter[TH5.selectIndex];
        }
    }
};
function imgOnload(e){
    var m = e.target || e.srcElement;
    if(m && m["roate"] && m["roate"] > 0) {
        //m.src = TH5.getRotateImg(m, m["roate"]);
        //m.onload = null;
		var ff=function(e) {
			return handler(e || window.event);
        };
        m.attachEvent('onload', ff);
        //m.detachEvent("onload", imgOnload);
    }
}
/**
 *
 * @param e
 */
function rotateCOnload(e){
    var im = e.srcElement;
    TH5.showContext.fillStyle = "#fff";
    TH5.showContext.fillRect(0, 0, TH5.showCanvas.width, TH5.showCanvas.height);
    if(typeof im.naturalWidth == "undefined") {
        var imgobj = TH5.getNaturalSize(im);
        TH5.showContext.drawImage(im, 0, 0, imgobj.width * TH5.zoom, imgobj.height * TH5.zoom);
        imgobj = null;
    }else {
        TH5.showContext.drawImage(im, 0, 0, im.naturalWidth * TH5.zoom, im.naturalHeight * TH5.zoom);
    }
    var img = e.target.targetImg;
    var index = img.tabIndex, rotate = parseInt(img.getAttribute('roate')) + (img["roate"] || 0);
    var oData = TH5.fileFilter[index];
    if(oData) {
        if (oData["rChanged"] == true) {
            oData["rotateChanged"] = true;
            oData["curRotate"] = rotate;
        }else if (oData["roate"] != null) {
            if (oData["roate"] != rotate) {
                oData["rotateChanged"] = true;
                oData["curRotate"] = rotate;
            }else{
                oData["rotateChanged"] = false;
            }
        }
    }
    TH5.showContext.fillStyle = "#fff";
    TH5.showContext.fillRect(0, 0, TH5.showCanvas.width, TH5.showCanvas.height);
    if(typeof im.naturalWidth == "undefined") {
        var imgobj = TH5.getNaturalSize(im);
        TH5.showContext.drawImage(im, 0, 0, imgobj.width * TH5.zoom, imgobj.height * TH5.zoom);
        imgobj = null;
    }else {
        TH5.showContext.drawImage(im, 0, 0, im.naturalWidth * TH5.zoom, im.naturalHeight * TH5.zoom);
    }
    var img = e.target.targetImg;
    var index = img.tabIndex, rotate = parseInt(img.getAttribute('roate')) + (img["roate"] || 0);
    var oData = TH5.fileFilter[index];
    if(oData) {
        if (oData["rChanged"] == true) {
            oData["rotateChanged"] = true;
            oData["curRotate"] = rotate;
        }else if (oData["roate"] != null) {
            if (oData["roate"] != rotate) {
                oData["rotateChanged"] = true;
                oData["curRotate"] = rotate;
            }else{
                oData["rotateChanged"] = false;
            }
        }
    }
    if(img["attachEvent"] && typeof img["attachEvent"] != "undefined"){
        img.detachEvent("onload",rotateCOnload);
    }
}
	

