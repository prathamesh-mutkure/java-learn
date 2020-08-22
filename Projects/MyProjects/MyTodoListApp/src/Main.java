import java.util.Scanner;

public class Main {


    private static TodoFunction mTodoFunction = new TodoFunction();
    private static Scanner mScanner = new Scanner(System.in);


    public static void main(String[] args){

        boolean exit = false;

        System.out.println("\nPlease enter your commands/choices: \n");
        printCommands();
        System.out.println();

        while (!exit){

            int mCommands = mScanner.nextInt();
            mScanner.nextLine();

            switch (mCommands){

                case 0 :
                    printCommands();
                    System.out.println();
                    break;
                case 1 :
                    mPrintItems();
                    System.out.println();
                    break;
                case 2 :
                    mAddItem();
                    System.out.println();
                    break;
                case 3 :
                    mUpdateItem();
                    System.out.println();
                    break;
                case 4 :
                    mRemoveItem();
                    System.out.println();
                    break;
                case 5 :
                    mSearchItem();
                    System.out.println();
                    break;
                case 6 :
                    exit = true;
                    System.out.println();
                    break;
                default:
                    System.out.println("Please enter a valid command!");
                    System.out.println();
                    break;

            }

        }

    }


    public static void printCommands(){

        System.out.println("Press 0 : To print Instructions");
        System.out.println("Press 1 : To print all items");
        System.out.println("Press 2 : To add an item in Todo");
        System.out.println("Press 3 : To modify a item in Todo");
        System.out.println("Press 4 : To remove item from Todo ");
        System.out.println("Press 5 : To search item in Todo ");
        System.out.println("Press 6 : To exit ");

    }

    public static void  mPrintItems(){

        mTodoFunction.mPrintItems();

    }

    public static void mAddItem(){

        System.out.println("Enter Item to be added:");

        String mItem = mScanner.nextLine();

        mTodoFunction.mAddItem(mItem);

        System.out.println(mItem + " Added to your Todo List");

    }

    public static void mUpdateItem(){

        System.out.println("Enter Item number to be updated:");
        int index = mScanner.nextInt();
        mScanner.nextLine();

        System.out.println("Enter new Item");
        String mItem = mScanner.nextLine();

        mTodoFunction.mUpdateItem(index - 1, mItem);

    }

    public static void mRemoveItem(){

        System.out.println("Enter Item number to be removed:");

        int index = mScanner.nextInt();
        mScanner.nextLine();

        System.out.println(mTodoFunction.TodoFunction.get(index - 1) + " is removed from your Todo List");

        mTodoFunction.mRemoveItem((index - 1));

        //System.out.println(mTodoFunction.TodoFunction.get(index) + " removed from your TodoList");

    }

    public static void mSearchItem(){

        System.out.println("Enter Item to be Searched:");
        String mSearchedItem = mScanner.nextLine();

        if (mTodoFunction.mSearchItem(mSearchedItem) == null){
            System.out.println("Item not found in your Todo List");
        } else {
            System.out.println(mSearchedItem + " was found in your TodoList at position " + (mTodoFunction.TodoFunction.indexOf(mSearchedItem) + 1));
        }

    }

}
