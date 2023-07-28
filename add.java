import java.util.*;
public class add { 
    
    Node head; // head of list 
    static class Node { 
    
        int data; 
        Node next; 
    
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
    
    // Method to insert a new node 
    public static add insert(add list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
          
    
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
    
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
    
        // Return the list by head 
        return list; 
    } 

    //Deleting a key from the linked list
    // Method to delete a node in the LinkedList by KEY
    public static void printList(add list) 
    { 
        Node currNode = list.head; 
     
        System.out.print("LinkedList: "); 
     
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
     
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 

    public static add addTwoNumbers(add l1, add l2) {
        int sum=0,carry=0;
        add dummy=new add();
        add curr=dummy;
        Node a=l1.head;
        Node b=l1.head;
        if(a==null&&b!=null)
        return l2;
        if(a!=null&&b==null)
        return l1;
        Node cur1=l1.head;
        Node cur2=l2.head;
        while(cur1!=null||cur2!=null)
        {
            sum=cur1.data+cur2.data;
            carry=(sum>=10)?1:0;
            

        }
        

    }
     
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        add list1 = new add(); 
        add list2 = new add();
        add list3 = new add();

        list1 = insert(list1, 2); 
        list1 = insert(list1, 4); 
        list1 = insert(list1, 3); 
        list2 = insert(list2, 5); 
        list2 = insert(list2, 6);
        list2 = insert(list2, 4);
    
        // Print the LinkedList 
        printList(list1); 
        printList(list2);
        list3=addTwoNumbers(list1, list2);
       
    } 
}