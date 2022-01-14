#!/bin/bash

echo "O que você deseja imprimir na tela? Routes(r)/Ifconfig(i)?"

read comando 

if [ "$comando" = "i" ]
then 
ifconfig
fi

if [ "$comando" = "r" ]
then
route -n
fi

