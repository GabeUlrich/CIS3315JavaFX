package Week7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * (rotate a rectangle) write a program that rotates a rectangle 15 
 * degrees right when the rotate button is clicked
 * 
 * @author Administrator Gabe
 */

public class c15n2 extends Application {

    @Override
    public void start(Stage primaryStage) {
       
        StackPane pane = new StackPane();
        pane.setMinWidth(300);
        pane.minHeight(300);
        
        Rectangle rectangle = new Rectangle();
        rectangle.widthProperty().bind(primaryStage.widthProperty().divide(2));
        rectangle.heightProperty().bind(primaryStage.heightProperty().divide(2));
        pane.getChildren().add(rectangle);

        
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);

       
        Button btRotate = new Button("ROTATE!");
        buttons.getChildren().add(btRotate);

        
        btRotate.setOnAction(e -> rectangle.setRotate(rectangle.getRotate() + 15));

      
        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(buttons);
        BorderPane.setMargin(buttons, new Insets(10, 10, 50, 10));

        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rotate Rectangle");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);

    }
}
