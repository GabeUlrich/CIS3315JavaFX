/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week7;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class c15n1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        List<Integer> list = new ArrayList();
        for (int i = 1; i < 52; i++) {
            list.add(i);

        }
        java.util.Collections.shuffle(list);

        HBox hbox = new HBox(5);
        hbox.setAlignment(Pos.CENTER);
        for (int i = 0; i < 5; i++) {

            hbox.getChildren().add(new ImageView("Image/card/" + list.get(i) + ".png"));
        }

        //BUTTON - EVENT DRIVEN PROGRAMING
        Button btRefresh = new Button("Refresh...");
        
        btRefresh.setOnAction(e -> {
            java.util.Collections.shuffle(list);
            hbox.getChildren().clear();

            for (int i = 0; i < 5; i++) {
                hbox.getChildren().add(new ImageView("Image/card/" + list.get(i) + ".png"));
            }
        });

        
        HBox hboxBtn = new HBox(5);
        hboxBtn.getChildren().add(btRefresh);
        hboxBtn.setAlignment(Pos.CENTER);
        hboxBtn.setPadding(new Insets(5,5,20,5));
        
        BorderPane pane = new BorderPane();
        pane.setCenter(hbox);
        pane.setBottom(hboxBtn);
        BorderPane.setAlignment(btRefresh, Pos.CENTER);
        
        Scene scene = new Scene(pane, 500, 350);

        primaryStage.setTitle("Refresh Cards");
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
