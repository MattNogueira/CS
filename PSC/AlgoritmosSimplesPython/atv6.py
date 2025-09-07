from decimal import Decimal

number = int(input())
hours = int(input())
salaryperh = (Decimal(input()))
salary = hours*salaryperh
print(f"NUMBER = {number}\nSALARY = U$ {salary}")