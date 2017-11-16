package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayCardContractInf;
import com.fosun.paymng.model.PayCardContractInfExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayCardContractInfDAO")
public class PayCardContractInfDAOImpl extends IbatisDaoAnnotation4Template implements PayCardContractInfDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayCardContractInfDAOImpl() {
        super();
    }

    public int countByExample(PayCardContractInfExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_card_contract_inf.countByExample", example);
        return count;
    }

    public int deleteByExample(PayCardContractInfExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_card_contract_inf.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String recSeqId) {
        PayCardContractInf _key = new PayCardContractInf();
        _key.setRecSeqId(recSeqId);
        int rows = getSqlMapClientTemplate().delete("pay_card_contract_inf.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(PayCardContractInf record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_card_contract_inf.insert", record);
        return (String) newKey;
    }

    public String insertSelective(PayCardContractInf record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_card_contract_inf.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<PayCardContractInf> selectByExampleWithBLOBs(PayCardContractInfExample example) {
        List<PayCardContractInf> list = getSqlMapClientTemplate().queryForList("pay_card_contract_inf.selectByExampleWithBLOBs", example);
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<PayCardContractInf> selectByExampleWithoutBLOBs(PayCardContractInfExample example) {
        List<PayCardContractInf> list = getSqlMapClientTemplate().queryForList("pay_card_contract_inf.selectByExample", example);
        return list;
    }

    public PayCardContractInf selectByPrimaryKey(String recSeqId) {
        PayCardContractInf _key = new PayCardContractInf();
        _key.setRecSeqId(recSeqId);
        PayCardContractInf record = (PayCardContractInf) getSqlMapClientTemplate().queryForObject("pay_card_contract_inf.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayCardContractInf record, PayCardContractInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_card_contract_inf.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExampleWithBLOBs(PayCardContractInf record, PayCardContractInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_card_contract_inf.updateByExampleWithBLOBs", parms);
        return rows;
    }

    public int updateByExampleWithoutBLOBs(PayCardContractInf record, PayCardContractInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_card_contract_inf.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayCardContractInf record) {
        int rows = getSqlMapClientTemplate().update("pay_card_contract_inf.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(PayCardContractInf record) {
        int rows = getSqlMapClientTemplate().update("pay_card_contract_inf.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(PayCardContractInf record) {
        int rows = getSqlMapClientTemplate().update("pay_card_contract_inf.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayCardContractInf> selectByPage(PayCardContractInfExample example, Page page) {
        List<PayCardContractInf> list = this.searchListPageMyObject("pay_card_contract_inf.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayCardContractInfExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayCardContractInfExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}