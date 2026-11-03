# Lab 02 · Decorator · Empaque de pedidos · 13 minutos

Un pedido puede combinar un empaque base con recargos opcionales. Usa los objetos ya codificados para comprobar las combinaciones.

## Pasos para completar la actividad

1. Abre **S13Lab02DecoratorMain.java**. El costo base es 5000 pesos, el recargo ecológico 2000 y el seguro 3000. Calcula en papel los cinco totales impresos.
2. Ejecuta **Run → S13Lab02DecoratorMain** y compara con la salida. Las dos combinaciones deben costar lo mismo aunque el orden sea distinto.
3. Lee Empaque.java, EmpaqueEstandar.java, DecoradorEmpaque.java, EmpaqueEcologico.java y SeguroEmpaque.java. Localiza la referencia al objeto envuelto y la llamada a su calcularCosto.
4. Coloca un breakpoint en calcularCosto de SeguroEmpaque. En Debug, usa Step Into para ver cómo llega al costo base a través del otro decorador.
5. En EmpaqueEcologico.java, cambia solo el recargo `2_000` por `2_500`. Predice y ejecuta otra vez: Base=5000, Ecologico=7500, Seguro=8000 y ambas combinaciones=10500.
6. Guarda los cinco totales nuevos. Explica por qué intercambiar recargos fijos no cambia el total y por qué el orden sí afectaba al mensaje de auditoría en el demo. ¿Necesitarías decoradores si siempre hubiera una única opción fija?

## Salida inicial esperada

```text
Base: 5000
Ecologico: 7000
Seguro: 8000
Ecologico y seguro: 10000
Seguro y ecologico: 10000
```

[Volver a la sesión](../../README.md) · [Abrir el programa](S13Lab02DecoratorMain.java)

Paso 1 – Cálculo en papel (valores originales)

Línea	Cálculo	Total
Base	5000	5000
Ecologico	5000 + 2000	7000
Seguro	5000 + 3000	8000
Ecologico y seguro	5000 + 2000 + 3000	10000
Seguro y ecologico	5000 + 3000 + 2000	10000

Paso 2 – Salida del Main original

text
Base: 5000
Ecologico: 7000
Seguro: 8000
Ecologico y seguro: 10000
Seguro y ecologico: 10000

Las dos combinaciones dan lo mismo porque la suma es conmutativa.

Paso 3 – Lectura de las clases

Empaque es el contrato (calcularCosto()).
EmpaqueEstandar es el componente base y devuelve 5000.
DecoradorEmpaque es la clase abstracta que guarda el objeto envuelto en protected final Empaque empaque.
EmpaqueEcologico y SeguroEmpaque llaman a empaque.calcularCosto() y le suman su recargo con Math.addExact.

Paso 4 – Debug
Con Step Into en SeguroEmpaque.calcularCosto ves cómo la llamada baja capa por capa: Seguro → Ecologico → Estandar. Luego el valor sube sumando 5000, después 2000 (o 2500) y por último 3000.

Paso 5 – Salida con el recargo en 2_500

text
Base: 5000
Ecologico: 7500
Seguro: 8000
Ecologico y seguro: 10500
Seguro y ecologico: 10500

Paso 6 – Preguntas conceptuales
Intercambiar recargos fijos no cambia el total porque cada decorador solo suma una constante y la suma no depende del orden (5000 + 2500 + 3000 = 5000 + 3000 + 2500).

El orden sí afecta al mensaje de auditoría porque cada decorador envuelve al anterior: el más externo se ejecuta primero y el más interno al final, así que el mensaje saldría en secuencias distintas (“ecológico y luego seguro” frente a “seguro y luego ecológico”). Ese mensaje de auditoría no aparece en el código que me enviaste: el Main solo imprime costos, así que esa parte te la explico en teoría.

Si siempre hubiera una única opción fija, no necesitarías decoradores: bastaría una clase concreta con el costo ya calculado. El Decorator tiene sentido cuando las opciones se combinan libremente y en cualquier orden.