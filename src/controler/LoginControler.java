/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author ME
 */
public class LoginControler implements  Initializable{
    @FXML
    private ImageView loading;  @FXML
    private AnchorPane login ;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        loading.setVisible(false);}
    @FXML
    void loginAction(ActionEvent event) {
        loading.setVisible(true);
        PauseTransition pt = new PauseTransition();
        pt.setDuration(Duration.seconds(3));
        pt.setOnFinished(ev ->{
            System.out.println("Gooooo");
                    loading.setVisible(false);

        });
        pt.play();

    }
      @FXML
    void signup(ActionEvent event) throws IOException {
        login.getScene().getWindow().hide();
        Parent root = FXMLLoader.load(getClass().getResource("/frontend/Sign_up.fxml"));
        Stage signup =new Stage();
        Scene scene = new Scene(root,600,800);
        signup.setScene(scene);
        signup.setResizable(false);
        signup.show();    }

    
}
