package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataCreditDatilOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditDatilOutlineInfoExample;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("DataCreditDatilOutlineInfoDAO")
public class DataCreditDatilOutlineInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataCreditDatilOutlineInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataCreditDatilOutlineInfoDAOImpl() {
        super();
    }

    public int countByExample(DataCreditDatilOutlineInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_credit_datil_outline_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataCreditDatilOutlineInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_credit_datil_outline_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataCreditDatilOutlineInfo _key = new DataCreditDatilOutlineInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_credit_datil_outline_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataCreditDatilOutlineInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_datil_outline_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataCreditDatilOutlineInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_datil_outline_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditDatilOutlineInfo> selectByExample(DataCreditDatilOutlineInfoExample example) {
        List<DataCreditDatilOutlineInfo> list = getSqlMapClientTemplate().queryForList("data_credit_datil_outline_info.selectByExample", example);
        return list;
    }

    public DataCreditDatilOutlineInfo selectByPrimaryKey(String id) {
        DataCreditDatilOutlineInfo _key = new DataCreditDatilOutlineInfo();
        _key.setId(id);
        DataCreditDatilOutlineInfo record = (DataCreditDatilOutlineInfo) getSqlMapClientTemplate().queryForObject("data_credit_datil_outline_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataCreditDatilOutlineInfo record, DataCreditDatilOutlineInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_datil_outline_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataCreditDatilOutlineInfo record, DataCreditDatilOutlineInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_datil_outline_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataCreditDatilOutlineInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_datil_outline_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(DataCreditDatilOutlineInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_datil_outline_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditDatilOutlineInfo> selectByPage(DataCreditDatilOutlineInfoExample example, Page page) {
        List<DataCreditDatilOutlineInfo> list = this.searchListPageMyObject("data_credit_datil_outline_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataCreditDatilOutlineInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataCreditDatilOutlineInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}