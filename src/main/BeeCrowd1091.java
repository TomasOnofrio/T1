package main;

import java.util.*;

public class beeCrowd1091 {
    public void calculaPosicao(int k, int n, int m, int x, int y){
        int constant = k;
        while(constant > 0){
            int first = n, second = m, third = x, forth = y;

            for(int i= 0; i < constant; i++){
                int dx = third - first, dy = forth - second;

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
        }
    }
}