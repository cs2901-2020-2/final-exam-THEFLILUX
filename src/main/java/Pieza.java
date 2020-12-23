public class Pieza {
    char[] a = new char[8];

    public Pieza(){
        a[0]='a';
        a[1]='b';
        a[2]='c';
        a[3]='d';
        a[4]='e';
        a[5]='f';
        a[6]='g';
        a[7]='h';
    }

    public int[][] pieza_a(){
        int[][] bloque_a = new int[3][3];
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if((i==0 && j==0) || (i==1 && j==0) || (i==2 && j==0) || (i==2 && j==1) || (i==2 && j==2)){
                    bloque_a[i][j]=1;
                } else{
                    bloque_a[i][j]=0;
                }
            }
        }

        return bloque_a;
    }

    public int[][] pieza_b(){
        int[][] bloque_b = new int[3][3];
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if((i==0 && j==0) || (i==0 && j==1) || (i==0 && j==2) || (i==1 && j==2) || (i==2 && j==2)){
                    bloque_b[i][j]=1;
                } else{
                    bloque_b[i][j]=0;
                }
            }
        }

        return bloque_b;
    }

    public int[][] pieza_c(){
        int[][] bloque_c = new int[3][3];
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if((i==0 && j==0) || (i==0 && j==1) || (i==0 && j==2)){
                    bloque_c[i][j]=1;
                } else{
                    bloque_c[i][j]=0;
                }
            }
        }

        return bloque_c;
    }

    public int[][] pieza_d(){
        int[][] bloque_d = new int[3][3];
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if((i==0 && j==1) || (i==1 && j==1) || (i==2 && j==1)){
                    bloque_d[i][j]=1;
                } else{
                    bloque_d[i][j]=0;
                }
            }
        }

        return bloque_d;
    }

    public int[][] pieza_e(){
        int[][] bloque_e = new int[3][3];
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if((i==0 && j==0) || (i==1 && j==1) || (i==2 && j==1) || (i==2 && j==0) || (i==2 && j==2)){
                    bloque_e[i][j]=1;
                } else{
                    bloque_e[i][j]=0;
                }
            }
        }

        return bloque_e;
    }

    public int[][] pieza_f(){
        int[][] bloque_f = new int[3][3];
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if((i==0 && j==0) || (i==0 && j==1) || (i==0 && j==2) || (i==1 && j==1) || (i==2 && j==1)){
                    bloque_f[i][j]=1;
                } else{
                    bloque_f[i][j]=0;
                }
            }
        }

        return bloque_f;
    }

    public int[][] pieza_g(){
        int[][] bloque_g = new int[3][3];
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if((i==0 && j==0) || (i==1 && j==0) || (i==2 && j==0) || (i==2 && j==1)){
                    bloque_g[i][j]=1;
                } else{
                    bloque_g[i][j]=0;
                }
            }
        }

        return bloque_g;
    }

    public int[][] pieza_h(){
        int[][] bloque_h = new int[3][3];
        for (int i =0; i<3; i++){
            for (int j =0; j<3; j++){
                if((i==0 && j==1) || (i==1 && j==1) || (i==2 && j==1) || (i==0 && j==2)){
                    bloque_h[i][j]=1;
                } else{
                    bloque_h[i][j]=0;
                }
            }
        }

        return bloque_h;
    }

}
