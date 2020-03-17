package DailyPractice;

enum EnumDay
{
	sun, mon, tus, wed, thu, fri, sat
}
public class Test8 {

	public static void m1(EnumDay e1)
	{
		System.out.println(e1);
	}
	
	public static void main(String arg[])
	{
		Test8.m1(EnumDay.fri);
		Test8.m1(EnumDay.mon);
	}
}
