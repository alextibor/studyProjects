#include <stdio.h>
#include <stdlib.h>

void lendoDados(){
    char letra;
    int nro;
    float n;
    double d;

    scanf("%c",&letra);
    scanf("%d",&nro);
    scanf("%f",&n);
    scanf("%f",&d);

    printf("%c \n", letra);
    printf("%d \n", nro);
    printf("%f \n", n);
    printf("%f \n", d);
}

void substituindoVariaveis(){

    char letra = 'a';
    int nro = 10;
    float n = 5.25;
    printf("%c \n", letra);
    printf("%d \n", letra);
    printf("%d \n", nro);
    printf("%f \n", n);
}

void helloWorld(){
    printf("Hello, World!\n");
    printf("Hello There\n");
    printf("Hello There");
}

int main() {

    helloWorld();
    return 0;
}
