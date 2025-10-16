import glfw
from OpenGL.GL import *
import numpy as np

# Função que cria a matriz de translação
def create_translation_matrix(tx, ty):
    return np.array([
        [1.0, 0.0, 0.0, tx],
        [0.0, 1.0, 0.0, ty],
        [0.0, 0.0, 1.0, 0.0],
        [0.0, 0.0, 0.0, 1.0]
    ], dtype=np.float32)

def create_scaling_matrix(sx, sy):
    return np.array([
        [sx, 0.0, 0.0, 0.0],
        [0.0, sy, 0.0, 0.0],
        [0.0, 0.0, 1.0, 0.0],
        [0.0, 0.0, 0.0, 1.0]
    ], dtype=np.float32)

# Inicializa janela
glfw.init()
glfw.window_hint(glfw.CONTEXT_VERSION_MAJOR, 2)
glfw.window_hint(glfw.CONTEXT_VERSION_MINOR, 1)
window = glfw.create_window(800, 600, "Translação com matriz", None, None)
glfw.make_context_current(window)

x_pos, y_pos = 0.0, 0.0
speed = 0.001
fator_scaling = 1.0

while not glfw.window_should_close(window):
    glfw.poll_events()

    # Scale
    if glfw.get_key(window, glfw.KEY_KP_ADD) or glfw.get_key(window, glfw.KEY_EQUAL) == glfw.PRESS:    # numpad +
        fator_scaling += 0.01
    if glfw.get_key(window, glfw.KEY_KP_SUBTRACT) or glfw.get_key(window, glfw.KEY_MINUS) == glfw.PRESS:  # numpad -
        fator_scaling -= 0.01

    # Teclas
    if glfw.get_key(window, glfw.KEY_RIGHT) or glfw.get_key(window, glfw.KEY_D) == glfw.PRESS:
        x_pos += speed
    if glfw.get_key(window, glfw.KEY_LEFT) or glfw.get_key(window, glfw.KEY_A) == glfw.PRESS:
        x_pos -= speed
    if glfw.get_key(window, glfw.KEY_UP) or glfw.get_key(window, glfw.KEY_W) == glfw.PRESS:
        y_pos += speed
    if glfw.get_key(window, glfw.KEY_DOWN) or glfw.get_key(window, glfw.KEY_S) == glfw.PRESS:
        y_pos -= speed
    if glfw.get_key(window, glfw.KEY_ESCAPE) == glfw.PRESS:
        glfw.set_window_should_close(window, True)
    if glfw.get_key(window, glfw.KEY_R) == glfw.PRESS:
        x_pos, y_pos = 0.0, 0.0
        fator_scaling = 1.0
    if glfw.get_key(window, glfw.KEY_SPACE) == glfw.PRESS:
        # Escala o tamanho do triângulo em 1.5x
        glScalef(1.5, 1.5, 0.0)

    # Limpa tela
    glClearColor(0.1, 0.1, 0.1, 1.0)
    glClear(GL_COLOR_BUFFER_BIT)

    # Cria e aplica a matriz de translação
    translation_matrix = create_translation_matrix(x_pos, y_pos)
    scale_matrix = create_scaling_matrix(fator_scaling, fator_scaling)

    transformation_matrix = np.dot(translation_matrix, scale_matrix)

    glLoadMatrixf(transformation_matrix.T) # OpenGL usa matriz coluna principal

    # Desenha triângulo
    glBegin(GL_TRIANGLES)
    glColor3f(1, 0, 0)
    glVertex2f(-0.5, -0.5)
    glColor3f(0, 1, 0)
    glVertex2f(0.5, -0.5)
    glColor3f(0, 0, 1)
    glVertex2f(0.0, 0.5)
    glEnd()

    glfw.swap_buffers(window)

glfw.terminate()