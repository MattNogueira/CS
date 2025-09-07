from decimal import Decimal

nums = input().split()
A = Decimal(nums[0])
B = Decimal(nums[1])
C = Decimal(nums[2])

aTriangulo = (A * C)/2
aCirculo = Decimal(3.14159)*C**2
aTrapezio = ((A + B)*C)/2
aQuadrado = B**2
aRetangulo = A*B

print(f"TRIANGULO: {round(aTriangulo, 3)}\nCIRCULO: {round(aCirculo,3)}\nTRAPEZIO: {round(aTrapezio, 3)}\nQUADRADO: {round(aQuadrado, 3)}\nRETANGULO: {round(aRetangulo, 3)}")