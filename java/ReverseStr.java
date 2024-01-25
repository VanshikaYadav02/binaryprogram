import java.io.*;
public class ReverseStr
{
  //by for loop
  public static void revFor(String s)
  {
    String rev="";
    int n=s.length();
    char ch[]=s.toCharArray();//converting string to a character array(seq of chars)
    char t;
    for(int i=0;i<n/2;i++)
    {
         t=ch[i];
         ch[i]=ch[n-1-i];
         ch[n-1-i]=t;
    }
    s=String.copyValueOf(ch);// copies the content of a character array into the string
    System.out.println("By FOR LOOP:");
    System.out.println("Reversed string is: "+s);
  }
   
  //by while loop
  public static void revWhile(String s)
  {
    String rev="";
    int n=s.length();
    char ch[]=s.toCharArray();//converting string to a character array(seq of chars)
    char t;
    int i=0;
    while(i<n/2)
    {
         t=ch[i];
         ch[i]=ch[n-1-i];
         ch[n-1-i]=t;
         i+=1;
    }
    s=String.copyValueOf(ch);// copies the content of a character array into the stringṬṭṬ
    System.out.println("By WHILE LOOP:");
    System.out.println("Reversed string is: "+s);
    
  }
    
  //by do while loop
  public static void revDoWhile(String s)
  {
    String rev="";
    int n=s.length();
    char ch[]=s.toCharArray();
    char t;
    int i=0;
    do
    {
      t=ch[i];
      ch[i]=ch[n-1-i];
      ch[n-1-i]=t;
      i++;
    }while(i<n/2);
    s=String.copyValueOf(ch);
    System.out.println("By DO WHILE LOOP:");
    System.out.println("Reveresed string is: "+s);
  }

  public static void main(String[] args) throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter string to reverse: ");
    String s=br.readLine();
    
    revFor(s);
    revWhile(s);
    revDoWhile(s);
  }
}