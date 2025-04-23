package lk.ijse.view.tdm;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TherapyHistoryTM {
    private String sessionId;
    private String therapistName;
    private String programName;
    private LocalDate Date;
}
