package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayChanlPayLog;
import com.fosun.paymng.model.PayChanlPayLogExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayChanlPayLogDAO {
    int countByExample(PayChanlPayLogExample example);

    int deleteByExample(PayChanlPayLogExample example);

    int deleteByPrimaryKey(String transPayId);

    String insert(PayChanlPayLog record);

    String insertSelective(PayChanlPayLog record);

    List<PayChanlPayLog> selectByExample(PayChanlPayLogExample example);

    PayChanlPayLog selectByPrimaryKey(String transPayId);

    int updateByExampleSelective(PayChanlPayLog record, PayChanlPayLogExample example);

    int updateByExample(PayChanlPayLog record, PayChanlPayLogExample example);

    int updateByPrimaryKeySelective(PayChanlPayLog record);

    int updateByPrimaryKey(PayChanlPayLog record);

    List<PayChanlPayLog> selectByPage(PayChanlPayLogExample example, Page page);
}