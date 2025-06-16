package StackAll;

public class StackImplLinkedList {
     static class Node
     {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static class stack
    {
        static Node head=null;

        public static boolean isEmpty()
        {
            return head==null;
        }
        //push
       public static void push(int data)
       {
           Node newnode=new Node(data);
           if(isEmpty())
           {
               head=newnode;
               return;
           }
           newnode.next=head;
           head=newnode;
       }

       //pop
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }


        //peek
        public static int peek(){
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args)
    {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);

        while(!s.isEmpty())
        {
            System.out.print(s.peek());
            s.pop();
        }
    }
}
