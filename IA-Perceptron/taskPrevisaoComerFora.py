# Importando biblioteca
from sklearn.linear_model import Perceptron

# Entrada de dados
X = [[0,1,1,1],[1,0,1,1],[1,1,0,1],[0,0,1,0],[1,1,1,1],[0,1,0,0],[1,0,0,1],[0,0,0,1]]

# Saída de Dados
Y = [0,1,0,1,1,0,0,0]

# Criando e treinando o perceptron
modelo = Perceptron()
modelo.fit(X, Y)

# Testando o modelo
print("Previsões:")
testes = [[0,1,1,1],[1,0,1,1],[1,1,0,1],[0,0,1,0],[1,1,1,1],[0,1,0,0],[1,0,0,1],[0,0,0,1]]
for teste in testes:
  previsao = modelo.predict([teste])
  print(f"Cansado: {teste[0]}, Ingredientes em Casa: {teste[1]}, Restaurante aberto {teste[2]}, Pagamento Recente {teste[3]} => Comer fora? {'Sim' if previsao[0] == 1 else 'Não'}")
