package lk.ijse.fx.controller;

/*
    @author DanujaV
    @created 7/15/23 - 1:26 PM   
*/

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.fx.business.BoFactory;
import lk.ijse.fx.business.BoType;
import lk.ijse.fx.business.custom.CustomerBo;
import lk.ijse.fx.business.custom.impl.CustomerBoImpl;
import lk.ijse.fx.dto.CustomerDto;

public class CustomerFormController {
    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtSalary;

    private CustomerBo bo = BoFactory.getBo(BoType.CUSTOMER);

    @FXML
    void btnDeleteOnAction(ActionEvent event) {

    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String id = txtId.getText();
        String name = txtName.getText();
        String address = txtAddress.getText();
        double salary = Double.parseDouble(txtSalary.getText());

        var dto = new CustomerDto(id, name, address, salary);
        try {
            boolean isSaved = bo.saveCustomer(dto);

            if(isSaved) {
                new Alert(Alert.AlertType.CONFIRMATION, "Customer Saved!").show();
            }
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, e.getMessage()).show();
        }

    }
}
