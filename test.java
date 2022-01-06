/* ***************************************
  @author    Noah Gomes
  @version   1
  
  A program to test a school student on
  multiplication tables and print their results. It tests a series of x * y ques:ons
  where x ranges from x_start…x_end as specified by the user, and y from 1...12
  (both inclusive).

  ****************************************/

import java.util.Scanner;

public class test {

    public static void println(String str) {
        System.out.println(str);
    }

    public static void print(String str) {
        System.out.print(str);
    }

    public static void printInt(int theInt) {
        System.out.println(theInt);
    }

    public static void mainMethod() {

        try (Scanner input = new Scanner(System.in)) {
            // ASK FOR START
            print("Enter x start (start>0): ");
            final int START = input.nextInt();

            // ASK FOR END
            print("Enter x end (end>=start): ");
            final int END = input.nextInt();

            int oneToTwelve[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
            int i, x;

            // COUNTER VARIABLES
            int correctOnes = 0;
            int timesAsked = 0;

            // START THE QUESTIONS ON START AND END ON END
            // WITH A CONTROLLED LOOP
            for (int counting = START; counting < END;) {

                // iterating over an array
                for (i = 0; i < oneToTwelve.length; i++) {
                    // accessing each element of array

                    x = oneToTwelve[i];
                    if (x == 12) {
                        counting = counting + 1;
                    }
                    String y = String.valueOf(x); // CHANGING X TO A STRING TO PRINT IT

                    println(counting + " x " + y);

                    int answer = input.nextInt();
                    timesAsked = timesAsked + 1; // USE OF THE COUNTER

                    if (answer == (counting * x)) {
                        println("Thats correct!");
                        correctOnes = correctOnes + 1;
                    } else {
                        println("Sorry Thats Wrong");

                        // SETTING THE GRADE AND CALCULATING PERCENTAGE
                        float percentage = (correctOnes * 100) / timesAsked;
                        String grade;
                        if (percentage < 50) {
                            grade = "C";
                        } else {
                            if (percentage > 75) {
                                grade = "A";
                            }

                            else {
                                grade = "B";
                            }
                        }

                        System.out.println(
                                "Your score was: " + correctOnes + "/" + timesAsked + " (" + percentage
                                        + "%) Grade: " + grade);

                        System.exit(0);
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
        mainMethod();
    }
}
