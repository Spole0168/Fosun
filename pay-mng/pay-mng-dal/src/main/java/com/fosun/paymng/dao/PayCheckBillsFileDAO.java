package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayCheckBillsFile;
import com.fosun.paymng.model.PayCheckBillsFileExample;
import com.huateng.base.common.beans.Page;
import java.util.List;

public interface PayCheckBillsFileDAO {
    int countByExample(PayCheckBillsFileExample example);

    int deleteByExample(PayCheckBillsFileExample example);

    int deleteByPrimaryKey(String id);

    String insert(PayCheckBillsFile record);

    String insertSelective(PayCheckBillsFile record);

    List<PayCheckBillsFile> selectByExample(PayCheckBillsFileExample example);

    PayCheckBillsFile selectByPrimaryKey(String id);

    int updateByExampleSelective(PayCheckBillsFile record, PayCheckBillsFileExample example);

    int updateByExample(PayCheckBillsFile record, PayCheckBillsFileExample example);

    int updateByPrimaryKeySelective(PayCheckBillsFile record);

    int updateByPrimaryKey(PayCheckBillsFile record);

    List<PayCheckBillsFile> selectByPage(PayCheckBillsFileExample example, Page page);
}