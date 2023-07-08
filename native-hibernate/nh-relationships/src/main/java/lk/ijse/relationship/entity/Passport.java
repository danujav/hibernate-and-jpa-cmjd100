package lk.ijse.relationship.entity;

/*
    @author DanujaV
    @created 7/8/23 - 4:03 PM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @Column(name = "passport_number")
    private String id;
    @Column(name = "issue_date", nullable = false)
    private String issueDate;

    @OneToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;
}
