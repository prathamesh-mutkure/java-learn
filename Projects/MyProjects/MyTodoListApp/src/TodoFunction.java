import java.util.ArrayList;

public class TodoFunction {


    ArrayList<String> TodoFunction = new ArrayList<>();


    // AddItem

    public void mAddItem(String mItem){

        TodoFunction.add(mItem);

    }

    // Remove Item

    public void mRemoveItem(int index){

        String RemoveItem = TodoFunction.get(index);
        TodoFunction.remove(index);

    }

    // Print Items

    public void mPrintItems(){

        System.out.println("Your Todo List consist of " + TodoFunction.size() + " items");

        for (int i = 0; i < TodoFunction.size(); i++){
            System.out.println("Item at position " + (i + 1) + " is: " + TodoFunction.get(i));
        }

    }

    // Update Item

    public void mUpdateItem(int index, String mItem){

        TodoFunction.set(index, mItem);
        System.out.println("Item at position " + (index + 1) + " Updated to " + mItem);

    }

    // Search Item

    public String mSearchItem(String searchItem){

       int searchIndex = TodoFunction.indexOf(searchItem);

       if (searchIndex < 0)
           return null;
       else
           return TodoFunction.get(searchIndex);


    }

}

