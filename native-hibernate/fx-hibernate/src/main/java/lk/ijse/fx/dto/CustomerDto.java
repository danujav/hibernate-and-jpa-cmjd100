package lk.ijse.fx.dto;

/*
    @author DanujaV
    @created 7/15/23 - 2:03 PM   
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private String id;
    private String name;
    private String address;
    private Double salary;
}
