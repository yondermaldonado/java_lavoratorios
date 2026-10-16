public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Escribir la regla de acceso en lenguaje natural.
        // Regla: ser mayor de edad (18 o más), tener membresía o invitación
        // y no estar bloqueado.

        // TODO 2: Construir puedeEntrar combinando edad, membresía, invitación y bloqueo.
        boolean puedeEntrar = edad >= 18 && (esMiembro || tieneInvitacion) && !bloqueado;

        // TODO 3: Mostrar "Acceso permitido" o "Acceso denegado" con if/else.
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        // TODO 4: Probar los tres casos mínimos del README; las otras combinaciones son opcionales.
        // Se cambian las cuatro variables del inicio y se ejecuta una vez por fila:
        // | edad | esMiembro | tieneInvitacion | bloqueado | Salida           |
        // | 18   | false     | true            | false     | Acceso permitido |
        // | 17   | false     | true            | false     | Acceso denegado  |
        // | 18   | false     | true            | true      | Acceso denegado  |

        // TODO 5: Explicar por qué el bloqueo impide siempre el acceso.
        // !bloqueado está unido con && al resto. Si bloqueado es true, !bloqueado es false
        // y una expresión con && necesita que todas sus partes sean true,
        // así que puedeEntrar queda false aunque haya invitación.

        // TODO 6 (opcional): Colocar un breakpoint en if y observar puedeEntrar antes de elegir la rama.
    }
}