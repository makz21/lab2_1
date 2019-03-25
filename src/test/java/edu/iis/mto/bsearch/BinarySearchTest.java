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
}
