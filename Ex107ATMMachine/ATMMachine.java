package be.vdab.Ex107ATMMachine;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfAccounts = 10;
        Account[] accounts = new Account[numberOfAccounts];
        for (int i = 0; i < numberOfAccounts; i++) {
            accounts[i] = new Account(i,100);
        }

        do {
            System.out.println("Enter an id");
            int id = scan.nextInt();
            while (id<0 || id>9) {
                System.out.println("Invalid value. Enter id again");
                id = scan.nextInt();
            }

            int choice = 0;
            while (choice != 4) {

                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.println("Enter a choice:");
                choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.println("Enter an amount to withdraw");
                        int amountWithdraw = scan.nextInt();
                        accounts[id].withdraw(amountWithdraw);
                        break;
                    case 3:
                        System.out.println("Enter an amount to deposit");
                        int amountDeposit = scan.nextInt();
                        accounts[id].deposit(amountDeposit);
                        break;
                    default:
                        break;
                }
            }
        } while(numberOfAccounts == 10);
    }
}


