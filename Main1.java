class SuperClass {
    int superMember;

    public SuperClass(int superMember) {
        superMember = superMember;
    }

    public void display() {
        System.out.println("SuperClass Member: " + superMember);
    }
}

class SubClass extends SuperClass {
    int subMember;

    public SubClass(int superMember, int subMember) {
        super(superMember);
        this.subMember = subMember;
    }

    
    public void display() {
        super.display(); 
        System.out.println("SubClass Member: " + subMember);
    }
}

class Main1 {
    public static void main(String[] args) {
        SubClass sub = new SubClass(100, 200);
        sub.display();
    }
}
