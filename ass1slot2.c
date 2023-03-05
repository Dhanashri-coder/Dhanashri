#include <stdio.h>
#include <stdlib.h>

#define MAX_PROCESSES 10
#define MAX_RESOURCES 10

int allocation[MAX_PROCESSES][MAX_RESOURCES];
int max[MAX_PROCESSES][MAX_RESOURCES];
int need[MAX_PROCESSES][MAX_RESOURCES];
int available[MAX_RESOURCES];
int num_processes, num_resources;

void accept_allocation() {
    printf("Enter allocation matrix:\n");
    for (int i = 0; i < num_processes; i++) {
        for (int j = 0; j < num_resources; j++) {
            scanf("%d", &allocation[i][j]);
        }
    }
}

void accept_max() {
    printf("Enter max matrix:\n");
    for (int i = 0; i < num_processes; i++) {
        for (int j = 0; j < num_resources; j++) {
            scanf("%d", &max[i][j]);
        }
    }
}

void accept_available() {
    printf("Enter available resources:\n");
    for (int i = 0; i < num_resources; i++) {
        scanf("%d", &available[i]);
    }
}

void display_allocation() {
    printf("Allocation matrix:\n");
    for (int i = 0; i < num_processes; i++) {
        for (int j = 0; j < num_resources; j++) {
            printf("%d ", allocation[i][j]);
        }
        printf("\n");
    }
}

void display_max() {
    printf("Max matrix:\n");
    for (int i = 0; i < num_processes; i++) {
        for (int j = 0; j < num_resources; j++) {
            printf("%d ", max[i][j]);
        }
        printf("\n");
    }
}

void display_need() {
    printf("Need matrix:\n");
    for (int i = 0; i < num_processes; i++) {
        for (int j = 0; j < num_resources; j++) {
            printf("%d ", need[i][j]);
        }
        printf("\n");
    }
}

void display_available() {
    printf("Available resources:\n");
    for (int i = 0; i < num_resources; i++) {
        printf("%d ", available[i]);
    }
    printf("\n");
}

void calculate_need() {
    for (int i = 0; i < num_processes; i++) {
        for (int j = 0; j < num_resources; j++) {
            need[i][j] = max[i][j] - allocation[i][j];
        }
    }
}

void accept_request(int pid) {
    int request[MAX_RESOURCES];
    printf("Enter request for process %d:\n", pid);
    for (int i = 0; i < num_resources; i++) {
        scanf("%d", &request[i]);
    }
    for (int i = 0; i < num_resources; i++) {
        if (request[i] > need[pid][i]) {
            printf("Error: Requested resources exceed maximum need\n");
            return;
        }
        if (request[i] > available[i]) {
            printf("Error: Insufficient resources available\n");
            return;
        }
    }
    for (int i = 0; i < num_resources; i++) {
        allocation[pid][i] += request[i];
        need[pid][i] -= request[i];
        available[i] -= request[i];
    }
    if (is_safe()) {
        printf("Request granted, system is in safe state\n");
    } else
    {
    printf("Request granted, system is not in safe state\n");
    for (int i = 0; i < num_resources; i++) {
        allocation[pid][i] -= request[i];
        need[pid][i] += request[i];
        available[i] += request[i];
    }
}
}

int is_safe() {
int work[MAX_RESOURCES];
int finish[MAX_PROCESSES];
for (int i = 0; i < num_resources; i++) {
work[i] = available[i];
}
for (int i = 0; i < num_processes; i++) {
finish[i] = 0;
}
int num_finished = 0;
while (num_finished < num_processes) {
int found = 0;
for (int i = 0; i < num_processes; i++) {
if (!finish[i]) {
int j;
for (j = 0; j < num_resources; j++) {
if (need[i][j] > work[j]) {
break;
}
}
if (j == num_resources) {
for (int k = 0; k < num_resources; k++) {
work[k] += allocation[i][k];
}
finish[i] = 1;
num_finished++;
found = 1;
}
}
}
if (!found) {
return 0;
}
}
return 1;
}

int main() {
printf("Enter number of processes: ");
scanf("%d", &num_processes);
printf("Enter number of resources: ");
scanf("%d", &num_resources);
accept_allocation();
accept_max();
calculate_need();
accept_available();

while (1) {
    printf("\n");
    printf("1. Display allocation\n");
    printf("2. Display max\n");
    printf("3. Display need\n");
    printf("4. Display available\n");
    printf("5. Accept request for a process\n");
    printf("6. Exit\n");
    printf("Enter your choice: ");
    int choice;
    scanf("%d", &choice);
    switch (choice) {
        case 1:
            display_allocation();
            break;
        case 2:
            display_max();
            break;
        case 3:
            display_need();
            break;
        case 4:
            display_available();
            break;
        case 5:
            printf("Enter process ID: ");
            int pid;
            scanf("%d", &pid);
            accept_request(pid);
            break;
        case 6:
            exit(0);
        default:
            printf("Invalid choice\n");
    }
}

return 0;

