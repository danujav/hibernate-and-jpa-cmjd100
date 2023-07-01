package lk.ijse.crud.entity;

/*
    @author DanujaV
    @created 7/1/23 - 12:12 PM   
*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    private int code;
    @Column(name = "item_desc", nullable = false, columnDefinition = "VARCHAR(200)")
    private String description;
    private double unitPrice;

    public Item() {
    }

    public Item(int code, String description, double unitPrice) {
        this.code = code;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
