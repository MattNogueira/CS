from decimal import Decimal

linha1 = input().split()
linha2 = input().split()

peca1 = int(linha1[0])
num1 = int(linha1[1])
valor1 = Decimal(linha1[2])
peca2 = int(linha2[0])
num2 = int(linha2[1])
valor2 = Decimal(linha2[2])

total = num1 * valor1 + num2 * valor2
print(f"VALOR A PAGAR: R$ {round(total, 2)}")