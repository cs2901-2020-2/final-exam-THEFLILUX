import java.util.Scanner;
import java.util.logging.Logger;

public class JuegoDemo {

    static final Logger logger = Logger.getLogger(JuegoDemo.class.getName());

    public static void main(String[] args){
        JuegoFacade juegoFacade = new JuegoFacade();

        logger.info("Ingrese (1) para iniciar una nueva partida o cualquier otra tecla para salir: ");
        Scanner myObj = new Scanner(System.in);
        String opcion = myObj.nextLine();

        if(opcion == "1"){
            juegoFacade.elegirPos(0,0,'a');
            juegoFacade.elegirPos(1,0,'b');
            juegoFacade.elegirPos(2,1,'c');
            juegoFacade.elegirPos(3,1,'d');
            juegoFacade.elegirPos(4,0,'e');
            juegoFacade.elegirPos(5,0,'f');
            juegoFacade.elegirPos(6,1,'g');
            juegoFacade.elegirPos(5,1,'h');
        } else{
            logger.info("Vuelve pronto!");
            System.exit(1);
        }
    }
}
