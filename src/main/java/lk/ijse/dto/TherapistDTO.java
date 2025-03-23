package lk.ijse.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TherapistDTO {
    private String id;
    private String name;
    private String specialization;
    private String availability;
}
