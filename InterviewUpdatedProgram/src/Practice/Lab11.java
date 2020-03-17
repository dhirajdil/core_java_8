package Practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lab11 {
	public static void main(String[] args) throws UnknownHostException {
		String hostname = InetAddress.getByName("192.168.1.1").getHostName();
	    System.out.println("hostname = " + hostname);
	    hostname="www.google.com";
	    System.out.println(hostname);
	    
	    
	}

}
