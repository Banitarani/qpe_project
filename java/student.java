import java.util.*;
public class teacher
 {
    public int marks;
    public String subject;
    public int total;
    public float avg;
    public int sum;
}
public void input()
{
Scanner table= new Scanner(System.in);
System.out.println("enter the value of marks");
marks = table .nextInt();
System.out.println("Enter the name of 5 subject");
subject = next();
System.out.println("Enter the total of subject");
total= table.nextInt();
System.out.println("Enter the avg marks");
avg= table.nextFloat();


}
public void cal()

    int i;
    int a[]=new int[5];
    a[0]=50;
     a[1]=60;
      a[2]=70;
       a[3]=80;
        a[4]=90;
        
           int sum=a[0]+a[1]+a[2]+a[3]+a[4];
        System.out.println("sum ="  +  sum);{
         int avg= sum/5;{
         System.out.println("avg =" + avg);
         }

}
public void display()
{System.out.println("Enter the name of marks:\n"+ marks);
System.out.println("Enter the no sub:\n"+ sub);
System.out.println("Enter the total:\n"+ total);
System.out.println("Enter the avg:\n"+ avg);


}
 Class student{
public static void main(String[] args)
{
 teacher  tabel= new teacher;
 table .input();
 table .cal();
 table .display();
}
 } 
