package lk.ijse.fx.business.custom;

/*
    @author DanujaV
    @created 7/15/23 - 2:02 PM   
*/

import lk.ijse.fx.dto.CustomerDto;

public interface CustomerBo {
    boolean saveCustomer(CustomerDto dto) throws Exception;
}
