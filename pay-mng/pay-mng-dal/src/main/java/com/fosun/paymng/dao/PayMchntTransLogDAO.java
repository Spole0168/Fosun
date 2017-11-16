package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayMchntTransLog;
import com.fosun.paymng.model.PayMchntTransLogExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayMchntTransLogDAO {
    int countByExample(PayMchntTransLogExample example);

    int deleteByExample(PayMchntTransLogExample example);

    int deleteByPrimaryKey(String transSeqId);

    String insert(PayMchntTransLog record);

    String insertSelective(PayMchntTransLog record);

    List<PayMchntTransLog> selectByExample(PayMchntTransLogExample example);

    PayMchntTransLog selectByPrimaryKey(String transSeqId);

    int updateByExampleSelective(PayMchntTransLog record, PayMchntTransLogExample example);

    int updateByExample(PayMchntTransLog record, PayMchntTransLogExample example);

    int updateByPrimaryKeySelective(PayMchntTransLog record);

    int updateByPrimaryKey(PayMchntTransLog record);

    List<PayMchntTransLog> selectByPage(PayMchntTransLogExample example, Page page);
}