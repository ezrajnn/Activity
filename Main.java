
import Bank.Choices;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // String [] values = {"Deposit", "Withdraw", "Inquire"};
        Scanner sc = new Scanner(System.in);

        Choices deposit = new Choices (1, "Deposit", 1000);
        Choices withdraw = new Choices (2, "Withdraw", 1000);
        Choices inquire = new Choices(3, "Inquire", 1000);



        int choices;



        do {

            System.out.println("1.) Deposit" );
            System.out.println("2.) Withdraw" );
            System.out.println("3.) Inquire" );
            System.out.println("4.) Exit");

            System.out.println("Choose a action: ");


            choices = sc.nextInt();

            System.out.println("You chose: ");


            switch (choices) {

                case 1:
                    System.out.println(deposit.getId() + ".) " + " " +deposit.getName());
                    System.out.println("Enter amount to deposit: ");

                    choices = sc.nextInt() + deposit.getValue();
                    System.out.println("Your balance is : " + choices);


                    break;

                case 2:
                    System.out.println(withdraw.getId() + ".) " + " " + withdraw.getName());
                    System.out.println("Enter amount to withdraw: ");

                    choices = sc.nextInt() - withdraw.getValue();
                    System.out.println("Your balance is: " + -choices);

                    break;

                case 3:
                    System.out.println(inquire.getId() + " " + inquire.getName());

                    choices = inquire.getValue();
                    System.out.println("Your balance is: " + choices);
                    break;


            }
        } while  (choices != 4);  {
            System.out.println("Exit, Thank you!");
        }

        //this loop stands as exit



    }
}
