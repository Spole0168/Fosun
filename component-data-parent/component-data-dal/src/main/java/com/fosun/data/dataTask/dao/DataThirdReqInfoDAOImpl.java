package com.fosun.data.dataTask.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.fosun.base.common.beans.Page;
import com.fosun.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.fosun.base.ibatisEx.IbatisTemplate;
import com.fosun.data.dataTask.model.DataThirdReqInfo;
import com.fosun.data.dataTask.model.DataThirdReqInfoExample;

@Repository("DataThirdReqInfoDAO")
public class DataThirdReqInfoDAOImpl extends IbatisDaoAnnotation4Template implements DataThirdReqInfoDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public DataThirdReqInfoDAOImpl() {
        super();
    }

    public int countByExample(DataThirdReqInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("data_third_req_info.countByExample", example);
        return count;
    }

    public int deleteByExample(DataThirdReqInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("data_third_req_info.deleteByExample", example);
        return rows;
    }

    public String insert(DataThirdReqInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_third_req_info.insert", record);
        return (String) newKey;
    }

    public String insertSelective(DataThirdReqInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("data_third_req_info.insertSelective", record);
        return (String) newKey;
    }

    @SuppressWarnings("unchecked")
    public List<DataThirdReqInfo> selectByExampleWithBLOBs(DataThirdReqInfoExample example) {
        List<DataThirdReqInfo> list = getSqlMapClientTemplate().queryForList("data_third_req_info.selectByExampleWithBLOBs", example);
        return list;
    }

    @SuppressWarnings("unchecked")
    public List<DataThirdReqInfo> selectByExampleWithoutBLOBs(DataThirdReqInfoExample example) {
        List<DataThirdReqInfo> list = getSqlMapClientTemplate().queryForList("data_third_req_info.selectByExample", example);
        return list;
    }

    public int updateByExampleSelective(DataThirdReqInfo record, DataThirdReqInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_third_req_info.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExampleWithBLOBs(DataThirdReqInfo record, DataThirdReqInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_third_req_info.updateByExampleWithBLOBs", parms);
        return rows;
    }

    public int updateByExampleWithoutBLOBs(DataThirdReqInfo record, DataThirdReqInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("data_third_req_info.updateByExample", parms);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<DataThirdReqInfo> selectByPage(DataThirdReqInfoExample example, Page page) {
        List<DataThirdReqInfo> list = this.searchListPageMyObject("data_third_req_info.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends DataThirdReqInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DataThirdReqInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}