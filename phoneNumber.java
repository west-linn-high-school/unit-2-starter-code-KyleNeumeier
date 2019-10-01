import java.util.Random;

public class phoneNumber{
  public static void main(String[] args){
    Random rand = new Random();
      System.out.println(

        "(" + (rand.nextInt(8) + 2) + rand.nextInt(9) + rand.nextInt(10) + ") " +
              (rand.nextInt(8) + 2) + rand.nextInt(10) + rand.nextInt(10) + " - " +
               rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10)
      );
  }
}
