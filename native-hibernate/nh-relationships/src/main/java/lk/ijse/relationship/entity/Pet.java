package lk.ijse.relationship.entity;

/*
    @author DanujaV
    @created 7/8/23 - 4:27 PM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @Column(name = "pet_id")
    private int id;
    @Column(name = "pet_name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false, referencedColumnName = "owner_id")
    private Owner owner;
}
