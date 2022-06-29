package day_3;
import java.util.*;

public class Day_3 {

    static int[][] fillArray(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++) array[i][j] = (i+1)*(j+1);
        }
        return array;
    }

    static void showTable(int[][] array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array.length; j++){
                System.out.printf("%-2d %1s %-2d %1s %-6d", j+1, "*", i+1, "=", array[i][j]);
            }
            System.out.println("");
        }
    }

    static int[] fillRandom(int[] array){
        Random rd = new Random();
        for(int i=0; i<array.length; i++) array[i] = rd.nextInt(21) - 10;
        return array;
    }

    static void showArray(int[] array){
        for (int x : array) System.out.printf("%4d", x);
    }

    static int[] copyArray(int[] array){
        int[] array1 = new int[array.length];
        for(int i=0; i<array.length; i++) array1[i] = array[i];
        return array1;
    }

    public static void main(String[] args){
        System.out.println("\r\nTask 1 - Multiplication table\r\n");
        /*
        1) Write a program which creates two dimensional
// array and stores a multiplication table (from 1 - 10) in it.

    Example of output:
        1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        ....
        10 * 9 = 90
        10 * 10 = 100

    Hint:
       1) don't forget that you have to save the values in the array and output them from the array.
       2) Arrays should be the size of [10][10]
         */
        int[][] multipl = new int[10][10];
        fillArray(multipl);
        showTable(multipl);

        System.out.println("\r\nTask 2 - Copy of array");
        /*
        2) Declare and initialize an array with four arbitrary whole numbers.
// Write a Java program to copy this array by iterating it.
         */
        int[] array = new int[4];
        array = fillRandom(array);
        System.out.println("\r\nInitial array:");
        showArray(array);
        int[] array1 = copyArray(array);
        System.out.println("\r\nCopied array:");
        showArray(array1);

        /*
        Tasks 3, 4
         */
        System.out.println("\r\n\r\nTasks 3, 4\r\n");
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.setBalance(3500.23);
        account2.setBalance(14.57);
        account1.printBalance();
        account2.printBalance();
        // write a code which tries to withdraw more money than there is in bank account
        account2.withdraw(200);
        // write a code which tries to deposit more than max limit
        account2.deposit(6700);
        // write a code which tries to transfer more money from one account to another account than possible
        account2.transfer(account1, 4000);
        account1.printBalance();
        account2.printBalance();
        account2.transfer(account1, 450);
        account1.printBalance();
        account2.printBalance();
    }
}
