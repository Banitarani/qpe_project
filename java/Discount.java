import java.util.*;

class Keeper {

    public int cost;
    public String name;
    public double Discount;
    public double amt ;

    public void input()
    {
        Scanner shop =new Scanner(System.in);
        System.out.println("enter the name of customer");
        name=shop.next();
        System.out.println("enter the cost of article");
        cost= shop.nextInt();




    }
    public void cal()
        {
        if(cost<=5000)
        {
          Discount=0;
        }
    else if(cost>=5001 && cost<=10000)
    {
    Discount=0.1*cost;
        }
    else if(cost>=10001 && cost<=15000)
    {
    Discount=0.15*cost;
    }
    else {
        Discount=0.2*cost;
    }
    amt=cost-Discount;

}

    
    public void display()
    {
        System.out.println("enter the name of customer:\n" +name);
        System.out.println("enter the value of cost:\n" +cost);
        System.out.println("enter the value of discount:\n" +Discount);
        System.out.println("enter the amount to be paid:\n" +amt);
    }
        class Discount
        {
            public static void main(String[]arg)
            {
            Keeper shop=new Keeper();
            shop.input();
            shop.cal();
            shop.display();

            }

        }
    }


