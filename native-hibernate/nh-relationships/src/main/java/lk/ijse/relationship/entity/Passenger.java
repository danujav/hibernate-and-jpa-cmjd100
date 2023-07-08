package lk.ijse.relationship.entity;

/*
    @author DanujaV
    @created 7/8/23 - 4:01 PM   
*/

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @Column(name = "passenger_id")
    private int id;
    @Column(nullable = false)
    private String name;
}
