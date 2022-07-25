public class BubbleSort { 
    

    static void BubbleSorting(int[] A) {  
        int n = A.length;  

        for(int i=0; i < n; i++){  
                for(int j=1; j < (n-i); j++){  
                        if(A[j-1] > A[j]){      //the preceding element is greater
                                int temp = A[j-1];  //so swap
                                A[j-1] = A[j];  
                                A[j] = temp;  
                        }  
                        
                }  
        }  
  
    }  
    public static void main(String[] args) {  
                int A[] ={ 12, 23, -10, 100, 123 };  
                 
                System.out.print("\n\n");
                
                System.out.print("\nINPUT ARRAY = ");  
                for(int i=0; i < A.length; i++){  
                        System.out.print(A[i] + " ");  
                }  
                System.out.println();  
                  
                BubbleSorting(A);//sorting array elements using bubble sort  
                 
                System.out.print("\nSORTED ARRAY = ");  
                for(int i=0; i < A.length; i++){  
                        System.out.print(A[i] + " ");  
                }  
   
                System.out.print("\n\n");
        }  
}