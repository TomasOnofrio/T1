package main;

import java.util.*;

public class beeCrowd1091 {
    public void calculaPosicao(){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, digite a constante");
        int k = in.nextInt();
        while(k > 0){
            Scanner on = new Scanner(System.in);
            System.out.println("Por favor, digite a primeira coordenada");
            int n = in.nextInt();
            Scanner en = new Scanner(System.in);
            System.out.println("Por favor, digite a segunda coordenada");
            int m = in.nextInt();

            for(int i= 0; i < k; i++){
                Scanner an = new Scanner(System.in);
                System.out.println("Por favor, digite a pen´ltima coordenada");
                int x = an.nextInt();
                Scanner un = new Scanner(System.in);
                System.out.println("Por favor, digite a ultima coordenada");
                int y = un.nextInt();

                int dx = x -n, dy = y - n;

                if(dx == 0 || dy == 0){
                    System.out.println("divisa");
                } else if (dx > 0 && dy > 0){
                    System.out.println("NE");
                }else if (dx > 0){
                    System.out.println("SE");
                }else if (dy > 0){
                    System.out.println("NO");
                }else{
                    System.out.println("SO");
                }
            }
            k = in.nextInt();
        }
    }
}