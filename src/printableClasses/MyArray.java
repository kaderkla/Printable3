package printableClasses;

import java.lang.Object;import java.lang.Override;import java.lang.String;import java.lang.System;import java.util.ArrayList;

/**
 * Created by kaderabk on 8.11.2016.
 */
public class MyArray extends ArrayList implements PrintableList {
    private ArrayList<Object> myArray= null;

    public MyArray(){
        myArray= new ArrayList<Object>();
    }

    @Override
    public String printArray() {

          String result = new String();

        if(!myArray.isEmpty()) {
            for(int index=0;index<myArray.size();index++){
                String value = myArray.get(index) + " ";
                result+=value;
              System.out.println(value);
            }
        }

        return result;
    }


    public ArrayList  getArray() {
        return myArray;
    }


    public void setArray(Object[] objectArray) {
        if(objectArray!=null){
            for(int counter=0;counter<objectArray.length;counter++){
                myArray.add(objectArray[counter]);
            }
        }
    }

}
