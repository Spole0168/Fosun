package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayFundCfg;
import com.fosun.paymng.model.PayFundCfgExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayFundCfgDAO")
public class PayFundCfgDAOImpl extends IbatisDaoAnnotation4Template implements PayFundCfgDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayFundCfgDAOImpl() {
        super();
    }

    public int countByExample(PayFundCfgExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_fund_cfg.countByExample", example);
        return count;
    }

    public int deleteByExample(PayFundCfgExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_fund_cfg.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        PayFundCfg _key = new PayFundCfg();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("pay_fund_cfg.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(PayFundCfg record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_fund_cfg.insert", record);
        return (String) newKey;
    }

    public String insertSelective(PayFundCfg record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_fund_cfg.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<PayFundCfg> selectByExample(PayFundCfgExample example) {
        List<PayFundCfg> list = getSqlMapClientTemplate().queryForList("pay_fund_cfg.selectByExample", example);
        return list;
    }

    public PayFundCfg selectByPrimaryKey(String id) {
        PayFundCfg _key = new PayFundCfg();
        _key.setId(id);
        PayFundCfg record = (PayFundCfg) getSqlMapClientTemplate().queryForObject("pay_fund_cfg.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayFundCfg record, PayFundCfgExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_fund_cfg.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayFundCfg record, PayFundCfgExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_fund_cfg.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayFundCfg record) {
        int rows = getSqlMapClientTemplate().update("pay_fund_cfg.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayFundCfg record) {
        int rows = getSqlMapClientTemplate().update("pay_fund_cfg.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayFundCfg> selectByPage(PayFundCfgExample example, Page page) {
        List<PayFundCfg> list = this.searchListPageMyObject("pay_fund_cfg.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayFundCfgExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayFundCfgExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}