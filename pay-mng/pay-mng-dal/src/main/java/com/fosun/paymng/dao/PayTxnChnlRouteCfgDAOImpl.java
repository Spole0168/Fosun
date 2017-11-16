package com.fosun.paymng.dao;

import com.fosun.paymng.model.PayTxnChnlRouteCfg;
import com.fosun.paymng.model.PayTxnChnlRouteCfgExample;
import com.huateng.base.common.beans.Page;
import com.huateng.base.ibatisEx.IbatisDaoAnnotation4Template;
import com.huateng.base.ibatisEx.IbatisTemplate;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;

@Repository("PayTxnChnlRouteCfgDAO")
public class PayTxnChnlRouteCfgDAOImpl extends IbatisDaoAnnotation4Template implements PayTxnChnlRouteCfgDAO {
    @Resource(name="sqlMapClientTemplate")
    private IbatisTemplate template;

    public PayTxnChnlRouteCfgDAOImpl() {
        super();
    }

    public int countByExample(PayTxnChnlRouteCfgExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("pay_txn_chnl_route_cfg.countByExample", example);
        return count;
    }

    public int deleteByExample(PayTxnChnlRouteCfgExample example) {
        int rows = getSqlMapClientTemplate().delete("pay_txn_chnl_route_cfg.deleteByExample", example);
        return rows;
    }

    public void insert(PayTxnChnlRouteCfg record) {
        getSqlMapClientTemplate().insert("pay_txn_chnl_route_cfg.insert", record);
    }

    public void insertSelective(PayTxnChnlRouteCfg record) {
        getSqlMapClientTemplate().insert("pay_txn_chnl_route_cfg.insertSelective", record);
    }

    @SuppressWarnings("unchecked")
    public List<PayTxnChnlRouteCfg> selectByExample(PayTxnChnlRouteCfgExample example) {
        List<PayTxnChnlRouteCfg> list = getSqlMapClientTemplate().queryForList("pay_txn_chnl_route_cfg.selectByExample", example);
        return list;
    }

    public int updateByExampleSelective(PayTxnChnlRouteCfg record, PayTxnChnlRouteCfgExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_txn_chnl_route_cfg.updateByExampleSelective", parms);
        return rows;
    }

    public int updateByExample(PayTxnChnlRouteCfg record, PayTxnChnlRouteCfgExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("pay_txn_chnl_route_cfg.updateByExample", parms);
        return rows;
    }

    @SuppressWarnings("unchecked")
    public List<PayTxnChnlRouteCfg> selectByPage(PayTxnChnlRouteCfgExample example, Page page) {
        List<PayTxnChnlRouteCfg> list = this.searchListPageMyObject("pay_txn_chnl_route_cfg.selectByExample", example, page);
        return list;
    }

    public IbatisTemplate getSqlMapClientTemplate() {
        return this.template;
    }

    protected static class UpdateByExampleParms extends PayTxnChnlRouteCfgExample {
        private Object record;

        public UpdateByExampleParms(Object record, PayTxnChnlRouteCfgExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}