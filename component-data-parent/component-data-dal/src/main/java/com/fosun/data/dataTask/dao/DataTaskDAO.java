package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataTask;
import com.fosun.data.dataTask.model.DataTaskExample;
import java.util.List;

public interface DataTaskDAO {
    int countByExample(DataTaskExample example);

    int deleteByExample(DataTaskExample example);

    String insert(DataTask record);

    String insertSelective(DataTask record);

    List<DataTask> selectByExample(DataTaskExample example);

    int updateByExampleSelective(DataTask record, DataTaskExample example);

    int updateByExample(DataTask record, DataTaskExample example);

    List<DataTask> selectByPage(DataTaskExample example, Page page);
}