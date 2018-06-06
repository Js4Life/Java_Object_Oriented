class Superclass {
    int age;
    
    Superclass(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("the value of variable named age in super class :" + age);
    }
}

public class Subclass extends Superclass {
    Subclass(int age) {
        super(age);
    }

    public static void main(String args[]) {
        Subclass s = new Subclass(77);
        s.getAge();
    }
}