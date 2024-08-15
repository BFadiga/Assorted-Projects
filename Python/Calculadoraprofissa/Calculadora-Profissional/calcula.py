escolha = input("Decida o método de cálculo (Subtração/Soma/Divisão/Multiplicação): ")

valor1, valor2 = input("Digite os dois números que formarão o cálculo(separado por espaço)" ).split(' ')

valor1 = int(valor1)
valor2 = int(valor2)

def calculo(escolha, valor1, valor2):
    if escolha == 'Subtração':
        valor3 = valor1 - valor2
        return f"O cálculo de {valor1} - {valor2} equivale a: {valor3}"
    
    elif escolha == 'Soma':
        valor3 = valor1 + valor2
        return f"O cálculo de {valor1} + {valor2} equivale a: {valor3}"
    
    elif escolha == 'Divisão':
        valor3 = valor1 / valor2
        return f"O cálculo de {valor1} / {valor2} equivale a: {valor3}"
    
    elif escolha == 'Multiplicação':
        valor3 = valor1 * valor2
        return f"O cálculo de {valor1} * {valor2} equivale a: {valor3}"
    

resultado = calculo(escolha, valor1, valor2)
print(resultado)