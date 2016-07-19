public class Node {
    public int data;
    public Node next;

    //Link constructor
    public Node(int d) {
	    data = d;
    }

    //Print Link data
    public void printNode() {
	    System.out.print("{" + data + "} ");
    }    
}

public class LinkList {
    private Node first;

    //LinkList constructor
    public LinkList() {
	    first = null;
    }

    //Returns true if list is empty
    public boolean isEmpty() {
	    return first == null;
    }

    //Inserts a new Link at the first of the list
    public void insert(int d) {
	    Node link = new Node(d);
	    link.next = first;
	    first = link;
    }

    //Deletes the link at the first of the list
    public Node delete() {
	    Node temp = first;
	    first = first.next;
	    return temp;
    }

    //Prints list data
    public void printList() {
	    Node currentLink = first;
	    System.out.print("List: ");
	    while(currentLink != null) {
		    currentLink.printNode();
		    currentLink = currentLink.next;
	    }
	    System.out.println("");
    }
        
    //insertAfter
    public void insertAfter(int d)
    {
    	// Traverse to the last node
    	Node tmp = first;
    	while(tmp.next != null)
    		tmp = tmp.next;
    	
    	// Insert after the last node 
    	Node link = new Node(d);
    	tmp.next = link;
    }
    
    //length
    public int length(){
    	int i = 0;
    	Node tmp = first;
    	while(tmp != null){
    		tmp = tmp.next;
    		i++;
    	}
    	return i;
    }
        
    //sort
    //bubble sort algorithm
    public void sort(){
    	int i, j, k, tempData ;
    	Node current;
    	Node next;
    	int size = length();
    	k = size ;
    	
    	for ( i = 0 ; i < size - 1 ; i++, k-- ) {
    		current = first;
    		next = first.next ;
    		
    	      for ( j = 1 ; j < k ; j++ ) {
    	          if ( current.data > next.data ) {
    	        	  tempData = current.data ;
    	        	  current.data = next.data;
    	        	  next.data = tempData ;    	        	  
    	          }
    	          current = current.next;
    	          next = next.next; 
    	      }
    	}    	
    }    
}

public class SortLinkList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    LinkList list = new LinkList();

	    list.insert(3);
	    list.insert(8);
	    list.insert(7);
	    list.insert(2);
	    list.insert(6);
	    list.insert(20);
	    list.insert(11);
	    list.printList();
	    
	    list.sort();
	    list.printList();		
		
	}

}
