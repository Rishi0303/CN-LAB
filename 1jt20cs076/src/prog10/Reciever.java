import java.io.*;
import java.net.*;
public class Reciever
 {
	public static void main(String[] args)throws Exception 
	{
		DatagramSocket socket = new DatagramSocket(4444);
		byte[] buf = new byte[256];
		DatagramPacket packet =new DatagramPacket(buf,buf.length);
		System.out.println("waitng.....");
		socket.receive(packet);
		String s = new String(packet.getData(),0,packet.getLength());
		System.out.println(packet.getAddress().getHostName()+":"+s);

	}
}

