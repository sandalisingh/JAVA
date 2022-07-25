/*
    Sandali Singh
*/

public class ExceptionHandling1 {

    public static void main(String[] args) throws Exception {

        try {
            System.out.println("\nTry Block"); 
            throw new Exception("\tNew Exception thrown !");
        } catch (Exception e) {
            System.out.println("\nCatch Block : " + e.getMessage()); 
        } finally {
            System.out.println("\nFinally Block !"); 
        }

    } 
}
