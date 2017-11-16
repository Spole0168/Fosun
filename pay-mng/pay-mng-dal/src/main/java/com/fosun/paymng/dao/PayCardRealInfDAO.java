package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayCardRealInf;
import com.fosun.paymng.model.PayCardRealInfExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayCardRealInfDAO {
    int countByExample(PayCardRealInfExample example);

    int deleteByExample(PayCardRealInfExample example);

    int deleteByPrimaryKey(String recSeqId);

    String insert(PayCardRealInf record);

    String insertSelective(PayCardRealInf record);

    List<PayCardRealInf> selectByExample(PayCardRealInfExample example);

    PayCardRealInf selectByPrimaryKey(String recSeqId);

    int updateByExampleSelective(PayCardRealInf record, PayCardRealInfExample example);

    int updateByExample(PayCardRealInf record, PayCardRealInfExample example);

    int updateByPrimaryKeySelective(PayCardRealInf record);

    int updateByPrimaryKey(PayCardRealInf record);

    List<PayCardRealInf> selectByPage(PayCardRealInfExample example, Page page);
}