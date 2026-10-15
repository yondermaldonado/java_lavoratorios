# Campus Java

Repositorio oficial del curso de Java con ejemplos, material de clase y laboratorios organizados por módulos y sesiones. Esta estructura inicial se completará con material a medida que avance el curso.

> **El repositorio campus-java es para recibir material; tu repositorio personal es para entregar tu trabajo.**

**Repositorio oficial:** [jhcuadrosp/campus-java](https://github.com/jhcuadrosp/campus-java) · **IDE del curso:** IntelliJ IDEA · **Entregas:** sistema Campus

## Guía de lectura

- [Propósito del repositorio](#propósito-del-repositorio)
- [Forma de trabajo](#forma-de-trabajo-con-el-repositorio-campus-java)
- [Herramientas del curso](#herramientas-del-curso)
- [Flujo básico](#flujo-básico)
- [Preguntas clave](#preguntas-clave)
- [Actualizar el material](#actualizar-el-material)
- [Buenas prácticas](#buenas-prácticas)
- [Estructura del repositorio](#estructura-del-repositorio)

## Propósito del repositorio

Este repositorio se utiliza para:

- Distribuir material oficial del curso.
- Compartir ejemplos desarrollados por el docente.
- Publicar ejercicios y laboratorios.
- Mantener una estructura organizada de las sesiones.
- Permitir que los estudiantes actualicen el material mediante Git.

## Forma de trabajo con el repositorio campus-java

El repositorio `campus-java` será el **repositorio oficial del curso**. Allí estarán disponibles los ejemplos, ejercicios iniciales y laboratorios de cada sesión.

1. Clona el repositorio una sola vez. En GitHub, copia su URL desde el botón **Code** y ejecuta `git clone https://github.com/jhcuadrosp/campus-java.git` usando esa URL.
2. En clases posteriores, abre una terminal dentro de la carpeta `campus-java` y actualiza el material con:

   ```bash
   git pull
   ```

3. El repositorio del docente se considera material oficial de solo lectura en condiciones normales.
4. No subas aquí tus soluciones.
5. Desarrolla tus soluciones y entregas en repositorios personales, fuera de la carpeta del repositorio oficial.
6. Entrega el enlace de tu repositorio personal mediante el sistema Campus.
7. Los Pull Requests al repositorio oficial se usarán solo para contribuciones excepcionales, como correcciones o mejoras solicitadas por el docente.

> **El repositorio campus-java es para recibir material; tu repositorio personal es para entregar tu trabajo.**

## Herramientas del curso

- **Java JDK:** permite compilar y ejecutar programas Java.
- **IntelliJ IDEA:** IDE oficial del curso para escribir, ejecutar y depurar código.
- **Git:** permite clonar y actualizar los repositorios.
- **GitHub:** aloja el material oficial y los repositorios personales.

En los módulos iniciales **no se utilizará Maven ni Gradle**. Estas herramientas se introducirán cuando sean necesarias, especialmente al llegar a Spring Boot.

## Flujo básico

El flujo normal será:

```mermaid
flowchart TD
    A["Docente publica material"] --> B{"¿Ya clonaste campus-java?"}
    B -->|No| C["Clona el repositorio una sola vez"]
    B -->|Sí| D["Actualiza con git pull"]
    C --> E["Copia el ejercicio en una carpeta personal"]
    D --> E
    E --> F["Abre el ejercicio en IntelliJ IDEA"]
    F --> G["Desarrolla la actividad"]
    G --> H["Prueba y depura"]
    H --> I["Crea tu propio repositorio para la entrega"]
    I --> J["Sube tu solución a tu repositorio personal"]
    J --> K["Entrega el enlace en Campus"]
    classDef docente fill:#dbeafe,stroke:#2563eb,color:#172554;
    classDef estudiante fill:#dcfce7,stroke:#16a34a,color:#14532d;
    classDef entrega fill:#fef3c7,stroke:#d97706,color:#78350f;
    class A docente;
    class E,F,G,H,I,J estudiante;
    class K entrega;
```

**De esta manera tenemos una separación clara:**

```mermaid
flowchart LR
    subgraph OFICIAL["Repositorio oficial del curso"]
        A["campus-java"] --> B["Material del docente"]
    end
    subgraph PERSONAL["Repositorio personal del estudiante"]
        C["Repositorio del estudiante"] --> D["Solución del estudiante"]
        D --> E["Entrega del enlace en Campus"]
    end
    B -.->|"Copia el ejercicio para trabajar"| C
    classDef docente fill:#dbeafe,stroke:#2563eb,color:#172554;
    classDef estudiante fill:#dcfce7,stroke:#16a34a,color:#14532d;
    class A,B docente;
    class C,D,E estudiante;
```

| Espacio | Qué contiene | Cómo lo usas |
| --- | --- | --- |
| `campus-java` | Material oficial publicado por el docente | Clonas una vez y actualizas con `git pull` |
| Tu repositorio personal | Tu actividad desarrollada, probada y depurada | Subes tu solución y compartes el enlace |
| Sistema Campus | El enlace a tu repositorio personal | Registras la entrega según las indicaciones del docente |

## Preguntas clave

**¿Hay que descargar el repositorio cada clase? → NO.**

Clónalo una sola vez, reemplazando `URL_DEL_REPOSITORIO` por la URL del repositorio oficial:

```bash
git clone URL_DEL_REPOSITORIO
```

En las siguientes clases, actualiza la copia existente desde la carpeta `campus-java`:

```bash
git pull
```

**¿Antes de comenzar un laboratorio debe actualizarse el repositorio? → SÍ.**

Desde la carpeta del repositorio oficial, ejecuta:

```bash
git pull
```

**¿Se recomienda trabajar en una copia en una carpeta personal? → SÍ.**

Copia el ejercicio a una carpeta personal fuera de `campus-java` y trabaja allí. Esto evita que un futuro `git pull` encuentre cambios personales mezclados con el material oficial. Sube tu solución a tu repositorio personal y entrega su enlace en Campus.

## Actualizar el material

### Primera vez: clonar

Abre una terminal en la carpeta donde guardarás el material del curso:

```bash
git clone https://github.com/jhcuadrosp/campus-java.git
cd campus-java
```

### Antes de cada clase o laboratorio: actualizar

Desde una terminal ubicada dentro de la carpeta del repositorio oficial, ejecuta:

```bash
git pull
```

- `git clone`: se usa la primera vez para obtener una copia local del repositorio.
- `git pull`: se usa para actualizar un repositorio ya clonado con el material publicado por el docente.

## Buenas prácticas

- No modificar directamente el material oficial salvo indicación del docente.
- Mantener las soluciones personales fuera del repositorio oficial.
- Leer el README de cada sesión, cuando esté disponible, antes de iniciar.
- Ejecutar y depurar el código antes de entregar.
- No subir archivos compilados ni configuraciones personales del IDE.
- Utilizar nombres claros para repositorios y archivos.

## Estructura del repositorio

El curso se organiza en **seis módulos y veinte sesiones**, con numeración continua. Esta es la estructura pública que se irá completando a medida que avance el curso. Actualmente están creadas las cuatro sesiones de fundamentos bajo `src/`. La sesión 1 ya incluye su README, tres demos y cinco labs; las demás sesiones y su material se incorporarán posteriormente.

### Mapa del curso

El diagrama muestra los seis módulos, las veinte sesiones y las carpetas `demo/` y `labs/` de cada sesión. Cada sesión seguirá la misma organización: ejemplos en `demo/` y actividades en `labs/`.

```mermaid
flowchart LR
    R["campus-java/"] --> README["README.md"]
    R --> IGNORE[".gitignore"]
    R --> SRC["src/ · módulos y sesiones"]
    SRC --> M1["01-fundamentos-java/"]
    M1 --> S1_1["sesion-01-introduccion-configuracion-variables/"]
    S1_1 --> S1_1_demo["demo/"]
    S1_1 --> S1_1_labs["labs/"]
    M1 --> S1_2["sesion-02-operadores-estructuras-decision/"]
    S1_2 --> S1_2_demo["demo/"]
    S1_2 --> S1_2_labs["labs/"]
    M1 --> S1_3["sesion-03-estructuras-repetitivas/"]
    S1_3 --> S1_3_demo["demo/"]
    S1_3 --> S1_3_labs["labs/"]
    M1 --> S1_4["sesion-04-cadenas-conversiones/"]
    S1_4 --> S1_4_demo["demo/"]
    S1_4 --> S1_4_labs["labs/"]
    SRC --> M2["02-poo-estructuras-datos/"]
    M2 --> S2_1["sesion-05-introduccion-poo/"]
    S2_1 --> S2_1_demo["demo/"]
    S2_1 --> S2_1_labs["labs/"]
    M2 --> S2_2["sesion-06-encapsulamiento/"]
    S2_2 --> S2_2_demo["demo/"]
    S2_2 --> S2_2_labs["labs/"]
    M2 --> S2_3["sesion-07-herencia-polimorfismo/"]
    S2_3 --> S2_3_demo["demo/"]
    S2_3 --> S2_3_labs["labs/"]
    M2 --> S2_4["sesion-08-arreglos-listas-genericos/"]
    S2_4 --> S2_4_demo["demo/"]
    S2_4 --> S2_4_labs["labs/"]
    M2 --> S2_5["sesion-09-relaciones-entre-clases/"]
    S2_5 --> S2_5_demo["demo/"]
    S2_5 --> S2_5_labs["labs/"]
    M2 --> S2_6["sesion-10-set-map-enum-excepciones/"]
    S2_6 --> S2_6_demo["demo/"]
    S2_6 --> S2_6_labs["labs/"]
    SRC --> M3["03-solid-patrones-diseno/"]
    M3 --> S3_1["sesion-11-principios-solid/"]
    S3_1 --> S3_1_demo["demo/"]
    S3_1 --> S3_1_labs["labs/"]
    M3 --> S3_2["sesion-12-patrones-creacionales/"]
    S3_2 --> S3_2_demo["demo/"]
    S3_2 --> S3_2_labs["labs/"]
    M3 --> S3_3["sesion-13-patrones-estructurales/"]
    S3_3 --> S3_3_demo["demo/"]
    S3_3 --> S3_3_labs["labs/"]
    M3 --> S3_4["sesion-14-patrones-comportamiento/"]
    S3_4 --> S3_4_demo["demo/"]
    S3_4 --> S3_4_labs["labs/"]
    SRC --> M4["04-concurrencia-java/"]
    M4 --> S4_1["sesion-15-introduccion-concurrencia/"]
    S4_1 --> S4_1_demo["demo/"]
    S4_1 --> S4_1_labs["labs/"]
    M4 --> S4_2["sesion-16-sincronizacion-atomicos/"]
    S4_2 --> S4_2_demo["demo/"]
    S4_2 --> S4_2_labs["labs/"]
    SRC --> M5["05-persistencia-datos/"]
    M5 --> S5_1["sesion-17-manejo-archivos/"]
    S5_1 --> S5_1_demo["demo/"]
    S5_1 --> S5_1_labs["labs/"]
    M5 --> S5_2["sesion-18-jdbc/"]
    S5_2 --> S5_2_demo["demo/"]
    S5_2 --> S5_2_labs["labs/"]
    SRC --> M6["06-lambdas-stream-api/"]
    M6 --> S6_1["sesion-19-expresiones-lambda/"]
    S6_1 --> S6_1_demo["demo/"]
    S6_1 --> S6_1_labs["labs/"]
    M6 --> S6_2["sesion-20-stream-api/"]
    S6_2 --> S6_2_demo["demo/"]
    S6_2 --> S6_2_labs["labs/"]
    classDef modulo fill:#dbeafe,stroke:#2563eb,color:#172554;
    class M1,M2,M3,M4,M5,M6 modulo;
```

### Árbol completo de carpetas

Este árbol detalla los nombres y rutas previstos; no indica que todo el material ya esté publicado.

```text
campus-java/
├── README.md
├── .gitignore
└── src/
    ├── 01-fundamentos-java/
    │   ├── sesion-01-introduccion-configuracion-variables/
    │   │   ├── README.md
    │   │   ├── demo/
    │   │   └── labs/
    │   ├── sesion-02-operadores-estructuras-decision/
    │   │   ├── demo/
    │   │   └── labs/
    │   ├── sesion-03-estructuras-repetitivas/
    │   │   ├── demo/
    │   │   └── labs/
    │   └── sesion-04-cadenas-conversiones/
    │       ├── demo/
    │       └── labs/
    ├── 02-poo-estructuras-datos/
    │   ├── sesion-05-introduccion-poo/
    │   │   ├── demo/
    │   │   └── labs/
    │   ├── sesion-06-encapsulamiento/
    │   │   ├── demo/
    │   │   └── labs/
    │   ├── sesion-07-herencia-polimorfismo/
    │   │   ├── demo/
    │   │   └── labs/
    │   ├── sesion-08-arreglos-listas-genericos/
    │   │   ├── demo/
    │   │   └── labs/
    │   ├── sesion-09-relaciones-entre-clases/
    │   │   ├── demo/
    │   │   └── labs/
    │   └── sesion-10-set-map-enum-excepciones/
    │       ├── demo/
    │       └── labs/
    ├── 03-solid-patrones-diseno/
    │   ├── sesion-11-principios-solid/
    │   │   ├── demo/
    │   │   └── labs/
    │   ├── sesion-12-patrones-creacionales/
    │   │   ├── demo/
    │   │   └── labs/
    │   ├── sesion-13-patrones-estructurales/
    │   │   ├── demo/
    │   │   └── labs/
    │   └── sesion-14-patrones-comportamiento/
    │       ├── demo/
    │       └── labs/
    ├── 04-concurrencia-java/
    │   ├── sesion-15-introduccion-concurrencia/
    │   │   ├── demo/
    │   │   └── labs/
    │   └── sesion-16-sincronizacion-atomicos/
    │       ├── demo/
    │       └── labs/
    ├── 05-persistencia-datos/
    │   ├── sesion-17-manejo-archivos/
    │   │   ├── demo/
    │   │   └── labs/
    │   └── sesion-18-jdbc/
    │       ├── demo/
    │       └── labs/
    └── 06-lambdas-stream-api/
        ├── sesion-19-expresiones-lambda/
        │   ├── demo/
        │   └── labs/
        └── sesion-20-stream-api/
            ├── demo/
            └── labs/
```

### Qué encontrarás en cada sesión

| Carpeta | Contenido | Cómo utilizarla |
| --- | --- | --- |
| `demo/` | Ejemplos desarrollados por el docente para explicar los conceptos de la sesión; código de demostración y recursos necesarios para ejecutarlo. | Abre los ejemplos en IntelliJ IDEA, ejecútalos y depúralos para comprender su funcionamiento. Si quieres modificarlos, trabaja en una copia personal. |
| `labs/` | Enunciados de ejercicios y laboratorios, instrucciones, requisitos, criterios de entrega y archivos iniciales o recursos de apoyo cuando la actividad los necesite. | Lee las indicaciones, copia el material necesario a tu carpeta personal y desarrolla, prueba y depura tu solución. Publícala en tu repositorio personal y entrega el enlace en Campus. |

```mermaid
flowchart LR
    S["Sesión del curso"] --> D["demo/ · ejemplos del docente"]
    S --> L["labs/ · actividades propuestas"]
    D --> C["Comprender, ejecutar y depurar"]
    L --> P["Desarrollar en tu repositorio personal"]
    P --> E["Entregar el enlace en Campus"]
    classDef material fill:#dbeafe,stroke:#2563eb,color:#172554;
    classDef trabajo fill:#dcfce7,stroke:#16a34a,color:#14532d;
    class D,L material;
    class C,P,E trabajo;
```

**Las carpetas `labs/` del repositorio oficial contienen las actividades propuestas; tus entregas se guardan en tu repositorio personal.**

La [sesión 1](src/01-fundamentos-java/sesion-01-introduccion-configuracion-variables/README.md) ya tiene su README con las orientaciones de trabajo. Las demás sesiones tendrán posteriormente sus propias guías; las carpetas pendientes conservan un `.gitkeep` para que Git pueda versionarlas.

### Organización en IntelliJ IDEA

`src/` agrupa los módulos y sesiones del curso. Las carpetas con guiones son categorías del material, no paquetes Java. Para ejecutar los ejemplos desde esta organización, marca las carpetas `demo/` y `labs/` de la sesión como **Sources Root**, dejando el `src/` general sin esa marca. Consulta la guía de la sesión 1 para los pasos detallados.
