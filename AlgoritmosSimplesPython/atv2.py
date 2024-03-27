from decimal import Decimal

n = Decimal(3.14159)
raio = Decimal(input())
area = round(n*(raio**2),4)
print(f"A={area}")