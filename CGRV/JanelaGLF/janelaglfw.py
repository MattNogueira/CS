import glfw
from OpenGL.GL import *
import time

if not glfw.init():
    raise Exception("Falha ao inicializar GLFW")
glfw.window_hint(glfw.CONTEXT_VERSION_MAJOR, 3)
glfw.window_hint(glfw.CONTEXT_VERSION_MINOR, 3)
glfw.window_hint(glfw.OPENGL_PROFILE, glfw.OPENGL_CORE_PROFILE)
glfw.window_hint(glfw.OPENGL_FORWARD_COMPAT, GL_TRUE)
window = glfw.create_window(800, 600, "Janela (OpenGL 3.3 Core)", None, None)
if not window:
    glfw.terminate()
    raise Exception("Não foi possível criar a janela OpenGL 3.3 Core Profile")
glfw.make_context_current(window)
print("Versão OpenGL:", glGetString(GL_VERSION).decode())

glClearColor(0.1,0.1,0.1,1.0)
glClear(GL_COLOR_BUFFER_BIT)
glfw.swap_buffers(window)

start = time.time()
while time.time() - start < 5:
    glfw.poll_events()

glfw.terminate()