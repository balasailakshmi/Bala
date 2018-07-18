import java.io.*;
public class xpatt
{
 public static void main(String args[])
  {
    int a[]={1,2,3,2,1};
     int len=a.length;
    for(int i=0;i<len;i++)
     {
      for(int j=0;j<len;j++)
       {
       if(j==i||j==(len-1-i))
          {
           System.out.print(a[j]);
          }
       else
         {
          System.out.print("  ");
         }
      }
    System.out.println();
   }
   }
}

