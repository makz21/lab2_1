package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    public static final int ELEMENT = 2;

    @Test public void search() {
    }

    @Test public void elementIsInSeq() {
        int[] sequence = {ELEMENT};
        Assert.assertTrue(BinarySearch.search(ELEMENT, sequence).isFound());
    }

    @Test public void elementNotInSingleSeq() {
        int[] sequence = {ELEMENT + 1};

        Assert.assertFalse(BinarySearch.search(ELEMENT, sequence).isFound());
    }

    @Test public void elementFirstInSeq() {
        int[] sequence = {ELEMENT, ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertEquals(0, BinarySearch.search(ELEMENT, sequence).getPosition());
    }

    @Test public void elementLastInSeqTest() {
        int[] sequence = {ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT};

        Assert.assertEquals(sequence.length, BinarySearch.search(ELEMENT, sequence).getPosition());
    }

}
