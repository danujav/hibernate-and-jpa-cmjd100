package lk.ijse.fx.dao;

/*
    @author DanujaV
    @created 7/15/23 - 2:24 PM   
*/

import lk.ijse.fx.dao.custom.impl.CustomerDaoImpl;

public class DaoFactory {
    public static <T extends SuperDao> T getDao(DaoType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerDaoImpl();
            default:
                return null;
        }
    }
}
