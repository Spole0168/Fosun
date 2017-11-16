package com.fosun.data.dataTask.dao.ext;

import com.fosun.data.dataTask.dao.DataTaskInfoDAO;
import com.fosun.data.dataTask.model.DataTaskInfo;

public interface ExtDataTaskInfoDAO extends DataTaskInfoDAO {

    DataTaskInfo selectByTaskId(String taskId);

}