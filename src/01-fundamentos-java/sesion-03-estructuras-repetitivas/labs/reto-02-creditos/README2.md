# Reto 2 · Simulador de aprobación de créditos

Programa de consola en Java (`S03Reto02Creditos`) que hace una evaluación preliminar de solicitudes de crédito para una cooperativa. Es un modelo didáctico: no incluye intereses, seguros ni comisiones, y no representa una política de crédito real.

## Reglas

**Menú:** `1` = nueva solicitud, `0` = finalizar. Cualquier otra opción muestra un aviso y se vuelve a pedir.

**Rangos de entrada:** cada dato se vuelve a pedir mientras esté fuera de rango, antes de evaluar, y no cuenta como solicitud adicional.

| Dato | Rango |
|---|---|
| Edad | 0 a 120 |
| Ingresos mensuales | 0 a 1 000 000 000 |
| Gastos mensuales | 0 a 1 000 000 000 |
| Crédito solicitado | 1 a 1 000 000 000 |
| Meses | 1 a 360 |

El dinero se maneja con `long` (pesos enteros).

**Requisitos obligatorios:** la edad debe estar entre 18 y 70 inclusive, y los ingresos deben ser mayores que los gastos. Si falla alguno, la solicitud es **RECHAZADA** y no se hace ninguna división.

**Cálculo:**
- `disponible = ingresos − gastos`
- `cuota = crédito / meses` (sin intereses)
- `endeudamiento = cuota / disponible`

**Clasificación (una sola vez por solicitud):**

| Endeudamiento | Resultado |
|---|---|
| ≤ 35 % | APROBADA |
| > 35 % y ≤ 45 % | REVISIÓN MANUAL (no es aprobación automática) |
| > 45 % | RECHAZADA |

Cada solicitud suma 1 a las evaluadas y a un solo contador de categoría. Al finalizar se muestran evaluadas, aprobadas, revisión manual y rechazadas, y la suma de las tres categorías siempre coincide con el total evaluado.

## Justificación de los límites

Si se divide `crédito / meses` con enteros, la cuota se trunca y una solicitud podría quedar en la categoría equivocada. Por eso la decisión no usa divisiones, sino comparaciones exactas con enteros:

```
crédito / (disponible · meses) ≤ 35 %   equivale a   crédito · 100 ≤ disponible · meses · 35
crédito / (disponible · meses) ≤ 45 %   equivale a   crédito · 100 ≤ disponible · meses · 45
```

Así los límites exactos (35 % y 45 %) se evalúan sin errores de redondeo. Con los rangos del reto no hay desbordamiento de `long`: el mayor valor posible es 1 000 000 000 · 360 · 45 = 1,62 · 10¹³, muy por debajo del máximo de `long` (≈ 9,2 · 10¹⁸).

El porcentaje se guarda como `double` solo para mostrarlo (es una razón, no un importe). La cuota se muestra redondeada y es **aproximada**; nunca se usa para decidir la categoría.

## Pruebas mínimas

| Edad | Ingresos | Gastos | Crédito | Meses | Resultado esperado |
|---|---|---|---|---|---|
| 30 | 3000000 | 1800000 | 6000000 | 12 | REVISIÓN MANUAL (≈ 41,67 %) |
| 30 | 1000000 | 0 | 350000 | 1 | APROBADA (exactamente 35 %) |
| 30 | 1000000 | 0 | 450000 | 1 | REVISIÓN MANUAL (exactamente 45 %) |
| 30 | 1000000 | 0 | 450001 | 1 | RECHAZADA (supera 45 %) |
| 17 | 1000000 | 0 | 100000 | 1 | RECHAZADA por edad |
| 30 | 1000000 | 1000000 | 100000 | 1 | RECHAZADA sin dividir |

Procesadas en una sola ejecución, el resumen esperado es: **6 evaluadas, 1 aprobada, 2 en revisión y 3 rechazadas**.

Otras pruebas:
- `meses = 0`: el dato se rechaza y se vuelve a pedir antes de evaluar.
- Finalizar de inmediato (opción `0`): los cuatro contadores quedan en cero.

## Nota

El programa no maneja entradas no numéricas (por ejemplo, letras): es una ampliación opcional del reto.