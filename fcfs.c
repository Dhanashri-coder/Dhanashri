#include<stdio.h>
struct time {
int p, at, bt, ct, st, wt, rt, c, tat;
};
void sort (struct time a[], int pro)
{
	int i,j;
	struct time temp;
	for (i=0; i<pro; i++)
	{
		for(j=i+1;j<pro;j++)
		{
			if ( a[i].at>a[j].at )
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return;
}
void print(struct time a[], int pro)
{	float totalWT=0,totalTAT=0;
	printf("\n\n\np \tat \tbt \tst \tct \ttat \twt \n");
	for (int i=0; i<pro; i++)
	{
		totalWT = totalWT + a[i].wt;
		totalTAT = totalTAT + a[i].tat;
		printf("%d \t %d \t %d \t%d \t%d \t%d \t%d\n",a[i].p,a[i].at,a[i].bt,a[i].st,a[i].ct,a[i].tat,a[i].wt);
	
	}
	printf("\nAverage of Waiting Time is : %.2f",totalWT/pro);
	printf("\nAverage of Turnaround Time is : %.2f",totalTAT/pro);
}
int main()
{
	int i,j,n,times=0,remain;
	struct time a[100];
	printf("Enter number of Processes you Want in Ready Queue :");
	scanf("%d",&n);
	for (i=0;i<n;i++)
	{
		printf("\nEnter Arrival Time for [p%d] :",i+1);
		scanf("%d",&a[i].at);
		printf("\nEnter Burst Time for p%d :",i+1);
		scanf("%d",&a[i].bt);
		a[i].p=i+1;
	}
	sort(a, n);
	printf("\n\n0");
	for (i=0; i<n; i++)
	{
		if (times >= a[i].at)
		{
			printf("<-[p%d]->%d", a[i].p, times + a[i].bt);
			a[i].st=times;
			times=times+a[i].bt;
			a[i].ct=times;
			a[i].tat=a[i].ct-a[i].at;
			a[i].wt=a[i].tat-a[i].bt;
		}
	}
	print(a,n);
}
		
