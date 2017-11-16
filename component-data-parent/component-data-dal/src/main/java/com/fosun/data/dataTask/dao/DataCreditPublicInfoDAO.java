package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataCreditPublicInfo;
import com.fosun.data.dataTask.model.DataCreditPublicInfoExample;
import java.util.List;

public interface DataCreditPublicInfoDAO {
    int countByExample(DataCreditPublicInfoExample example);

    int deleteByExample(DataCreditPublicInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataCreditPublicInfo record);

    String insertSelective(DataCreditPublicInfo record);

    List<DataCreditPublicInfo> selectByExample(DataCreditPublicInfoExample example);

    DataCreditPublicInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataCreditPublicInfo record, DataCreditPublicInfoExample example);

    int updateByExample(DataCreditPublicInfo record, DataCreditPublicInfoExample example);

    int updateByPrimaryKeySelective(DataCreditPublicInfo record);

    int updateByPrimaryKey(DataCreditPublicInfo record);

    List<DataCreditPublicInfo> selectByPage(DataCreditPublicInfoExample example, Page page);
}