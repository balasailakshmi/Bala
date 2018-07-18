import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
public class Regx3
{
 public static void main(String args[])
  {
    Pattern p=Pattern.compile("//w{4}.//w{3}.//w{2}");
    Matcher m=p.matcher("yaah.com.co");
    while(m.find())
     {
      System.out.println(m.group());
     }
   }
}
