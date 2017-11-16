package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayFundCfg;
import com.fosun.paymng.model.PayFundCfgExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayFundCfgDAO {
    int countByExample(PayFundCfgExample example);

    int deleteByExample(PayFundCfgExample example);

    int deleteByPrimaryKey(String id);

    String insert(PayFundCfg record);

    String insertSelective(PayFundCfg record);

    List<PayFundCfg> selectByExample(PayFundCfgExample example);

    PayFundCfg selectByPrimaryKey(String id);

    int updateByExampleSelective(PayFundCfg record, PayFundCfgExample example);

    int updateByExample(PayFundCfg record, PayFundCfgExample example);

    int updateByPrimaryKeySelective(PayFundCfg record);

    int updateByPrimaryKey(PayFundCfg record);

    List<PayFundCfg> selectByPage(PayFundCfgExample example, Page page);
}