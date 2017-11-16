package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayTransRecordInfo;
import com.fosun.paymng.model.PayTransRecordInfoExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayTransRecordInfoDAO {
    int countByExample(PayTransRecordInfoExample example);

    int deleteByExample(PayTransRecordInfoExample example);

    int deleteByPrimaryKey(String id);

    String insert(PayTransRecordInfo record);

    String insertSelective(PayTransRecordInfo record);

    List<PayTransRecordInfo> selectByExample(PayTransRecordInfoExample example);

    PayTransRecordInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(PayTransRecordInfo record, PayTransRecordInfoExample example);

    int updateByExample(PayTransRecordInfo record, PayTransRecordInfoExample example);

    int updateByPrimaryKeySelective(PayTransRecordInfo record);

    int updateByPrimaryKey(PayTransRecordInfo record);

    List<PayTransRecordInfo> selectByPage(PayTransRecordInfoExample example, Page page);
}