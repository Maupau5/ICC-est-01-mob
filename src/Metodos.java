public class Metodos {
    public Metodos() {
        System.out.println("Se creó la clase Métodos");
    }

    public int[] sortByBubble(int[] arreglo) {
        int tamanio = arreglo.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }

    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }
    }

    public int[] sortByBubbleDes(int[] arregloD) {
        int tamanio = arregloD.length;
        for (int i = 0; i < tamanio - 1; i++) {
            for (int j = i + 1; j < tamanio; j++) {
                if (arregloD[i] < arregloD[j]) {
                    int aux = arregloD[i];
                    arregloD[i] = arregloD[j];
                    arregloD[j] = aux;
                }
            }
        }
        return arregloD;
    }

    public void printArregloDes(int[] arregloD) {
        for (int elemento : arregloD) {
            System.out.println(elemento);
        }
    }

    public String[] sortByBubblePalabras(String[] palabras) {
        int tamanio = palabras.length;

        for (int i = 0; i < tamanio - 1; i++) { // Corrección: iterar hasta tamanio - 1
            for (int j = i + 1; j < tamanio; j++) { // Corrección: incrementar j
                if (palabras[i].compareToIgnoreCase(palabras[j]) > 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        return palabras;
    }

    public void printArreglo(String[] arreglo) {
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
    }
}