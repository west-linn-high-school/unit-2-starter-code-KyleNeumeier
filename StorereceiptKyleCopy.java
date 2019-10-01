import java.util.Scanner;
import java.util.Random;

public class Storereceipt{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Insert # of books bought:");
    int books = input.nextInt();
    System.out.println("Insert # of movies bought:");
    int movies = input.nextInt();
    System.out.println("Insert pounds of peanuts bought:");
    double peanuts = input.nextInt();

    System.out.println("==============================================");
    System.out.println("----------------------------------------------");
    System.out.println("            Date:" + (int)(Math.random()*12 + 1) + "/" + (int)(Math.random()*28 +1) +"/19");
    System.out.println("     Thank you for Shopping at          ");
    System.out.println("            Steve's S-Mart                ");
    System.out.println("            Cashier: Dave       ");
    System.out.println("----------------------------------------------");
    System.out.println("");


  }
}
