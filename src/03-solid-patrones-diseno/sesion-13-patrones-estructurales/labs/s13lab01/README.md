# Lab 01 · Facade · Préstamo bibliotecario · 15 minutos

Una biblioteca debe comprobar membresía y disponibilidad antes de registrar el préstamo y emitir un recibo simulado.

## Pasos para completar la actividad

1. Abre **S13Lab01FacadeMain.java**. Cada llamada a ejecutar crea una biblioteca nueva con un único ejemplar. Los argumentos son `disponible, vigente`, en ese orden.
2. Predice las tres situaciones: ejemplar disponible con membresía vigente; ejemplar no disponible; membresía vencida. Ejecuta **Run → S13Lab01FacadeMain** y compara con la salida.
3. Abre PrestamoFacade.java. Sigue prestar: primero verifica membresía, luego reserva el ejemplar y finalmente registra y emite recibo. Identifica qué clase realiza cada tarea.
4. En Debug, coloca un breakpoint en prestar. Ejecuta los tres casos: en los dos rechazados, registrar y emitir no deben ejecutarse. Comprueba los contadores en la consola.
5. Cambia únicamente la tercera llamada `ejecutar(true, false)` por `ejecutar(true, true)`. Predice y ejecuta: las últimas dos líneas deben pasar a `Prestamo registrado` y `Prestamos=1 recibos=1 disponible=false`.
6. Guarda las salidas anterior y nueva. Explica por qué la fachada coordina servicios en lugar de guardar todos sus contadores dentro de sí misma. ¿Aportaría valor si el préstamo requiriera una única operación sencilla?

## Salida inicial esperada

```text
Prestamo registrado
Prestamos=1 recibos=1 disponible=false
Ejemplar no disponible
Prestamos=0 recibos=0 disponible=false
Membresia vencida o ausente
Prestamos=0 recibos=0 disponible=true
```

[Volver a la sesión](../../README.md) · [Abrir el programa](S13Lab01FacadeMain.java)

Paso 1 – Cómo funciona ejecutar
Cada llamada crea una biblioteca nueva con un solo ejemplar. Los argumentos son disponible, vigente.

Paso 2 – Predicción y salida del Main original

Caso	Predicción
(true, true)	Préstamo registrado, 1 préstamo y 1 recibo, ejemplar ya no disponible
(false, true)	Ejemplar no disponible, sin préstamos ni recibos
(true, false)	Membresía vencida, sin préstamos ni recibos, ejemplar sigue disponible
text
Prestamo registrado
Prestamos=1 recibos=1 disponible=false
Ejemplar no disponible
Prestamos=0 recibos=0 disponible=false
Membresia vencida o ausente
Prestamos=0 recibos=0 disponible=true

Paso 3 – Quién hace cada tarea en prestar

Membresia verifica que la membresía esté vigente.
Catalogo reserva el ejemplar con reservar().
RegistroPrestamos registra el préstamo.
EmisorRecibo emite el recibo.
PrestamoFacade solo coordina el orden: primero valida, luego reserva y al final registra y emite.

Paso 4 – Debug
En los dos casos rechazados, prestar termina con return antes de llegar a registro.registrar() y recibos.emitir(). Por eso los contadores quedan en 0. Fíjate en que disponible=true en el tercer caso significa que el ejemplar no se reservó, porque la membresía se valida primero.

Paso 5 – Salida con ejecutar(true, true) en la tercera llamada

text
Prestamo registrado
Prestamos=1 recibos=1 disponible=false
Ejemplar no disponible
Prestamos=0 recibos=0 disponible=false
Prestamo registrado
Prestamos=1 recibos=1 disponible=false

Las últimas dos líneas pasan a Prestamo registrado y Prestamos=1 recibos=1 disponible=false, como pide el README.

Paso 6 – Preguntas conceptuales
La fachada coordina servicios y no guarda sus contadores porque cada clase tiene una sola responsabilidad: RegistroPrestamos cuenta préstamos, EmisorRecibo cuenta recibos y Catalogo maneja la disponibilidad. La fachada solo ofrece una interfaz simple, prestar, y oculta el orden y las reglas entre los subsistemas. Si el cliente tuviera que llamar a cada clase, repetiría esa lógica en todos los sitios.

Si el préstamo requiriera una única operación sencilla, la fachada no aportaría valor: sería una clase que solo delega una llamada, y el cliente podría usar el servicio directamente.
