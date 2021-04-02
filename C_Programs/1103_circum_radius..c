//wap to accept radius and then calculate and print area and circumference of a circle
//(area = 3.14f * radius * radius, circ= 2 * 3.14f * radius)
#include<stdio.h>
int main(){
 float radius,area,circum;
 
 printf("enter radius\n");
 scanf("%f",&radius);
 area =3.14*radius*radius;
 printf("area of circle is %f\n",area);
 circum = 2*3.14*radius;
 printf("circumference of circle is %f\n",circum);


return 0;
}