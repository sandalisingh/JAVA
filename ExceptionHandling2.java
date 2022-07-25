/*
    Sandali Singh
*/

class Exception_Derived extends Exception{
    String S;

    Exception_Derived(String s) {
        S = s;
    }

    public String toString(){
        return ( "Exception_Derived : " + S + "\n\n" ) ;
    }
}


class ExceptionHandling2{
    public static void main(String args[]){ 
        try{

            System.out.println("\nTry Block"); 
            throw new Exception_Derived("Error message!");

        }catch(Exception_Derived Exp){

            System.out.println("\nCatch Block") ;
            System.out.println(Exp) ; 

        }
    } 
}