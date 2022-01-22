import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.settimeout(0.6)

ip = raw_input("Digite o IP ou endereco: ")
port = int(raw_input("Digite a porta: "))

code = client.connect_ex((ip, port))

if code == 0:
    print "Porta aberta"
else:
    print "Porta fechada"