package team.dna2.serviceDesk_client.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import team.dna2.serviceDesk_client.ScreenManager;

public class CreateSoftwareScreenController {
    //region FXMLNodes
    @FXML
    private TextField SoftwareNameField;
    @FXML
    private TextArea SoftwareArea;
    @FXML
    private Button CreateSoftwareButton;
//endregion

    public void CreateSoftwareButtonClicked() {
        //TODO ну ясен хрен тут еще что-то нужно

        System.out.println("SoftwareName = " + SoftwareNameField.getText());
        System.out.println("Software = " + SoftwareArea.getText());

        ScreenManager.CloseSecondScreen();
    }


    @FXML
    public void PreviousScreenButtonClicked() {
        ScreenManager.TryShowPreviousScreen();
    }
}