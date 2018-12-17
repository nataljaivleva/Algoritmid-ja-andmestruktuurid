// Insertion Sort 
public class ExampleSort 
{ 
    static void sortInsertion(int arr[]) 
    { 
        int length = arr.length; 
        for (int i=1; i<length; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
    } 
  
    static void printArray(int arr[]) 
    { 
        int length = arr.length; 
        for (int i=0; i<length; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  

    public static void main(String args[]) 
    {         
        int arr[] = {5,12,3,6,7,3,3,3,3,1}; 
        sortInsertion(arr);
        printArray(arr); 
    } 
} 
