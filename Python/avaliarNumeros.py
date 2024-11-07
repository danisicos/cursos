# Crie um programa que realize a verificação dos números inseridos pelo usuário
# Indique se o númemro é positivo ou negativo
# Indique se o número é ímpar ou par
# Indique se o número é primo

class AvaliarNumeros:
    def __init__(self, numero):
        self.numero = numero
        self.sinal = self.verificar_sinal()
        self.par = self.verificar_paridade()
        self.primo = self.verificar_primalidade()

    def verificar_sinal(self):
        if self.numero >= 0:
            return "é positivo"
        else:
            return "é negativo"

    def verificar_paridade(self):
        if self.numero % 2 == 0:
            return "é par"
        else:
            return "é ímpar"


    def verificar_primalidade(self):
        if self.numero <= 1:
            return "não é primo"
        for i in range(2, int(self.numero**0.5) + 1):
            if self.numero % i == 0:
                return "não é primo"
        return "é primo"

    def imprimir_resultados(self):
        print(f"O número digitado foi {self.numero}")
        print(f"O número digitado {self.sinal}")
        print(f"O número digitado {self.par}")
        print(f"O número digitado {self.primo}")

# Entrada do número pelo usuário
numero = int(input("Digite um número: "))

# Criação da instância da classe e impressão dos resultados
avaliacao = AvaliarNumeros(numero)
avaliacao.imprimir_resultados()