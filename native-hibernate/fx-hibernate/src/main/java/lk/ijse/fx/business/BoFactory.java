package lk.ijse.fx.business;

/*
    @author DanujaV
    @created 7/15/23 - 1:59 PM   
*/

import lk.ijse.fx.business.custom.impl.CustomerBoImpl;

public class BoFactory {
    public static <T extends SuperBo>T getBo(BoType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerBoImpl();
            default:
                return null;
        }
    }
}
