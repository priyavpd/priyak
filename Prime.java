import java.util.Scanner;

public class prime
{
public static void main(String[] args)
{
int count=0;
int flag=0;
Scanner s=new Scanner(System.in);
System.out.println("eneter the range");
int n=s.nextInt();

for(int i=1;i<n;i++) 
{
         flag=0;
         for(int j=2;j<i;j++)
         {
                  if(i%j==0)
                  {
                	  flag=1;
                	  break;
                  }
                  
         }
         if(flag==0)
         {
        	 
        count++;
         System.out.println("count :"+count);
         System.out.println("prime number is:"+i);
         }
}
}
}
