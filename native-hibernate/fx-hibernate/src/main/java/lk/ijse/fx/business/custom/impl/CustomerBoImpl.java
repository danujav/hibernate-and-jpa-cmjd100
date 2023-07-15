package lk.ijse.fx.business.custom.impl;

/*
    @author DanujaV
    @created 7/15/23 - 2:06 PM   
*/

import lk.ijse.fx.business.custom.CustomerBo;
import lk.ijse.fx.dao.DaoFactory;
import lk.ijse.fx.dao.DaoType;
import lk.ijse.fx.dao.custom.CustomerDao;
import lk.ijse.fx.dto.CustomerDto;
import lk.ijse.fx.entity.Customer;

public class CustomerBoImpl implements CustomerBo {
    private CustomerDao dao = DaoFactory.getDao(DaoType.CUSTOMER);
    @Override
    public boolean saveCustomer(CustomerDto dto) throws Exception {
        return dao.save(new Customer(
                dto.getId(),
                dto.getName(),
                dto.getAddress(),
                dto.getSalary()
        ));
    }
}
