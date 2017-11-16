package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataThirdReqInfo;
import com.fosun.data.dataTask.model.DataThirdReqInfoExample;
import java.util.List;

public interface DataThirdReqInfoDAO {
    int countByExample(DataThirdReqInfoExample example);

    int deleteByExample(DataThirdReqInfoExample example);

    String insert(DataThirdReqInfo record);

    String insertSelective(DataThirdReqInfo record);

    List<DataThirdReqInfo> selectByExampleWithBLOBs(DataThirdReqInfoExample example);

    List<DataThirdReqInfo> selectByExampleWithoutBLOBs(DataThirdReqInfoExample example);

    int updateByExampleSelective(DataThirdReqInfo record, DataThirdReqInfoExample example);

    int updateByExampleWithBLOBs(DataThirdReqInfo record, DataThirdReqInfoExample example);

    int updateByExampleWithoutBLOBs(DataThirdReqInfo record, DataThirdReqInfoExample example);

    List<DataThirdReqInfo> selectByPage(DataThirdReqInfoExample example, Page page);
}