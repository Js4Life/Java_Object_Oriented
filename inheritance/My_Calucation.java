class Calcualtion {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("the sum of given number: " +z);
    }

    public void Substraction(int x , int y) {
        z = x - y;
        System.out.println("the difference between the given numbers:" + z);
        
    }
}

public class My_Calucation extends Calcualtion {
    public void multiplication(int x , int y) {
        z = x * y;
        System.out.println("PRODUCT:" +z);
        
    }

    public static void main(String args[]) {
        int a = 20 , b = 10;
        My_Calucation demo = new  My_Calucation();
        demo.addition(a,b);
        demo.Substraction(a,b);
        demo.multiplication(a,b);
    }
}