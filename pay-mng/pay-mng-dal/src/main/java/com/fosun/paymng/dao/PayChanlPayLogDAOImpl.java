package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayChanlPayLog;
import com.fosun.paymng.model.PayChanlPayLogExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayChanlPayLogDAO")
public class PayChanlPayLogDAOImpl extends IbatisDaoAnnotation4Template implements PayChanlPayLogDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayChanlPayLogDAOImpl() {
        super();
    }

    public int countByExample(PayChanlPayLogExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_chanl_pay_log.countByExample", example);
        return count;
    }

    public int deleteByExample(PayChanlPayLogExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_chanl_pay_log.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String transPayId) {
        PayChanlPayLog _key = new PayChanlPayLog();
        _key.setTransPayId(transPayId);
        int rows = getSqlMapClientTemplate().delete("pay_chanl_pay_log.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(PayChanlPayLog record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_chanl_pay_log.insert", record);
        return (String) newKey;
    }

    public String insertSelective(PayChanlPayLog record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_chanl_pay_log.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<PayChanlPayLog> selectByExample(PayChanlPayLogExample example) {
        List<PayChanlPayLog> list = getSqlMapClientTemplate().queryForList("pay_chanl_pay_log.selectByExample", example);
        return list;
    }

    public PayChanlPayLog selectByPrimaryKey(String transPayId) {
        PayChanlPayLog _key = new PayChanlPayLog();
        _key.setTransPayId(transPayId);
        PayChanlPayLog record = (PayChanlPayLog) getSqlMapClientTemplate().queryForObject("pay_chanl_pay_log.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayChanlPayLog record, PayChanlPayLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_chanl_pay_log.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayChanlPayLog record, PayChanlPayLogExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_chanl_pay_log.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayChanlPayLog record) {
        int rows = getSqlMapClientTemplate().update("pay_chanl_pay_log.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayChanlPayLog record) {
        int rows = getSqlMapClientTemplate().update("pay_chanl_pay_log.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayChanlPayLog> selectByPage(PayChanlPayLogExample example, Page page) {
        List<PayChanlPayLog> list = this.searchListPageMyObject("pay_chanl_pay_log.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayChanlPayLogExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayChanlPayLogExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}