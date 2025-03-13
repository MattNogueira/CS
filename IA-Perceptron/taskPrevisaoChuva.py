# Importando biblioteca
from sklearn.linear_model import Perceptron

# Dados de entrada
X = [[0, 0], [0, 1], [1, 0], [1, 1]]

# Saídas desejadas
Y = [0, 1, 1, 1]

# Criando e treinando o perceptron
modelo = Perceptron()
modelo.fit(X, Y)

# Testando o modelo
print("Previsões:")
testes = [[0,0], [0,1], [1,0], [1,1]]
for teste in testes:
  previsao = modelo.predict([teste])
  print(f"Nuvens: {teste[0]}, Previsão Chuva: {teste[1]} => Levar Guarda-chuva? {'Sim' if previsao[0] == 1 else 'Não'}")
