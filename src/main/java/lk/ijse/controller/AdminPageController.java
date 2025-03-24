package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AdminPageController implements Initializable {

    private static AdminPageController instance;

    @FXML
    private Button btnAppointment;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnPatient;

    @FXML
    private Button btnPayment;

    @FXML
    private Button btnTherapist;

    @FXML
    private Button btnTherapyProgram;

    @FXML
    private ImageView imgLogout;

    @FXML
    private ImageView imgSettings;

    @FXML
    private Label lblAdd;

    @FXML
    private Label lblAdminId;

    @FXML
    private Label lblWelcome;

    @FXML
    private AnchorPane mainContent;

    @FXML
    private AnchorPane rootPane;

    public AdminPageController() {
        instance = this;
    }

    public static AdminPageController getInstance() {
        return instance;
    }

    @FXML
    void btnAppointmentOnAction(ActionEvent event) {

    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) {
        loadUI("/view/Home.fxml");
    }

    @FXML
    void btnPatientOnAction(ActionEvent event) {

    }

    @FXML
    void btnPaymentOnAction(ActionEvent event) {

    }

    @FXML
    void btnTherapistOnAction(ActionEvent event) {
        loadUI("/view/TherapistManagementForm.fxml");
    }

    @FXML
    void btnTherapyProgramOnAction(ActionEvent event) {
        loadUI("/view/TherapyProgramManagementForm.fxml");
    }

    @FXML
    void onLogoutClick(MouseEvent event) {

    }

    @FXML
    void onSettingsClick(MouseEvent event) {

    }

    private void loadUI(String resource) {
        mainContent.getChildren().clear();
        try {
            mainContent.getChildren().add(FXMLLoader.load(Objects.requireNonNull(getClass().getResource(resource))));
        } catch (IOException e) {
            showAlert("Error", "Failed to load dashboard!", Alert.AlertType.ERROR);
        }
    }

    private void showAlert(String title, String message, Alert.AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        navigateTo("/view/Home.fxml");

    }

    private void navigateTo(String fxmlPath) {
        try {
            mainContent.getChildren().clear();
            AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlPath));

            load.prefWidthProperty().bind(mainContent.widthProperty());
            load.prefHeightProperty().bind(mainContent.heightProperty());
            mainContent.getChildren().add(load);

        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Failed to load page!").show();
        }
    }

    public void navigateToTherapistManagement() {
        loadUI("/view/TherapistManagementForm.fxml");
    }
}
