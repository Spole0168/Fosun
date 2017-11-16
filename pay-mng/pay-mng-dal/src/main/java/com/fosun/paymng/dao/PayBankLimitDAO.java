package com.fosun.paymng.dao;


import java.util.List;

import com.fosun.paymng.model.PayBankLimit;
import com.fosun.paymng.model.PayBankLimitExample;
import com.fosun.paymng.model.PayBankLimitKey;
import com.huateng.base.common.beans.Page;

public interface PayBankLimitDAO {
    int countByExample(PayBankLimitExample example);

    int deleteByExample(PayBankLimitExample example);

    int deleteByPrimaryKey(PayBankLimitKey _key);

    void insert(PayBankLimit record);

    void insertSelective(PayBankLimit record);

    List<PayBankLimit> selectByExample(PayBankLimitExample example);

    PayBankLimit selectByPrimaryKey(PayBankLimitKey _key);

    int updateByExampleSelective(PayBankLimit record, PayBankLimitExample example);

    int updateByExample(PayBankLimit record, PayBankLimitExample example);

    int updateByPrimaryKeySelective(PayBankLimit record);

    int updateByPrimaryKey(PayBankLimit record);

    List<PayBankLimit> selectByPage(PayBankLimitExample example, Page page);
}