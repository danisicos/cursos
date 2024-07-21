class temperatura:
    c = int(input("Digite a temperatura em celsius: "))
    f = c * 18 + 32
    k = c + 273.15
    re = c*0.8
    ra = c*1.8+32+459.67
    print(f" {c} em Celsius equivale a {f}  em Farenheit; {k} em Kelvin; {re} em Reamur; {ra} em Rankine.")