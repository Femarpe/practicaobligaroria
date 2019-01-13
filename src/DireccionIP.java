import java.util.Scanner;

public class DireccionIP  {
    int ip [] = new int [4];
    String ipp [] = new String[4];

    public DireccionIP (String stringip){
        ipp = stringip.split(".");
        for (int i = 0; i <4 ; i++) {
            ip [i] = Integer.parseInt(ipp [i]);
        }
    }

    public DireccionIP ( int intip1,int intip2,int intip3,int intip4){
        ip [0] = intip1;
        ip [1] = intip2;
        ip [2] = intip3;
        ip [3] = intip4;
    }

    public DireccionIP ( int intip []){
        ip [0] = intip [0];
        ip [1] = intip [1];
        ip [2] = intip [2];
        ip [3] = intip [3];

    }
}
