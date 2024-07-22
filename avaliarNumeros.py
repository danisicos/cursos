# Crie um programa que realize a verificação dos números inseridos pelo usuário
# Indique se o númemro é positivo ou negativo
# Indique se o número é ímpar ou par
# Indique se o número é primo

class avaliarNumeros:
    #bloco de declaração das variáveis
    numero = 0
    sinal = "valor inválido"
    par = "valor inválido"
    primo = "valor inválido"

    numero = int(input("Digite um número: "))

    #bloco das condicionais
    if (numero>=0):
        sinal = " é positivo"
    else:
        sinal = " é negativo"

    if (numero%2==0):
        par = " é par"
    else:
        par = "é ímpar"

    for i in range(2, int(numero**0.5) + 1):
        if (numero%i==0):
            primo = " não é primo"
        else:
            primo = " é primo"

    #bloco da impressão dos resultados
    print(f"O número digitado foi {numero}")
    print(f"O número digitado {sinal}")
    print(f"O número digitado {par}")
    print(f"O número digitado {primo}")

