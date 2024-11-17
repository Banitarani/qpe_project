import java.util .*;

class employee 

{
    private int pan;
    private String name;
    private double IncomeTax;
    private double tax;

    public void input()
    {
    Scanner company=new Scanner(System.in);
    System.out.println("enter the pan number");
    pan=company.nextInt();
    System.out.println("enter the name");
    name=company.next();
    System.out.println("enter the tax income");
     IncomeTax= company. nextDouble();

}
public void cal()
{
        if (IncomeTax <= 250000) {
            tax= 0;}
        else if (IncomeTax > 250000 && IncomeTax <= 500000) {
            tax = (IncomeTax - 250000)*0.1;}
         else if (IncomeTax > 500000 && IncomeTax <= 1000000) {
            tax = 30000 + (IncomeTax - 500000)*0.2; }
        else { tax=50000+(IncomeTax - 1000000)*0.3; }
        }
public void display()
{
System.out.println("enter the pan number:\n"+pan);
System.out.println("enter the name:\n"+name);
System.out.println("enter the value of incometax:\n"+IncomeTax);
System.out.println("enter the value of tax:\n" +tax);

}

}
 class manager
 {
    public static void main(String[]args)
    {
        employee company = new employee();
        company .input();
        company.cal();
        company.display();
    }
 }
    


