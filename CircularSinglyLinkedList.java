import java.util.Scanner;
 
class Node
{
    protected int data;
    protected Node link;
 
   
    public Node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}
 
/* Class linkedList */
class linkedList2
{
    protected Node start2 ;
    protected Node end2 ;
    public int size2 ;
 
    /* Constructor */
    public linkedList2()
    {
        start2 = null;
        end2 = null;
        size2 = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty2()
    {
        return start2 == null;
    }
    /* Function to get size of the list */
    public int getSize2()
    {
        return size2;
    }
    /* Function to insert element at the begining */
    public void insertAtStart2(int val)
    {
        Node nptr = new Node(val,null);    
        nptr.setLink(start2);
        if(start2 == null)
        {            
            start2 = nptr;
            nptr.setLink(start2);
            end2 = start2;            
        }
        else
        {
            end2.setLink(nptr);
            start2 = nptr;        
        }
        size2++ ;
    }
    /* Function to insert element at end */
    public void insertAtEnd2(int val)
    {
        Node nptr = new Node(val,null);    
        nptr.setLink(start2);
        if(start2 == null)
        {            
            start2 = nptr;
            nptr.setLink(start2);
            end2 = start2;            
        }
        else
        {
            end2.setLink(nptr);
            end2 = nptr;            
        }
        size2++ ;
    }
    /* Function to insert element at position */
    public void insertAtPos(int val , int pos) 
    {
        Node nptr = new Node(val,null);                
        Node ptr = start2;
        pos = pos - 1 ;
        for (int i = 1; i < size2 ; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink() ;
                ptr.setLink( nptr );
                nptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size2++ ;
    }
    /* Function to delete element at position */
    public void deleteAtPos2(int pos)
    {    
        if (size2 == 1 && pos == 1)
        {
            start2 = null;
            end2 = null;
            size2 = 0;
            return ;
        }        
        if (pos == 1) 
        {
            start2 = start2.getLink();
            end2.setLink(start2);
            size2--; 
            return ;
        }
        if (pos == size2) 
        {
            Node s = start2;
            Node t = start2;
            while (s != end2)
            {
                t = s;
                s = s.getLink();
            }
            end2 = t;
            end2.setLink(start2);
            size2 --;
            return;
        }
        Node ptr = start2;
        pos = pos - 1 ;
        for (int i = 1; i < size2 - 1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size2-- ;
    }
    /* Function to display contents */
    public void display()
    {
        System.out.print("\nCircular Singly Linked List = ");
        Node ptr = start2;
          if (size2 == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start2.getLink() == start2) 
        {
            System.out.print(start2.getData()+ "->"+ptr.getData()+ "\n");
            return;
        }
        System.out.print(start2.getData()+ "->");
        ptr = start2.getLink();
        while (ptr.getLink() != start2) 
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+ "->");
        ptr = ptr.getLink();
        System.out.print(ptr.getData()+ "\n");
    }
}
 
/* Class CircularSinglyLinkedList */
public class CircularSinglyLinkedList
{    
    public static void main(String[] args)
    {            
        Scanner scan = new Scanner(System.in);
        /* Creating object of linkedList */
        linkedList2 list = new linkedList2(); 
        System.out.println("Circular Singly Linked List Test\n");          
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nCircular Singly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");            
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtStart2( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd2( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list.getSize2() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize2() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos2(p);
                break;
            case 5 : 
                System.out.println("Empty status = "+ list.isEmpty2());
                break;                   
            case 6 : 
                System.out.println("Size = "+ list.getSize2() +" \n");
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);            
        } while (ch == 'Y'|| ch == 'y');                    
    } 
}
