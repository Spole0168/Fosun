package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataCreditDatilTransactionInfo;
import com.fosun.data.dataTask.model.DataCreditDatilTransactionInfoExample;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("DataCreditDatilTransactionInfoDAO")
public class DataCreditDatilTransactionInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataCreditDatilTransactionInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataCreditDatilTransactionInfoDAOImpl() {
        super();
    }

    public int countByExample(DataCreditDatilTransactionInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_credit_datil_transaction_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataCreditDatilTransactionInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_credit_datil_transaction_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataCreditDatilTransactionInfo _key = new DataCreditDatilTransactionInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_credit_datil_transaction_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataCreditDatilTransactionInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_datil_transaction_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataCreditDatilTransactionInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_datil_transaction_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditDatilTransactionInfo> selectByExample(DataCreditDatilTransactionInfoExample example) {
        List<DataCreditDatilTransactionInfo> list = getSqlMapClientTemplate().queryForList("data_credit_datil_transaction_info.selectByExample", example);
        return list;
    }

    public DataCreditDatilTransactionInfo selectByPrimaryKey(String id) {
        DataCreditDatilTransactionInfo _key = new DataCreditDatilTransactionInfo();
        _key.setId(id);
        DataCreditDatilTransactionInfo record = (DataCreditDatilTransactionInfo) getSqlMapClientTemplate().queryForObject("data_credit_datil_transaction_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataCreditDatilTransactionInfo record, DataCreditDatilTransactionInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_datil_transaction_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataCreditDatilTransactionInfo record, DataCreditDatilTransactionInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_datil_transaction_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataCreditDatilTransactionInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_datil_transaction_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(DataCreditDatilTransactionInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_datil_transaction_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditDatilTransactionInfo> selectByPage(DataCreditDatilTransactionInfoExample example, Page page) {
        List<DataCreditDatilTransactionInfo> list = this.searchListPageMyObject("data_credit_datil_transaction_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataCreditDatilTransactionInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataCreditDatilTransactionInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}