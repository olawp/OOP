package no.hiof.olawp.DyreparkJavaFX.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import no.hiof.olawp.DyreparkJavaFX.MainJavaFX;
import no.hiof.olawp.DyreparkJavaFX.model.Dyr;

public class DyreDetaljController {
    @FXML
    private Label tittelLabel;
    @FXML
    private Button knappNeste;
    @FXML
    private Button knappForrige;
    @FXML
    private TextField fodselsdatoTextField, idTextField;

    private int valgtDyrIndex = 0;
    private MainJavaFX mainJavaFX;

    @FXML
    private void initialize() {
        tittelLabel.setText("TestDyr");

        mainJavaFX = MainJavaFX.javaFXApplikasjon;

        Dyr etDyr = mainJavaFX.getListeMedDyr().get(valgtDyrIndex);

        fyllUtDyreData(etDyr);


    }

    @FXML
    public void gaaTilForrige(ActionEvent actionEvent) {

        valgtDyrIndex--;

        Dyr etDyr = mainJavaFX.getListeMedDyr().get(valgtDyrIndex);

        fyllUtDyreData(etDyr);

    }

    @FXML
    public void gaaTilListeScene() throws Exception {
        mainJavaFX.gaaTilDyreListeScene();
    }


    @FXML
    public void gaaTilNeste(ActionEvent actionEvent) {

        valgtDyrIndex++;

        Dyr etDyr = mainJavaFX.getListeMedDyr().get(valgtDyrIndex);

        fyllUtDyreData(etDyr);
    }

    private void fyllUtDyreData(Dyr etDyr) {
        if (etDyr != null) {
            tittelLabel.setText(etDyr.getNavn() + " - " + etDyr.getArt());

            idTextField.setText(String.valueOf(etDyr.getId()));

            fodselsdatoTextField.setText(etDyr.getFodselsdato().toString());

        }
    }
}
