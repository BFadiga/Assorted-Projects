idade = input("Qual a sua idade? ")

nascimento = input("Em que ano nasceu? ")

atual = input("Qual o ano atual? ")

print(f"Você tem {idade} anos de idade")

diferenca = int(atual) - int(nascimento)

print(f"Você nasceu em {nascimento}, o ano atual é {atual}, portanto passaram-se {diferenca} anos")