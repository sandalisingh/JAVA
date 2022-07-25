//Sandali Singh

import java.util.*;

public class ArrayOfStrings_Display{
	public static void Display(String S[]) {
        System.out.print("Array of Strings = ");
		for(String i : S){
            System.out.print(i+" ");
        }
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Size = ");
		int n = Integer.parseInt(scn.nextLine());

        String S[] = new String[n];
		
		for(int i = 0; i < n; i++){
            System.out.print("String["+ i +"] = ");
		    S[i] = scn.nextLine();
        }
		
		Display(S);

        scn.close();
	}
}
