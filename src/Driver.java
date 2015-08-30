import java.awt.*;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Created by cdevitt on 8/30/15.
 *
 * STUDENTS:  replace all // comments, not comments, with code to accomplish the task
 */

public class Driver {


        public static void main(String[] args) {


            /* PART 1 -- create rectangle on a canvas and find its area */

            Canvas canvas = Canvas.getCanvas();
            // construct a rectangle from awt package.  Hint: Rectangle myRectangle = ...
            //canvas.draw(myRectangle, "blue", myRectangle);
            // print the rectangle's area


            /* PART 2  - print a number representing the result of rolling a 6 sided die */
            Random randy = new Random();
            //Get a random number from 1 to 10
            //print the number with a meaningful label


            /* PART 3  Replace all vowels in a name as follows
            * 1 = i, 2=a, 3=e, o=0, u=4
            * No conditional (if) or loop statements please */
            String name = JOptionPane.showInputDialog("What is your name?");
            //print the input name
            //replace the vowels * 5 statements
            //print the new name


            /* PART 4 Enter a string and swap e's and a's
            For example: the pears are good for eating this season
            No conditional (if) or loop statements please
            REFER to the String class to see what methods are available*/

            String theString = JOptionPane.showInputDialog("Please enter a word:");
            //print the input string
            //swap letters a and e; this may require more than 1 line of code
            //print the new phrase
        }

    }


