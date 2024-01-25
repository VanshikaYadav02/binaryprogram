/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
*/
public class Diamond
{
 //BY ITERATION
 public static void patternIterative()
 {
  int a=4;
  for(int i=1;i<=5;i++)//for printing first 5 rows
  {
   for(int x=1;x<=a;x++)//for printing starting spaces
   {
    System.out.print(" ");
   }
   a-=1;
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int k=i-1;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving next line 
  }

  int b=1;
  for(int i=4;i>=1;i--)//for printing next 4 rows
  {
   for(int x=1;x<=b;x++)//for printing starting spaces
   {
    System.out.print(" ");
   }
   b+=1;
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int k=i-1;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving next line
  }
 }

/* //BY RECURSION
 static int br=1;
 static int ar=4;
 public static void patternRecursive()
 {
  upperHalf(1);
  lowerHalf(4);
 }
 
 public static void upperHalf(int i)
 {
   if(i>5)
    return;
   for(int x=1;x<=ar;x++)//for printing starting spaces
   {
    System.out.print(" ");
   }
   ar-=1;
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int k=i-1;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving next line 
   upperHalf(i+1);
 }

 public static void lowerHalf(int i)
 {
  if(i<1)
   return;
  for(int x=1;x<=br;x++)//for printing starting spaces
   {
    System.out.print(" ");
   }
   br+=1;
   for(int j=1;j<=i;j++)
   {
    System.out.print(j);
   }
   for(int k=i-1;k>=1;k--)
   {
    System.out.print(k);
   }
   System.out.println();//for giving next line
  lowerHalf(i-1);
 }*/

 public static void main(String [] args)
 {
  patternIterative();
  
 }
}