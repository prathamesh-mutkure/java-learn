package com.company;

import java.util.Scanner;

public class Main {


    private static TodoFunction mTodoFunction = new TodoFunction();
    private static Scanner mScanner = new Scanner(System.in);


    public static void main(String[] args) {

        int mCommand = 0;
        boolean exit = false;

        printCommand();

        while (!exit){ // True

            System.out.println("Enter your command/choices: ");
            mCommand = mScanner.nextInt();
            mScanner.nextLine();


            switch (mCommand){

                case 0 :
                    printCommand();
                    break;
                case 1 :
                    mTodoFunction.mPrintItem();
                    break;
                case 2 :
                    mAddItem();
                    break;
                case 3 :
                    mUpdateItem();
                    break;
                case 4 :
                    mRemoveItem();
                    break;
                case 5 :
                    mSearchItem();
                    break;
                case 6 :
                    exit = true;     // Make loop False (!true) and stops it
                    break;
                default:
                    System.out.println("Please choose only from given commands!");

            }

        }

    }



    public static void printCommand(){
        System.out.println("Press 0 : To print Instructions");
        System.out.println("Press 1 : To print all items");
        System.out.println("Press 2 : To add an item in Todo");
        System.out.println("Press 3 : To modify a item in Todo");
        System.out.println("Press 4 : To remove item from Todo ");
        System.out.println("Press 5 : To search item in Todo ");
        System.out.println("Press 6 : To exit ");
    }

    public static void mAddItem(){
        System.out.println("Enter Item to be Added in Todo list: ");
        mTodoFunction.mAddItem(mScanner.nextLine());
    }

    public static void mUpdateItem(){

        System.out.println("Enter the item number: ");
        int index = mScanner.nextInt();
        mScanner.nextLine();

        System.out.println("Enter new item to be added");
        String mNewItem = mScanner.nextLine();

        mTodoFunction.mUpdateItem(index - 1, mNewItem);
    }

    public static void mRemoveItem(){

        System.out.println("Enter the item number to be removed");

        int index = mScanner.nextInt();
        mScanner.nextLine();

        mTodoFunction.mRemoveItem(index - 1);

    }

    public static void mSearchItem(){
        System.out.println("Enter String to be searched");
        String SearchItem = mScanner.nextLine();

        if (mTodoFunction.mSearchItem(SearchItem) == null){
            System.out.println("Item not found in your Todo list");
        } else {
            System.out.println(SearchItem + " was found in your Todo List");
        }
    }



}