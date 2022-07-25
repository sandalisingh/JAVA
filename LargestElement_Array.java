//Sandali Singh

import java.util.*;

public class LargestElement_Array{
	public static int Greatest(int a[]) {
		int max = a[0];
		
        for(int i : a){
            if(i > max){
                max = i;
            }
        }

        return max;
	}

    public static float Average(int a[]) {
		float avg = 0;
		
        for(int i : a){
            avg += i;
        }

        avg = avg / a.length;
        return avg;
	}


	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Size of array = ");
		int n = scn.nextInt();

        int a[] = new int[n];
		
		for(int i = 0; i < n; i++){
            System.out.println("Array["+ i +"] = ");
		    a[i] = scn.nextInt();
        }
		
		// int max = Greatest(a);	
		// System.out.println("Max = " + max);

        float avg = Average(a);
        System.out.println("Average = " + avg);

        scn.close();
	}
}
