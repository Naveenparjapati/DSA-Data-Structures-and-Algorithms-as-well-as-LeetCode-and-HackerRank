package linkedlistappnacl;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addnf at furst
    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {   //when ever we want to check list is empy then head==nul
            head = tail = newNode;
            return;
        }

        // step2 = newNode next = head
        newNode.next = head; // link

        // step3 = head = newNode
        head = newNode;
    }


    //adding at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    //iterating the list
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    //ading at spacific position
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);// Create a new node with the given data
        size++;
        Node temp = head; // Start from the head of the list
        int i = 0; // Initialize an index counter

        // Traverse the list until reaching the position before the specified index
        while (i < idx - 1) {
            temp = temp.next; // Move to the next node
            i++; // Increment the counter
        }

        // i = idx - 1; temp is the previous node
        newNode.next = temp.next; // Link newNode to the following node
        temp.next = newNode; // Link the previous node to newNode
    }

    /// ///////////////////////////////////////////
    /// remove first
    public int removefirat() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else {
            if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }


    public int removelast() {
        if (size == 0) {
            System.out.print("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
    //prev :i=size-2
    Node prev=head;
    for(int i=0;i<size-2;i++)
    {
        prev=prev.next;
    }
    int val=prev.next.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;
    }
/// //serching linear
public int itrserch(int key)
{
    Node temp=head;
    int i=0;
    while(temp != null)
    {
        if(temp.data==key)//key found
        {
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
}
/// //recursive serch
public int helper(Node head,int key)
{
    if(head==null)
    {
        return 0;
    }
    if(head.data==key)
    {
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1)
    {
        return -1;
    }

    return idx+1;
}
public int requs(int k)
{
  return   helper(head,k);
}

//reverce
    public static void reversll()
    {
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

public static void deletNthFRomlast(int n)
{
int sz=0;
Node temp=head;
while(temp!=null)
{
    temp=temp.next;
    sz++;
}
if(sz==n)
{
    head=head.next;//remove first as sam
    return;
}

//sz-n
    int i=0;
    int itofind=sz-n;
    Node prev=head;
    while(i<itofind)
    {
        prev=prev.next;
        i++;
    }

     prev.next=prev.next.next;
     return;
}

//slow fast approach
public Node findMid() {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next; // Move slow by 1
        fast = fast.next.next; // Move fast by 2
    }
    return slow; // This will be the middle node
}

    public boolean checkPalindrom() {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node is a palindrome
        }

        // Step 1: Find the middle node
        Node midNode = findMid();

        // Step 2: Reverse the second half of the list
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Now 'prev' is the head of the reversed second half
        Node right = prev; // Start of the reversed second half
        Node left = head; // Start of the first half

        // Step 3: Check if the two halves are the same
        while (right != null) {
            if (left.data != right.data) {
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }

        return true; // If all nodes matched, it is a palindrome
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(2);
//        ll.addLast(11);
//        ll.add(2,78);
        ll.print();//2->23->78->34->11
       // System.out.print(ll.size);
//        ll.removefirat();
//        ll.print();
//
//        System.out.println(ll.itrserch(23));
//
//       System.out.println(ll.requs(23));
//       ll.reversll();
//       ll.print();
//        ll.deletNthFRomlast(3);
//        ll.print();

        System.out.print(ll.checkPalindrom());

    }
}