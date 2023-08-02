import java.util.*;
 class pattern{  
public static void main(String args[]){
  Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
  
 for(int i=0;i<=rows;i++){ 
     for(int j=0;j<=cols;j++)
 
 if(i-j==0||i+j==8)


{     
   System.out.print("*");
   
 }
 else 
{
      System.out.print(" ");
}
     System.out.println();
}
}
}