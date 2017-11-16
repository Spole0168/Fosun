package com.fosun.paymng.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.fosun.paymng.model.PayBankLimit;
import com.fosun.paymng.model.PayBankLimitExample;
import com.fosun.paymng.model.PayBankLimitKey;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;

@Repository("PayBankLimitDAO")
public class PayBankLimitDAOImpl extends IbatisDaoAnnotation4Template implements PayBankLimitDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayBankLimitDAOImpl() {
        super();
    }

    public int countByExample(PayBankLimitExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_bank_limit.countByExample", example);
        return count;
    }

    public int deleteByExample(PayBankLimitExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_bank_limit.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(PayBankLimitKey _key) {
        int rows = getSqlMapClientTemplate().delete("pay_bank_limit.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(PayBankLimit record) {
        getSqlMapClientTemplate().insert("pay_bank_limit.insert", record);
    }

    public void insertSelective(PayBankLimit record) {
        getSqlMapClientTemplate().insert("pay_bank_limit.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<PayBankLimit> selectByExample(PayBankLimitExample example) {
        List<PayBankLimit> list = getSqlMapClientTemplate().queryForList("pay_bank_limit.selectByExample", example);
        return list;
    }

    public PayBankLimit selectByPrimaryKey(PayBankLimitKey _key) {
        PayBankLimit record = (PayBankLimit) getSqlMapClientTemplate().queryForObject("pay_bank_limit.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayBankLimit record, PayBankLimitExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_bank_limit.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayBankLimit record, PayBankLimitExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_bank_limit.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayBankLimit record) {
        int rows = getSqlMapClientTemplate().update("pay_bank_limit.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayBankLimit record) {
        int rows = getSqlMapClientTemplate().update("pay_bank_limit.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayBankLimit> selectByPage(PayBankLimitExample example, Page page) {
        List<PayBankLimit> list = this.searchListPageMyObject("pay_bank_limit.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayBankLimitExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayBankLimitExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}