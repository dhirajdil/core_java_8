package DailyPractice;

class Singleton
{
	private static Singleton s1 = null;
	
	private Singleton(){}
	
	public static Singleton getObject()
	{
		if(s1==null)
		{
			synchronized(Singleton.class)
			{
				if(s1==null)
					s1=new Singleton();
			}
		}
		
		return s1;
	}
}

public class Test6 {

	public static void main(String arg[])
	{
		Singleton s1 = Singleton.getObject();
		Singleton s2 = Singleton.getObject();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
