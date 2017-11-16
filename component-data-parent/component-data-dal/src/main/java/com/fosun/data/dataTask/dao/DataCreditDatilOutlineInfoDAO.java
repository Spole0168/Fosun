package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataCreditDatilOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditDatilOutlineInfoExample;
import java.util.List;

public interface DataCreditDatilOutlineInfoDAO {
    int countByExample(DataCreditDatilOutlineInfoExample example);

    int deleteByExample(DataCreditDatilOutlineInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataCreditDatilOutlineInfo record);

    String insertSelective(DataCreditDatilOutlineInfo record);

    List<DataCreditDatilOutlineInfo> selectByExample(DataCreditDatilOutlineInfoExample example);

    DataCreditDatilOutlineInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataCreditDatilOutlineInfo record, DataCreditDatilOutlineInfoExample example);

    int updateByExample(DataCreditDatilOutlineInfo record, DataCreditDatilOutlineInfoExample example);

    int updateByPrimaryKeySelective(DataCreditDatilOutlineInfo record);

    int updateByPrimaryKey(DataCreditDatilOutlineInfo record);

    List<DataCreditDatilOutlineInfo> selectByPage(DataCreditDatilOutlineInfoExample example, Page page);
}