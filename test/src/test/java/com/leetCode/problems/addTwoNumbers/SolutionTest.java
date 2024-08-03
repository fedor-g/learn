package com.leetCode.problems.addTwoNumbers;


import com.leetCode.model.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test1() {
        ListNode first = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode second = new ListNode(1, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                          new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                          new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0,
                          new ListNode(1)))))))))))))))))))))))))))))));
        //[5,6,4]
        //[1,0,0,0,0,0,0,0,0,0,
        // 0,0,0,0,0,0,0,0,0,0,
        // 0,0,0,0,0,0,0,0,0,0,
        // 1]

        ListNode listNode = solution.addTwoNumbers(first, second);

        Assert.assertEquals(6, listNode.val);
        Assert.assertEquals(6, listNode.next.val);
        Assert.assertEquals(4, listNode.next.next.val);
        Assert.assertEquals(0, listNode.next.next.next.val);
        Assert.assertEquals(1, listNode.next.next.next.next.next.next.next.next.next
                .next.next.next.next.next.next.next.next.next
                .next.next.next.next.next.next.next.next.next.
                next.next.next.val);
    }

    @Test
    public void test2() {
        ListNode first = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode second = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode listNode = solution.addTwoNumbers(first, second);

        Assert.assertEquals(8, listNode.val);
        Assert.assertEquals(9, listNode.next.val);
        Assert.assertEquals(9, listNode.next.next.val);
        Assert.assertEquals(9, listNode.next.next.next.val);
        Assert.assertEquals(0, listNode.next.next.next.next.val);
        Assert.assertEquals(0, listNode.next.next.next.next.next.val);
        Assert.assertEquals(0, listNode.next.next.next.next.next.next.val);
        Assert.assertEquals(1, listNode.next.next.next.next.next.next.next.val);
    }
}
