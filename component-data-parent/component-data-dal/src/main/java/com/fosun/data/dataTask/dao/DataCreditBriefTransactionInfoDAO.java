package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataCreditBriefTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditBriefTransactionInfoExample;
import java.util.List;

public interface DataCreditBriefTransactionInfoDAO {
    int countByExample(DataCreditBriefTransactionInfoExample example);

    int deleteByExample(DataCreditBriefTransactionInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataCreditBriefTransactionInfo record);

    String insertSelective(DataCreditBriefTransactionInfo record);

    List<DataCreditBriefTransactionInfo> selectByExample(DataCreditBriefTransactionInfoExample example);

    DataCreditBriefTransactionInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataCreditBriefTransactionInfo record, DataCreditBriefTransactionInfoExample example);

    int updateByExample(DataCreditBriefTransactionInfo record, DataCreditBriefTransactionInfoExample example);

    int updateByPrimaryKeySelective(DataCreditBriefTransactionInfo record);

    int updateByPrimaryKey(DataCreditBriefTransactionInfo record);

    List<DataCreditBriefTransactionInfo> selectByPage(DataCreditBriefTransactionInfoExample example, Page page);
}