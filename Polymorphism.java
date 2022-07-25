
class Parent{

    Parent() {
        System.out.println("-> PARENT CONSTRUCTOR"); 
    }

    public void Fxn(){
        System.out.println("PARENT.Fxn()"); 
    }

    
    public void finalize() throws Throwable{ 
        System.out.println("~ PARENT object destroyed by GARBAGE COLLECTOR"); 
    }
}

class Child extends Parent{

    Child() {
        System.out.println("-> CHILD CONSTRUCTOR"); 
    }

    public void Fxn(){ 
        System.out.println("CHILD.Fxn()"); 
    }

    public void finalize() throws Throwable{ 
        System.out.println("~ CHILD object destroyed by GARBAGE COLLECTOR"); 
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        System.out.println("\n\nRUNTIME POLYMORPHISM / LATE BINDING");
        
        System.out.println("\n1. Parent Object - Child Constructor");
        Parent V = new Child();         
        V.Fxn();                       // PC - C.move()
        
        System.out.println("\n2. Parent Object - Parent Constructor");
        Parent S = new Parent();              
        S.Fxn();                       // PP - P.move()
        
        System.out.println("\n3. Child Object - Child Constructor");
        Child B = new Child();            
        B.Fxn();                       // PC - C.move()
        
        // 4. Parent Object - Parent Constructor
        // ERROR = incompatible types: Vehicle cannot be converted to Bike
        // B = new Vehicle();          
        // B.move();                   // PP - P.move()

        System.gc();    // runs the garbage collector
    }
}
