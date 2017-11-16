package com.fosun.data.dataTask.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataTaskResult;
import com.fosun.data.dataTask.model.DataTaskResultExample;

@Repository("DataTaskResultDAO")
public class DataTaskResultDAOImpl extends IbatisDaoAnnotation4Template implements DataTaskResultDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataTaskResultDAOImpl() {
        super();
    }

    public int countByExample(DataTaskResultExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_task_result.countByExample", example);
        return count;
    }

    public int deleteByExample(DataTaskResultExample example) {
        int rows = getSqlMapClientTemplate().delete("data_task_result.deleteByExample", example);
        return rows;
    }

    public String insert(DataTaskResult record) {
        Object newKey = getSqlMapClientTemplate().insert("data_task_result.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataTaskResult record) {
        Object newKey = getSqlMapClientTemplate().insert("data_task_result.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataTaskResult> selectByExampleWithBLOBs(DataTaskResultExample example) {
        List<DataTaskResult> list = getSqlMapClientTemplate().queryForList("data_task_result.selectByExampleWithBLOBs", example);
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<DataTaskResult> selectByExampleWithoutBLOBs(DataTaskResultExample example) {
        List<DataTaskResult> list = getSqlMapClientTemplate().queryForList("data_task_result.selectByExample", example);
        return list;
    }

    public int updateByExampleSelective(DataTaskResult record, DataTaskResultExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_task_result.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExampleWithBLOBs(DataTaskResult record, DataTaskResultExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_task_result.updateByExampleWithBLOBs", parms);
        return rows;
    }

    public int updateByExampleWithoutBLOBs(DataTaskResult record, DataTaskResultExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_task_result.updateByExample", parms);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataTaskResult> selectByPage(DataTaskResultExample example, Page page) {
        List<DataTaskResult> list = this.searchListPageMyObject("data_task_result.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataTaskResultExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataTaskResultExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}