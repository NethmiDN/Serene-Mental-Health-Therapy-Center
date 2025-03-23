package lk.ijse.view.tdm;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TherapyProgramTM {
    private String id;
    private String name;
    private int duration;
    private double fee;
    private String therapistId;
}
