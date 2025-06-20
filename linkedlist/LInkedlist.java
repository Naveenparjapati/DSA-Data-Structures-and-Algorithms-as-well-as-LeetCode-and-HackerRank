package linkedlist;

public class LInkedlist {
    //Node creatin part
   public static class Node{
        private int data;
        Node next;

          public  Node(int data)
            {
                this.data=data;
                this.next=null;
            }
    }

    public static Node head;
   public static Node tail;
   public static  int size;

   public void addFirst(int data)
   {
       //step 1: create a node
       Node newNode=new Node(data);
       size++;
       //if we hava only one node
       if(head==null)
       {
           head=tail=newNode;
           return;
       }
       //step 2:
       newNode.next=head;
       //step 3:
       head=newNode;
   }

   public void addLast(int data)
   {
       //step 1:new node creation
       Node newNode=new Node(data);
       size++;
       //if we have only one
       if(head==null)
       {
           head=tail=newNode;
           return;
       }
       //step 2:
       tail.next=newNode;
       tail=newNode;
   }

   //add at idex
    public static void  addat(int ind,int data)
    {
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<ind-1)//we will reach at position to just previous node
        {
            temp=temp.next;
            i++;
        }
        //insertion
        temp.next=newNode;
    }

    public int removeFirst()
    {
        //if ll has zero nodes
        if(size==0)
        {
            System.out.println("ll is empty");
            return  Integer.MIN_VALUE;
        }//if ll has one nodes
        else if(size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
      int val=head.data;
        head=head.next;
        size--;
        return val;
    }

public int removeLast()
{
    //if ll has zero nodes
    if(size==0)
    {
        System.out.println("ll is empty");
        return  Integer.MIN_VALUE;
    }//if ll has one nodes
    else if(size==1)
    {
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }

    //prev  size-2
    Node prev=head;

    for(int i=0;i<size-2;i++)
    {
        prev=prev.next;
    }
    int val=prev.next.data;//tail
    prev.next=null;
    tail=prev;
    size--;
    return  val;
}




   public void print()
   {
       //if ll is empty
       if(head==null)
       {
           System.out.print("ll is empty") ;
           return;
       }
       Node temp=head;
       while(temp!=null)
       {
           System.out.println(temp.data);
         temp=temp.next;
       }
       System.out.println();
   }
    public static void main(String[] args)
    {
        LInkedlist l=new LInkedlist();
        l.addFirst(10);
        l.addFirst(20);
        l.addFirst(30);
//        l.addFirst(40);
//        l.addLast(60);
//        l.print();
//        l.addat(4,111);
//        l.removeFirst();
        l.removeLast();
        l.print();

        //printing the size of an ll
        System.out.println(size);
    }
}
