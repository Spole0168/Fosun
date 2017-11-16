package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayChnlInf;
import com.fosun.paymng.model.PayChnlInfExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayChnlInfDAO {
    int countByExample(PayChnlInfExample example);

    int deleteByExample(PayChnlInfExample example);

    int deleteByPrimaryKey(String chnlId);

    void insert(PayChnlInf record);

    void insertSelective(PayChnlInf record);

    List<PayChnlInf> selectByExample(PayChnlInfExample example);

    PayChnlInf selectByPrimaryKey(String chnlId);

    int updateByExampleSelective(PayChnlInf record, PayChnlInfExample example);

    int updateByExample(PayChnlInf record, PayChnlInfExample example);

    int updateByPrimaryKeySelective(PayChnlInf record);

    int updateByPrimaryKey(PayChnlInf record);

    List<PayChnlInf> selectByPage(PayChnlInfExample example, Page page);
}