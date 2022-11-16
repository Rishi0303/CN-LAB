import java.io.*;
import java.net.*;
public class Sender 
{

	public static void main(String[] args)throws Exception 
	{
		InetAddress addr= InetAddress.getByName(args[0]);
		byte[] buf = args[1].getBytes();
		DatagramPacket packet = new DatagramPacket(buf,buf.length,addr,4444);
		DatagramSocket socket = new DatagramSocket();
		socket.send(packet);

	}

}

