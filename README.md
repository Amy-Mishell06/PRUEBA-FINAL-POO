*Tecnologías Utilizadas*

- Java 25 JDK

- Spring Boot

- Spring Web

- Spring Data JPA

- H2 Database

- Maven

- Postman

*Ejecución del Proyecto*

- Clonar el repositorio

- Abrir el proyecto en IntelliJ IDEA

- Ejecutar la clase principal: PruebaFinalPooApplication

- El servidor se levanta con: http://localhost:8080/api/estudiantes

*Desde POSTMAN*

- GET /api/estudiantes

<img width="754" height="779" alt="image" src="https://github.com/user-attachments/assets/36297262-e01c-43b6-90e7-107e7d4521a4" />


- GET /api/estudiantes/{id}

<img width="665" height="394" alt="image" src="https://github.com/user-attachments/assets/2e6df600-89a1-430b-97f8-7b8bbf674f06" />


- POST /api/estudiantes
  - En Body - RAW - JSON
    {
      "nombre": "nombreEjemplo",
      "email": "nombre@gmail.com",
      "edad": 1,
      "carrera": "carreraEJEMPLO"
    }

    <img width="728" height="429" alt="image" src="https://github.com/user-attachments/assets/f286376d-7b20-4f87-8bd9-fc447cf21ffc" />

    
-  PUT /api/estudiantes/{id}

<img width="663" height="398" alt="image" src="https://github.com/user-attachments/assets/28a5b08f-7eed-44f6-a490-85d87150328d" />


- DELETE /api/estudiantes/{id}

<img width="587" height="431" alt="image" src="https://github.com/user-attachments/assets/3efac75e-a29f-4ea9-851a-531115337f46" />



  





