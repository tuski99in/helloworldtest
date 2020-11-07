package Designpattern;

public class Singelton {

	private static Singelton sing=null;
	private static String set;
	public static synchronized Singelton getInstance()
	{
		
		if(sing==null)
		{
			sing= new Singelton();
		}
		return sing;
	}
	public Singelton()
	{
		set="Lala lala lala";
	}
	public static void setStrg(String value)
	{
		set=value;
	}
	public static void main(String ar[])
	{
		
		Singelton sinew= getInstance();
		System.out.println("" +sinew.set);
		sinew.setStrg("Yo Yo Yo");

		Singelton sinew1= getInstance();
		System.out.println("" +sinew1.set);
		
	}
			
}
 