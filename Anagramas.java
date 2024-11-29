public class Anagramas {

    public static boolean sonAnagramas(String palabra1, String palabra2) {
        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        char[] arr1 = new char[palabra1.length()];
        char[] arr2 = new char[palabra2.length()];

        for (int i = 0; i < palabra1.length(); i++) {
            arr1[i] = palabra1.charAt(i);
            arr2[i] = palabra2.charAt(i);
        }

        for (int i = 0; i < arr1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr2[j] = 0;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palabra1 = "listen";
        String palabra2 = "silent";

        if (sonAnagramas(palabra1, palabra2)) {
            System.out.println(palabra1 + " y " + palabra2 + " son anagramas.");
        } else {
            System.out.println(palabra1 + " y " + palabra2 + " no son anagramas.");
        }
    }
}
