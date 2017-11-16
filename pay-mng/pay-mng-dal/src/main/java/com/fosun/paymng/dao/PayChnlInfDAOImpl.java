package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayChnlInf;
import com.fosun.paymng.model.PayChnlInfExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayChnlInfDAO")
public class PayChnlInfDAOImpl extends IbatisDaoAnnotation4Template implements PayChnlInfDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayChnlInfDAOImpl() {
        super();
    }

    public int countByExample(PayChnlInfExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_chnl_inf.countByExample", example);
        return count;
    }

    public int deleteByExample(PayChnlInfExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_chnl_inf.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String chnlId) {
        PayChnlInf _key = new PayChnlInf();
        _key.setChnlId(chnlId);
        int rows = getSqlMapClientTemplate().delete("pay_chnl_inf.deleteByPrimaryKey", _key);
        return rows;
    }

    public void insert(PayChnlInf record) {
        getSqlMapClientTemplate().insert("pay_chnl_inf.insert", record);
    }

    public void insertSelective(PayChnlInf record) {
        getSqlMapClientTemplate().insert("pay_chnl_inf.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<PayChnlInf> selectByExample(PayChnlInfExample example) {
        List<PayChnlInf> list = getSqlMapClientTemplate().queryForList("pay_chnl_inf.selectByExample", example);
        return list;
    }

    public PayChnlInf selectByPrimaryKey(String chnlId) {
        PayChnlInf _key = new PayChnlInf();
        _key.setChnlId(chnlId);
        PayChnlInf record = (PayChnlInf) getSqlMapClientTemplate().queryForObject("pay_chnl_inf.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayChnlInf record, PayChnlInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_chnl_inf.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayChnlInf record, PayChnlInfExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_chnl_inf.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayChnlInf record) {
        int rows = getSqlMapClientTemplate().update("pay_chnl_inf.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayChnlInf record) {
        int rows = getSqlMapClientTemplate().update("pay_chnl_inf.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayChnlInf> selectByPage(PayChnlInfExample example, Page page) {
        List<PayChnlInf> list = this.searchListPageMyObject("pay_chnl_inf.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayChnlInfExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayChnlInfExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}