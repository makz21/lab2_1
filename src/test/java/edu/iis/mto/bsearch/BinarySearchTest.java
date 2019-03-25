package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class BinarySearchTest {

    public static final int ELEMENT = 2;

    @Test
    public void search() {
    }

    @Test
    public void elementIsInSeq() {
        int[] sequence = {ELEMENT};

        Assert.assertThat(true, is(equalTo(BinarySearch.search(ELEMENT, sequence).isFound())));
        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test
    public void elementNotInSingleSeq() {
        int[] sequence = {ELEMENT + 1};

        Assert.assertThat(false,is(equalTo((BinarySearch.search(ELEMENT, sequence).isFound()))));
        Assert.assertThat(-1, is(equalTo(BinarySearch.search(ELEMENT, sequence).getPosition())));
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

    @Test
    public void elementMiddleInSeq() {
        int[] sequence = {ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};

        Assert.assertThat(ELEMENT, is(equalTo(sequence[BinarySearch.search(ELEMENT, sequence).getPosition()])));
    }

    @Test
    public void elementNotInMultiSeq() {
        int[] sequence = {ELEMENT + 1, ELEMENT + 2, ELEMENT + 3};

        Assert.assertThat(-1, is(equalTo(BinarySearch.search(ELEMENT, sequence).getPosition())));
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchElementInEmptySeq() {
        int[] sequence = {};

        BinarySearch.search(ELEMENT,sequence);
    }

    @Test
    public void searchNegativeElementInSeq() {
        int[] sequence = {ELEMENT - 4, ELEMENT - 3, ELEMENT - 2, ELEMENT - 1, ELEMENT, ELEMENT + 1, ELEMENT + 2};
        int key = ELEMENT - 4;

        Assert.assertThat(key, is(equalTo(sequence[BinarySearch.search(key, sequence).getPosition()])));
    }

    @Test
    public void searchElementInSeqContainsSameElement() {
        int[] sequence = {ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT, ELEMENT};

        Assert.assertThat((sequence.length - 1) / 2, is(equalTo(BinarySearch.search(ELEMENT, sequence).getPosition())));
    }
}
