# SapeGym

**SapeGym** es un sistema de gestión para gimnasios, desarrollado en Java.  
Permite la administración de usuarios, amigos, productos y acciones dentro del gimnasio, proporcionando una arquitectura organizada y mantenible basada en los principios de la Programación Orientada a Objetos.

---

## 📦 Estructura del Proyecto

SapeGym/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── app/
│ │ │ │ ├── App.java
│ │ │ │ ├── services/
│ │ │ │ │ ├── graphicServices/
│ │ │ │ │ │ ├── GraficoAvanzadoService.java
│ │ │ │ │ │ ├── ObjGraficoService.java
│ │ │ │ │ │ ├── RecursosService.java
│ │ │ │ │ ├── logicServices/
│ │ │ │ │ │ ├── AccionService.java
│ │ │ │ │ │ ├── AmigoService.java
│ │ │ │ │ │ ├── ProductoService.java
│ │ │ │ │ │ ├── UsuarioService.java
│ │ │ ├── logic/
│ │ │ │ ├── ControlAmigos.java
│ │ │ │ ├── ControlProductos.java
│ │ │ │ ├── ControlUsuarios.java
│ │ │ ├── model/
│ │ │ │ ├── Accion.java
│ │ │ │ ├── Amigo.java
│ │ │ │ ├── Producto.java
│ │ │ │ ├── Usuario.java

yaml
Copiar
Editar

---

## 🚀 Tecnologías

- **Lenguaje:** Java
- **IDE:** Visual Studio Code
- **Paradigma:** Programación Orientada a Objetos (OOP)
- **Patrones utilizados:**
  - Encapsulamiento
  - Separación por capas (Modelo, Servicio, Controlador)

---

## 🗂️ Arquitectura

El proyecto está estructurado en varias capas para promover una arquitectura limpia:

- **Model:**  
  Contiene las clases que representan los datos del sistema.

- **Services:**  
  Contiene la lógica de negocio para manipular los modelos.  
  Incluye servicios gráficos y de recursos para la interfaz.

- **Controllers:**  
  Controla la lógica de presentación e interacción con los usuarios.

- **App:**  
  Punto de entrada de la aplicación.

---

## 🔎 Principios de POO en el proyecto

- **Encapsulamiento:**  
  Los atributos de las clases están definidos como `private`, con métodos públicos de acceso (`getters`).

- **Herencia y Polimorfismo:**  
  Actualmente no se ha implementado herencia ni polimorfismo.  
  El sistema se puede extender fácilmente para incluir estas características.

---

## ✅ Estado del Proyecto

Proyecto en desarrollo. Actualmente incluye:

- Gestión de Usuarios
- Gestión de Amigos
- Gestión de Productos
- Gestión de Acciones

---

## 💡 Posibles mejoras futuras

- Implementación de interfaces y herencia.
- Implementación de patrones de diseño como DAO.
- Persistencia de datos (actualmente no definida).
- Interfaz gráfica avanzada.

---

## 👨‍💻 Autor

Fernando Aguirre

---

## 📝 Licencia

Uso personal / educativo.

A continuación se presentan algunas capturas.

<div align='center'>
    <img  src='https://i.imgur.com/35Gb1ra.png'>
    <p>Login de usuarios.</p>
</div>

<div align='center'>
    <img  src='https://i.imgur.com/C323HG1.png'>
    <p>Inicio de aplicación.</p>
</div>

<div align='center'>
    <img  src='https://i.imgur.com/iLAnqNE.png'>
    <p>Listado de productos.</p>
</div>
