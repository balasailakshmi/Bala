//import java.io.BufferReader.*;
import java.io.*;
//import java.io.FileReader.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reader
{
public static void main(String args[])throws Exception
 {
BufferedReader fr= new BufferedReader(new FileReader("abc.txt"));
String a=fr.readLine();

Pattern p=Pattern.compile("[0-9]*[^a-zA-Z]");
Matcher m=p.matcher(a);
 while(m.find())
  { 
  System.out.println(m.group());
  }
 }
}

