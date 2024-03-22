Series-3
Write a java program to generate the following series 0, 3, 8, 15, 24….

Example 1:

Input: 

 
5


Output:

0 3 8 15 24

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int i,n,a=0,b=3;
    n=m.nextInt();
    for(i=0;i<n;i++){
      System.out.print(a+" ");
      a+=b;
      b+=2;
    }
  }
}
