package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

//    int [] tab = {1,2,3,4,5,6};
//    int key = 1;
    public static final int ELEMENT = 2;

    @Test
    public void search() {
    }

    @Test
    public void elementIsInSeq(){
        int [] sequence = {ELEMENT};
        Assert.assertTrue(BinarySearch.search(ELEMENT,sequence).isFound());
    }
}
