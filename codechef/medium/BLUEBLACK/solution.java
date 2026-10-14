import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int cost1 = 3 * A;
        int cost2 = A + B;

        System.out.println(Math.min(cost1, cost2));

        sc.close();

	}
}
