package Assignment02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 10;
        int y = 4;
        double z = 1.5;

        Worker01 w = new Worker01();

        System.out.println(w.doubleIt(x)); //20
        System.out.println(w.doubleIt(y)); //8

        int a = add(x,y);
        System.out.println(a); //14

        double e = add(x,z);
        System.out.println(e); //11.5

        double f = add(x,z,y);
        System.out.println(f); //15.5

        int b = multiply(x,y);
        System.out.println(b); //40

        int c = subtract(x,y);
        System.out.println(c); //6

        int d = subtract(y,x);
        System.out.println(d); //6

        System.out.println(w.calculate(x,y,y)); //Result is 10
        System.out.println(w.calculate(y,x,x)); //Result is 4
        System.out.println(makeMeme()); //*genius meme face. When you finally complete one task of this assignment.

    }
    //You may need to code here

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static double add(int num1, double num2){
        return num1 + num2;
    }

    public static double add(int num1, double num2, int num3){
        return num1 + num2 + num3;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }

    public static int subtract(int num1, int num2){
        return Math.abs(num1 - num2);
    }

    public static String makeMeme(){
        return "*genius meme face. When you finally complete one task of this assignment.";
    }

}

class Worker01{
    public int doubleIt(int number){
        return 2* number;
    }

    public String calculate(int num1, int num2, int num3){
        return "Result is " + (num1 + num2 - num3);
    }
}
