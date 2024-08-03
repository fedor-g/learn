package com.leetCode.problems.addTwoNumbers;

import com.leetCode.model.ListNode;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> list = new ArrayList<>();

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        try {
            sumNode(l1, l2, 0);
        } catch (RuntimeException ignored) {

        }
        ListNode base = new ListNode();
        collectNodes(base, 0);
        return base;
    }

    private void collectNodes(ListNode base, int index) {
        base.val = list.get(index);

        if (index == list.size() - 1) {
            return;
        }

        base.next = new ListNode();
        collectNodes(base.next, ++index);
    }

    private void sumNode(ListNode l1, ListNode l2, int add) {
        int v1 = 0;
        int v2 = 0;

        if (l1 != null && l1.val != 0) {
            v1 = l1.val;
        }

        if (l2 != null && l2.val != 0) {
            v2 = l2.val;
        }

        int result = v1 + v2 + add;

        list.add(result % 10);

        if (result == 1) {
            System.out.println("Here");
        }

        if (result < 10 && l1 == null && l2 == null) {
            throw new RuntimeException();
        }

        if (result > 10) {
            if (l1 == null || l1.next == null) {
                if (l2 == null || l2.next == null) {
                    sumNode(null, null, result/10);
                    System.out.println("Here");
                } else {
                    sumNode(null, l2.next, result/10);
                    System.out.println("Here");
                }
            } else {
                if (l2 == null || l2.next == null) {
                    sumNode(l1.next, null, result/10);
                    System.out.println("Here");
                } else {
                    sumNode(l1.next, l2.next, result/10);
                    System.out.println("Here");
                }
            }
        }


        if (l1 == null || l1.next == null) {
            if (l2 == null || l2.next == null) {
                sumNode(null, null, result/10);
                System.out.println("Here");
            } else {
                sumNode(null, l2.next, result/10);
                System.out.println("Here");
            }
        } else {
            if (l2 == null || l2.next == null) {
                sumNode(l1.next, null, result/10);
                System.out.println("Here");
            } else {
                sumNode(l1.next, l2.next, result/10);
                System.out.println("Here");
            }
        }


    }


}