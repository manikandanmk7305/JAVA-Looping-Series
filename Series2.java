Series-2
Write a java program to generate the following series 6, 9, 14, 21, 30….

Example 1:

Input: 

 
5


Output:

6 9 14 21 30

import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int n;
    n=m.nextInt();
    int a=6,b=3;
    for(int i=0;i<n;i++){
      System.out.print(a+" ");
      a+=b;
      b+=2;
    }
  } 
}
