package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayTransRecordInfo;
import com.fosun.paymng.model.PayTransRecordInfoExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayTransRecordInfoDAO")
public class PayTransRecordInfoDAOImpl extends IbatisDaoAnnotation4Template implements PayTransRecordInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayTransRecordInfoDAOImpl() {
        super();
    }

    public int countByExample(PayTransRecordInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_trans_record_info.countByExample", example);
        return count;
    }

    public int deleteByExample(PayTransRecordInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_trans_record_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        PayTransRecordInfo _key = new PayTransRecordInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("pay_trans_record_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(PayTransRecordInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_trans_record_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(PayTransRecordInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_trans_record_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<PayTransRecordInfo> selectByExample(PayTransRecordInfoExample example) {
        List<PayTransRecordInfo> list = getSqlMapClientTemplate().queryForList("pay_trans_record_info.selectByExample", example);
        return list;
    }

    public PayTransRecordInfo selectByPrimaryKey(String id) {
        PayTransRecordInfo _key = new PayTransRecordInfo();
        _key.setId(id);
        PayTransRecordInfo record = (PayTransRecordInfo) getSqlMapClientTemplate().queryForObject("pay_trans_record_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayTransRecordInfo record, PayTransRecordInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_trans_record_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayTransRecordInfo record, PayTransRecordInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_trans_record_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayTransRecordInfo record) {
        int rows = getSqlMapClientTemplate().update("pay_trans_record_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayTransRecordInfo record) {
        int rows = getSqlMapClientTemplate().update("pay_trans_record_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayTransRecordInfo> selectByPage(PayTransRecordInfoExample example, Page page) {
        List<PayTransRecordInfo> list = this.searchListPageMyObject("pay_trans_record_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayTransRecordInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayTransRecordInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}