package com.linkedin.inspectCollection;

import com.linkedin.inspectCollection.Answer.Item;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class AnswerTest {


    @Test
    public void test1() {
        List<Item> items = new ArrayList<>();
        items.add(new Answer.Item(1, "shirt", 100, 2));
        items.add(new Answer.Item(2, "shoes", 3800, 1));
        items.add(new Answer.Item(3, "pants", 1500, 3));
        items.add(new Answer.Item(4, "hat", 70, 5));
        items.add(new Answer.Item(5, "jacket", 1250, 1));
        float result = Answer.getCartTotal(items);
    }

}
