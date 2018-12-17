import java.util.Random;

import com.sun.org.apache.xpath.internal.SourceTree;


public class ExampleSort 
{ 
    static final int SIZE=100;
    static final int MAX_RANDOM=50;
    static int counter=0;
    static int[] arr;
    static {
        arr=new int[SIZE];
        Random rnd=new Random();
        for (int i = 0; i < SIZE; i++) {
            arr[i]=rnd.nextInt(MAX_RANDOM+1);
        }
    }

    public static void main(String args[]) 
    {   
        System.out.println("  ===================== Array ====================");
        printArray();      
        sortInsertion();
        System.out.println("  ============== Insertion Sort ==================");
        printArray(); 
        System.out.println("Count: "+counter);
    } 

    static void sortInsertion() 
    { 
        int length = arr.length; 
        counter=0;
        for (int i=1; i<length; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
                counter++;
            } 
            arr[j+1] = key; 
        } 
    } 
  
    static void printArray() 
    { 
        int length = arr.length; 
        for (int i=0; i<length; ++i) {
            System.out.printf("%5d",arr[i]); 
            if (i!=0 && (i+1) % 10==0) System.out.println();
        }
        System.out.println(); 
    } 

} 
