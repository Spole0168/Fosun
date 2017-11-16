package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataCreditBriefTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditBriefTransactionInfoExample;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("DataCreditBriefTransactionInfoDAO")
public class DataCreditBriefTransactionInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataCreditBriefTransactionInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataCreditBriefTransactionInfoDAOImpl() {
        super();
    }

    public int countByExample(DataCreditBriefTransactionInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_credit_brief_transaction_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataCreditBriefTransactionInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_credit_brief_transaction_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataCreditBriefTransactionInfo _key = new DataCreditBriefTransactionInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_credit_brief_transaction_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataCreditBriefTransactionInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_brief_transaction_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataCreditBriefTransactionInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_brief_transaction_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditBriefTransactionInfo> selectByExample(DataCreditBriefTransactionInfoExample example) {
        List<DataCreditBriefTransactionInfo> list = getSqlMapClientTemplate().queryForList("data_credit_brief_transaction_info.selectByExample", example);
        return list;
    }

    public DataCreditBriefTransactionInfo selectByPrimaryKey(String id) {
        DataCreditBriefTransactionInfo _key = new DataCreditBriefTransactionInfo();
        _key.setId(id);
        DataCreditBriefTransactionInfo record = (DataCreditBriefTransactionInfo) getSqlMapClientTemplate().queryForObject("data_credit_brief_transaction_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataCreditBriefTransactionInfo record, DataCreditBriefTransactionInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_brief_transaction_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataCreditBriefTransactionInfo record, DataCreditBriefTransactionInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_brief_transaction_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataCreditBriefTransactionInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_brief_transaction_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(DataCreditBriefTransactionInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_brief_transaction_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditBriefTransactionInfo> selectByPage(DataCreditBriefTransactionInfoExample example, Page page) {
        List<DataCreditBriefTransactionInfo> list = this.searchListPageMyObject("data_credit_brief_transaction_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataCreditBriefTransactionInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataCreditBriefTransactionInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}