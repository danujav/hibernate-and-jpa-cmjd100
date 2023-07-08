package lk.ijse.relationship.entity;

/*
    @author DanujaV
    @created 7/8/23 - 4:58 PM   
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
@Table(name = "lecturer")
public class Lecturer {
    @Id
    private int id;
    @Column(nullable = false)
    private String name;

    @ManyToMany (mappedBy = "lecturerList")
    private List<Module> moduleList = new ArrayList<>();
}
