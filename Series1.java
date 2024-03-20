Series 1:
Write a java program to generate the following series 101, 103, 107, 109….

Example 1:

Input: 

 
8


Output:

101
103
107
109
113
127
131
137

 import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner m=new Scanner(System.in);
    int k=m.nextInt();
    int low=100, high=200, i, n;
    int cnt=1;
  while ( k>=cnt) {
     n = 0;
      for (i = 2; i <= low / 2; ++i) {z
         if (low % i == 0) {
            n = 1;
           break;
         }
      }
      if (n == 0){
         System.out.printf("%d\n", low);
        cnt+=1;
      }
      ++low;
   }
  }
}
