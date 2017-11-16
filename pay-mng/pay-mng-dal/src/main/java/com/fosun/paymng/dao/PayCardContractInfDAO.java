package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayCardContractInf;
import com.fosun.paymng.model.PayCardContractInfExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayCardContractInfDAO {
    int countByExample(PayCardContractInfExample example);

    int deleteByExample(PayCardContractInfExample example);

    int deleteByPrimaryKey(String recSeqId);

    String insert(PayCardContractInf record);

    String insertSelective(PayCardContractInf record);

    List<PayCardContractInf> selectByExampleWithBLOBs(PayCardContractInfExample example);

    List<PayCardContractInf> selectByExampleWithoutBLOBs(PayCardContractInfExample example);

    PayCardContractInf selectByPrimaryKey(String recSeqId);

    int updateByExampleSelective(PayCardContractInf record, PayCardContractInfExample example);

    int updateByExampleWithBLOBs(PayCardContractInf record, PayCardContractInfExample example);

    int updateByExampleWithoutBLOBs(PayCardContractInf record, PayCardContractInfExample example);

    int updateByPrimaryKeySelective(PayCardContractInf record);

    int updateByPrimaryKeyWithBLOBs(PayCardContractInf record);

    int updateByPrimaryKeyWithoutBLOBs(PayCardContractInf record);

    List<PayCardContractInf> selectByPage(PayCardContractInfExample example, Page page);
}