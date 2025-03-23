package lk.ijse.controller;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardFormController {

    @FXML
    private AnchorPane ap;

    @FXML
    private Button patientbtn;

    @FXML
    private Button paymentbtn;

    @FXML
    private Button reportbtn;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button sessionbtn;

    @FXML
    private Button therapistbtn;

    @FXML
    private Button therapyProgrambtn;

    @FXML
    void patientbtnOnAction(ActionEvent event) {

    }

    @FXML
    void paymentbtnOnAction(ActionEvent event) {

    }

    @FXML
    void reportbtnOnAction(ActionEvent event) {

    }

    @FXML
    void sessionbtnOnAction(ActionEvent event) {

    }

    @FXML
    void therapistbtnOnAction(ActionEvent event) {

    }

    @FXML
    void therapyProgrambtnOnAction(ActionEvent event) {

    }

    @FXML
    public void initialize(URL url, ResourceBundle rb) {
        navigateTo("/view/Home.fxml");
        initializeButtonEffect(patientbtn);
        initializeButtonEffect(reportbtn);
        initializeButtonEffect(paymentbtn);
        initializeButtonEffect(sessionbtn);
        initializeButtonEffect(therapistbtn);
        initializeButtonEffect(therapyProgrambtn);

        setButtonSizes();

    }

    @FXML
    private void initializeButtonEffect(Button button) {
        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.rgb(100, 100, 100, 0.4));

        button.setOnMouseEntered(e -> button.setEffect(shadow));
        button.setOnMouseExited(e -> button.setEffect(null));

        button.setOnMousePressed(e -> {
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(150), button);
            scaleTransition.setToX(0.95);
            scaleTransition.setToY(0.95);
            scaleTransition.play();
        });

        button.setOnMouseReleased(e -> {
            ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(150), button);
            scaleTransition.setToX(1.0);
            scaleTransition.setToY(1.0);
            scaleTransition.play();
        });
    }

    private void setButtonSizes() {
        double buttonWidth = 240;
        double buttonHeight = 20;

        patientbtn.setPrefSize(buttonWidth, buttonHeight);
        reportbtn.setPrefSize(buttonWidth, buttonHeight);
        paymentbtn.setPrefSize(buttonWidth, buttonHeight);
        sessionbtn.setPrefSize(buttonWidth, buttonHeight);
        therapistbtn.setPrefSize(buttonWidth, buttonHeight);
        therapyProgrambtn.setPrefSize(buttonWidth, buttonHeight);
    }

    private void setActiveButtonStyle(Button activeButton) {
        activeButton.setStyle(
                "-fx-background-color: linear-gradient(to right, #1FA2FF, #1885D2);" +
                        "-fx-text-fill: #FFFFFF;" +
                        "-fx-border-color: #1885D2;" +
                        "-fx-border-width: 1;" +
                        "-fx-background-radius: 6;" +
                        "-fx-border-radius: 6;" +
                        "-fx-effect: dropshadow(gaussian, rgba(24, 133, 210, 0.4), 12, 0, 0, 3);"
        );
    }

    private void resetButtonStyles() {
        String resetStyle =
                "-fx-background-color: transparent;" +
                        "-fx-border-color: linear-gradient(to right, #1FA2FF, #1885D2);" +
                        "-fx-border-width: 1;" +
                        "-fx-background-radius: 6;" +
                        "-fx-border-radius: 6;" +
                        "-fx-text-fill: #1885D2;";

        patientbtn.setStyle(resetStyle);
        reportbtn.setStyle(resetStyle);
        paymentbtn.setStyle(resetStyle);
        sessionbtn.setStyle(resetStyle);
        therapistbtn.setStyle(resetStyle);
        therapyProgrambtn.setStyle(resetStyle);
    }

    private void onButtonClicked(Button selectedButton) {
        resetButtonStyles();
        setActiveButtonStyle(selectedButton);
    }

    private void onButtonClickeda(ImageView selectedButton) {
        resetButtonStyles();
    }

    private void navigateTo(String fxmlPath) {
        try {
            ap.getChildren().clear();
            AnchorPane load = FXMLLoader.load(getClass().getResource(fxmlPath));

            load.prefWidthProperty().bind(ap.widthProperty());
            load.prefHeightProperty().bind(ap.heightProperty());
            ap.getChildren().add(load);

            applyEnhancedTransition(load);

        } catch (IOException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR, "Failed to load page!").show();
        }
    }

    private void applyEnhancedTransition(Node node) {
        FadeTransition fadeIn = new FadeTransition(Duration.millis(400), node);
        fadeIn.setFromValue(0.0);
        fadeIn.setToValue(1.0);

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(400), node);
        scaleTransition.setFromX(0.85);
        scaleTransition.setFromY(0.85);
        scaleTransition.setToX(1.0);
        scaleTransition.setToY(1.0);

        TranslateTransition slideTransition = new TranslateTransition(Duration.millis(400), node);
        slideTransition.setFromY(20);
        slideTransition.setToY(0);

        ParallelTransition parallelTransition = new ParallelTransition(fadeIn, scaleTransition, slideTransition);
        parallelTransition.play();
    }

}
