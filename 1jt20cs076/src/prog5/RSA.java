package prog5;

import java.math.BigInteger;
import java.util.*;
public class RSA {
public static void main(String args[])
{
Scanner ip=new Scanner(System.in);
int p,q,n,e=1,j;
int d=1,i1;
int t1,t2;
int pt[]=new int[10];
int ct[]=new int[10];
int rt[]=new int[10];
int temp[]=new int[10];
String i=new String();
System.out.println("enter the two prime numbers:");
p=ip.nextInt();
q=ip.nextInt();
System.out.println("enter the message to be sent:");
i=ip.next();
i1=i.length();
n=p*q;
t1=p-1;
t2=q-1;
System.out.println("\n___________________________");
System.out.println("sender side:");
while((t1*t2)%e==0)
{
e++;
}
System.out.println("public key(e)="+e);
System.out.println("______________________________");
for(j=0;j<i1;j++)
{
pt[j]=(i.charAt(j))-96;
ct[j]=((int)Math.pow(pt[j], e))%n;
System.out.println("cipher text="+ct[j]);
}
System.out.println("\n transmitted message:");
for(j=0;j<i1;j++)
{
temp[j]=ct[j]+96;
System.out.println((char)temp[j]);
}
System.out.println("\n\n______");
System.out.println("receiver side:");
while((d*e)%(t1*t2)!=1)
{
d++;
}
System.out.println("private key(d)="+d);
System.out.println("_________________________");
for(j=0;j<i1;j++)
{
BigInteger very_big_no=BigInteger.valueOf(ct[j]);
very_big_no=very_big_no.pow(d);
very_big_no=very_big_no.mod(BigInteger.valueOf(n));
rt[j]=very_big_no.intValue();
System.out.println("plain text="+rt[j]);
}
System.out.println("\n______________");
System.out.println("decrypted message");
for(j=0;j<i1;j++)
{
rt[j]=rt[j]+96;
System.out.println((char)rt[j]);
}
System.out.println("\n__________________");
ip.close();
}
}
