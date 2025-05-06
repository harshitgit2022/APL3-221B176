/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Appliaction
{
	public static void main(String[] args) {
	Crow crow = new IndianCrow();
	Swan swan = new IndianSwan();
	CrowAdapter crowadapter = new CrowAdapte(crow);
	
	}
}