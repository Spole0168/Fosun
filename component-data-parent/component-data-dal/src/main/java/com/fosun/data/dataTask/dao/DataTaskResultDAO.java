package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataTaskResult;
import com.fosun.data.dataTask.model.DataTaskResultExample;
import java.util.List;

public interface DataTaskResultDAO {
    int countByExample(DataTaskResultExample example);

    int deleteByExample(DataTaskResultExample example);

    String insert(DataTaskResult record);

    String insertSelective(DataTaskResult record);

    List<DataTaskResult> selectByExampleWithBLOBs(DataTaskResultExample example);

    List<DataTaskResult> selectByExampleWithoutBLOBs(DataTaskResultExample example);

    int updateByExampleSelective(DataTaskResult record, DataTaskResultExample example);

    int updateByExampleWithBLOBs(DataTaskResult record, DataTaskResultExample example);

    int updateByExampleWithoutBLOBs(DataTaskResult record, DataTaskResultExample example);

    List<DataTaskResult> selectByPage(DataTaskResultExample example, Page page);
}