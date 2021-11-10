o
import java.util.Scanner;

class Dec2Hex
{
	public static int Arg1 = 0;

    public static void main(String args[])
    {
	// return an error if no input argument is provided 
        if(args.length == 0) 
	{
           logger.log("ERROR: Please Enter a Decimal Number to Convert");
           return;
        }

       // error handling to ensure that non-Integer inputs are not converted
	// also do not result in a failed execution
       
        try
        {
             Arg1 = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException ex)
        {
          logger.log("ERROR: Please Enter Valid Decimal Number: ");
          return;
        }

	logger.log("Conversion of Decimal to Hexadecimal");
	int num, rem;
	num = Arg1;
	String hex = "";
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	
        while(num > 0)
        {
            rem = num%16;
            hex = ch[rem] + hex;
            num = num/16;
        }

        logger.log("Hexadecimal representation is: " + hex);

    }
}

