import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.settimeout(30)

try:
    client.connect(("142.251.129.228", 80))

    print client.send("GET / HTTP/1.1\nHost: google.com\n\n\n")

    pacotes_recebidos = client.recv(1024)

    print pacotes_recebidos
except:
    print "Conexao falhou"