import java.util.*;
public class Random
{
  public static void main(String args[])
  {
    int d;
    for(int i=1;i<=5;i++)
    {
      d=(int)(Math.random()*10);
      System.out.println(d);
    }
  }
} 