package the.sum.medium;

public class Question_1669 {
    public class ListNode {
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

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode aNode = list1;
        ListNode bNode = list1;
        ListNode tmpNode = list2;
        for (int i = 0; i < b + 1; i++) {
            if (i < a - 1) aNode = aNode.next;
            bNode = bNode.next;
        }

        while (tmpNode.next != null) tmpNode = tmpNode.next;

        aNode.next = list2;
        tmpNode.next = bNode;


        return list1;
    }

    public static void main(String[] args) {

    }
}
