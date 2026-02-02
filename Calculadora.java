package Z_EjerciciosControl;
import java.io.IOException;
public class Calculadora {
    public static void main(String[] args) throws IOException {
        Teclado t=new Teclado();
        int resultado;
        System.out.println("Dar num 1:");
        int num1= t.leerInt();
        System.out.println("Dar num 2:");
        int num2= t.leerInt();
        System.out.println("Sumar(+), restar(-), Multiplicar(*), dividir (/) ");
        char operacion= t.leerChar();
        switch (operacion) {
            case '+': resultado=num1+num2;
                break;
            case '-': resultado=num1-num2;
                break;
            case '*': resultado=num1*num2;
                break;
            case '/': if (num2!=0)
                resultado=num1/num2;
            else
                resultado=Integer.MAX_VALUE;
            break;
            default:
                resultado=Integer.MAX_VALUE;
        }
        if (resultado!=Integer.MAX_VALUE)
        System.out.println("Resultado:" + resultado);
        else
            System.out.println("SyntaxError");
    }
}

