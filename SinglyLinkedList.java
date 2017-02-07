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
 public boolean isEmpty()
 {
  return start1 ==null;
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

public class SinglyLinkedList
{
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  linkedList1 list = new linkedList1();
  System.out.println("Singly linked list test\n");
  char ch;
  do
  {
  System.out.println("\nSingly Linked List operations\n");
  System.out.println("1.insert at begining");
  System.out.println("2.insert at end");
  System.out.println("3.insert at position");
  System.out.println("4.delete at position");
  System.out.println("5.check empty");
  System.out.println("6.get size");
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
   System.out.println("Empty status="+list.isEmpty());
   break;
   case 6:
    System.out.println("Size"+list.getSize1()+"\n");
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
}
}
   

      