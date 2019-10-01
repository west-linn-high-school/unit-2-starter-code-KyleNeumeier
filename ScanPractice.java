import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Write a description of class ScanPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScanPractice
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line of text:");

        String word = scan.next();

        String line = scan.nextLine();

        System.out.println(word);
        System.out.println(line);

        System.out.println("50 plus 25 is " + 50 + 25);

        String m1, m2, m3;
        m1 = "Quest for the Holy Grail";
        m2 = m1.toLowerCase();
        m3 = m1 + " " + m2;
        System.out.println(m3.replace('h', 'z'));


        // DecimalFormat fmt = new DecimalFormat("0.###");
        // System.out.println("A formatted decimal: " + fmt.format(15.2346672));
        // fmt.applyPattern("0.#");
        // System.out.println("Uses a new format: " + fmt.format(15.2346672));
    }
}
