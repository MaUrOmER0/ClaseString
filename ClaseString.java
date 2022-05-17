public class ClaseString{
    public static void main(String[] args) {

        String cadenaCaracteres = "NO DEJES PARA MAÑANA LO QUE PUEDAS HACER HOY";
        System.out.println("la cadena a la que vamos a aplicar los metodos es: ");
        System.out.println(cadenaCaracteres);
        System.out.println("la cadena de caracteres tiene " + cadenaCaracteres.length() + " caracteres" );
        /**
         * lenght() - Devuelve la longitud, es decir, el numero de caracteres de la cadena encapsulada en el String.
         */
        System.out.println("la subcadena que se ubica a partir de la posicion 14 y que finaliza antes de la pocision 20 es ---> " + cadenaCaracteres.substring(14, 20) + " <----");
        /**
         * substring(posicion1,posicion2) - Devuelve la cadena de caracteres del String comprendida entre el caracter ubicado en la posicion1(inclusive),
         * hasta el caracter comprendido en la posicion2(exclusive).
         * Hay que tener en cuenta para el uso de todos los metodos de la clase String, que la primera posicion es la numero 0.
         */
        System.out.println("la subcadena -->>PUEDAS<<--- se encuentra a traves de la posicion : " + cadenaCaracteres.indexOf("PUEDAS"));
        /**
         * indexOf(subString) - Devuelve la posicion en que se encuentra la primera ocurrencia del subString transferido como argumento,
         *  dentro del String.
         */
        for (int i = 0 ; i <cadenaCaracteres.length();i++) {
            System.out.println("posicion : " + i + " caracter: " + cadenaCaracteres.charAt(i));
            /**
             * charAt(posicion) - Devuelve el char ubicado en la posicion transferida como argumento.
             */

        }


    }
    
}