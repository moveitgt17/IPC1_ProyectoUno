/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author CARLOS
 */
public class AdminMenuController implements Initializable {

    @FXML
    private JFXButton goMovie;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void branchActions(ActionEvent event) {
    }

    @FXML
    private void exit(ActionEvent event) {
    }

    @FXML
    private void testMovie(ActionEvent event) {
    }

    @FXML
    private void showReports(ActionEvent event) {
    }

    @FXML
    private void asignSellers(ActionEvent event) {
    }

    @FXML
    private void employeesAction(ActionEvent event) {
    }

    @FXML
    private void goToMovies(MouseEvent event) throws IOException{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("Interface/Pelis.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Pelis");
        stage.setMaximized(true);
        stage.show();
        Stage old =(Stage) goMovie.getScene().getWindow();
        old.close();
    }

    @FXML
    private void moviesActions(ActionEvent event) {
    }

    @FXML
    private void rooomsActions(ActionEvent event) {
    }
    
}
