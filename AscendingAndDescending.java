/**
 * AscendingAndDescending
 */
import java.util.Scanner;
public class AscendingAndDescending {

    
    public static void main(String[] args) {
        double numberOne;
        double numberTwo;
        double numberThree;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number >> ");
        numberOne = input.nextDouble();

        System.out.println("Enter a second number >> ");
        numberTwo = input.nextDouble();

        System.out.println("Enter a final number >> ");
        numberThree = input.nextDouble();

        
        if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println(numberOne + ", " + numberTwo + ", " + numberThree);
            System.out.println(numberThree + ", " + numberTwo + ", " + numberOne);
        } else {
            if (numberOne > numberThree && numberThree > numberTwo) {
                System.out.println(numberOne + ", " + numberThree + ", " + numberTwo);
                System.out.println(numberTwo + ", " + numberThree + ", " + numberOne);
            } else {
                if (numberTwo > numberOne && numberOne > numberThree ) {
                    System.out.println(numberTwo + ", " + numberOne + ", " + numberThree);
                    System.out.println(numberThree + ", " + numberOne + ", " + numberTwo);
                } else {
                    if (numberTwo > numberThree && numberThree > numberOne) {
                        System.out.println(numberTwo + ", " + numberThree + ", " + numberOne);
                        System.out.println(numberOne + ", " + numberThree + ", " + numberTwo);
                    } else {
                        if (numberThree > numberTwo && numberTwo > numberOne) {
                            System.out.println(numberThree + ", " + numberTwo + ", " + numberOne);   
                            System.out.println(numberOne + ", " + numberTwo + ", " + numberThree);                         
                        } else {
                            if (numberThree > numberOne && numberOne > numberTwo) {
                                System.out.println(numberThree + ", " + numberOne + ", " + numberTwo);
                                System.out.println(numberTwo + ", " + numberOne + ", " + numberThree);
                            }
                        }
                    }
                }
            }
        }
    }
}