package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayBillFileDtl;
import com.fosun.paymng.model.PayBillFileDtlExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayBillFileDtlDAO")
public class PayBillFileDtlDAOImpl extends IbatisDaoAnnotation4Template implements PayBillFileDtlDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayBillFileDtlDAOImpl() {
        super();
    }

    public int countByExample(PayBillFileDtlExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_bill_file_dtl.countByExample", example);
        return count;
    }

    public int deleteByExample(PayBillFileDtlExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_bill_file_dtl.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        PayBillFileDtl _key = new PayBillFileDtl();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("pay_bill_file_dtl.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(PayBillFileDtl record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_bill_file_dtl.insert", record);
        return (String) newKey;
    }

    public String insertSelective(PayBillFileDtl record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_bill_file_dtl.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<PayBillFileDtl> selectByExample(PayBillFileDtlExample example) {
        List<PayBillFileDtl> list = getSqlMapClientTemplate().queryForList("pay_bill_file_dtl.selectByExample", example);
        return list;
    }

    public PayBillFileDtl selectByPrimaryKey(String id) {
        PayBillFileDtl _key = new PayBillFileDtl();
        _key.setId(id);
        PayBillFileDtl record = (PayBillFileDtl) getSqlMapClientTemplate().queryForObject("pay_bill_file_dtl.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayBillFileDtl record, PayBillFileDtlExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_bill_file_dtl.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayBillFileDtl record, PayBillFileDtlExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_bill_file_dtl.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayBillFileDtl record) {
        int rows = getSqlMapClientTemplate().update("pay_bill_file_dtl.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayBillFileDtl record) {
        int rows = getSqlMapClientTemplate().update("pay_bill_file_dtl.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayBillFileDtl> selectByPage(PayBillFileDtlExample example, Page page) {
        List<PayBillFileDtl> list = this.searchListPageMyObject("pay_bill_file_dtl.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayBillFileDtlExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayBillFileDtlExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}