import static javax.swing.JOptionPane.showMessageDialog; //Exibir Mensagem
import static javax.swing.JOptionPane.showInputDialog; //Receber dados do usuario
import static java.lang.Integer.parseInt; 
import static java.lang.Float.parseFloat;

public class AprendendoFuncoes {
    public static void main(String[] args) {
        int n1 = parseInt(showInputDialog("Digite o primeiro número 1: "));
        int n2 = parseInt(showInputDialog("Digite o primeiro número 2: "));
        int resultado = calculaSoma(n1, n2);
        showMessageDialog(null, resultado);
        
    }
    
    public static int calculaSoma(int a, int b){
     int soma = a + b;
     return soma;
    }
}