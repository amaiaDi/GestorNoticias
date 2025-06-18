# 📰 Gestor de Noticias

Proyecto Java sencillo desarrollado como práctica para la asignatura de **Entornos de Desarrollo** en ciclos de **Desarrollo Web** y **Desarrollo Multiplataforma**.

## 📌 Descripción

Este programa permite gestionar un listado de noticias desde un menú por consola. El usuario puede:

- Crear una nueva noticia
- Listar todas las noticias disponibles
- Eliminar una noticia por su título
- Salir del programa

Las noticias tienen la siguiente información:

- Título
- Contenido
- Autor
- Fecha de publicación

---

## 🗂️ Estructura del proyecto

GestorNoticias/

├── src/

│ └── com.gestor.noticias/

│           ├── Main.java

│           ├── modelo/Noticia.java

│           ├── servicio/GestorNoticias.java

│           └── util/Utilidades.java

├── test/
│   └── com.gestor.noticias/

│           ├── MainTest.java

│           ├── modelo/NoticiaTest.java

│           └── servicio/GestorNoticiasTest.java

├── lib/ → Librerías externas (por ejemplo, JUnit 5)

└── README.md

---

## 🧪 Pruebas unitarias

El proyecto incluye tests básicos con **JUnit 5** para comprobar el correcto funcionamiento de las clases:

- `NoticiaTest`: comprueba los atributos y métodos de la clase `Noticia`.
- `GestorNoticiasTest`: verifica la gestión de noticias (añadir, listar, eliminar).
- `MainTest`: verifica que el método `main` está definido correctamente.

Para ejecutar los tests en Eclipse:

1. Asegúrate de que la carpeta `test/` está marcada como *Source Folder*.
2. Añade JUnit 5 al proyecto (Build Path → Add Libraries → JUnit).
3. Clic derecho sobre una clase de test → `Run As → JUnit Test`.

---

## ▶️ Ejecución

Para ejecutar el programa principal:

1. Abre `Main.java`.
2. Haz clic derecho → `Run As → Java Application`.

---

## 📚 Objetivos didácticos

- Comprender la organización de un proyecto Java por paquetes.
- Aplicar la programación orientada a objetos.
- Utilizar utilidades para entrada/salida por consola.
- Aprender a separar la lógica del programa en clases reutilizables.
- Introducir el uso de pruebas unitarias con JUnit.

---

## 📅 Autoría y licencia

Proyecto desarrollado con fines educativos.  
Asignatura: **Entornos de Desarrollo**  
Curso: **1º de Desarrollo Web / Multiplataforma**  
Centro: **C.I.F.P ciudad Jardin L.H.I.I**



