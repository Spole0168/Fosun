package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataCreditQueryInfo;
import com.fosun.data.dataTask.model.DataCreditQueryInfoExample;
import java.util.List;

public interface DataCreditQueryInfoDAO {
    int countByExample(DataCreditQueryInfoExample example);

    int deleteByExample(DataCreditQueryInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataCreditQueryInfo record);

    String insertSelective(DataCreditQueryInfo record);

    List<DataCreditQueryInfo> selectByExample(DataCreditQueryInfoExample example);

    DataCreditQueryInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataCreditQueryInfo record, DataCreditQueryInfoExample example);

    int updateByExample(DataCreditQueryInfo record, DataCreditQueryInfoExample example);

    int updateByPrimaryKeySelective(DataCreditQueryInfo record);

    int updateByPrimaryKey(DataCreditQueryInfo record);

    List<DataCreditQueryInfo> selectByPage(DataCreditQueryInfoExample example, Page page);
}