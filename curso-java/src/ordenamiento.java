public class ordenamiento {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        sortBubble();
        long  endTime = (System.nanoTime() - startTime);
        System.out.println(endTime);
        long startTime1 = System.nanoTime();
        betterBubble();
        long  endTime1 = (System.nanoTime() - startTime1) ;
        System.out.println(endTime1);

    }
    public static void sortBubble(){
        int aux;
        int ordenados[] = {9,13,22,4,15,3,17,2,1};
        for(int i = ordenados.length; i > 0;i--) {
            for (int j = ordenados.length-1 ; j > 0;j--){
                if (ordenados[j] < ordenados[j - 1]) {
                    aux = ordenados[j];
                    ordenados[j] = ordenados[j - 1];
                    ordenados[j - 1] = aux;
                }
            }
        }
        int n = 0;
        while(n < ordenados.length){
            System.out.println(ordenados[n]);
            n++;
        }
    }
    public static void betterBubble(){
        int aux;
        int ordenados[] = {9,13,22,4,15,3,17,2,1};
        for(int i = 0; i < ordenados.length; i++){
            for(int j = i; j< ordenados.length;j++){
                if (ordenados[i] > ordenados[j]) {
                    aux = ordenados[j];
                    ordenados[j] = ordenados[i];
                    ordenados[i] = aux;
                }
            }

        }
        int n = 0;
        while (n<ordenados.length){
            System.out.println(ordenados[n]);
            n++;
        }
    }


}

