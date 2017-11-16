package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataTaskInfo;
import com.fosun.data.dataTask.model.DataTaskInfoExample;
import java.util.List;

public interface DataTaskInfoDAO {
    int countByExample(DataTaskInfoExample example);

    int deleteByExample(DataTaskInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataTaskInfo record);

    String insertSelective(DataTaskInfo record);

    List<DataTaskInfo> selectByExample(DataTaskInfoExample example);

    DataTaskInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataTaskInfo record, DataTaskInfoExample example);

    int updateByExample(DataTaskInfo record, DataTaskInfoExample example);

    int updateByPrimaryKeySelective(DataTaskInfo record);

    int updateByPrimaryKey(DataTaskInfo record);

    List<DataTaskInfo> selectByPage(DataTaskInfoExample example, Page page);
}