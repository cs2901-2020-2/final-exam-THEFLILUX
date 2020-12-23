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
            for (int i = x; i<x+3; i++){
                for (int j = y; j<y+3; j++){
                    tablero.table[i][j]=pieza.pieza_a()[i-x][j-y];
                }
            }
        } else if(figura == 'b'){
            for (int i = x; i<x+3; i++){
                for (int j = y; j<y+3; j++){
                    tablero.table[i][j]=pieza.pieza_b()[i-x][j-y];
                }
            }
        } else if(figura == 'c'){
            for (int i = x; i<x+3; i++){
                for (int j = y; j<y+3; j++){
                    tablero.table[i][j]=pieza.pieza_c()[i-x][j-y];
                }
            }
        } else if(figura == 'd'){
            for (int i = x; i<x+3; i++){
                for (int j = y; j<y+3; j++){
                    tablero.table[i][j]=pieza.pieza_d()[i-x][j-y];
                }
            }
        } else if(figura == 'e'){
            for (int i = x; i<x+3; i++){
                for (int j = y; j<y+3; j++){
                    tablero.table[i][j]=pieza.pieza_e()[i-x][j-y];
                }
            }
        } else if(figura == 'f'){
            for (int i = x; i<x+3; i++){
                for (int j = y; j<y+3; j++){
                    tablero.table[i][j]=pieza.pieza_f()[i-x][j-y];
                }
            }
        } else if(figura == 'g'){
            for (int i = x; i<x+3; i++){
                for (int j = y; j<y+3; j++){
                    tablero.table[i][j]=pieza.pieza_g()[i-x][j-y];
                }
            }
        } else if(figura == 'h'){
            for (int i = x; i<x+3; i++){
                for (int j = y; j<y+3; j++){
                    tablero.table[i][j]=pieza.pieza_h()[i-x][j-y];
                }
            }
        }
    }
}

