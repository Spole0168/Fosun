package com.fosun.data.dataTask.dao;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataCreditBriefOutlineInfo;
import com.fosun.data.dataTask.model.DataCreditBriefOutlineInfoExample;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("DataCreditBriefOutlineInfoDAO")
public class DataCreditBriefOutlineInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataCreditBriefOutlineInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataCreditBriefOutlineInfoDAOImpl() {
        super();
    }

    public int countByExample(DataCreditBriefOutlineInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_credit_brief_outline_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataCreditBriefOutlineInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_credit_brief_outline_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataCreditBriefOutlineInfo _key = new DataCreditBriefOutlineInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_credit_brief_outline_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataCreditBriefOutlineInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_brief_outline_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataCreditBriefOutlineInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_credit_brief_outline_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditBriefOutlineInfo> selectByExample(DataCreditBriefOutlineInfoExample example) {
        List<DataCreditBriefOutlineInfo> list = getSqlMapClientTemplate().queryForList("data_credit_brief_outline_info.selectByExample", example);
        return list;
    }

    public DataCreditBriefOutlineInfo selectByPrimaryKey(String id) {
        DataCreditBriefOutlineInfo _key = new DataCreditBriefOutlineInfo();
        _key.setId(id);
        DataCreditBriefOutlineInfo record = (DataCreditBriefOutlineInfo) getSqlMapClientTemplate().queryForObject("data_credit_brief_outline_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataCreditBriefOutlineInfo record, DataCreditBriefOutlineInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_brief_outline_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(DataCreditBriefOutlineInfo record, DataCreditBriefOutlineInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_credit_brief_outline_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataCreditBriefOutlineInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_brief_outline_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKey(DataCreditBriefOutlineInfo record) {
        int rows = getSqlMapClientTemplate().update("data_credit_brief_outline_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataCreditBriefOutlineInfo> selectByPage(DataCreditBriefOutlineInfoExample example, Page page) {
        List<DataCreditBriefOutlineInfo> list = this.searchListPageMyObject("data_credit_brief_outline_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataCreditBriefOutlineInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataCreditBriefOutlineInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}