import java.util.*;

   class profit 
  {
    public int p;
    public float r;
    public int t;
    public double interest,amt;
  
    public void input()
    {
        Scanner business=new Scanner(System.in);
        System.out.println("enter the principle");
        p=business.nextInt();
        System.out.println("enter the rate value");
        r=business.nextFloat();
        System.out.println("enter the time");
        t=business.nextInt();

    }
    public void cal()
    {
        if (t <= 1){
            r=6.5f;
        }
        else if(t>=1 && t<=2){
            r=7.5f;
        }
        else if(t>=2 && t<=3){
            r=8.5f;
        }
        else{
            r=9.5f;
        }
        interest=(p*t*r)/100;
        amt=p+interest;

    } 
    public void display()
    {
        System.out.println("enter the principle:\n"+p);
        System.out.println("enter the interest:\n"+interest);
        System.out.println("enter the amount to be paid:\n"+amt);

    }
     public class interest2
    {
        public static void main(String[]args)
        {
            profit business = new profit();
            business.input();
            business.cal();
            business.display();

        }
    }

 }