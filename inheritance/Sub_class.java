class Super_class {
    int num = 20;

    public void display() {
        System.out.println("superclass");
    }
}

public class Sub_class extends Super_class {
    int num = 10;

    public void display() {
            System.out.println("subclass");
    }

    public void my_method() {
        Sub_class sub = new Sub_class();
        sub.display(); 
        // sub
        super.display();
         // super class

        System.out.println("sub class num" + sub.num);
        System.out.println("sub class num" + super.num);
    }
    public static void main(String args[]) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }
}