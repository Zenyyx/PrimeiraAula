import static javax.swing.JOptionPane.showInputDialog; //input
import static javax.swing.JOptionPane.showMessageDialog; //output
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.String.valueOf; // ?? -> String

public class Exercicio401
{
    public static void main(String[] args) {
        int i = 10;
        int[] valN = new int[i];
        int[] valA = new int[i];
        String msg = "";
        
        for (int j = 0; j < i; j++) {
            valN[j] = receberInt("Digite um Valor");
        }
        
        for (int j = 0; j < i; j++) { 
            if ((j % 2) == 0){
                valA[j] = valN[j] * 5;
            }
            else
            {
                valA[j] = valN[j] + 5;
            }
        }
        
        for (int j = 0; j < i; j++) {
            msg += "Indice: " + j + " Array A: " + valN[j] + " Array B: " + valA[j] + "\n";
        }
        
        exibir(msg);
        
        }
    
    public static int receberInt(String mensagemProUsuario) {
        String aux = showInputDialog(mensagemProUsuario);
        try {
            return parseInt(aux);
        } catch (Exception e) {
            System.out.print("Você digitou algo errado :(");
            return 0;
        }
    }
      public static void exibir(String mensagemProUsuario) {
        showMessageDialog(null, mensagemProUsuario);
    }
}