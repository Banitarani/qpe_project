import java.util.*;
class phone {
    
    private int prv;
    private int pre;
    private int call;
    String name;
    double amt;
    double total;

public void input()
{
    Scanner wire =new Scanner(System.in);
    System.out.println("Enter the name of customer");
    name= wire.next();
    System.out.println("Enter the present reading");
    pre= wire.nextInt();
    System.out.println("store previous reading");
    prv= wire. nextInt();


}
public void cal()
{
    call=pre-prv ;
    if(call<=100)
    amt=0;
    else if(call>=100 && call<=200)
    amt=(call-100)*0.9;
    else if(call>=200 && call<=400)
    amt=90+(call-200)*0.8;
    else
    {
        
    amt=160+90+(call-400)*0.7;
}
{if (amt<=180) {
    amt=180;
    
}
}
}
public void display()

{
    System.out.println("Enter the name of costumer:\n"+name);
    System.out.println("Enter the no of call mades:\n"+call);
    System.out.println("Enter the amount:\n"+amt);
    System.out.println("Enter the total amount to be paid:\n"+total);

}
class telephone
{
    public static void main(String[]args)
    {
        phone wire = new phone();
        wire .input();
        wire .cal();
        wire .display();
    }
}
        
}



