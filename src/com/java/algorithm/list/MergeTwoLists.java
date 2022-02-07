package com.java.algorithm.list;

/**
 * @author: Trae.Liu
 * @create: 2022-02-07 15:40
 * @description: 合并两个有序链表
 */
public class MergeTwoLists {

    /**
     * 递归
     *
     * @param l1 链表1
     * @param l2 链表2
     * @return 合并后链表
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

    /**
     * 迭代
     *
     * @param l1 链表1
     * @param l2 链表2
     * @return 合并后链表
     */
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);

        ListNode prev = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;
        return preHead.next;
    }

    /**
     * [1,2,4]
     * [1,3,4]
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        // ListNode listNode = mergeTwoLists(l1, l2);
        ListNode listNode = mergeTwoLists2(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

