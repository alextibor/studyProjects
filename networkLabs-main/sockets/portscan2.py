import socket

ip = raw_input("Digite o IP ou endereco: ")
# ports = range(65535)
ports = [21, 22, 23, 25, 80, 135, 8080, 443, 3306 ]

for port in ports:
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    client.settimeout(0.05)
    code = client.connect_ex((ip, port))

    if code == 0:
        print str(port) + " -> Porta aberta"
    else:
        print str(port) + " -> Porta fechada"

print "Scan finalizado"