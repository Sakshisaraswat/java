import java.util.Random;
import java.util.Scanner;
public class Bubble
{
    static int[] sort(int[] sequence)
     {
      int k=0;
      int l=sequence.length;
      int n=1; 

      for(int i=0;i<l;i++)
      {
       if(n>=1)
       {
        n=0;
        for(int j=1;j<(l-i);j++)
        {
         k=k+1;
         if(sequence[j-1]>sequence[j])
         {
          sequence[j-1]=sequence[j-1]+sequence[j];
          sequence[j]=sequence[j-1]-sequence[j];
          sequence[j-1]=sequence[j-1]-sequence[j];
          n=n+1; 
        }
       }
      }
     }
     System.out.println("no. of comp:"+k);
     return sequence;
    }

 static void printSequence(int[] sorted_sequence)
  {
   for(int i=0;i<sorted_sequence.length;i++)
   System.out.print(sorted_sequence[i]+" ");
  }

 public static void main(String args[])
  {
  
   Scanner scanner = new Scanner(System.in);
   System.out.print("\nenter an integer"); 
   int N =scanner.nextInt();
   System.out.println("number:"+N);
   System.out.println("sorting of randomly generated numbers using bubble sort");
   Random random = new Random();
   int[] sequence =new int[N];

   for(int i=0;i<N;i++)
    sequence[i]=random.nextInt(1000);

   System.out.println("\noriginal sequence: ");
   printSequence(sequence);
  
   System.out.println("\nSorted Sequence: ");
   printSequence(sort(sequence));
  }
}  