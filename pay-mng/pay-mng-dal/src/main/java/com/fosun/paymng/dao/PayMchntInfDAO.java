package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayMchntInf;
import com.fosun.paymng.model.PayMchntInfExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayMchntInfDAO {
    int countByExample(PayMchntInfExample example);

    int deleteByExample(PayMchntInfExample example);

    int deleteByPrimaryKey(String mchntId);

    void insert(PayMchntInf record);

    void insertSelective(PayMchntInf record);

    List<PayMchntInf> selectByExample(PayMchntInfExample example);

    PayMchntInf selectByPrimaryKey(String mchntId);

    int updateByExampleSelective(PayMchntInf record, PayMchntInfExample example);

    int updateByExample(PayMchntInf record, PayMchntInfExample example);

    int updateByPrimaryKeySelective(PayMchntInf record);

    int updateByPrimaryKey(PayMchntInf record);

    List<PayMchntInf> selectByPage(PayMchntInfExample example, Page page);
}