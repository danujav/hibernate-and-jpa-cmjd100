package lk.ijse.relationship.entity;

/*
    @author DanujaV
    @created 7/8/23 - 4:59 PM   
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
@Table(name = "module")
public class Module {
    @Id
    @Column(name = "module_code")
    private String code;
    @Column(nullable = false)
    private String description;

    @ManyToMany
    @JoinTable(
            name = "lecturer_details",
            joinColumns = @JoinColumn(name = "module_id", referencedColumnName = "module_code"),
            inverseJoinColumns = @JoinColumn(name = "lecturer_id", referencedColumnName = "id")
    )
    private List<Lecturer> lecturerList = new ArrayList<>();
}
