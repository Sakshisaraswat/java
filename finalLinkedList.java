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
 
  public Node(int d, Node n)
  {
  
   data = d;
   link = n;
 
   }

  public void setLink(Node n)
  {
    link=n;
  }

   public void setData(int d)
  {
    data=d;
  }
 
  public Node getLink()
  {
   return link;
  }
  
  public int getData()
  {
   return data;
  }

 } 
class linkedList1
{
 protected Node start1;
 protected Node end1;
 public int size1;
 
 public linkedList1()
 {
  start1 =null;
  end1 =null;
  size1 =0;
 }

 public int getSize1()
 {
  return size1;
 }
 
 public void insertAtStart1(int val)
 {
  Node nptr = new Node(val,null);
  size1++;
  if(start1==null)
  {
   start1= nptr;
   end1 =start1;
  }
  else
  
  {
    nptr.setLink(start1);
    start1=nptr;
  }
 }

 public void insertAtEnd1( int val )
 {
  
  Node nptr = new Node(val,null);
  size1++;
  if(start1==null)
  {
   start1=nptr;
   end1=start1;
  }
  else
  {
   end1.setLink(nptr);
   end1 = nptr;
   }
  }

 public void insertAtPos1(int val ,int pos)
 {
  Node nptr = new Node(val,null);
  Node ptr =start1;
  pos=pos-1;
  for(int i=1;i<size1;i++)
  {
   if (i==pos)
    {
     Node tmp =ptr.getLink();
     ptr.setLink(nptr);
     nptr.setLink(tmp);
     break;
    }
   ptr=ptr.getLink();
  }
 size1++;
 }
 
 public void deleteAtStart1()
 {
  start1=start1.getLink();
     size1--;
   return;
 }

 public void deleteAtEnd1()
 {
     Node s =start1;
   Node t =start1;
   while(s!=end1)
   {
    t=s;
    s=s.getLink();
   }
  end1 = t;
  end1.setLink(null);
  size1--;
  return;
 }
   
  
 public void deleteAtPos1(int pos)
 {
  if(pos==1)
   {
    start1=start1.getLink();
     size1--;
   return;
   }
  
  if(pos==size1)
  {
   Node s =start1;
   Node t =start1;
   while(s!=end1)
   {
    t=s;
    s=s.getLink();
   }
  end1 = t;
  end1.setLink(null);
  size1--;
  return;
 }
 Node ptr =start1;
 pos = pos -1;
 for (int i=1;i<size1-1;i++)
 {
  if(i==pos)
  {
  Node tmp =ptr.getLink();
  tmp=tmp.getLink();
  ptr.setLink(tmp);
  break;
 }
 ptr=ptr.getLink();
}
size1-- ;
}

public void display()
{
 System.out.print("\nSingly Linked List=");
 if(size1==0)
 {
  System.out.print("empty\n");
   return;
  }
 if(start1.getLink()==null)
 {
  System.out.println(start1.getData());
  return;
 }
 Node ptr =start1;
 System.out.print(start1.getData()+"->");
 ptr=start1.getLink();
 while(ptr.getLink()!=null)
 {
  System.out.print(ptr.getData()+"->");
  ptr=ptr.getLink();
 }
 System.out.print(ptr.getData()+"\n");
}
}

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
 


public class finalLinkedList
{
 public static void main(String[] args)
 {
   Scanner scan=new Scanner(System.in);
  System.out.println("want to create singly linked list or circular linked list");
   System.out.println("for singly press 1 \n for circular press 2");
   int c =scan.nextInt(); 
  while(c==1||c==2)
{
 
   switch(c)
    {
     case 1:
  linkedList1 list = new linkedList1();
  char ch;
       do
       {
  System.out.println("\nSingly Linked List operations\n");
  System.out.println("1.insert at begining");
  System.out.println("2.insert at end");
  System.out.println("3.insert at position");
  System.out.println("4.delete at position");
  System.out.println("5.delete from start");
  System.out.println("6.delete from end");
   int choice =scan.nextInt();
  switch(choice)
  {
   case 1 :
   System.out.println("\nenter integer element to insert");
   list.insertAtStart1(scan.nextInt());
    break;
   case 2: 
    System.out.println("\nenter integer element to insert");
    list.insertAtEnd1(scan.nextInt());
    break;
   case 3:
    System.out.println("\nenter integer element to insert");
    int num =scan.nextInt();
    System.out.println("\nenter position");
    int pos =scan.nextInt();
    if(pos<=1||pos>list.getSize1())
     System.out.println("\nInvalid position");
    else
     list.insertAtPos1(num,pos);
    break;
  case 4:
    System.out.println("\nenter position");
    int p=scan.nextInt();
    if(p<1||p > list.getSize1())
    System.out.println("\nInvalid position");
    else
    list.deleteAtPos1(p);
    break;
  case 5:
    list.deleteAtStart1();
    break;
  case 6:
    list.deleteAtEnd1();
    break;  
    default:
    System.out.println("\nwrong entry");
    break;
 }
 list.display();
 System.out.println("\ndo you want to continue");
 ch=scan.next().charAt(0);
 }
 while(ch=='Y'||ch=='y');
 break;
case 2:
        linkedList2 list2 = new linkedList2(); 
        System.out.println("Circular Singly Linked List Test\n");          
        char che;
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
                list2.insertAtStart2( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list2.insertAtEnd2( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos <= 1 || pos > list2.getSize2() )
                    System.out.println("Invalid position\n");
                else
                    list2.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list2.getSize2() )
                    System.out.println("Invalid position\n");
                else
                    list2.deleteAtPos2(p);
                break;                         
             default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }
            /*  Display List  */ 
            list2.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            che = scan.next().charAt(0);            
        } while (che == 'Y'|| che == 'y');                    
          break;
}
  System.out.println("want to create singly linked list or circular linked list");
   System.out.println("for singly press 1 \n for circular press 2");
    c =scan.nextInt();
}
}
}  