#Crie um programa que solicite a entrada de uma temperatura em Celsius e apresente a conversão para outras unidades.

class Temperatura:
    def __init__(self):
        self.celsius = self.get_celsius_input()
        self.fahrenheit = self.celsius_to_fahrenheit()
        self.kelvin = self.celsius_to_kelvin()
        self.reamur = self.celsius_to_reamur()
        self.rankine = self.celsius_to_rankine()

    def get_celsius_input(self):
        while True:
            try:
                celsius = float(input("Digite a temperatura em Celsius: "))
                return celsius
            except ValueError:
                print("Por favor, insira um número válido.")

    def celsius_to_fahrenheit(self):
        return self.celsius * 1.8 + 32

    def celsius_to_kelvin(self):
        return self.celsius + 273.15

    def celsius_to_reamur(self):
        return self.celsius * 0.8

    def celsius_to_rankine(self):
        return self.celsius * 1.8 + 32 + 459.67

    def exibir_conversoes(self):
        print(f"{self.celsius}°C equivale a:")
        print(f"{self.fahrenheit:.2f}°F (Fahrenheit)")
        print(f"{self.kelvin:.2f}K (Kelvin)")
        print(f"{self.reamur:.2f}°Ré (Reaumur)")
        print(f"{self.rankine:.2f}°R (Rankine)")

# Criação da instância e exibição das conversões
temperatura = Temperatura()
temperatura.exibir_conversoes()