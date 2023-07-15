package lk.ijse.fx.dao.custom;

/*
    @author DanujaV
    @created 7/15/23 - 2:26 PM   
*/

import lk.ijse.fx.dao.SuperDao;
import lk.ijse.fx.entity.Customer;

public interface CustomerDao extends SuperDao {
    boolean save(Customer customer) throws Exception;
}
