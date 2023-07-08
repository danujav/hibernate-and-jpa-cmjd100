package lk.ijse.relationship.entity;

/*
    @author DanujaV
    @created 7/8/23 - 3:02 PM   
*/

import jakarta.persistence.*;
import lk.ijse.relationship.entity.embeddeble.Name;
import lombok.*;

/*@Getter
@Setter
@ToString*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private int id;
    @Embedded
    private Name name;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String address; //text
}
