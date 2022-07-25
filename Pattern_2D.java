//Sandali Singh

import java.util.*;

public class Pattern_2D{
	public static void Display(int S[][]) {
        for(int i[] : S){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		
		int S[][]= {
                        {1},
                        {1,2},
                        {1,2,3},
                        {1,2,3,4},
                        {1,2,3,4,5}
                    };
		
		Display(S);
	}
}
