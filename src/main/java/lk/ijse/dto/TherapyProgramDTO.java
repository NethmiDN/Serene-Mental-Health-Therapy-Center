package lk.ijse.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TherapyProgramDTO {
    private String id;
    private String name;
    private int duration;
    private double fee;
    private String therapistId; // Store therapist's ID instead of full entity reference
}
