import java.util.*;
class ASCDEC
{
int temp,i,j;
void asc(int a[])
{
for(i=0;i<5;i++)
{
for(j=i+1;j<5;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Ascending order is ");
for(i=0;i<5;i++)
{
System.out.println(a[i]+" ");
}
}


void desc(int a[])
{
for(i=0;i<5;i++)
{
for(j=0;j<4;j++)
{
if(a[j]<a[j+1])
{
temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("Descending order is ");
for(i=0;i<5;i++)
{
System.out.println(a[i]+" ");
}
}
}

class Sorting
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
ASCDEC abc=new ASCDEC();
System.out.println("Please enter any 5 numbers:");
int a[]=new int[5];
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
abc.asc(a);
abc.desc(a);
}
}
