package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataCreditReportInfo;
import com.fosun.data.dataTask.model.DataCreditReportInfoExample;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("DataCreditReportInfoDAO")
public class DataCreditReportInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataCreditReportInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataCreditReportInfoDAOImpl() {
        super();
    }

    public int countByExample(DataCreditReportInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_credit_report_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataCreditReportInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_credit_report_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataCreditReportInfo _key = new DataCreditReportInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_credit_report_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataCreditReportInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_report_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataCreditReportInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_report_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditReportInfo> selectByExample(DataCreditReportInfoExample example) {
        List<DataCreditReportInfo> list = getSqlMapClientTemplate().queryForList("data_credit_report_info.selectByExample", example);
        return list;
    }

    public DataCreditReportInfo selectByPrimaryKey(String id) {
        DataCreditReportInfo _key = new DataCreditReportInfo();
        _key.setId(id);
        DataCreditReportInfo record = (DataCreditReportInfo) getSqlMapClientTemplate().queryForObject("data_credit_report_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataCreditReportInfo record, DataCreditReportInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_report_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataCreditReportInfo record, DataCreditReportInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_report_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataCreditReportInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_report_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(DataCreditReportInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_report_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditReportInfo> selectByPage(DataCreditReportInfoExample example, Page page) {
        List<DataCreditReportInfo> list = this.searchListPageMyObject("data_credit_report_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataCreditReportInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataCreditReportInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}