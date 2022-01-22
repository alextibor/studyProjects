try:
    with open('emails.txt') as arquivo:
        print(arquivo.readlines())
except FileNotFoundError:
    print('Arquivo não existe')