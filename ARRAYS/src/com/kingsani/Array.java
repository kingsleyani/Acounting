package com.kingsani;

public class Array{
    private int[] items;
    private int count;
    public Array(int length){

        items = new int[length];
    }
    public void insert(int item){
    // if the array is full we need to resize it
        if (items.length == count){
            //create a new array( twice the size)
            int[] newItems  = new int[count * 2];
            //copy all the existing item.
           for(int i = 0; i<count; i++){
               newItems[i] = items[i];
           }
           items = newItems;
        }
        // Add new item at the end of the current array
        items[count++] = new item;

    }

    public void removeAt(int index){
        // validate the index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        // shift the items to the left to fill the
        // [10,20,30,40]
        // index = 1
        //1<-2
        //2<-3
        for (int i = index; i < count; i++)
            items[i] = items[i+1];
        count--;
    }

    public int indexOf(int item){
        //if we find them return index
        //otherwise return -1
        for (int i = 0 i < count; i++)
            if(items [i] == item)
                return i;
            return -1
    }
    public void print(){
        for(int i = 0; i < count; i++ )
            System.out.println(items[i]);
    }
}
