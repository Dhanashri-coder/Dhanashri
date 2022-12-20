#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
int main()
{
	pid_t pid;
	pid = fork();
	if (pid == 0)
	{
		sleep(2);
		printf("\nI am Child Process having PID %d\n",getpid());
		printf("My parent PID is %d\n",getppid());
	}
	else
	{
		printf("I am Parent Process having PID %d\n",getpid());
		printf("My Child PID is %d\n",pid);
	}
	return 0;
}
		
