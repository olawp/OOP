package no.hiof.olawp.DyreparkJavaFX.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import no.hiof.olawp.DyreparkJavaFX.MainJavaFX;

public class DyreListeController {
    @FXML
    private Button gaaTilDetaljerKnapp;
    @FXML
    private ListView dyreListView;

    private MainJavaFX mainJavaFX;


    @FXML
    public void initialize(){
        mainJavaFX = MainJavaFX.javaFXApplikasjon;

            dyreListView.setItems(mainJavaFX.getListeMedDyr());

            gaaTilDetaljerKnapp.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    try {
                        mainJavaFX.gaaTilDyreDetaljScene();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });


    }

}
