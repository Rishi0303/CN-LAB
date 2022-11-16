package prog6;
import java.util.Scanner;
public class leakyBucket {
public static void main(String[] args)throws InterruptedException
{
	int n,incoming,outgoing,store=0,bucketsize;
	Scanner Scan =new Scanner(System.in);
	System.out.println("Enter bucketsize,outgoing rate,no of inputs and incoming size");
	bucketsize=Scan.nextInt();
	outgoing=Scan.nextInt();
	n=Scan.nextInt();
	incoming=Scan.nextInt();
	while(n!=0)
	{
		System.out.println("incoming size is"+incoming);
		if(incoming<=(bucketsize-store))
		{
			store+=incoming;
			System.out.println("bucket buffer size is "+store+"out of"+bucketsize);
		}
		else
		{
			System.out.println("packet loss :"+(incoming-bucketsize));
			store=bucketsize;
			System.out.println("bucket buffer size is"+store+"out of "+bucketsize);
		}
		store-=outgoing;
		System.out.println("after outgoing"+store+"packets left out of "+bucketsize+"in buffer");
		n--;
		Thread.sleep(3000);
	}
	Scan.close();
}
}
