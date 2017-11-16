package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayBankInf;
import com.fosun.paymng.model.PayBankInfExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayBankInfDAO {
    int countByExample(PayBankInfExample example);

    int deleteByExample(PayBankInfExample example);

    int deleteByPrimaryKey(String bankId);

    void insert(PayBankInf record);

    void insertSelective(PayBankInf record);

    List<PayBankInf> selectByExample(PayBankInfExample example);

    PayBankInf selectByPrimaryKey(String bankId);

    int updateByExampleSelective(PayBankInf record, PayBankInfExample example);

    int updateByExample(PayBankInf record, PayBankInfExample example);

    int updateByPrimaryKeySelective(PayBankInf record);

    int updateByPrimaryKey(PayBankInf record);

    List<PayBankInf> selectByPage(PayBankInfExample example, Page page);
}