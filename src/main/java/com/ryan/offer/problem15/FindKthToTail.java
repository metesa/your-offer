package com.ryan.offer.problem15;

import com.ryan.offer.node.ListNode;

/**
 * Problem15
 * 输入一个链表，输出该链表的倒数第K个结点
 * @author hztaoran
 *
 */
public class FindKthToTail {

    public ListNode findKthOfTail(ListNode head, int k) {
        if (null == head || k <= 0) {
            return  null;
        }
        ListNode p = head;
        for (int i = 0; i < k - 1; i++) {
            if (p.next != null) {
                p = p.next;
            } else {
                return null;
            }
        }
        ListNode q = head;
        while (p.next != null) {
            p = p.next;
            q = q.next;
        }
        return q;
    }

}
