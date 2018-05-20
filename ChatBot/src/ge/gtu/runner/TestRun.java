/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ge.gtu.runner;



import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestRun extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        TestRun r =new TestRun();
        Parent root = FXMLLoader.load(r.getClass().getResource("Registration.fxml"));
        
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Log In");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
