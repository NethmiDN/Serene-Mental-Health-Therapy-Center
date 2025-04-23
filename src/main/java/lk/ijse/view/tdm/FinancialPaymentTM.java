package lk.ijse.view.tdm;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FinancialPaymentTM extends PaymentTM{
    private String paymentId;
    private double amount;
    private String status;
}
