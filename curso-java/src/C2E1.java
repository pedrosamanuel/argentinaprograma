public class C2E1 {
    public static void main(String[] args){
apariciones();
ordenamiento();
sumatoriaMayorA();
    }


public static void apariciones(){
    String myStr = "argentina programa";
    char myChar = 'a';
    int cont = 0;
    for (int indice = 0;indice<myStr.length();indice++){
        if ( myStr.charAt(indice) == myChar){
            cont ++;
        }
    }
    System.out.println( myChar  + " se repite " + cont + " veces");
}
public static void ordenamiento(){
        int nro1 = 8;
        int nro2 = 16;
        int nro3 = 4;
        int aux;
        int ordenados[] = {nro1,nro2,nro3};
        for(int i = ordenados.length; i > 0;i--) {
            for (int j = ordenados.length-1 ; j > 0;j--){
            if (ordenados[j] < ordenados[j - 1]) {
                aux = ordenados[j];
                ordenados[j] = ordenados[j - 1];
                ordenados[j - 1] = aux;
            }
            }
        }
    System.out.println("---------------");
        System.out.println("El vector ordenado de manera creciente es: ");
        for (int n = 0 ; n<ordenados.length; n++){
            System.out.println(ordenados[n]);
        }
        }
public static void sumatoriaMayorA(){
        int vector[] = {2,1,5,3,10,8};
        int pivot = 7;
        int aux = 0;
        for (int i = 0; i < vector.length; i++){
            if (vector[i]>pivot){
                aux = aux + vector[i];
            }
        }
    System.out.println("---------------");
        System.out.println("la sumatoria es : " + aux);
}

}

