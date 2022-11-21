/**
 *
 * @author Jony
 */
public class ProyectoFuturo {
    public static void main(String[] args) {
        System.out.println("Estudiante" + args[0] + " : ");
        System.out.println(veredicto(args[3],args[2]));
    }
    public static String veredicto(String valor1, String valor2){
        if (valor1.equals(valor2)) {
            return "Bien. Debes esforzarte un poco mas";
        }
        if (Integer.valueOf(valor1)< Integer.valueOf(valor2)){
            return "Debes dedicar mas tiempo de estudio";
    }
        return "Ideal. Continúa trabajando asi";
    }
}
