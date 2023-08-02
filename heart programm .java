class heart3{
public static void main(String args[]){
for(int i=0;i<20;i++){
for(int j=0;j<21;j++)
if(i+j==3||i==0&j==4||i<=5&&j-i==5||i<=5&&i+j==15||i==0&&j==16||j-i==17||i-j==9||i+j==29||i>=3&&i<=9&&j==0||i>=3&&i<=9&&j==20)
{
System.out.print("* ");
}

else if(i==6&&j==1||i==6&&j==2||i==6&&j==3||i==6&&j==4||i==6&&j==5||i==6&&j==6)
{
System.out.print("pavin");
}
else if(i==8&&j==1||i==8&&j==2||i==8&&j==3||i==8&&j==4||i==8&&j==5||i==8&&j==6||i==8&&j==7)
{
System.out.print("prithi");
}
else{
System.out.print(" ");
}
System.out.println();
}}}