package Week8;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
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
        Label lbEarth = new Label("Weight in Pounds on EARTH -->");
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
        tfMoon.setPromptText("In Pounds... ");
        gridPane.add(tfMoon, 1, 1);
//------------------------------------------------------------------------------
        Label lbVenus = new Label("VENUS -->");
        lbVenus.setStyle("-fx-font-size: 10pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbVenus, 0, 2);

        tfVenus = new TextField();
        tfVenus.setEditable(false);
        tfVenus.setPromptText("In Pounds... ");
        gridPane.add(tfVenus, 1, 2);
//------------------------------------------------------------------------------
        Label lbMars = new Label("MARS -->");
        lbMars.setStyle("-fx-font-size: 10pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbMars, 0, 3);

        tfMars = new TextField();
        tfMars.setEditable(false);
        tfMars.setPromptText("In Pounds... ");
        gridPane.add(tfMars, 1, 3);
//------------------------------------------------------------------------------
        Label lbJupiter = new Label("JUPITER -->");
        lbJupiter.setStyle("-fx-font-size: 10pt; -fx-text-fill: #0000ff;");
        gridPane.add(lbJupiter, 0, 4);

        tfJupiter = new TextField();
        tfJupiter.setEditable(false);
        tfJupiter.setPromptText("In Pounds... ");
        gridPane.add(tfJupiter, 1, 4);
//------------------------------------------------------------------------------

        Button btn = new Button();
        btn.setText("Calculate Weights...");
        btn.setStyle("-fx-font-size: 18pt; -fx-padding: 10; -fx-text-fill: #0000ff;");
        btn.setOnAction(e -> calculate());

        HBox hBoxBtn = new HBox();
        hBoxBtn.setAlignment(Pos.CENTER);
        hBoxBtn.getChildren().add(btn);

        BorderPane root = new BorderPane();
        root.setStyle("-fx-padding: 20");
        root.setTop(hboxTitle);
        root.setCenter(gridPane);
        root.setBottom(hBoxBtn);

        Scene scene = new Scene(root, 400, 400);

        primaryStage.setTitle("Weights!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void calculate() {
        double EarthWeight = Double.parseDouble(tfEarth.getText());
        
        double moonWeight = EarthWeight * GRAVITY_MOON;
        tfMoon.setText(String.format("%.2f", moonWeight));

        double venusWeight = EarthWeight * GRAVITY_VENUS;
        tfVenus.setText(String.format("%.2f", venusWeight));

        double marsWeight = EarthWeight * GRAVITY_MARS;
        tfMars.setText(String.format("%.2f", marsWeight));

        double jupWeight = EarthWeight * GRAVITY_JUPITER;
        tfJupiter.setText(String.format("%.2f", jupWeight));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
