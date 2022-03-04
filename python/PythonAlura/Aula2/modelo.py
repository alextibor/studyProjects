class Programa:
    def __init__(self, nome, ano):
        self._nome = nome.title()
        self._ano = ano
        self._likes = 0

    @property
    def nome(self):
        return self._nome

    @nome.setter
    def nome(self, novo_nome):
        self._nome = novo_nome

    @property
    def ano(self):
        return self._ano

    @ano.setter
    def ano(self, novo_ano):
        self._ano = novo_ano

    @property
    def duracao(self):
        return self._duracao

    @duracao.setter
    def duracao(self, nova_duracao):
        self._duracao = nova_duracao

    @property
    def temporadas(self):
        return self._temporadas

    @temporadas.setter
    def temporadas(self, numero_temporada):
        self._temporadas = numero_temporada

    @property
    def likes(self):
        return self._likes

    @likes.setter
    def likes(self, numero_de_likes):
        self._likes += numero_de_likes

    def __str__(self):
        return f'Nome: {self._nome} Ano: {self._ano} Likes: {self._likes}'

class Filme(Programa):
    def __init__(self, nome, ano, duracao):
        super().__init__(nome, ano)
        self.duracao = duracao

        def __str__(self):
            return f'Nome: {self._nome} Ano: {self._ano} Duracao: {self.duracao} Likes: {self._likes}'

class Serie(Programa):
    def __init__(self, nome, ano, temporadas):
        super().__init__(nome, ano)
        self.temporadas = temporadas

    def __str__(self):
        return f'Nome: {self._nome} Ano: {self._ano} Temporadas: {self.temporadas} Likes: {self._likes}'

class Playlist(list):
    def __init__(self, nome, programas):
        self.nome = nome
        super().__init__(programas)

    def __getitem__(self, item):
        return self._programas[item]

vingadores = Filme('vingadores', 2018, 160)
soa = Serie('sons of anarch', 2020, 7)
tmep = Filme('Todo mundo em panico', 1999, 100)
demolidor = Serie('Demolidor', 2016, 2)

vingadores.likes = 12
tmep.likes = 7
demolidor.likes = 4
soa.likes = 3

filmes_e_series = [vingadores, soa, demolidor, tmep]
playlist_fim_de_semana = Playlist('Fim de semana', filmes_e_series)

for programa in playlist_fim_de_semana:
    print(programa)
