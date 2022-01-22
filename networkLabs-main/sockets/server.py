import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
ip = "127.0.0.1"
port = 888

try:
    server.bind((ip, port))
    server.listen(5)
    print "Listening in " + ip + ": " + str(port)

    (client_socket, address) = server.accept()

    print "Received from: " + address[0]

    while True:
        data = client_socket.recv(1024)
        print data
        client_socket.send("Ack: ")

    server.close()

except Exception as erro:
    print "Erro" + str(erro)
    server.close()