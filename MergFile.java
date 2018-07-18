import java.io.*;
public class MergFile
{
 public static void main(String args[])throws Exception
  {  
    PrintWriter pw=new PrintWriter("out2.txt");
   BufferedReader b=new BufferedReader(new FileReader("a1.txt"));
   BufferedReader c=new BufferedReader(new FileReader("s1.txt"));
   String l1=b.readLine();
   String l2=c.readLine();




    while(l1!=null)
    {
     pw.println(l1);
     l1=b.readLine();
    }
   
while(l2!=null)
    {
     pw.println(l2);
     l2=c.readLine();
     }

    
  pw.flush();
  b.close();
  c.close();
  pw.close();
}
}

