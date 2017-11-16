package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataThirdRepInfo;
import com.fosun.data.dataTask.model.DataThirdRepInfoExample;
import java.util.List;

public interface DataThirdRepInfoDAO {
    int countByExample(DataThirdRepInfoExample example);

    int deleteByExample(DataThirdRepInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataThirdRepInfo record);

    String insertSelective(DataThirdRepInfo record);

    List<DataThirdRepInfo> selectByExampleWithBLOBs(DataThirdRepInfoExample example);

    List<DataThirdRepInfo> selectByExampleWithoutBLOBs(DataThirdRepInfoExample example);

    DataThirdRepInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataThirdRepInfo record, DataThirdRepInfoExample example);

    int updateByExampleWithBLOBs(DataThirdRepInfo record, DataThirdRepInfoExample example);

    int updateByExampleWithoutBLOBs(DataThirdRepInfo record, DataThirdRepInfoExample example);

    int updateByPrimaryKeySelective(DataThirdRepInfo record);

    int updateByPrimaryKeyWithBLOBs(DataThirdRepInfo record);

    int updateByPrimaryKeyWithoutBLOBs(DataThirdRepInfo record);

    List<DataThirdRepInfo> selectByPage(DataThirdRepInfoExample example, Page page);
}