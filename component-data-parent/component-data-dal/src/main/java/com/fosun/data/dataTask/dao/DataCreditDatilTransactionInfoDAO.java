package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataCreditDatilTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditDatilTransactionInfoExample;
import java.util.List;

public interface DataCreditDatilTransactionInfoDAO {
    int countByExample(DataCreditDatilTransactionInfoExample example);

    int deleteByExample(DataCreditDatilTransactionInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataCreditDatilTransactionInfo record);

    String insertSelective(DataCreditDatilTransactionInfo record);

    List<DataCreditDatilTransactionInfo> selectByExample(DataCreditDatilTransactionInfoExample example);

    DataCreditDatilTransactionInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataCreditDatilTransactionInfo record, DataCreditDatilTransactionInfoExample example);

    int updateByExample(DataCreditDatilTransactionInfo record, DataCreditDatilTransactionInfoExample example);

    int updateByPrimaryKeySelective(DataCreditDatilTransactionInfo record);

    int updateByPrimaryKey(DataCreditDatilTransactionInfo record);

    List<DataCreditDatilTransactionInfo> selectByPage(DataCreditDatilTransactionInfoExample example, Page page);
}