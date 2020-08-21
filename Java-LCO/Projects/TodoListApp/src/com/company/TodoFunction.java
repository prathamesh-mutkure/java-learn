package com.company;


import java.util.ArrayList;

public class TodoFunction {


    private ArrayList<String> mTodoList = new ArrayList<String>();


//    Add Item List

    public void mAddItem(String mItem){

        mTodoList.add(mItem);

    }


//    Remove List Item

    public void mRemoveItem(int index){

        String mStringRemove = mTodoList.get(index);
        mTodoList.remove(index);

    }


//    Print List Items

    public void mPrintItem(){

        System.out.println("Your Todo List consists of " + mTodoList.size() + " Items");

        for (int i = 0; i < mTodoList.size(); i++){
            System.out.println("Item at position " + (i + 1) + " is " + mTodoList.get(i));
        }

    }


//    Update List Item

    public void mUpdateItem(int mUpdateIndex, String mUpdateItem){

        mTodoList.set(mUpdateIndex, mUpdateItem);

        System.out.println("Updation completed at position " + (mUpdateIndex + 1));

    }


//    Search Feature For Users

    public String mSearchItem(String mSearch){

        int index = mTodoList.indexOf(mSearch);

        if (index < 0){
            return null;
        } else {
            return mTodoList.get(index);
        }

    }





}