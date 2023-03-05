#include <stdio.h>
#include <stdbool.h>

#define MAX_PROCESSES 10
#define MAX_RESOURCES 10

int allocation[MAX_PROCESSES][MAX_RESOURCES];
int max[MAX_PROCESSES][MAX_RESOURCES];
int need[MAX_PROCESSES][MAX_RESOURCES];
int available[MAX_RESOURCES];

int n_processes;
int n_resources;

void accept_available() {
    printf("Enter the available resources for each resource type:\n");
    for (int i = 0; i < n_resources; i++) {
        printf("Resource %d: ", i);
        scanf("%d", &available[i]);
    }
}

void display_allocation_max() {
    printf("Process\tAllocation\tMax\n");
    for (int i = 0; i < n_processes; i++) {
        printf("P%d\t", i);
        for (int j = 0; j < n_resources; j++) {
            printf("%d ", allocation[i][j]);
        }
        printf("\t");
        for (int j = 0; j < n_resources; j++) {
            printf("%d ", max[i][j]);
        }
        printf("\n");
    }
}

void display_need_matrix() {
    printf("Process\tNeed\n");
    for (int i = 0; i < n_processes; i++) {
        printf("P%d\t", i);
        for (int j = 0; j < n_resources; j++) {
            printf("%d ", need[i][j]);
        }
        printf("\n");
    }
}

void display_available() {
    printf("Available resources:\n");
    for (int i = 0; i < n_resources; i++) {
        printf("Resource %d: %d\n", i, available[i]);
    }
}

bool is_safe_state() {
    int work[n_resources];
    for (int i = 0; i < n_resources; i++) {
        work[i] = available[i];
    }
    bool finish[n_processes];
    for (int i = 0; i < n_processes; i++) {
        finish[i] = false;
    }
    int safe_sequence[n_processes];
    int safe_count = 0;
    while (safe_count < n_processes) {
        bool found = false;
        for (int i = 0; i < n_processes; i++) {
            if (!finish[i]) {
                bool can_allocate = true;
                for (int j = 0; j < n_resources; j++) {
                    if (need[i][j] > work[j]) {
                        can_allocate = false;
                        break;
                    }
                }
                if (can_allocate) {
                    for (int j = 0; j < n_resources; j++) {
                        work[j] += allocation[i][j];
                    }
                    safe_sequence[safe_count] = i;
                    safe_count++;
                    finish[i] = true;
                    found = true;
                }
            }
        }
        if (!found) {
            break;
        }
    }
    if (safe_count < n_processes) {
        return false;
    }
    printf("Safe sequence: ");
    for (int i = 0; i < n_processes; i++) {
        printf("P%d ", safe_sequence[i]);
    }
    printf("\n");
    return true;
}

int main() {
    printf("Enter the number of processes: ");
    scanf("%d", &n_processes);
    printf("Enter the number of resource types: ");
    scanf("%d", &n_resources);
    printf("Enter the allocation matrix:\n
for (int i = 0; i < n_processes; i++) {
    for (int j = 0; j < n_resources; j++) {
        scanf("%d", &allocation[i][j]);
    }
}
printf("Enter the maximum matrix:\n");
for (int i = 0; i < n_processes; i++) {
    for (int j = 0; j < n_resources; j++) {
        scanf("%d", &max[i][j]);
        need[i][j] = max[i][j] - allocation[i][j];
    }
}
accept_available();
display_allocation_max();
display_need_matrix();
display_available();
if (is_safe_state()) {
    printf("The current state is safe.\n");
} else {
    printf("The current state is not safe.\n");
}
return 0;

