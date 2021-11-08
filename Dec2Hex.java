import java.util.Scanner;
import java.io.*;

class Dec2Hex
{

    public static void main(String args[])
    {
	System.out.println("Conversion of Decimal to Hexadecimal");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a Decimal Number: ");
	int num = scan.nextInt();
	int rem;
	String hex = "";
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
        while(num > 0)
        {
            rem = num%16;
            hex = ch[rem] + hex;
            num = num/16;
        }

        System.out.println("Hexadecimal representation is: " + hex);

    }
}

