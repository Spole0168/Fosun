package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataFileApplyInfo;
import com.fosun.data.dataTask.model.DataFileApplyInfoExample;
import java.util.List;

public interface DataFileApplyInfoDAO {
    int countByExample(DataFileApplyInfoExample example);

    int deleteByExample(DataFileApplyInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataFileApplyInfo record);

    String insertSelective(DataFileApplyInfo record);

    List<DataFileApplyInfo> selectByExampleWithBLOBs(DataFileApplyInfoExample example);

    List<DataFileApplyInfo> selectByExampleWithoutBLOBs(DataFileApplyInfoExample example);

    DataFileApplyInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataFileApplyInfo record, DataFileApplyInfoExample example);

    int updateByExampleWithBLOBs(DataFileApplyInfo record, DataFileApplyInfoExample example);

    int updateByExampleWithoutBLOBs(DataFileApplyInfo record, DataFileApplyInfoExample example);

    int updateByPrimaryKeySelective(DataFileApplyInfo record);

    int updateByPrimaryKeyWithBLOBs(DataFileApplyInfo record);

    int updateByPrimaryKeyWithoutBLOBs(DataFileApplyInfo record);

    List<DataFileApplyInfo> selectByPage(DataFileApplyInfoExample example, Page page);
}