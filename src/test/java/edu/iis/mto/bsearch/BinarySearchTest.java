package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BinarySearchTest {

    public static final int ELEMENT = 2;
    public static final int OTHER_ELEMENT = 3;

    @Test
    public void search() {
    }

    @Test
    public void elementIsInSeq(){
        int [] sequence = {ELEMENT};
        Assert.assertTrue(BinarySearch.search(ELEMENT,sequence).isFound());
    }
    @Test
    public void elementIsNotInSeq(){
        int [] sequence = {ELEMENT};
        Assert.assertFalse(BinarySearch.search(OTHER_ELEMENT,sequence).isFound());
    }

    @Test
    public void elementFirstInSeq() {
        int[] sequence = {ELEMENT, ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test
    public void elementLastInSeq() {
        int[] sequence = {ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT};

        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test public void elementMidInSeq() {
        int[] sequence = {ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};

        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test
    public void elementIsNotInMultiSeq() {
        int[] sequence = {ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertThat(-1, is(equalTo(BinarySearch.search(ELEMENT, sequence).getPosition())));
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchElementInEmptySeq() {
        int[] sequence = {};

        BinarySearch.search(ELEMENT, sequence);
    }

    @Test
    public void searchNegativeElementInSeq() {
        int[] sequence = {ELEMENT - 4, ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};
        int elementToFind = ELEMENT - 4;

        Assert.assertThat(elementToFind, is(equalTo(sequence[BinarySearch.search(elementToFind, sequence).getPosition()])));
    }

    @Test
    public void searchElementInSeqContainsSameElements() {
        int[] sequence = {ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT};

        Assert.assertThat((sequence.length - 1) / 2, is(equalTo(BinarySearch.search(ELEMENT, sequence).getPosition())));
    }

}
