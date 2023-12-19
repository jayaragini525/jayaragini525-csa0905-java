class Superclass1 {
    String a;
    public Superclass1(String a) {
        a = a;
    }
}

class Subclass extends Superclass1 {
    String b;
    public Subclass(String a, String b) {
        super(a);
        b = b;
    }

    void displayValues() {
        System.out.println("Superclass1 a: " + super.a); 
        System.out.println("Subclass b: " + b);
    }
}

class Main {
    public static void main(String[] args) {
        String superValue = apple;
        String subValue = mango;

        Subclass sub = new Subclass(superValue, subValue);
        sub.displayValues();
    }
}