AGENDA = {}

AGENDA['guilherme'] = {
    'telefone': '999928272',
    'email': 'guilherme@solyd.com.br',
    'endereco': 'Av. 1',
}

AGENDA['maria'] = {
    'telefone': '999282727',
    'email': 'maria@solyd.com.br',
    'endereco': 'Av. 2',
}


def mostrar_contatos():
    for contato in AGENDA:
        buscar_contato(contato)


def buscar_contato(contato):
    print('Nome:', contato)
    print('Telefone:', AGENDA[contato]['telefone'])
    print('Email:', AGENDA[contato]['email'])
    print('Endereço:', AGENDA[contato]['endereco'])
    print('--------------------------------------------')


def incluir_editar_contato(contato, telefone, email, endereco):
    AGENDA[contato] = {
        'telefone': telefone,
        'email': email,
        'endereco': endereco,
    }
    print()
    print('>>>> Contato {} adicionado/editado com sucesso'.format(contato))
    print()


def excluir_contato(contato):
    AGENDA.pop(contato)
    print()
    print('>>>> Contato {} excluido com sucesso'.format(contato))
    print()


def imprimir_menu():
    print('------------------------------------------')
    print('1 - Mostrar todos os contatos da agenda')
    print('2 - Buscar contato')
    print('3 - Incluir contato')
    print('4 - Editar contato')
    print('5 - Excluir contato')
    print('0 - Fechar agenda')
    print('------------------------------------------')


while True:
    imprimir_menu()

    opcao = input('Escolha uma opção: ')
    if opcao == '1':
        mostrar_contatos()
    elif opcao == '2':
        contato = input('Digite o nome do contato: ')
        buscar_contato(contato)
    elif opcao == '3' or opcao == '4':
        contato = input('Digite o nome do contato: ')
        telefone = input('Digite o nome do telefone: ')
        email = input('Digite o nome do email: ')
        endereco = input('Digite o nome do endereco: ')
        incluir_editar_contato(contato, telefone, email, endereco)
    elif opcao == '5':
        contato = input('Digite o nome do contato: ')
        excluir_contato(contato)
    elif opcao == '0':
        print('>>>> Fechando programa')
        break
    else:
        print('>>>> Opção inválida')
