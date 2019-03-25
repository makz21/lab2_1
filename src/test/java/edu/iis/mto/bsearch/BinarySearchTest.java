package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {


    public static final int ELEMENT = 2;

    @Test
    public void search() {
    }

    @Test
    public void elementIsInSeq(){
        int [] sequence = {ELEMENT};
        Assert.assertTrue(BinarySearch.search(ELEMENT,sequence).isFound());
    }

    @Test
    public void elementNotInSingleSeq(){
        int[] sequence = {ELEMENT+1};

        Assert.assertFalse(BinarySearch.search(ELEMENT, sequence).isFound());
    }
}
