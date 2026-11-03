# Lab 03 · Composite · Ruta formativa · 15 minutos

Una ruta contiene módulos y lecciones. Calcula la duración con la misma operación para elementos individuales y grupos.

## Pasos para completar la actividad

1. Abre **S13Lab03CompositeMain.java**. introduccion es un módulo con lecciones de 10 y 20 minutos; ruta contiene ese módulo y otra lección de 15. Predice los totales del módulo vacío, introduccion y ruta.
2. Ejecuta **Run → S13Lab03CompositeMain**. Compara con la salida: 0, 30 y 45 minutos. El intento final de añadir ruta dentro de introduccion debe rechazarse porque formaría un ciclo.
3. Lee ElementoFormativo.java, Leccion.java y ModuloFormativo.java. Localiza dónde una hoja devuelve minutos y dónde el compuesto recorre sus elementos y suma.
4. En el Main, inmediatamente después de añadir la lección de 15 minutos a ruta, agrega `introduccion.agregarElementoFormativo(new Leccion(5));`. Predice y ejecuta: introduccion debe dar 35 y ruta 50. El módulo vacío sigue mostrando 0 porque se imprimió antes de agregar lecciones.
5. Coloca un breakpoint en calcularMinutos de ModuloFormativo y usa Step Into para seguir la llamada del módulo ruta al módulo introduccion y a sus hojas. Observa el retorno de cada subtotal.
6. Guarda la salida nueva y dibuja un árbol sencillo de los dos módulos y sus cuatro lecciones. Explica qué ocurriría con la recursión si se permitiera el ciclo y cuándo bastaría una lista plana sin Composite.

## Salida inicial esperada

```text
Modulo vacio: 0
Introduccion: 30
Ruta: 45
Ciclo rechazado
```

[Volver a la sesión](../../README.md) · [Abrir el programa](S13Lab03CompositeMain.java)

Paso 1 – Predicción

Elemento	Cálculo	Total
Módulo vacío	sin elementos	0
introduccion	10 + 20	30
ruta	introduccion (30) + lección de 15	45

Paso 2 – Salida del Main original

text
Modulo vacio: 0
Introduccion: 30
Ruta: 45
Ciclo rechazado

El intento de añadir ruta dentro de introduccion se rechaza porque ruta ya contiene a introduccion, y eso formaría un ciclo.

Paso 3 – Hoja y compuesto

Leccion es la hoja: calcularMinutos() devuelve directamente sus minutos.
ModuloFormativo es el compuesto: calcularMinutos() recorre su lista y suma el calcularMinutos() de cada elemento, sea lección u otro módulo.
Las dos clases implementan ElementoFormativo, y por eso el cliente las trata igual.

Paso 4 – Salida con la lección de 5 minutos

text
Modulo vacio: 0
Introduccion: 35
Ruta: 50
Ciclo rechazado

introduccion pasa a 35 (10 + 20 + 5) y ruta a 50 (35 + 15). El módulo vacío sigue en 0 porque se imprime antes de agregar lecciones.

Paso 5 – Debug
Con Step Into, ruta.calcularMinutos() entra al for y llama primero a introduccion.calcularMinutos(), que suma sus hojas (10, 20, 5) y devuelve 35. Luego ruta llama a la lección de 15 y suma: 35 + 15 = 50.

Paso 6 – Árbol, recursión y lista plana

text
ruta (50)
├── introduccion (35)
│   ├── Leccion 10
│   ├── Leccion 20
│   └── Leccion 5
└── Leccion 15

Si se permitiera el ciclo (introduccion contiene a ruta y ruta a introduccion), calcularMinutos() se llamaría a sí mismo sin parar: la recursión nunca llegaría a una hoja y terminaría en StackOverflowError. Por eso agregarElementoFormativo revisa el ciclo antes de insertar.

Bastaría una lista plana sin Composite cuando no hay grupos anidados: si todo son lecciones sueltas, sumar una lista de Leccion es suficiente. El Composite aporta valor cuando hay módulos dentro de módulos y se quiere tratar igual a una hoja y a un grupo.