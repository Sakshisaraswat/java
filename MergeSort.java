/* Java program for Merge Sort */
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
class MergeSort
{   
    void merge(int arr[], int l, int m, int r)
    {
        int i;
        //size of two subarray
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*transfering data from main array to auxillary array*/
        for ( i=0; i<n1; ++i)
            L[i] = arr[l + i];
        
         System.out.println(Arrays.toString(L));
 
       for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        
         System.out.println(Arrays.toString(R));
 
 
        /* Merge the temp arrays */
 
         i = 0;
        int  j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    System.out.println(Arrays.toString(arr));
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
 
    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
   
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in); 
        int k; 
       do
       {
        System.out.println("enter number of elements");
        int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("\n1.Manual Mode\n2.Computer Mode");
        System.out.println("Enter your choice");
        int c=s.nextInt();
        if(c==1)
        {
        System.out.println("\nenter elements");
	for(int i=0;i<n;i++)
	  arr[i]=s.nextInt();
        }
        if(c==2)
        {   
        Random rand = new Random();
        for(int i=0;i<n;i++)
           arr[i]=rand.nextInt(1000);
        } 
        System.out.println("Given Array");
        printArray(arr);
 
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length-1);
 
        System.out.println("\nSorted array");
        printArray(arr);
        System.out.println("Do you want to continue?if yes, press 1 else 0");
        k=s.nextInt();
       } while(k==1);
    }
}

