package lk.ijse.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class PaymentManagementController {

    @FXML
    private JFXButton btnClear;

    @FXML
    private JFXButton btnDelete;

    @FXML
    private JFXButton btnSave;

    @FXML
    private JFXButton btnUpdate;

    @FXML
    private ComboBox<?> cmbInvoice;

    @FXML
    private ComboBox<?> cmbPatient;

    @FXML
    private TableColumn<?, ?> colAmount;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colInvoice;

    @FXML
    private TableColumn<?, ?> colPatient;

    @FXML
    private TableColumn<?, ?> colPaymentId;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private DatePicker dpPaymentDate;

    @FXML
    private ImageView imgHome;

    @FXML
    private TableView<?> tblPayment;

    @FXML
    private TextField txtAmount;

    @FXML
    private TextField txtPaymentId;

    @FXML
    private TextField txtStatus;

    @FXML
    void btnClear_OnAction(ActionEvent event) {

    }

    @FXML
    void btnDelete_OnAction(ActionEvent event) {

    }

    @FXML
    void btnSave_OnAction(ActionEvent event) {

    }

    @FXML
    void btnUpdate_OnAction(ActionEvent event) {

    }

    @FXML
    void navigateToHome(MouseEvent event) {

    }

}
