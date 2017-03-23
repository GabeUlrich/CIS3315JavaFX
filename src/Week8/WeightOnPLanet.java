package Week8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Create GUI Java FX application that given the weight of a person on Earth
 * then calculate the weight of the person on the Moon, Mars, and Jupiter.
 * Display the calculated weights with two with two decimal places and make sure
 * the calculated text field values cannot be edited.
 *
 * @author Administrator Gabe
 */
public class WeightOnPLanet extends Application {

    private static final double GRAVITY_MOON = 0.17;
    private static final double GRAVITY_VENUS = 0.91;
    private static final double GRAVITY_MARS = 0.38;
    private static final double GRAVITY_JUPITER = 2.54;

    private TextField tfEarth, tfMoon, tfVenus, tfMars, tfJupiter;

    @Override
    public void start(Stage primaryStage) {
        Label lbTitle = new Label("How much do I weigh? ");
        lbTitle.setStyle("-fx-font-size: 24pt; text-size-fill: #0000ff;");
        HBox hboxTitle = new HBox();
        hboxTitle.setAlignment(Pos.CENTER);
        hboxTitle.getChildren().add(lbTitle);

        GridPane gridPane = new GridPane();
        gridPane.setStyle("-fx-hgap: 10; -fx-vgap: 10; -fx-padding: 20; -fx-alignment: center;");
//------------------------------------------------------------------------------
        Label lbEarth = new Label("Weight on EARTH -->");
        lbEarth.setStyle("-fx-font-size: 10pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbEarth, 0, 0);

        tfEarth = new TextField();
        tfEarth.setPromptText("Enter your weight ");
        gridPane.add(tfEarth, 1, 0);
//------------------------------------------------------------------------------        
        Label lbMoon = new Label("MOON -->");
        lbMoon.setStyle("-fx-font-size: 10pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbMoon, 0, 1);

        tfMoon = new TextField();
        tfMoon.setEditable(false);
        gridPane.add(tfMoon, 1, 1);
//------------------------------------------------------------------------------
        Label lbVenus = new Label("VENUS -->");
        lbVenus.setStyle("-fx-font-size: 10pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbVenus, 0, 2);
        
        tfVenus = new TextField();
        tfVenus.setEditable(false);
        gridPane.add(tfVenus, 1, 2);
//------------------------------------------------------------------------------
        Label lbMars = new Label("MARS -->");
        lbMars.setStyle("-fx-font-size: 10pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbMars, 0, 3);
        
        tfMars = new TextField();
        tfMars.setEditable(false);
        gridPane.add(tfMars, 1, 3);
//------------------------------------------------------------------------------
        Label lbJupiter = new Label("JUPITER -->");
        lbJupiter.setStyle("-fx-font-size: 10pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbJupiter, 0, 4);
        
        tfJupiter = new TextField();
        tfJupiter.setEditable(false);
        gridPane.add(tfJupiter, 1, 4);
//------------------------------------------------------------------------------

        Button btn = new Button();
        btn.setText("Calculate weights...");
        btn.setStyle("-fx-font-size: 10pt; -fx-padding: 10; -fx-text-fill: #0000ff;");
//        btn.setOnAction(e -> calculate());

        HBox hboxBtn = new HBox();
        hboxBtn.setAlignment(Pos.CENTER);
        hboxBtn.getChildren().add(btn);

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-padding: 20;");
        borderPane.setTop(hboxTitle);
        borderPane.setCenter(gridPane);

        Scene scene = new Scene(borderPane, 400, 600);

        primaryStage.setTitle("Weights on Planets");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void calculate() {
        double weight = Double.parseDouble(tfEarth.getText());
        double moonWeight = weight + GRAVITY_MOON;
        tfMoon.setText(String.format("%.2f" , moonWeight));
        
        double venusWeight = weight + GRAVITY_VENUS;
        tfVenus.setText(String.format("%.2f" , venusWeight));
        
        double marsWeight = weight + GRAVITY_MARS;
        tfMars.setText(String.format("%.2f" , marsWeight));
        
        double jupWeight = weight + GRAVITY_JUPITER;
        tfJupiter.setText(String.format("%.2f" , jupWeight));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
