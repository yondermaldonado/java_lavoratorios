# Reto 3 · Control de producción y calidad

Programa de consola en Java (`S03Reto03Calidad`) que inspecciona las medidas de un lote, clasifica cada pieza y detiene la línea si hay tres rechazos consecutivos.

## Reglas

**Entradas:**
- Cantidad de piezas: entero mayor que 0. Si no lo es, se vuelve a pedir antes de comenzar.
- Medida de cada pieza: positiva y finita, en mm y con punto decimal (por ejemplo `9.8`). Si no es válida, se vuelve a pedir para la misma pieza y no cambia ningún contador ni la racha.

**Clasificación (exactamente una vez por medida válida):**

| Medida (mm) | Resultado |
|---|---|
| de 9.8 a 10.2 inclusive | APROBADA |
| de 9.5 hasta menos de 9.8, o mayor que 10.2 hasta 10.5 inclusive | REPROCESO |
| fuera de 9.5 – 10.5 | RECHAZADA |

**Contadores:** cada medida válida aumenta `inspeccionadas`, el contador de su categoría y `sumaMedidas`.

**Racha de rechazos:**
- Rechazada: aumenta `rechazadas` (total) y `rechazadasConsecutivas`.
- Aprobada o reproceso: `rechazadasConsecutivas` vuelve a 0.
- `rechazadas` (total) nunca se reinicia.

**Parada:** al llegar a 3 rechazos consecutivos se muestra `ALERTA: detener la linea de produccion.` y no se piden más medidas. La tercera rechazada cuenta como inspeccionada y entra en el promedio.

**Resumen final:** inspeccionadas, aprobadas, reproceso, rechazadas, aprobación (`100.0 * aprobadas / inspeccionadas`) y promedio (`sumaMedidas / inspeccionadas`). Como se divide por las piezas realmente inspeccionadas y no por el tamaño original del lote, el cálculo es correcto aunque la línea se detenga antes. Además, aprobadas + reproceso + rechazadas = inspeccionadas.

## Decisiones

**Ciclo elegido: `while`.** No se sabe de antemano cuántas vueltas habrá, porque el lote puede terminar antes por la alerta, y las medidas inválidas no cuentan como inspección. Un `for` con contador fijo no refleja bien eso. Con `while` la condición lo expresa directamente:

```java
while (inspeccionadas < cantidad && rechazadasConsecutivas < 3)
```

**Cómo se garantiza la parada:** la condición se evalúa antes de pedir cada medida. Si ya se inspeccionó todo el lote, o la racha llegó a 3, el ciclo termina y no se piden medidas nuevas. Cada vuelta válida aumenta `inspeccionadas`, así que el ciclo siempre termina.

**Validación de la medida:** un `do-while` repite la petición mientras la medida sea `<= 0`, `NaN` o infinita.

**Decimales con punto:** se usa `sc.useLocale(Locale.US)`. Sin esto, en un computador configurado en español de Colombia el Scanner espera coma (`9,8`) y rechaza `9.8`.

No se usan arrays ni colecciones para guardar el lote: solo contadores y una suma acumulada.

## Pruebas mínimas

| Lote y medidas, en orden | Resultado esperado |
|---|---|
| 6 piezas: 9.5, 9.8, 10.0, 10.2, 10.5, 10.6 | 6 inspeccionadas; 3 aprobadas; 2 reproceso; 1 rechazada; aprobación 50 %; promedio 10.1 mm |
| 5 piezas: 9.4, 10.6, 10.7 | Alerta tras la tercera; 3 inspeccionadas, todas rechazadas; aprobación 0 %; promedio ≈ 10.2333 mm; no pide las medidas 4 y 5 |
| 4 piezas: 9.4, 10.6, 10.0, 9.4 | 4 inspeccionadas; 1 aprobada; 3 rechazadas; sin alerta, porque no hubo tres consecutivas |

Otras pruebas:
- `cantidad = 0`: se corrige antes de comenzar.
- `medida = 0`: se vuelve a pedir y no cuenta como inspección.

## Nota

El programa no maneja letras ni tokens no numéricos (ampliación opcional). La extensión de mínimo y máximo tampoco está incluida.