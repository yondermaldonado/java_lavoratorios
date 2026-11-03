# Lab 00 · Adapter · Duración de citas · 12 minutos

La aplicación consulta minutos, pero una biblioteca existente entrega segundos. Integra los contratos sin modificar el proveedor.

## Pasos para completar la actividad

1. Abre **S13Lab00AdapterMain.java**. El arreglo duracionesSegundos contiene 0, 2700 y 5400 segundos. Anota cuántos minutos esperas para cada valor.
2. Ejecuta **Run → S13Lab00AdapterMain** y compara con la salida de abajo. El caso -1 debe mostrar un rechazo, sin convertir la duración.
3. Abre DuracionCita.java, BibliotecaSegundos.java y AdaptadorDuracion.java, en ese orden. Identifica el contrato en minutos, el proveedor en segundos y la clase que traduce.
4. En el Main, cambia el arreglo a `{0, 2700, 5400, 61}`. Antes de ejecutar, predice si 61 segundos producirá 1 o más de 1 minuto. Ejecuta: debe añadirse `61 s = 1.0166666666666666 min` antes del rechazo.
5. Coloca un breakpoint en consultarMinutos y ejecuta en Debug. Inspecciona el valor de obtenerSegundos y la división entre 60.0. Explica qué se perdería si se dividieran dos enteros entre 60.
6. Guarda la salida y responde en una frase: ¿qué tendría que cambiar el cliente si no existiera el adaptador? ¿Sería necesario si la biblioteca ya devolviera minutos?

## Salida inicial esperada

```text
0 s = 0.0 min
2700 s = 45.0 min
5400 s = 90.0 min
Duracion negativa rechazada
```

[Volver a la sesión](../../README.md) · [Abrir el programa](S13Lab00AdapterMain.java)

Paso 1 – Predicción

Segundos	Minutos esperados
0	           0.0
2700	       45.0
5400	       90.0

Paso 2 – Salida del Main original

0 s = 0.0 min
2700 s = 45.0 min
5400 s = 90.0 min
Duracion negativa rechazada

Paso 3 – Los tres roles

DuracionCita: el contrato que espera la aplicación (target), con consultarMinutos().
BibliotecaSegundos: el proveedor existente (adaptee), que entrega segundos y no se modifica.
AdaptadorDuracion: el que traduce. Implementa DuracionCita, recibe la biblioteca por constructor y convierte obtenerSegundos() / 60.0.

Paso 4 – Predicción y salida con {0, 2700, 5400, 61}

0 s = 0.0 min
2700 s = 45.0 min
5400 s = 90.0 min
61 s = 1.0166666666666666 min
Duracion negativa rechazada

Paso 5 – Debug y la división entre enteros
En el breakpoint de consultarMinutos, obtenerSegundos() vale 61 y la división se hace entre int y double (60.0). Eso promueve el entero a double y conserva los decimales.

Si se dividieran dos enteros (61 / 60), Java haría división entera y daría 1: se perdería la parte fraccionaria (los 1.0166 minutos), y duraciones menores de 60 s, como 30 s, darían 0 minutos.

Paso 6 – Pregunta conceptual
Sin el adaptador, cada cliente tendría que depender de BibliotecaSegundos y hacer la conversión de segundos a minutos por su cuenta, repitiendo esa lógica en cada sitio. Si la biblioteca ya devolviera minutos con la misma firma que DuracionCita, el adaptador no sería necesario, porque los contratos ya serían compatibles.