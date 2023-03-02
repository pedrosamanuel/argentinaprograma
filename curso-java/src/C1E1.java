public class C1E1 {
    public static void main(String[] args) {

        int inicio = 5;
        int finals= 10;
        int cont = inicio;

        System.out.println("Los números comprendidos son: ");

        while(cont <= finals){
            System.out.println(cont);
            cont = cont + 1;
        }
        cont = inicio;
        System.out.println("Los pares son: ");
        while(cont <= finals){
            if(cont % 2 == 0){
                System.out.println(cont);
            }
            cont++;
        }
        System.out.println("Tu decision es: ");
        String decision = "impar";
        cont = inicio;
        if(decision == "par"){
            while(cont <= finals){
                if(cont % 2 == 0){
                    System.out.println(cont);
                }
                cont++;
            }
        } else if (decision == "impar"){
            while(cont <= finals){
                if(cont % 2 == 1){
                    System.out.println(cont);
                }
                cont++;
            }
        }
        System.out.println("Los pares al revés son: ");
        for(cont=finals;cont>=inicio;cont--){
            if(cont % 2 == 0){
                System.out.println(cont);
            }
        }

    }
}