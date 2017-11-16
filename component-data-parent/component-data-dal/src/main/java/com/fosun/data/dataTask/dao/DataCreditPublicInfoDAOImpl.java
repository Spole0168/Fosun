package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataCreditPublicInfo;
import com.fosun.data.dataTask.model.DataCreditPublicInfoExample;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("DataCreditPublicInfoDAO")
public class DataCreditPublicInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataCreditPublicInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataCreditPublicInfoDAOImpl() {
        super();
    }

    public int countByExample(DataCreditPublicInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_credit_public_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataCreditPublicInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_credit_public_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataCreditPublicInfo _key = new DataCreditPublicInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_credit_public_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataCreditPublicInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_public_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataCreditPublicInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_public_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditPublicInfo> selectByExample(DataCreditPublicInfoExample example) {
        List<DataCreditPublicInfo> list = getSqlMapClientTemplate().queryForList("data_credit_public_info.selectByExample", example);
        return list;
    }

    public DataCreditPublicInfo selectByPrimaryKey(String id) {
        DataCreditPublicInfo _key = new DataCreditPublicInfo();
        _key.setId(id);
        DataCreditPublicInfo record = (DataCreditPublicInfo) getSqlMapClientTemplate().queryForObject("data_credit_public_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataCreditPublicInfo record, DataCreditPublicInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_public_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataCreditPublicInfo record, DataCreditPublicInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_public_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataCreditPublicInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_public_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(DataCreditPublicInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_public_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditPublicInfo> selectByPage(DataCreditPublicInfoExample example, Page page) {
        List<DataCreditPublicInfo> list = this.searchListPageMyObject("data_credit_public_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataCreditPublicInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataCreditPublicInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}