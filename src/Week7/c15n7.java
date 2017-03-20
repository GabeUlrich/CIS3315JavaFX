package Week7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author Administrator Gabe
 */
public class c15n7 extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        Circle circle = new Circle(100, 100, 80);

        root.getChildren().add(circle);
        circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);

        circle.setOnMousePressed(e -> circle.setFill(Color.YELLOW));
        circle.setOnMouseReleased(e -> circle.setFill(Color.BLUE));

        
      

        Scene scene = new Scene(root, 300, 250);

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
