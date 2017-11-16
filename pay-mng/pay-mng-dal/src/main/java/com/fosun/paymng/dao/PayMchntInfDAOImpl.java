package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayMchntInf;
import com.fosun.paymng.model.PayMchntInfExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayMchntInfDAO")
public class PayMchntInfDAOImpl extends IbatisDaoAnnotation4Template implements PayMchntInfDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayMchntInfDAOImpl() {
        super();
    }

    public int countByExample(PayMchntInfExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_mchnt_inf.countByExample", example);
        return count;
    }

    public int deleteByExample(PayMchntInfExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_mchnt_inf.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String mchntId) {
        PayMchntInf _key = new PayMchntInf();
        _key.setMchntId(mchntId);
        int rows = getSqlMapClientTemplate().delete("pay_mchnt_inf.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(PayMchntInf record) {
        getSqlMapClientTemplate().insert("pay_mchnt_inf.insert", record);
    }

    public void insertSelective(PayMchntInf record) {
        getSqlMapClientTemplate().insert("pay_mchnt_inf.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<PayMchntInf> selectByExample(PayMchntInfExample example) {
        List<PayMchntInf> list = getSqlMapClientTemplate().queryForList("pay_mchnt_inf.selectByExample", example);
        return list;
    }

    public PayMchntInf selectByPrimaryKey(String mchntId) {
        PayMchntInf _key = new PayMchntInf();
        _key.setMchntId(mchntId);
        PayMchntInf record = (PayMchntInf) getSqlMapClientTemplate().queryForObject("pay_mchnt_inf.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayMchntInf record, PayMchntInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_mchnt_inf.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayMchntInf record, PayMchntInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_mchnt_inf.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayMchntInf record) {
        int rows = getSqlMapClientTemplate().update("pay_mchnt_inf.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayMchntInf record) {
        int rows = getSqlMapClientTemplate().update("pay_mchnt_inf.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayMchntInf> selectByPage(PayMchntInfExample example, Page page) {
        List<PayMchntInf> list = this.searchListPageMyObject("pay_mchnt_inf.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayMchntInfExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayMchntInfExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}