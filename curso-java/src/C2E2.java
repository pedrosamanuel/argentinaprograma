public class C2E2 {
    public static void main(String[] args){
        String frase = "yo se programar";
        String fraseDesplazada = "";

        for (int i = 0; i < frase.length();i++){
            int valorAscii = (int) frase.charAt(i);
            fraseDesplazada = fraseDesplazada + (char) (valorAscii + 2);
        }
        System.out.println(frase);
        System.out.println(fraseDesplazada);
    }
}
