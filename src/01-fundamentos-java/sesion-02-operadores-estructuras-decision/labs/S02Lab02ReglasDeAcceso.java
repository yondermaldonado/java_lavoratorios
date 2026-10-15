public class S02Lab02ReglasDeAcceso {
    public static void main(String[] args) {
        int edad = 18;
        boolean esMiembro = false;
        boolean tieneInvitacion = true;
        boolean bloqueado = false;

        // TODO 1: Escribir la regla de acceso en lenguaje natural.
        //regla: ser mayor de edad, tener membresía o invitación y no estar bloqueado.
        // TODO 2: Construir puedeEntrar combinando edad, membresía, invitación y bloqueo.
        boolean puedeEntrar = (edad >= 18) && (esMiembro || tieneInvitacion) && !bloqueado;
        // TODO 3: Mostrar "Acceso permitido" o "Acceso denegado" con if/else.
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        // TODO 4: Probar los tres casos mínimos del README; las otras combinaciones son opcionales.
        // | 18 | false | true | false | Acceso permitido |
        //| 17 | false | true | false | Acceso denegado |
        //| 18 | false | true | true | Acceso denegado |
        edad = 18;
        esMiembro = false;
        tieneInvitacion = true;
        bloqueado = false;
        puedeEntrar = (edad >= 18) && (esMiembro || tieneInvitacion) && !bloqueado;
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }

        edad = 17;
        esMiembro = false;
        tieneInvitacion = true;
        bloqueado = false;
        puedeEntrar = (edad >= 18) && (esMiembro || tieneInvitacion) && !bloqueado;
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }  

        edad = 18;
        esMiembro = false;
        tieneInvitacion = true;
        bloqueado = true;
        puedeEntrar = (edad >= 18) && (esMiembro || tieneInvitacion) && !bloqueado;
        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        // TODO 5: Explicar por qué el bloqueo impide siempre el acceso.
        // El bloqueo impide siempre el acceso porque la expresión !bloqueado es false, lo que hace que toda la expresión sea false.
        // TODO 6 (opcional): Colocar un breakpoint en if y observar puedeEntrar antes de elegir la rama.
    }   
}
