import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;

public class snowman extends Application {

  public void start(Stage stage){

    Rectangle sky = new Rectangle(0, 0, 200, 200);

    Rectangle top = new Rectangle(80, 20, 40, 10);
    Rectangle hat = new Rectangle(90, 10, 20, 20);

    Rectangle nose = new Rectangle(100, 55, 5, 5);

    Circle eye1 = new Circle();
    Circle eye2 = new Circle();

    Circle head = new Circle();
    Circle body = new Circle();
    Circle feet = new Circle();

    top.setFill(Color.BLACK);
    hat.setFill(Color.BLACK);

    nose.setFill(Color.ORANGE);

    head.setCenterX(100.0f);
    head.setCenterY(60.0f);
    head.setRadius(30.0f);
    head.setFill(Color.WHITE);

    body.setCenterX(100.0f);
    body.setCenterY(100.0f);
    body.setRadius(30.0f);
    body.setFill(Color.WHITE);

    feet.setCenterX(100.0f);
    feet.setCenterY(140.0f);
    feet.setRadius(30.0f);
    feet.setFill(Color.WHITE);

    eye1.setCenterX(120.0f);
    eye1.setCenterY(50.0f);
    eye1.setRadius(5.0f);
    eye1.setFill(Color.BLUE);

    eye2.setCenterX(80.0f);
    eye2.setCenterY(50.0f);
    eye2.setRadius(5.0f);
    eye2.setFill(Color.BLUE);

    sky.setFill(Color.BLUE);

    Line line1 = new Line();
    line1.setStartX(90.0f);
    line1.setStartY(120.0f);
    line1.setEndX(80.0f);
    line1.setEndY(140.0f);

    Line line2 = new Line();
    line2.setStartX(110.0f);
    line2.setStartY(120.0f);
    line2.setEndX(120.0f);
    line2.setEndY(140.0f);



    Group root = new Group(sky, head, body, feet, top, hat, nose, eye1, eye2, line1, line2);
    Scene scene = new Scene(root, 200, 400, Color.WHITE);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
