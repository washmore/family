package tech.washmore.family.dao;

import org.springframework.stereotype.Repository;
import tech.washmore.family.model.Bill;
import tech.washmore.family.model.view.BillView;

import java.util.List;
import java.util.Map;

@Repository
public class BillDao extends BaseDao {
    public int addBill(Bill bill) {
        return super.getSqlSession().insert("addBill", bill);
    }

    public List<Bill> findBillsByParams(Map<String, Object> params) {
        return super.getSqlSession().selectList("findBillsByParams", params);
    }

    public List<BillView> findBillViewsByParams(Map<String, Object> params) {
        return super.getSqlSession().selectList("findBillViewsByParams", params);

    }

    public int updateBill(Bill bill) {
        return super.getSqlSession().update("updateBill", bill);
    }
}
