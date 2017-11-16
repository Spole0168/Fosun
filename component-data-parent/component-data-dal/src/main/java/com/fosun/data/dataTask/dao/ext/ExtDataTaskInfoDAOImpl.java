package com.fosun.data.dataTask.dao.ext;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.dao.DataTaskInfoDAOImpl;
import com.fosun.data.dataTask.model.DataTaskInfo;
@Qualifier
public class ExtDataTaskInfoDAOImpl extends DataTaskInfoDAOImpl implements ExtDataTaskInfoDAO {
	@Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public ExtDataTaskInfoDAOImpl() {
        super();
    }

    public DataTaskInfo selectByTaskId(String taskId) {
        DataTaskInfo _key = new DataTaskInfo();
        _key.setTaskId(taskId);
        DataTaskInfo record = (DataTaskInfo) getSqlMapClientTemplate().queryForObject("ext_data_task_info.selectByTaskId", _key);
        return record;
    }

}