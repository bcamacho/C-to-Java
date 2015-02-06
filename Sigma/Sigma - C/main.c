//
//  main.c
//  Sigma
//
//  Created by Brandy Camacho on 2/5/15.
//  Copyright (c) 2015 Brandy Camacho. All rights reserved.
//

#include <stdio.h>
// for linux use <cs50.h> versus "cs50.c"
#include "cs50.c"


// declare sigma and GetInt as functions
int sigma(int m);

int main(void)
{
    int n;
    do
    {
        printf("positive interger please: ");
        n = GetInt();
    }
    
    while (n<1) ;
    
    int answer = sigma(n);
    
    printf("%i\n", answer);
}


int sigma(int m)
{
    if (m<=0)
    {
        return 0;
    }
    else
    {
        return m + sigma(m -1);
    }
}

