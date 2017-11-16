package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataTask;
import com.fosun.data.dataTask.model.DataTaskExample;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("DataTaskDAO")
public class DataTaskDAOImpl extends IbatisDaoAnnotation4Template implements DataTaskDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataTaskDAOImpl() {
        super();
    }

    public int countByExample(DataTaskExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_task.countByExample", example);
        return count;
    }

    public int deleteByExample(DataTaskExample example) {
        int rows = getSqlMapClientTemplate().delete("data_task.deleteByExample", example);
        return rows;
    }

    public String insert(DataTask record) {
        Object newKey = getSqlMapClientTemplate().insert("data_task.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataTask record) {
        Object newKey = getSqlMapClientTemplate().insert("data_task.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataTask> selectByExample(DataTaskExample example) {
        List<DataTask> list = getSqlMapClientTemplate().queryForList("data_task.selectByExample", example);
        return list;
    }

    public int updateByExampleSelective(DataTask record, DataTaskExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_task.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataTask record, DataTaskExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_task.updateByExample", parms);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataTask> selectByPage(DataTaskExample example, Page page) {
        List<DataTask> list = this.searchListPageMyObject("data_task.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataTaskExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataTaskExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}