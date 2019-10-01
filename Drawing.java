import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;

public class Drawing extends Application {

  public void start(Stage stage){
    Text hello = new Text(8, 10, "Slime");
    Rectangle body = new Rectangle(50, 50, 140, 140);
    Rectangle eyeLeft = new Rectangle(65, 70, 40, 40);
    Rectangle eyeRight = new Rectangle(135, 70, 40, 40);
    Rectangle mouth = new Rectangle(130, 140, 20, 20);

    Circle sun = new Circle();

    Polyline grass = new Polyline();

    Double[] myPoints = new Double[]{
    0.0, 300.0,
    5.0, 270.0,
    10.0, 300.0,
    15.0, 270.0,
    20.0, 300.0,
    25.0, 270.0,
    30.0, 300.0,
    35.0, 270.0,
    40.0, 300.0
  };

    for(int i = 0; i<20; i++){
    myPoints[myPoints.length - 1] = 5.0*i;
    System.out.println(i);
}
    grass.getPoints().addAll(myPoints);

    grass.setFill(Color.LIGHTGREEN);

    sun.setCenterX(200.0f);
    sun.setCenterY(10.0f);
    sun.setRadius(30.0f);
    sun.setFill(Color.ORANGE);

    body.setStroke(Color.LIGHTGREEN);
    body.setFill(Color.LIGHTGREEN);

    eyeLeft.setFill(Color.GREEN);

    eyeRight.setFill(Color.GREEN);

    mouth.setFill(Color.GREEN);

    Group root = new Group(hello, body, eyeLeft, eyeRight, mouth, sun, grass);
    Scene scene = new Scene(root, 300, 300, Color.WHITE);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
