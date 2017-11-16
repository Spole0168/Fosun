package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayTxnChnlRouteCfg;
import com.fosun.paymng.model.PayTxnChnlRouteCfgExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayTxnChnlRouteCfgDAO {
    int countByExample(PayTxnChnlRouteCfgExample example);

    int deleteByExample(PayTxnChnlRouteCfgExample example);

    void insert(PayTxnChnlRouteCfg record);

    void insertSelective(PayTxnChnlRouteCfg record);

    List<PayTxnChnlRouteCfg> selectByExample(PayTxnChnlRouteCfgExample example);

    int updateByExampleSelective(PayTxnChnlRouteCfg record, PayTxnChnlRouteCfgExample example);

    int updateByExample(PayTxnChnlRouteCfg record, PayTxnChnlRouteCfgExample example);

    List<PayTxnChnlRouteCfg> selectByPage(PayTxnChnlRouteCfgExample example, Page page);
}