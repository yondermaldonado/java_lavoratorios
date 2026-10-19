# Reto 4 · Sistema de pedidos para un restaurante

Programa de consola en Java (`S03Reto04Restaurante`) que permite agregar productos a un pedido y, al finalizar, calcula descuento, domicilio y total.

## Menú y precios

| Opción | Producto | Precio |
|---|---|---|
| 1 | Hamburguesa | 18000 |
| 2 | Pizza | 25000 |
| 3 | Ensalada | 15000 |
| 4 | Bebida | 6000 |
| 5 | Finalizar pedido | – |

## Reglas

- **Opción inválida** (por ejemplo 7): se muestra un error y el menú se vuelve a mostrar; no cambia ningún acumulador.
- **Opción 5:** finaliza sin pedir cantidad.
- **Cantidad:** entero mayor que cero. Si no lo es (por ejemplo −2), se vuelve a pedir y el producto no se registra hasta que sea válida.
- **Unidades solicitadas:** cuenta unidades (la suma de las cantidades), no las veces que se eligió una opción.
- **Dinero:** todo con `long`.
- **Descuento (una sola tasa):** 15 % si subtotal > 150000; si no, 10 % si subtotal > 100000; si no, 0 %. Los límites son estrictos: exactamente 100000 no tiene descuento y exactamente 150000 tiene 10 %.
- **Neto:** `subtotal − descuento` (después del descuento y antes del domicilio).
- **Domicilio:** 5000 si el pedido tiene productos y `neto < 30000`. Un pedido vacío no paga domicilio.
- **Total:** `neto + domicilio`.

## Decisiones

**Ciclo:** un `while (opcion != 5)` mantiene el menú abierto. Termina cuando el cliente elige 5. Se usa `opcion = 0` como valor inicial solo para entrar al ciclo, porque 0 no es una opción del menú.

**Precio del producto:** una cadena de `if / else if` asigna el precio según la opción elegida (1 a 4).

**Opción o cantidad inválidas:** la opción solo se acepta si está entre 1 y 4 (producto) o es 5; cualquier otro valor muestra el error y no toca el pedido. La cantidad se pide con un `do-while` hasta que sea mayor que cero, y solo entonces se calcula el importe y se suman subtotal y unidades.

**Por qué se comprueba primero el descuento mayor:** un subtotal de 175000 cumple las dos condiciones (`> 150000` y `> 100000`). Si se probara primero la de 100000, se aplicaría el 10 % y nunca el 15 %. Con `else if`, solo se aplica una tasa.

**Regla de domicilio elegida: `neto < 30000`.** Se calcula sobre el neto porque es lo que el cliente realmente paga por los productos, después del descuento. El neto se calcula antes de agregar el domicilio, para no usar un total que ya contenga ese cargo.

**Por qué da el mismo resultado que usar el subtotal:** el descuento solo existe cuando el subtotal supera 100000, y en ese caso el neto es como mínimo el 85 % del subtotal (más de 85000), muy por encima de 30000. Con estas tarifas, el neto es menor que 30000 solo cuando no hay descuento, o sea cuando neto = subtotal. Para distinguir ambas reglas haría falta un descuento aplicable a pedidos pequeños, por ejemplo un 20 % para un subtotal de 35000: con la regla del subtotal no habría domicilio (35000 ≥ 30000), pero con la del neto sí (28000 < 30000).

**Pedido vacío:** el domicilio se agrega solo si `unidades > 0`, así todos los valores quedan en cero.

## Pruebas mínimas

Cada fila es un pedido nuevo.

| Productos seleccionados | Unidades | Subtotal | Descuento | Domicilio | Total |
|---|---|---|---|---|---|
| Bebida × 1 | 1 | 6000 | 0 | 5000 | 11000 |
| Ensalada × 2 | 2 | 30000 | 0 | 0 | 30000 |
| Pizza × 4 | 4 | 100000 | 0 | 0 | 100000 |
| Pizza × 6 | 6 | 150000 | 15000 | 0 | 135000 |
| Pizza × 7 | 7 | 175000 | 26250 | 0 | 148750 |
| Hamburguesa × 4 y Pizza × 2 | 6 | 122000 | 12200 | 0 | 109800 |

Otras pruebas:
- Elegir `5` al comenzar: el resumen queda todo en cero, sin domicilio.
- `opción = 7`: muestra el error y no cambia los acumuladores.
- `cantidad = −2`: se vuelve a pedir la cantidad.

## Nota

El programa no maneja entradas no numéricas (ampliación opcional), y no incluye la extensión de registrar varios clientes.