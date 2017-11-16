package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayBillFileDtl;
import com.fosun.paymng.model.PayBillFileDtlExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayBillFileDtlDAO {
    int countByExample(PayBillFileDtlExample example);

    int deleteByExample(PayBillFileDtlExample example);

    int deleteByPrimaryKey(String id);

    String insert(PayBillFileDtl record);

    String insertSelective(PayBillFileDtl record);

    List<PayBillFileDtl> selectByExample(PayBillFileDtlExample example);

    PayBillFileDtl selectByPrimaryKey(String id);

    int updateByExampleSelective(PayBillFileDtl record, PayBillFileDtlExample example);

    int updateByExample(PayBillFileDtl record, PayBillFileDtlExample example);

    int updateByPrimaryKeySelective(PayBillFileDtl record);

    int updateByPrimaryKey(PayBillFileDtl record);

    List<PayBillFileDtl> selectByPage(PayBillFileDtlExample example, Page page);
}