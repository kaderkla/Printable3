package printableClasses;

import junit.framework.Assert;

public class MyArrayTest {

    @org.junit.Test
    public void testPrintArray() throws Exception {
        Integer[] testArray ={1,2,3};

        MyArray myArray = new MyArray();
        myArray.setArray(testArray);

        Assert.assertEquals("1 2 3 ",myArray.printArray());
    }


    @org.junit.Test
    public void testPrintStringArray() throws Exception {
        String [] testArray ={"a","b","c"};

        MyArray myArray = new MyArray();
        myArray.setArray(testArray);

        Assert.assertEquals("a b c ",myArray.printArray());
    }
}