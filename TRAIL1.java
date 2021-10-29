// Pgm to print sum of n integers

public class Main{
    public static void main(String args[]) {
        int n = 5;
        System.out.println("The sum of first "+n+" numbers is - ");
        int sum = 0;
        for (int i=1; i<=n; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}

// Pgm to check for palindrome

import java.util.*;
public class Main{
    public static void main (String[] args) {
        System.out.println("Enter your number - ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp = num;
        int sum = 0 , remainder;
        while (num!=0){
            remainder = num%10;
            sum = sum*10 + remainder;
            num = num/10;
        }
        if (temp == sum)
            System.out.println("The number entered is a palindrome");
        else
            System.out.println("The number entered is not a palindrome");
    }
}


// Pgm to print all the numbers divisble by 10 b/w 0 to 1000

public class Main{
    public static void main(String args[]){
        for (int i=0; i<=1000 ; i++ )
        {
            if (i%10 == 0){
                System.out.println(i);
            }
        }
    }
}


// Pgm to demonstrate an infinity while loop

public class Main{
    public static void main (String[] args) {
        int i = 0;
        while (true)
        {
            i++;
            if (i%2 == 0)
                continue;
            else if (i == 1001)
                break;
            else
                System.out.println("Infinity - " + i);
        }
    }
}


// Pgm to demonstrate an infinity for loop

import java.util.*;
public class Main{
    public static void main (String[] args) {
        System.out.println("Enter the password - ");
        Scanner s = new Scanner(System.in);
        for(int i=1 ; i > 0 ; )
        {
            int pass = s.nextInt();
            if(pass == 106)
            {
                System.out.println("Welcome user");
                break;
            }
            else
            {
                System.out.println("incorrect password \nEnter password -");
                continue;
            }
        }
    }
}


// Pgm to demonstrate an infinity do while loop

public class Main{
    public static void main (String[] args) {
        int i=0;
        do
        {
            i++;
            if (i == 1000)
            {
                System.out.println("Limit reached");
                break;
            }
            else
            {
                System.out.println("Value of i = "+i);
                continue;
            }
        }while(i!=0);
    }
}
