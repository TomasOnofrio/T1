package trabalho;

import java.util.*;

public class BeeCrowd1091 {
    public string calculaPosicao(int k, int n, int m, int x, int y){
        int constant = k;
        while(constant > 0){
            int first = n, second = m, third = x, forth = y;
            string coord = "";

            for(int i= 0; i < constant; i++){
                int dx = third - first, dy = forth - second;

                if(dx == 0 || dy == 0){
                    coord = "divisa";
                } else if (dx > 0 && dy > 0){
                    coord = "NE";
                }else if (dx > 0){
                    coord = "SE";
                }else if (dy > 0){
                    coord = "NO";
                }else{
                    coord = "SO";
                }
            }
            return coord;
        }
    }
}