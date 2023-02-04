public class Main {

    public static void main(String[] args) {
        Examen exam = new Examen();
        String cadenaConPrimeraMayuscula = exam.primeraMayuscula("anita lava la tina");
        System.out.println(cadenaConPrimeraMayuscula);
        String cadenaInvertida = exam.invertirCadena("anita lava la tina");
        System.out.println(cadenaInvertida);
        String cadenaConVocalesEnMayuscula = exam.vocalesMayuscula("Hasta luego cocodrilo");
        System.out.println(cadenaConVocalesEnMayuscula);
        exam.fizzBuzz();
        System.out.println("");
        String prueba = "Anita lava la tina";
        if (exam.palindromo(prueba)) {
            System.out.println("Es palíndromo");
        } else {
            System.out.println("No es palíndromo");
        }
    }
}