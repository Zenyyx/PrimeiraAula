import static javax.swing.JOptionPane.showInputDialog; //input
import static javax.swing.JOptionPane.showMessageDialog; //output
import static java.lang.Integer.parseInt; //String -> int
import static java.lang.String.valueOf; // ?? -> String

public class Exercicio402
{
    public static void main(String[] args) 
    {
        int i = 5;
        float soma = 0f;
        float[] valN = new float[i];
        
        for (int j = 0; j < i; j++) {
            valN[j] = receberInt("Digite um Valor");
        }
        
        for (int j = 0; j < i; j++) {
            if ((valN[j] % 2) != 0) {
                soma += valN[j];
            }
            
        }
        exibir("A soma dos numero impares é: " + soma);
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