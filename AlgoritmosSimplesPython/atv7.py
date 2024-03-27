from decimal import Decimal

nome = input()
salario = Decimal(input())
vendas = Decimal(input())
taxa = Decimal(0.15)
total = (salario + vendas*taxa)
print(f"TOTAL = R$ {round(total, 2)}")