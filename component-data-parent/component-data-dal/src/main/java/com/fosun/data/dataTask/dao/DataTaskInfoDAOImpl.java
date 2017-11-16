package com.fosun.data.dataTask.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataTaskInfo;
import com.fosun.data.dataTask.model.DataTaskInfoExample;

@Repository("DataTaskInfoDAO")
public class DataTaskInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataTaskInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataTaskInfoDAOImpl() {
        super();
    }

    public int countByExample(DataTaskInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_task_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataTaskInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_task_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataTaskInfo _key = new DataTaskInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_task_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataTaskInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_task_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataTaskInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_task_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataTaskInfo> selectByExample(DataTaskInfoExample example) {
        List<DataTaskInfo> list = getSqlMapClientTemplate().queryForList("data_task_info.selectByExample", example);
        return list;
    }

    public DataTaskInfo selectByPrimaryKey(String id) {
        DataTaskInfo _key = new DataTaskInfo();
        _key.setId(id);
        DataTaskInfo record = (DataTaskInfo) getSqlMapClientTemplate().queryForObject("data_task_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataTaskInfo record, DataTaskInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_task_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataTaskInfo record, DataTaskInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_task_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataTaskInfo record) {
        int rows = getSqlMapClientTemplate().update("data_task_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(DataTaskInfo record) {
        int rows = getSqlMapClientTemplate().update("data_task_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataTaskInfo> selectByPage(DataTaskInfoExample example, Page page) {
        List<DataTaskInfo> list = this.searchListPageMyObject("data_task_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataTaskInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataTaskInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}