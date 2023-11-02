# LABORATORIO 8 AREP

### Demo EC2: https://youtu.be/R-tlm5lh4kw
### Nombres: Juan Acosta y Santiago Bayona

En este laboratorio se diseño un API junto con un monolito Quarkus que permite a los usuarios hacer posts estilo Twitter. Además, se desplegó tanto en S3 como en EC2.

### Prerrequisitos

- Java: Es un lenguaje de programación de propósito general orientado a objetos, portátil y muy versátil.
- Maven: Es una herramienta que maneja el ciclo de vida del programa.
- Git: Es un sistema de control de versiones distribuido (VCS).
- AWS: Servicio de nube.
- Quarkus: Framework de Java.
- MongoDB: Base de datos de documentos que ofrece una gran escalabilidad y flexibilidad, así como un modelo de consultas e indexación avanzado.

### Instalación y ejecución

Se clona el repositorio con el comando
```
git clone https://github.com/jloading/Taller8AREP.git
```

Se instalan las dependencias y se corre el proyecto
```
mvn clean install
```
```
quarkus dev
```

En el navegador ingresa a la siguiente dirección (las credenciales de acceso son usuario: AREP, contraseña: admin
```
http://localhost:8080/login.html
```
<img width="720" alt="Captura de pantalla 2023-11-01 a la(s) 10 14 00 p  m" src="https://github.com/jloading/Taller8AREP/assets/65261708/cad00d13-5aef-4df3-949f-c3e6d26897d6">

<img width="715" alt="Captura de pantalla 2023-11-01 a la(s) 10 14 29 p  m" src="https://github.com/jloading/Taller8AREP/assets/65261708/74a23500-a5f6-4d43-8303-944f0cffc120">

### Despliegue en AWS

- **EC2:**
Se crea la instancia EC2

<img width="1191" alt="Captura de pantalla 2023-11-01 a la(s) 11 58 51 p  m" src="https://github.com/jloading/Taller8AREP/assets/65261708/51fe0034-3ed8-474d-abe1-e52657ce4f65">

Se transfiere el proyecto a la instancia EC2 usando sftp, posteriormente se ejecuta con el comando

```
quarkus dev
```

<img width="1440" alt="Captura de pantalla 2023-11-02 a la(s) 12 28 47 a  m" src="https://github.com/jloading/Taller8AREP/assets/65261708/a1da291d-c20b-42df-a2ae-5c6c66bfa94d">

Posteriormente se accede a la dirección de la máquina

<img width="1428" alt="Captura de pantalla 2023-11-02 a la(s) 12 31 16 a  m" src="https://github.com/jloading/Taller8AREP/assets/65261708/b460cd54-5258-46a1-8760-909faf8fb058">

<img width="1440" alt="Captura de pantalla 2023-11-02 a la(s) 12 31 40 a  m" src="https://github.com/jloading/Taller8AREP/assets/65261708/463853ba-f348-4d87-a1aa-9014b3c855fd">

- **S3:**
Se crea un bucket de S3 y se añaden los archivos deseados

![img2](https://github.com/jloading/Taller8AREP/assets/64861204/4f04f41c-2a3b-4e7c-b1e6-5cc17ee48451)

Luego se accede al recurso

![img3](https://github.com/jloading/Taller8AREP/assets/64861204/9ca843b9-8d4b-410e-9afc-5116fc919d9a)

y funciona correctamente

![img4](https://github.com/jloading/Taller8AREP/assets/64861204/3adfc1c6-9c99-4aec-8b6e-bc1da407ad9e)

![img1](https://github.com/jloading/Taller8AREP/assets/64861204/52cb09e1-62a3-4ad9-9896-18f34af50ff9)





