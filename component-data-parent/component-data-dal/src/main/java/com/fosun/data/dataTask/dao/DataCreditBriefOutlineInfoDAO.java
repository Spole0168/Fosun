package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.data.dataTask.model.DataCreditBriefOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditBriefOutlineInfoExample;
import java.util.List;

public interface DataCreditBriefOutlineInfoDAO {
    int countByExample(DataCreditBriefOutlineInfoExample example);

    int deleteByExample(DataCreditBriefOutlineInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(DataCreditBriefOutlineInfo record);

    String insertSelective(DataCreditBriefOutlineInfo record);

    List<DataCreditBriefOutlineInfo> selectByExample(DataCreditBriefOutlineInfoExample example);

    DataCreditBriefOutlineInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(DataCreditBriefOutlineInfo record, DataCreditBriefOutlineInfoExample example);

    int updateByExample(DataCreditBriefOutlineInfo record, DataCreditBriefOutlineInfoExample example);

    int updateByPrimaryKeySelective(DataCreditBriefOutlineInfo record);

    int updateByPrimaryKey(DataCreditBriefOutlineInfo record);

    List<DataCreditBriefOutlineInfo> selectByPage(DataCreditBriefOutlineInfoExample example, Page page);
}