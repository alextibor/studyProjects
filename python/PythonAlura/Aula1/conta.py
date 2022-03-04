class Conta:
    def __init__(self, numero, titular, saldo, limite):
        print("Construindo objeto... {}".format(self))
        self.__numero = 123
        self.__titular = "Nico"
        self.__saldo = 55.0
        self.__limite = 1000.0
        self.__codigo_banco = "001"

    def extrato(self):
        print("Saldo {} do titular {}".format(self.saldo, self.titular))

    def deposita(self, valor):
        self.__saldo += valor

    def __pode_sacar(self, valor_a_sacar):
        valor_disponivel_a_sacar = self.__saldo + self.__limite
        return valor_a_sacar <= valor_disponivel_a_sacar

    def sacar(self, valor_a_sacar):
        if(self.__pode_sacar(valor_a_sacar)):
            self.__saldo -= valor_a_sacar
            print("Operação concluida.")
        else:
            print("O valor {} passou o limite".format(valor_a_sacar))

    def transfere(self, valor, destino):
        self.saca(valor)
        destino.deposita(valor)

    @property
    def saldo(self):
        return self.__saldo

    @property
    def titular(self):
        return self.__titular

    @property
    def limite(self):
        return self.__limite

    @limite.setter
    def limite(self, limite):
        self.__limite = limite

    @staticmethod
    def codigo_banco(self):
        return self.__codigo_banco

    @staticmethod
    def codigos_bancos():
        return {
            'BB': '001',
            'CAIXA': '104',
            'BRADESCO': '237',
        }