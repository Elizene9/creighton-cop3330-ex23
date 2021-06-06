/*
* UCF COP 3330 Summer 2021 Assignment 1 Solutions
* Copyright 2021 Charlene Creighton
 */

/*
Create a program that walks the user through troubleshooting issues with a car.
Use the following decision tree to build the system:

Example Output
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.

Constraint
Ask only questions that are relevant to the situation and to the previous answers.
Don’t ask for all inputs at once.
 */

package Exercise_23;
import java.util.Scanner;
public class ex23 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Is the car silent when you turn the key? ");

        char ans = input.next().charAt(0);

        if (ans == 'y') {

            System.out.print("\nAre the battery terminals corroded? ");

            char ans_1 = input.next().charAt(0);

            if (ans_1 == 'y') {
                System.out.print("\nClean terminals and try starting again.");
            } else if (ans_1 == 'n') {
                System.out.print("\nReplace cables and start again.");
            }
        }

        else if (ans == 'n'){

            System.out.print("\nDoes the car make a slicking noise? ");
            char ans_2 = input.next().charAt(0);

            if (ans_2 == 'y') {
                System.out.print("\nReplace the battery");
            }

            else if (ans_2 == 'n') {
                System.out.print("\nDoes the car crank up but fail to start? ");
                char ans_3 = input.next().charAt(0);

                if (ans_3 == 'y')
                    System.out.print("\nCheck spark plug connections.");

                else if (ans_3 == 'n') {
                    System.out.print("\nDoes the engine start and then die? ");
                    char ans_4 = input.next().charAt(0);

                    if (ans_4 == 'y') {
                        System.out.print("\nDoes your car have fuel injection? ");
                        char ans_5 = input.next().charAt(0);

                        if (ans_5 =='y')
                            System.out.print("\nGet it in for service.");

                        else if (ans_5 == 'n')
                            System.out.print("\nCheck to ensure the choke is opening and closing.");
                    }
                    else if(ans_4 == 'n') {
                        System.out.print("\nThis should not be possible.");
                    }
                }
            }
        }
    }
}
