class Filme:
    def __init__(self, nome, ano, duracao):
        self.__nome = nome.title()
        self.__ano = ano
        self.__duracao = duracao
        self.__likes = 0

    @property
    def nome(self):
        return self.__nome

    @nome.setter
    def nome(self, novo_nome):
        self.__nome = novo_nome

    @property
    def ano(self):
        return self.__ano

    @ano.setter
    def ano(self, novo_ano):
        self.__ano = novo_ano

    @property
    def duracao(self):
        return self.__duracao

    @duracao.setter
    def duracao(self, nova_duracao):
        self.__duracao = nova_duracao

    @property
    def likes(self):
        return self.__likes

    @likes.setter
    def likes(self, numero_de_likes):
        self.__likes += numero_de_likes


class Serie:
    def __init__(self, nome, ano, temporadas):
        self.__nome = nome.title()
        self.__ano = ano
        self.__temporadas = temporadas
        self.__likes = 0

    @property
    def nome(self):
        return self.__nome

    @nome.setter
    def nome(self, novo_nome):
        self.__nome = novo_nome

    @property
    def ano(self):
        return self.__ano

    @ano.setter
    def ano(self, novo_ano):
        self.__ano = novo_ano

    @property
    def temporadas(self):
        return self.__temporadas

    @temporadas.setter
    def temporadas(self, numero_temporada):
        self.__temporadas = numero_temporada

    @property
    def likes(self):
        return self.__likes

    @likes.setter
    def likes(self, numero_de_likes):
        self.__likes += numero_de_likes

vingadores = Filme('vingadores', 2018, 160)
print(vingadores.nome)

soa = Serie('sons of anarch', 2020, 7)
print(soa.nome)

vingadores.likes
soa.likes

print(f'Nome: {soa.nome} Ano: {soa.ano} Temporadas: {soa.temporadas} Likes: {soa.likes}')
print(f'Nome: {vingadores.nome} Ano: {vingadores.ano}  Duracao {vingadores.duracao} Likes: {vingadores.likes}')

vingadores.likes = 5
soa.likes = 3

print(f'Likes: Soa: {soa.likes} Ving: {vingadores.likes}')