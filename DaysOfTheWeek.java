
//Write a Java program to print the day of the week after 5 days of a given date without using the calendar class.
//(For example, it was a monday on 27-07-2020. So the output should be Saturday) 



import java.util.*;
public class DaysOfTheWeek
{
final static String[] DAYS={"saturday","sunday","monday","tuesday","wednesday",thursday","friday"};
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the date in DD/MM/YYYY format:");
String[] dates=input.nextLine().split("/");
int d=Integer.parseInt(dates[0]);
int m=Integer.parseInt(dates[1]);
int y=Integer.parseInt(dates[2]);

if(m<3)
{
m+=12;
y-=1;
}

int k=y%100;
int j=y/100;

int day=((((d+5)+((m+1)*26)/10)+k+(k/4)+(j/4)+(5*j))%7);
System.out.println("5th day after the given date is "+DAYS[day]);
main(null);
}
}
