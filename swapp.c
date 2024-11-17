#include <stdio.h>

int main(int argc, char *argv[])
{
int a;
int b;
int temp;{
	
		printf("enter the value of a:\n");
		scanf("%d",&a);
		printf("enter the value of b:\n");
		scanf("%d",&b);
	{
		temp=a;
		a=b;
		b=temp;
	}
printf("after swapping a is %d \n",a);

printf("after swapping b is %d \n",b);

	
	return 0;

}
}