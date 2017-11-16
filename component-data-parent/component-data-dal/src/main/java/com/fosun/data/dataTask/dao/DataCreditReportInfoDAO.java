package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataCreditReportInfo;
import com.fosun.data.dataTask.model.DataCreditReportInfoExample;
import java.util.List;

public interface DataCreditReportInfoDAO {
    int countByExample(DataCreditReportInfoExample example);

    int deleteByExample(DataCreditReportInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataCreditReportInfo record);

    String insertSelective(DataCreditReportInfo record);

    List<DataCreditReportInfo> selectByExample(DataCreditReportInfoExample example);

    DataCreditReportInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataCreditReportInfo record, DataCreditReportInfoExample example);

    int updateByExample(DataCreditReportInfo record, DataCreditReportInfoExample example);

    int updateByPrimaryKeySelective(DataCreditReportInfo record);

    int updateByPrimaryKey(DataCreditReportInfo record);

    List<DataCreditReportInfo> selectByPage(DataCreditReportInfoExample example, Page page);
}