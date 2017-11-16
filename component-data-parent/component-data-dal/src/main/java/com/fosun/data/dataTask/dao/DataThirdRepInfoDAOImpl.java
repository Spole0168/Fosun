package com.fosun.data.dataTask.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataThirdRepInfo;
import com.fosun.data.dataTask.model.DataThirdRepInfoExample;

@Repository("DataThirdRepInfoDAO")
public class DataThirdRepInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataThirdRepInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataThirdRepInfoDAOImpl() {
        super();
    }

    public int countByExample(DataThirdRepInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_third_rep_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataThirdRepInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_third_rep_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataThirdRepInfo _key = new DataThirdRepInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_third_rep_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataThirdRepInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_third_rep_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataThirdRepInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_third_rep_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataThirdRepInfo> selectByExampleWithBLOBs(DataThirdRepInfoExample example) {
        List<DataThirdRepInfo> list = getSqlMapClientTemplate().queryForList("data_third_rep_info.selectByExampleWithBLOBs", example);
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<DataThirdRepInfo> selectByExampleWithoutBLOBs(DataThirdRepInfoExample example) {
        List<DataThirdRepInfo> list = getSqlMapClientTemplate().queryForList("data_third_rep_info.selectByExample", example);
        return list;
    }

    public DataThirdRepInfo selectByPrimaryKey(String id) {
        DataThirdRepInfo _key = new DataThirdRepInfo();
        _key.setId(id);
        DataThirdRepInfo record = (DataThirdRepInfo) getSqlMapClientTemplate().queryForObject("data_third_rep_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataThirdRepInfo record, DataThirdRepInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_third_rep_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExampleWithBLOBs(DataThirdRepInfo record, DataThirdRepInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_third_rep_info.updateByExampleWithBLOBs", parms);
        return rows;
    }

    public int updateByExampleWithoutBLOBs(DataThirdRepInfo record, DataThirdRepInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_third_rep_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataThirdRepInfo record) {
        int rows = getSqlMapClientTemplate().update("data_third_rep_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(DataThirdRepInfo record) {
        int rows = getSqlMapClientTemplate().update("data_third_rep_info.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(DataThirdRepInfo record) {
        int rows = getSqlMapClientTemplate().update("data_third_rep_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataThirdRepInfo> selectByPage(DataThirdRepInfoExample example, Page page) {
        List<DataThirdRepInfo> list = this.searchListPageMyObject("data_third_rep_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataThirdRepInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataThirdRepInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}