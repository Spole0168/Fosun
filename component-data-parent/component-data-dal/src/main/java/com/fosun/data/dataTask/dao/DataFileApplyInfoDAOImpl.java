package com.fosun.data.dataTask.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataFileApplyInfo;
import com.fosun.data.dataTask.model.DataFileApplyInfoExample;

@Repository("DataFileApplyInfoDAO")
public class DataFileApplyInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataFileApplyInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataFileApplyInfoDAOImpl() {
        super();
    }

    public int countByExample(DataFileApplyInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_file_apply_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataFileApplyInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_file_apply_info.deleteByExample", example);
        return rows;
    }

    public int deleteByPrimaryKey(String id) {
        DataFileApplyInfo _key = new DataFileApplyInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("data_file_apply_info.deleteByPrimaryKey", _key);
        return rows;
    }

    public String insert(DataFileApplyInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_file_apply_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataFileApplyInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_file_apply_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataFileApplyInfo> selectByExampleWithBLOBs(DataFileApplyInfoExample example) {
        List<DataFileApplyInfo> list = getSqlMapClientTemplate().queryForList("data_file_apply_info.selectByExampleWithBLOBs", example);
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<DataFileApplyInfo> selectByExampleWithoutBLOBs(DataFileApplyInfoExample example) {
        List<DataFileApplyInfo> list = getSqlMapClientTemplate().queryForList("data_file_apply_info.selectByExample", example);
        return list;
    }

    public DataFileApplyInfo selectByPrimaryKey(String id) {
        DataFileApplyInfo _key = new DataFileApplyInfo();
        _key.setId(id);
        DataFileApplyInfo record = (DataFileApplyInfo) getSqlMapClientTemplate().queryForObject("data_file_apply_info.selectByPrimaryKey", _key);
        return record;
    }

    public int updateByExampleSelective(DataFileApplyInfo record, DataFileApplyInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_file_apply_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExampleWithBLOBs(DataFileApplyInfo record, DataFileApplyInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_file_apply_info.updateByExampleWithBLOBs", parms);
        return rows;
    }

    public int updateByExampleWithoutBLOBs(DataFileApplyInfo record, DataFileApplyInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_file_apply_info.updateByExample", parms);
        return rows;
    }

    public int updateByPrimaryKeySelective(DataFileApplyInfo record) {
        int rows = getSqlMapClientTemplate().update("data_file_apply_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    public int updateByPrimaryKeyWithBLOBs(DataFileApplyInfo record) {
        int rows = getSqlMapClientTemplate().update("data_file_apply_info.updateByPrimaryKeyWithBLOBs", record);
        return rows;
    }

    public int updateByPrimaryKeyWithoutBLOBs(DataFileApplyInfo record) {
        int rows = getSqlMapClientTemplate().update("data_file_apply_info.updateByPrimaryKey", record);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataFileApplyInfo> selectByPage(DataFileApplyInfoExample example, Page page) {
        List<DataFileApplyInfo> list = this.searchListPageMyObject("data_file_apply_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataFileApplyInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataFileApplyInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}