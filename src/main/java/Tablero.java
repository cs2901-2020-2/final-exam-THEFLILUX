public class Tablero {
    int[][] table = new int[9][9];

    public Tablero(){
        for (int i =0; i<9; i++){
            for (int j =0; j<9; j++){
                table[i][j]=0;
            }
        }
    }
}
