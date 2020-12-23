public class JuegoFacade {
    Tablero tablero;
    Pieza pieza;

    BienvenidaJuego bienvenidaJuego;

    public JuegoFacade(){
        tablero = new Tablero();
        pieza = new Pieza();
        bienvenidaJuego = new BienvenidaJuego();

    }

    public void elegirPos(int x, int y, char figura){
        if(figura == 'a'){
            for (int i = x; i<9; i++){
                for (int j = y; j<9; j++){
                    tablero.table[i][j]=pieza.pieza_a()[i][j];
                }
            }
        } else if(figura == 'b'){
            for (int i = x; i<9; i++){
                for (int j = y; j<9; j++){
                    tablero.table[i][j]=pieza.pieza_b()[i][j];
                }
            }
        } else if(figura == 'c'){
            for (int i = x; i<9; i++){
                for (int j = y; j<9; j++){
                    tablero.table[i][j]=pieza.pieza_c()[i][j];
                }
            }
        } else if(figura == 'd'){
            for (int i = x; i<9; i++){
                for (int j = y; j<9; j++){
                    tablero.table[i][j]=pieza.pieza_d()[i][j];
                }
            }
        } else if(figura == 'e'){
            for (int i = x; i<9; i++){
                for (int j = y; j<9; j++){
                    tablero.table[i][j]=pieza.pieza_e()[i][j];
                }
            }
        } else if(figura == 'f'){
            for (int i = x; i<9; i++){
                for (int j = y; j<9; j++){
                    tablero.table[i][j]=pieza.pieza_f()[i][j];
                }
            }
        } else if(figura == 'g'){
            for (int i = x; i<9; i++){
                for (int j = y; j<9; j++){
                    tablero.table[i][j]=pieza.pieza_g()[i][j];
                }
            }
        } else if(figura == 'h'){
            for (int i = x; i<9; i++){
                for (int j = y; j<9; j++){
                    tablero.table[i][j]=pieza.pieza_h()[i][j];
                }
            }
        }
    }
}
