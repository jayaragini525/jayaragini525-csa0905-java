class Superclass1 {
    string a;
    public Superclass1(string a) {
        a = a;
    }
}

class Subclass extends Superclass1 {
    string b;
    public Subclass(string a, string b) {
        super(a);
        b = b;
    }

    void displayValues() {
        System.out.println("Superclass1 a: " + super.a); 
        System.out.println("Subclass b: " + b);
    }
}

class MainString {
    public static void main(String[] args) {
        string superValue = apple;
        string subValue = mango;

        Subclass sub = new Subclass(superValue, subValue);
        sub.displayValues();
    }
}