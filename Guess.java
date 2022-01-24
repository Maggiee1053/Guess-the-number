import java.util.*;
class Guess{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int mynumber = (int)(Math.random()*100);
int number = 0;
do{
System.out.println("enter a number");
number=sc.nextInt();
if(mynumber==number){
System.out.println("you have entered correct number");
break;
}
else if(number > mynumber ){
System.out.println("you have entered a large number");
}
else{
System.out.println("you have entered small number ");
}
}while(number >= 0 );
System.out.println("the number is " );
System.out.println(mynumber);

}
}