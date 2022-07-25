class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    
    public void area() {
        double Area = (breadth * length);
        String S = String.valueOf(Area);
        System.out.println("\nAREA = " + S);
    }
    
    public void perimeter() {
        double Peri = (2 * (breadth + length));
        String S = String.valueOf(Peri);
        System.out.println("\nPERIMETER = " + S);
    }
}

    
    
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}


public class Shapes {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(2, 3);
        Rectangle S = new Square(4);

        System.out.println("\nRECTANGLE\n");
        R.area();
        R.perimeter();

        System.out.println("\n\nSQUARE\n");
        S.area();
        S.perimeter();
    }
}