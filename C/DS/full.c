#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *link;
}
struct node *START;
struct node createNode(){
    struct node *n;
    n=(struct node*)malloc(sizeof(struct node));
    return n;
}
