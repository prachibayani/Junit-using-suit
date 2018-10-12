package com.codekul.logicTestCases;

import com.codekul.logic.Arithematic;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArithematicTestCases {

    Arithematic arithematic;  // created instance variable of class

    @Before
    public void init(){  // assigning memory to the object
        arithematic = new Arithematic();

    }
    @Test

    public void verifyAddition()  // put word verify before the method
    {
        int result=arithematic.addition(100,100); // called the method
        Assert.assertEquals(result,200);  // called different assert method
        Assert.assertNotNull(result); // called different assert method
    }
}
