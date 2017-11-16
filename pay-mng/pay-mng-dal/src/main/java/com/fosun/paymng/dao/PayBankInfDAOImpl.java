package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayBankInf;
import com.fosun.paymng.model.PayBankInfExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayBankInfDAO")
public class PayBankInfDAOImpl extends IbatisDaoAnnotation4Template implements PayBankInfDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayBankInfDAOImpl() {
        super();
    }

    public int countByExample(PayBankInfExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_bank_inf.countByExample", example);
        return count;
    }

    public int deleteByExample(PayBankInfExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_bank_inf.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String bankId) {
        PayBankInf _key = new PayBankInf();
        _key.setBankId(bankId);
        int rows = getSqlMapClientTemplate().delete("pay_bank_inf.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(PayBankInf record) {
        getSqlMapClientTemplate().insert("pay_bank_inf.insert", record);
    }

    public void insertSelective(PayBankInf record) {
        getSqlMapClientTemplate().insert("pay_bank_inf.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<PayBankInf> selectByExample(PayBankInfExample example) {
        List<PayBankInf> list = getSqlMapClientTemplate().queryForList("pay_bank_inf.selectByExample", example);
        return list;
    }

    public PayBankInf selectByPrimaryKey(String bankId) {
        PayBankInf _key = new PayBankInf();
        _key.setBankId(bankId);
        PayBankInf record = (PayBankInf) getSqlMapClientTemplate().queryForObject("pay_bank_inf.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayBankInf record, PayBankInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_bank_inf.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayBankInf record, PayBankInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_bank_inf.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayBankInf record) {
        int rows = getSqlMapClientTemplate().update("pay_bank_inf.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayBankInf record) {
        int rows = getSqlMapClientTemplate().update("pay_bank_inf.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayBankInf> selectByPage(PayBankInfExample example, Page page) {
        List<PayBankInf> list = this.searchListPageMyObject("pay_bank_inf.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayBankInfExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayBankInfExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}