package lk.ijse.fx.business.custom;

/*
    @author DanujaV
    @created 7/15/23 - 2:02 PM   
*/

import lk.ijse.fx.business.SuperBo;
import lk.ijse.fx.dto.CustomerDto;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer(CustomerDto dto) throws Exception;
}
