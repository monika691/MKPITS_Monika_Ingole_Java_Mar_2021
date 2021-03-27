  #include<stdio.h>

  int main()
  {
  int n1,n2,n3;

  printf("Enter the 3 number\n");
  scanf("%d%d%d",&n1,&n2,&n3);
  
  if(n1<n2 && n1<n3){
  printf("% is smaller\n",n1);
  }
  else if(n2<n3 && n2<n1){
  printf("%d is smaller\n",n2);
  }
  else
  printf("%d is smaller\n",n3);

  return 0;
  }