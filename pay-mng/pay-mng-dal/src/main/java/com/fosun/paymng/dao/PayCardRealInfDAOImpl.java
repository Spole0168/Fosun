package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayCardRealInf;
import com.fosun.paymng.model.PayCardRealInfExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayCardRealInfDAO")
public class PayCardRealInfDAOImpl extends IbatisDaoAnnotation4Template implements PayCardRealInfDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayCardRealInfDAOImpl() {
        super();
    }

    public int countByExample(PayCardRealInfExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_card_real_inf.countByExample", example);
        return count;
    }

    public int deleteByExample(PayCardRealInfExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_card_real_inf.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String recSeqId) {
        PayCardRealInf _key = new PayCardRealInf();
        _key.setRecSeqId(recSeqId);
        int rows = getSqlMapClientTemplate().delete("pay_card_real_inf.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(PayCardRealInf record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_card_real_inf.insert", record);
        return (String) newKey;
    }

    public String insertSelective(PayCardRealInf record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_card_real_inf.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<PayCardRealInf> selectByExample(PayCardRealInfExample example) {
        List<PayCardRealInf> list = getSqlMapClientTemplate().queryForList("pay_card_real_inf.selectByExample", example);
        return list;
    }

    public PayCardRealInf selectByPrimaryKey(String recSeqId) {
        PayCardRealInf _key = new PayCardRealInf();
        _key.setRecSeqId(recSeqId);
        PayCardRealInf record = (PayCardRealInf) getSqlMapClientTemplate().queryForObject("pay_card_real_inf.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayCardRealInf record, PayCardRealInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_card_real_inf.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayCardRealInf record, PayCardRealInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_card_real_inf.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayCardRealInf record) {
        int rows = getSqlMapClientTemplate().update("pay_card_real_inf.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayCardRealInf record) {
        int rows = getSqlMapClientTemplate().update("pay_card_real_inf.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayCardRealInf> selectByPage(PayCardRealInfExample example, Page page) {
        List<PayCardRealInf> list = this.searchListPageMyObject("pay_card_real_inf.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayCardRealInfExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayCardRealInfExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}