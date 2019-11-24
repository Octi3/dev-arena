#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node* next ;


};
void printlist(struct node *n){
    while(n!=NULL){
        printf("%d",n->data);
        n=n->data;
    }

}

int main(){
    struct node* head = NULL;
    struct node* sec = NULL;
    struct node* thrd = NULL;

    head =(struct node*)malloc(sizeof(struct node));
    sec =(struct node*)malloc(sizeof(struct node));
    thrd =(struct node*)malloc(sizeof(struct node));

    head->data=10;
    head->next=sec;
    sec->data=20;
    sec->next=thrd;
    thrd->data=30;
    thrd->next=NULL;
    printlist(head);
    return 0;
}

