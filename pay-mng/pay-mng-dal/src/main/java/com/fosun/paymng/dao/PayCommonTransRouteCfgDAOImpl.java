package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayCommonTransRouteCfg;
import com.fosun.paymng.model.PayCommonTransRouteCfgExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayCommonTransRouteCfgDAO")
public class PayCommonTransRouteCfgDAOImpl extends IbatisDaoAnnotation4Template implements PayCommonTransRouteCfgDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayCommonTransRouteCfgDAOImpl() {
        super();
    }

    public int countByExample(PayCommonTransRouteCfgExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_common_trans_route_cfg.countByExample", example);
        return count;
    }

    public int deleteByExample(PayCommonTransRouteCfgExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_common_trans_route_cfg.deleteByExample", example);
        return rows;
    }

    public void insert(PayCommonTransRouteCfg record) {
        getSqlMapClientTemplate().insert("pay_common_trans_route_cfg.insert", record);
    }

    public void insertSelective(PayCommonTransRouteCfg record) {
        getSqlMapClientTemplate().insert("pay_common_trans_route_cfg.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<PayCommonTransRouteCfg> selectByExample(PayCommonTransRouteCfgExample example) {
        List<PayCommonTransRouteCfg> list = getSqlMapClientTemplate().queryForList("pay_common_trans_route_cfg.selectByExample", example);
        return list;
    }

    public int updateByExampleSelective(PayCommonTransRouteCfg record, PayCommonTransRouteCfgExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_common_trans_route_cfg.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayCommonTransRouteCfg record, PayCommonTransRouteCfgExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_common_trans_route_cfg.updateByExample", parms);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayCommonTransRouteCfg> selectByPage(PayCommonTransRouteCfgExample example, Page page) {
        List<PayCommonTransRouteCfg> list = this.searchListPageMyObject("pay_common_trans_route_cfg.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayCommonTransRouteCfgExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayCommonTransRouteCfgExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}