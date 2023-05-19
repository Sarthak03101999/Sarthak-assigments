package com.expenditure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();
    }

    private static void optionsSelection() {
        String[] arr = {
                "1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };

        ArrayList<Integer> expenses = new ArrayList<Integer>();
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);

        System.out.println("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int options = sc.nextInt();

        switch (options) {
            case 1:
                System.out.println("Your saved expenses are listed below: \n");
                System.out.println(expenses);
                optionsSelection();
                break;
            case 2:
                System.out.println("Enter the value to add your Expense: \n");
                int value = sc.nextInt();
                expenses.add(value);
                System.out.println("Your value is updated\n");
                System.out.println(expenses);
                optionsSelection();
                break;
            case 3:
                System.out.println("You are about to delete all your expenses! \nConfirm again by selecting the same option...\n");
                int con_choice = sc.nextInt();
                if (con_choice == options) {
                    expenses.clear();
                    System.out.println(expenses);
                    System.out.println("All your expenses are erased!\n");
                } else {
                    System.out.println("Oops... try again!");
                }
                optionsSelection();
                break;
            case 4:
                sortExpenses(expenses);
                optionsSelection();
                break;
            case 5:
                searchExpenses(expenses);
                optionsSelection();
                break;
            case 6:
                closeApp();
                break;
            default:
                System.out.println("You have made an invalid choice!");
                optionsSelection();
                break;
        }
    }

    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
    }

    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int leng = arrayList.size();
        System.out.println("Enter the expense you need to search:\t");
        Scanner sc = new Scanner(System.in);
        int searchExpense = sc.nextInt();
        boolean found = false;

        for (int expense : arrayList) {
            if (expense == searchExpense) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Expense found in the list.");
        } else {
            System.out.println("Expense not found in the list.");
        }
    }

    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrLength = arrayList.size();
        Collections.sort(arrayList);
        System.out.println("Expenses sorted in ascending order: ");
        System.out.println(arrayList);
    }
}
