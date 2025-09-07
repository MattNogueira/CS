from decimal import Decimal
raio = Decimal(input())
volume = Decimal(4/3) * Decimal(3.14159) * raio**3
print(f"VOLUME = {round(volume, 3)}")