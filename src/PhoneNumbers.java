/* PhoneNumbers.java
   Kenton Duprey
   Java Graphics II G
   Mr. Blondin
   11/7/2016
*/

import java.util.Scanner;
public class PhoneNumbers
    {
        static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
        {
            int i;
            boolean alreadyIn = false;
            String[][] names = new String[30][30];
            names[0][0] = "Kenton";
            names[1][0] = "Andrew";
            names[2][0] = "Ben";
            names[3][0] = "Blondin";
            names[4][0] = "Chris";
            names[5][0] = "Tyler";
            names[6][0] = "Greg";
            names[7][0] = "Biankah";
            names[8][0] = "Ashaunti";
            names[9][0] = "Kerry";
            names[1][0] = "508-555-3127";
            names[1][1] = "508-555-5124";
            names[1][2] = "508-555-6398";
            names[1][3] = "508-555-5784";
            names[1][4] = "508-555-5974";
            names[1][5] = "508-555-7561";
            names[1][6] = "508-555-4535";
            names[1][7] = "508-555-4625";
            names[1][8] = "508-555-7452";
            names[1][9] = "508-555-7824";
        System.out.print("Enter a name for the directory: ");
            String input = scan.nextLine();
        for (i = 0; i < 9; i++)
            {
            if (names[i][0].equalsIgnoreCase(input))
                {
                    System.out.println("This person is in the directory already.\nTheir phone number is: " + names[1][i]);
                    break;
                }
            else
                alreadyIn = true;
            }
            if (alreadyIn)
                {
                System.out.print("What is their phone number: ");
                names[1][i + 1] = scan.nextLine();
                System.out.println("Name: " + input + "\nPhone Number: " + names[1][i+1]);
                }
        }// end main method
    }
