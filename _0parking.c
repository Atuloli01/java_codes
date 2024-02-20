
#include <stdio.h>

int menu();
void bus();
void cycle();
void riksha();
void delete_();
void show_detail();

int nor = 0, nob = 0, noc = 0, amount = 0, count = 0;

int main() {

    while (1) {
    
        switch (menu()) {
            case 1:
                bus();
                break;
            case 2:
                cycle();
                break;
            case 3:
                riksha();
                break;
            case 4:
                show_detail();
                break;
            case 5:
                delete_();
                break;
            case 6:
                return 0;
            default:
                printf("\nInvalid choice.\n");
        }
    }
}

int menu() {
    int ch;
    printf("\n1. Enter the bus");
    printf("\n2. Enter the cycle");
    printf("\n3. Enter the riksha");
    printf("\n4. Show status");
    printf("\n5. Delete data");
    printf("\n6. Exit");
    printf("\nEnter your choice: ");
    scanf("%d", &ch);
    return ch;
}

void delete_() {
    nob = 0;
    noc = 0;
    nor = 0;
    amount = 0;
    count = 0;
}

void show_detail() {
    printf("\nNumber of bus = %d", nob);
    printf("\nNumber of cycle = %d", noc);
    printf("\nNumber of riksha = %d", nor);
    printf("\nTotal number of vehicles = %d", nob + noc + nor);
    printf("\nTotal gain amount = %d", amount);
}

void riksha() {
    nor++;
    amount += 50;
    count++;
}

void cycle() {
    noc++;
    amount += 20;
    count++;
}

void bus() {
    nob++;
    amount += 100;
    count++;
}
