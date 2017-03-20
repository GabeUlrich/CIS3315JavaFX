package week6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Administrator Gabe
 */
public class c14n1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(20);
        pane.setVgap(20);
        
        ImageView imageView1 = new ImageView("image/uk.gif");
        ImageView imageView2 = new ImageView("image/ca.gif");
        ImageView imageView3 = new ImageView("image/china.gif");
        ImageView imageView4 = new ImageView("image/us.gif");
        
        pane.add(imageView1, 0, 0);
        pane.add(imageView2, 1, 0);
        pane.add(imageView3, 0, 1);
        pane.add(imageView4, 1, 1);

        Scene scene = new Scene(pane, 500, 500);

        primaryStage.setTitle("c14n1");
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
