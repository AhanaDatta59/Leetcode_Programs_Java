import java.util.*;
public class SLL
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    //function to insert nodes
    public static SLL insert(SLL list,int data)
    {
        Node new_node=new Node(data);
        
        
        //if list is empty then making the new node the head
        if(list.head==null)
         list.head=new_node;
        //if the list have more elements 
        else{
            Node last=list.head;
            while(last.next!=null)
            last=last.next;
        
        last.next=new_node;
        }
        return list;
    }
    public static SLL delete(SLL list, int key)
    {
      Node currNode=list.head,prev=null;
      //if the data to be deleted is present at the head
      if(currNode!=null&&currNode.data==key){
      list.head=currNode.next;//changing the head
      System.out.println(key+" is deleted");
      return list;
      }

      //if the node to be deleted is present in between somewhere 
      while(currNode!=null&&currNode.data!=key)
      {
          prev=currNode;
          currNode=currNode.next;
      }
      if(currNode!=null)
      {
        prev.next=currNode.next;
        System.out.println(key+ "found and deleted");
      }
      if(currNode==null)
      System.out.println(key+ "not Found");

      return list;
    }
    public static SLL method(SLL list)
    {
        Node cur=list.head;
        System.out.println("The list is: ");
        int num=0,n=0;
        while(cur!=null)
        {
           num++;
           cur=cur.next;
        }
        cur=list.head;
        Node prev=list.head;
        if(num==1)
        {
            list.head=cur.next;//changing the head
             return list;
        }
       System.out.println(num);
        if(num%2!=0)
        n=(num+1)/2;
        else
        n=num/2+1;
        System.out.println(n);
        

        for (int i = 1 ;i<n;++i){
               prev=cur;
               cur=cur.next;
        }
        prev.next=cur.next;
        return list;
    }
    public static void printList(SLL list) 
    { 
        Node currNode = list.head; 
     
        //System.out.print("LinkedList: "); 
     
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
     
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 

    public static void main(String[] args)
    {
        SLL list=new SLL();
        list=insert(list,2);
        // list=insert(list,1);
        // list=insert(list,3);
        // list=insert(list,4);
        //  list=insert(list,1);
        //  list=insert(list,2);
        // list=insert(list,6);
        
        list=method(list);

        // list=delete(list,2);
        // list=delete(list,4);

        printList(list);

    }
}
