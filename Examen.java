class Examen {
    String primeraMayuscula(String cadena) {
        return String.valueOf(cadena.charAt(0)).toUpperCase() + cadena.substring(1);
    }

    String invertirCadena(String cadena) {
        String resultado = "";
        for (int x = cadena.length() - 1; x >= 0; x--) {
            resultado += String.valueOf(cadena.charAt(x));
        }
        return resultado;
    }

    String vocalesMayuscula(String cadena) {
        String resultado = "";
        String vocales = "aeiou";
        for (int x = 0; x < cadena.length(); x++) {
            String letra = String.valueOf(cadena.charAt(x));
            if (vocales.contains(letra.toLowerCase())) {
                letra = letra.toUpperCase();
            }
            resultado += letra;
        }
        return resultado;
    }

    void fizzBuzz() {
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0) {
                System.out.print("Fizz");
            }
            if (numero % 5 == 0) {
                System.out.print("Buzz");
            }
            if (numero % 3 != 0 && numero % 5 != 0) {
                System.out.print(numero);
            }
            System.out.print(" ");
        }
    }

    boolean palindromo(String cadena) {
        String limpia = cadena.replace(" ", "").replace(".", "").replace(",", "").toLowerCase();
        String invertida = this.invertirCadena(limpia);
        if (limpia.equals(invertida)) {
            return true;
        } else {
            return false;
        }
    }
}