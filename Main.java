import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number which needs to be divided");
        int number=input.nextInt();
        if (number%2!=0){
            System.out.println("Enter a positive number");
        }

        input.close();
        Counter c=new Counter(number);
        int Count=c.counter();
        System.out.println("the given number gets divided by 2 "+Count+" times");

    }
}