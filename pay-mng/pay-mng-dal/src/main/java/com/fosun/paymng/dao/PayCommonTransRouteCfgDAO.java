package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayCommonTransRouteCfg;
import com.fosun.paymng.model.PayCommonTransRouteCfgExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayCommonTransRouteCfgDAO {
    int countByExample(PayCommonTransRouteCfgExample example);

    int deleteByExample(PayCommonTransRouteCfgExample example);

    void insert(PayCommonTransRouteCfg record);

    void insertSelective(PayCommonTransRouteCfg record);

    List<PayCommonTransRouteCfg> selectByExample(PayCommonTransRouteCfgExample example);

    int updateByExampleSelective(PayCommonTransRouteCfg record, PayCommonTransRouteCfgExample example);

    int updateByExample(PayCommonTransRouteCfg record, PayCommonTransRouteCfgExample example);

    List<PayCommonTransRouteCfg> selectByPage(PayCommonTransRouteCfgExample example, Page page);
}