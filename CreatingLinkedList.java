class Node1
{
    int data;
    Node1 address;
    
    public Node1(int data)
    {
        this.data = data;
        this.address = null;
    }
}
public class CreatingLinkedList {
    Node1 head, tail;
    int size;
    
    public void add(int d)
    {
      Node1 n = new Node1(d);
        if(head == null)
        {
            head=tail=n;
        }
        else
        {
            tail.address=n;
            tail=n;
        }
       // size++;
    }
    
     public void insertAtBeginning(int data) {
        // Create a new node with the given data
        Node1 newNode = new Node1(data);

        // Point the new node's next to the current head
        newNode.address = head;

        // Move the head to point to the new node
        head = newNode;
    }
    
     // Method to insert a new node at a specific position
    public void insertAtPosition(int data, int position) {
        Node1 newNode = new Node1(data);

        // If inserting at the head (position 0)
        if (position == 0) {
            newNode.address = head;
            head = newNode;
            return;
        }

        Node1 current = head;
        int currentPosition = 0;

        // Traverse the list until we reach the node just before the desired position
        while (current != null && currentPosition < position - 1) {
            current = current.address;
            currentPosition++;
        }

        // If the position is out of bounds (e.g., greater than list size)
        if (current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        // Insert the new node at the specified position
        newNode.address = current.address;
        current.address = newNode;
    }
    
    public void deleteAtPosition(int index)
    {
        if(index<0 || index >=size)
        {
            System.out.println("Out Of Bound");
        }
        
        Node1 temp = head;
        for(int i=0; i<index-1;i++)
        {
            temp=temp.address;
            System.out.println(temp.data);
        }
        temp.address = temp.address.address;
        System.out.println("Checking "+temp.address.data);
        
        if(temp.address == null)
        {
            tail = temp;
        }
        size--;
    }
    
    
    // Function to delete the node with a given value
    public void deleteByValue(int value) {
        // If the list is empty
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        // If the head node contains the value to be deleted
        if (head.data == value) {
            head = head.address;
            System.out.println("Deleted node with value " + value);
            return;
        }
        // Search for the node to delete
        Node1 current = head;
        while (current.address != null) {
            if (current.address.data == value) {
                current.address = current.address.address;
                System.out.println("Deleted node with value " + value);
                return;
            }
            current = current.address;
        }
        System.out.println("Value " + value + " not found in the list.");
    }

    
     public void printlist() // Traversing a LinkedList
    {
        Node1 current = head;
        while(current!=null)
                {
     System.out.println(current.data+" ");
     current = current.address;
                }
        System.out.println();
    }
     
     
    public static void main(String [] args)
    {
     CreatingLinkedList list = new CreatingLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.insertAtBeginning(70);
        list.insertAtPosition(80,2);
        list.deleteByValue(40);
        list.deleteAtPosition(4);
        System.out.println("Size "+list.size);
        list.printlist();
        //System.out.println("Node 1 Data: "+node1.data);
        //System.out.println("Node 1 Address: "+node1.address.toString());
    }
}