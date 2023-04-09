import java.math.*;;

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

class AddTwoNumber {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0;
        int num1 = 0, num2 = 0;
        while (l1 != null) {
            num1 = num1 + l1.val * (int) Math.pow(10, count);
            l1 = l1.next;
            count++;
        }
        count = 0;
        while (l2 != null) {
            num2 = num2 + l1.val * (int) Math.pow(10, count);
            l2 = l2.next;
            count++;
        }
        int sum = num1 + num2;

        ListNode l3;
        ListNode t = new ListNode();
        ListNode p = new ListNode();
        if (sum != 0) {
            p.val = sum % 10;
            p.next = null;
            l3 = p;
            sum = sum / 10;
            while (sum != 0) {
                p.val = sum % 10;
                p.next = null;
                t.next = p;
                t = p;
                sum = sum / 10;
            }
            return l3;
        }
        return null;
    }

    public static void main(String[] args) {

    }
}