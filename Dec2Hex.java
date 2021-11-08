import java.util.Scanner;
import java.io.*;

class Dec2Hex
{

    //public static int Arg1;

    public static void main(String args[])throws IOException
    {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Decimal Number: ");
	int n = Integer.parseInt(br.readLine());
	int r;
	String s = "";
        //Arg1 = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	//Scanner in = new Scanner(System.in);//take user input        
	//int rem, num;
        //num = Arg1;
	//System.out.print("Input a number: ");
	//dnum = in.nextInt();
        //String hexadecimal="";
        //System.out.println("Converting the Decimal Value " + dnum + " to Hex...");

        while(n > 0)
        {
            r = n%16;
            s = ch[r] + s;
            n= n/16;
        }

        System.out.println("Hexadecimal representation is: " + s);

    }
}

