/*

Sandali Singh

Q1)even print 1 tp 20
Q2)3 int input ...check equality of 3 inputs
Q3)int input till user wants....largest smallest display

*/

import java.util.*;

public class ControlStatements{
	public static int Max(int a, int b) {
        if(a > b){
            return a;
        }

        return b;
	}

    public static int Min(int a, int b) {
        if(a > b){
            return b;
        }

        return a;
	}

    public static boolean Equaliity(int a, int b, int c) {
		if( a == b && b == c){
            return true;
        }
        return false;
	}

    public static void DisplayEven(int n) {
        for(int i = 2 ; i <= n; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
	}

	
	public static void main(String[] args) {

        //1st Question
        System.out.println("\nQUESTION 1\n");
        DisplayEven(20);
		
		Scanner scn = new Scanner(System.in);
		
        //2nd Question
        System.out.println("\nQUESTION 2\n");

		System.out.println("Enter 3 numbers = ");
		int a = Integer.parseInt(scn.nextLine());
        int b = Integer.parseInt(scn.nextLine());
        int c = Integer.parseInt(scn.nextLine());

        if(Equaliity(a, b, c)){
            System.out.println("a, b, and c are EQUAL!");
        }else{
            System.out.println("a, b, and c are NOT equal!");
        }

        //3rd Question
        System.out.println("\nQUESTION 3\n");
        
        String ans = "yes";
        
        int num;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        do{
            System.out.print("Enter a number : ");
            num = Integer.parseInt(scn.nextLine());

            max = Max(num, max);
            min = Min(num, min);

            System.out.println("Do you wish to continue? ");
            ans = scn.nextLine();

        }while(ans.equals("yes") || ans.equals("Yes"));

        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);

        scn.close();
	}
}
