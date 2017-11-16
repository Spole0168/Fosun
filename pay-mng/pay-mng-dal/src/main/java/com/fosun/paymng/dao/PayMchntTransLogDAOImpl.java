package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayMchntTransLog;
import com.fosun.paymng.model.PayMchntTransLogExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayMchntTransLogDAO")
public class PayMchntTransLogDAOImpl extends IbatisDaoAnnotation4Template implements PayMchntTransLogDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayMchntTransLogDAOImpl() {
        super();
    }

    public int countByExample(PayMchntTransLogExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_mchnt_trans_log.countByExample", example);
        return count;
    }

    public int deleteByExample(PayMchntTransLogExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_mchnt_trans_log.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String transSeqId) {
        PayMchntTransLog _key = new PayMchntTransLog();
        _key.setTransSeqId(transSeqId);
        int rows = getSqlMapClientTemplate().delete("pay_mchnt_trans_log.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(PayMchntTransLog record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_mchnt_trans_log.insert", record);
        return (String) newKey;
    }

    public String insertSelective(PayMchntTransLog record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_mchnt_trans_log.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<PayMchntTransLog> selectByExample(PayMchntTransLogExample example) {
        List<PayMchntTransLog> list = getSqlMapClientTemplate().queryForList("pay_mchnt_trans_log.selectByExample", example);
        return list;
    }

    public PayMchntTransLog selectByPrimaryKey(String transSeqId) {
        PayMchntTransLog _key = new PayMchntTransLog();
        _key.setTransSeqId(transSeqId);
        PayMchntTransLog record = (PayMchntTransLog) getSqlMapClientTemplate().queryForObject("pay_mchnt_trans_log.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayMchntTransLog record, PayMchntTransLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_mchnt_trans_log.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayMchntTransLog record, PayMchntTransLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_mchnt_trans_log.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayMchntTransLog record) {
        int rows = getSqlMapClientTemplate().update("pay_mchnt_trans_log.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayMchntTransLog record) {
        int rows = getSqlMapClientTemplate().update("pay_mchnt_trans_log.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayMchntTransLog> selectByPage(PayMchntTransLogExample example, Page page) {
        List<PayMchntTransLog> list = this.searchListPageMyObject("pay_mchnt_trans_log.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayMchntTransLogExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayMchntTransLogExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}