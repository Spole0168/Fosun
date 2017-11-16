package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayCheckBillsFile;
import com.fosun.paymng.model.PayCheckBillsFileExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayCheckBillsFileDAO")
public class PayCheckBillsFileDAOImpl extends IbatisDaoAnnotation4Template implements PayCheckBillsFileDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayCheckBillsFileDAOImpl() {
        super();
    }

    public int countByExample(PayCheckBillsFileExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_check_bills_file.countByExample", example);
        return count;
    }

    public int deleteByExample(PayCheckBillsFileExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_check_bills_file.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        PayCheckBillsFile _key = new PayCheckBillsFile();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("pay_check_bills_file.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(PayCheckBillsFile record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_check_bills_file.insert", record);
        return (String) newKey;
    }

    public String insertSelective(PayCheckBillsFile record) {
        Object newKey = getSqlMapClientTemplate().insert("pay_check_bills_file.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<PayCheckBillsFile> selectByExample(PayCheckBillsFileExample example) {
        List<PayCheckBillsFile> list = getSqlMapClientTemplate().queryForList("pay_check_bills_file.selectByExample", example);
        return list;
    }

    public PayCheckBillsFile selectByPrimaryKey(String id) {
        PayCheckBillsFile _key = new PayCheckBillsFile();
        _key.setId(id);
        PayCheckBillsFile record = (PayCheckBillsFile) getSqlMapClientTemplate().queryForObject("pay_check_bills_file.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(PayCheckBillsFile record, PayCheckBillsFileExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_check_bills_file.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayCheckBillsFile record, PayCheckBillsFileExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_check_bills_file.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(PayCheckBillsFile record) {
        int rows = getSqlMapClientTemplate().update("pay_check_bills_file.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(PayCheckBillsFile record) {
        int rows = getSqlMapClientTemplate().update("pay_check_bills_file.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayCheckBillsFile> selectByPage(PayCheckBillsFileExample example, Page page) {
        List<PayCheckBillsFile> list = this.searchListPageMyObject("pay_check_bills_file.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayCheckBillsFileExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayCheckBillsFileExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}