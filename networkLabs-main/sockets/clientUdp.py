import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

try:

    while True:
        client.sendto(raw_input("Você: ") + "\n", ("127.0.0.1", 666))
        msg, friend = client.recvfrom(1024)
        print friend[0]+ ": " + msg

    client.close()()

except Exception as erro:
    print "Conexao falhou"
    print erro
    client.close()