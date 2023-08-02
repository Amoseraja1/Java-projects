import java.util.*;
class cpattern{  
public static void main(String args[]){
  Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
  
 for(int i=0;i<=rows;i++){ 
     for(int j=0;j<=cols;j++)
 
 if(i==0&&j==2||i==0 && j==3||i==0&&j==4||i==0 && j==5||i==3&&j==0||i==3&&j==1||i==4 && j==0||i==4&&j==1||i==5&&j==0||i==5&&j==1||i==6&&j==0||i==6&&j==1||i==9&&j==2||
i==9&&j==3||i==9&&j==4||i==9&&j==5)


{     
   System.out.print("#");
   
 }
 else if(i==1 && j==1||i==1 && j==2||i==2 && j==0||i==2 && j==1||i==7 && j==0||i==7 && j==1||i==8&&j==1||i==8&&j==2||i==8&&j==6||i==8&&j==7||i==7 && j==6||i==7 && j==7
||i==1 && j==6||i==1 && j==7||i==2 && j==6||i==2 && j==7)
{
      System.out.print("*");
 }
else {
      System.out.print(" ");
     }
     System.out.println();
}
}
}