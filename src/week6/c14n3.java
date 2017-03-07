/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class c14n3 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            list.add(i);
        }
        java.util.Collections.shuffle(list);

        HBox pane = new HBox(5);
        pane.setAlignment(Pos.CENTER);
        
        for(int i=5; i< 5; i++) {
            pane.getChildren().add(new ImageView("image/card/" + list.get(i)+ ".png"));
        }
        
//        pane.getChildren().add(new ImageView("image/card" + list.get(0) + ".png"));
//        pane.getChildren().add(new ImageView("image/card" + list.get(1) + ".png"));
//        pane.getChildren().add(new ImageView("image/card" + list.get(2) + ".png"));
//        pane.getChildren().add(new ImageView("image/card" + list.get(3) + ".png"));
//        pane.getChildren().add(new ImageView("image/card" + list.get(4) + ".png"));

        Scene scene = new Scene(pane, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
