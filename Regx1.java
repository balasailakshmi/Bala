import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
public class Regx1
{
 public static void main(String args[])
  {
    Pattern p=Pattern.compile("[a-z]{5}[.][a-z]{3}[.][a-z]{2}[.][a-z]{2}");
    Matcher m=p.matcher("gmail.com.co.in");
    while(m.find())
     {
      System.out.println(m.group());
     }
   }
}   
