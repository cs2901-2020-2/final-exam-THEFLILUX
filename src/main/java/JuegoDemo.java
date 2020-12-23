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
            juegoFacade.elegirPos(1,3,'a');
        } else{
            logger.info("Vuelve pronto!");
            System.exit(1);
        }
    }
}
