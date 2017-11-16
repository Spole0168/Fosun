package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataCreditQueryInfo;
import com.fosun.data.dataTask.model.DataCreditQueryInfoExample;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("DataCreditQueryInfoDAO")
public class DataCreditQueryInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataCreditQueryInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataCreditQueryInfoDAOImpl() {
        super();
    }

    public int countByExample(DataCreditQueryInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_credit_query_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataCreditQueryInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_credit_query_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataCreditQueryInfo _key = new DataCreditQueryInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_credit_query_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataCreditQueryInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_query_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataCreditQueryInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_query_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditQueryInfo> selectByExample(DataCreditQueryInfoExample example) {
        List<DataCreditQueryInfo> list = getSqlMapClientTemplate().queryForList("data_credit_query_info.selectByExample", example);
        return list;
    }

    public DataCreditQueryInfo selectByPrimaryKey(String id) {
        DataCreditQueryInfo _key = new DataCreditQueryInfo();
        _key.setId(id);
        DataCreditQueryInfo record = (DataCreditQueryInfo) getSqlMapClientTemplate().queryForObject("data_credit_query_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataCreditQueryInfo record, DataCreditQueryInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_query_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataCreditQueryInfo record, DataCreditQueryInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_query_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataCreditQueryInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_query_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(DataCreditQueryInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_query_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditQueryInfo> selectByPage(DataCreditQueryInfoExample example, Page page) {
        List<DataCreditQueryInfo> list = this.searchListPageMyObject("data_credit_query_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataCreditQueryInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataCreditQueryInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}