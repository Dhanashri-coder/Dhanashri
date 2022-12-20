#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>

void ChildProcess();
void ParentProcess();

int main()
{
	pid_t pid;
	pid=fork();
	if (pid==0)
		ChildProcess();
	else if(pid>0)
		ParentProcess();
	return 0;
}

void ChildProcess()
{
	printf("\nI am child process..\n");
	printf("PID is: %d\n",getpid());
}

void ParentProcess()
{
	printf("\nI am parent process..\n");
	printf("PID is: %d",getpid());
}

/*OUTPUT
Desktop/OS$ cc fork.c
ty60@pc21:~/Desktop/OS$ ./a.out
I am parent process..I am child process..
*/
