distância, tempo = input("Digite a distância (métros) percorrida e os tempo (minutos) passado (dividídos por vírgula e espaço.) ").split(', ')

distância = float(distância)
tempo = float(tempo)
velomed = distância / tempo

print(f'A distância percorrida foi de {distância:.1f} metros e o tempo foi de {tempo:.1f} minutos, portanto, a velocidade média é de {velomed:.1f} km/h')