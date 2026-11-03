# Lab 00 · Strategy · Descuentos de tienda · 10 minutos

Precios ficticios en pesos enteros. Se admiten múltiplos de 100 entre 100 y 1000000 y cantidades de 1 a 100. Así los porcentajes 5 % y 10 % son exactos. Regular no descuenta; fidelizado siempre 5 %; mayorista 10 % desde 10 unidades.

## Pasos para completar la actividad

1. Abre **S14Lab00StrategyMain.java**. El precio unitario es 1000 pesos. Calcula el subtotal y total de las cuatro salidas: regular10, fidelizado10, mayorista9 y mayorista10.
2. Ejecuta **Run → S14Lab00StrategyMain** y compara con la salida. Mayorista9 no tiene descuento; mayorista10 recibe 10 %. Aunque ambos totales son 9000, corresponden a cantidades diferentes.
3. Lee Descuento.java, Regular.java, Fidelizado.java, Mayorista.java y Carrito.java. Localiza la llamada a descuento.calcular; el carrito no elige el tipo de cliente con condiciones.
4. En el Main, cambia solo `new Carrito(new Mayorista())` por `new Carrito(new Fidelizado())` en la variable carrito. Cambia las etiquetas de sus dos println de Mayorista a Fidelizado.
5. Predice y ejecuta otra vez: las dos últimas líneas deben ser `Fidelizado 9: 8550` y `Fidelizado 10: 9500`. No cambies Carrito.java para obtener esos valores.
6. Coloca un breakpoint en total y usa Step Into para entrar en la estrategia. Guarda las salidas inicial y modificada; explica quién seleccionó la regla y cuándo bastaría un cálculo directo sin Strategy.

## Salida inicial esperada

```text
Regular 10: 10000
Fidelizado 10: 9500
Mayorista 9: 9000
Mayorista 10: 9000
```

[Abrir el programa](S14Lab00StrategyMain.java) · [Volver a la sesión](../../README.md)

Paso 1 – Cálculo en papel (precio unitario 1000)

Salida	Subtotal	Descuento	Total
regular10	10000	0	10000
fidelizado10	10000	5 % = 500	9500
mayorista9	9000	0 (menos de 10 unidades)	9000
mayorista10	10000	10 % = 1000	9000

Paso 2 – Salida del Main original

text
Regular 10: 10000
Fidelizado 10: 9500
Mayorista 9: 9000
Mayorista 10: 9000

Los dos totales de 9000 son iguales por casualidad: con 9 unidades no hay descuento, y con 10 unidades se descuenta el 10 %.

Paso 3 – Dónde está la estrategia
Carrito.total llama a descuento.calcular(precioUnitario, unidades) y no tiene ningún if sobre el tipo de cliente. Descuento es la interfaz de la estrategia y Regular, Fidelizado y Mayorista son las estrategias concretas.

Paso 4 y 5 – Salida con Fidelizado

text
Regular 10: 10000
Fidelizado 10: 9500
Fidelizado 9: 8550
Fidelizado 10: 9500
9 unidades: 9000 − 5 % (450) = 8550.
10 unidades: 10000 − 5 % (500) = 9500.

Las dos últimas líneas coinciden con lo que pide el README. Solo cambié la estrategia que se pasa al constructor.

Paso 6 – Breakpoint y pregunta conceptual
Con Step Into en total, entras primero a validar y luego a Fidelizado.calcular, que devuelve el descuento. Después total calcula precioUnitario * unidades - descuento.

Quien seleccionó la regla fue el cliente del carrito, el Main, al elegir qué objeto Descuento pasar al constructor (new Fidelizado()). El Carrito no decide nada: solo delega.

Bastaría un cálculo directo, sin Strategy, si hubiera una única regla fija que no va a cambiar. Con una sola fórmula, la interfaz y las clases extra serían complejidad innecesaria. Strategy compensa cuando hay varias reglas intercambiables o se esperan más.