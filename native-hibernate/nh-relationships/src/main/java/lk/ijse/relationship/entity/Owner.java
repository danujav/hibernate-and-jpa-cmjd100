package lk.ijse.relationship.entity;

/*
    @author DanujaV
    @created 7/8/23 - 4:26 PM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "owner")
public class Owner {
    @Id
    @Column(name = "owner_id")
    private int id;
    @Column(nullable = false)
    private String name;

    @OneToMany (mappedBy = "owner")
    private List<Pet> petList = new ArrayList<>();
}
