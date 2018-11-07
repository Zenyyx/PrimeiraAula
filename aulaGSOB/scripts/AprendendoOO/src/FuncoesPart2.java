import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Float.parseFloat;

public class FuncoesPart2{
    public static void main(String[] args) {
        int n1, n2, n3, n4, n5, n6, n7;
        
        n1 = ReceberInt("Seu primeiro número: ");
        n2 = ReceberInt("Seu segundo número: ");
        n3 = ReceberInt("Seu terceiro número: ");
        n4 = ReceberInt("Seu quarto número: ");
        n5 = ReceberInt("Seu quinto número: ");
        n6 = ReceberInt("Seu sexto número: ");
        n7 = ReceberInt("Seu sétimo número: ");
        
        Exibir("Número 1: " + n1 + "\n" +
                "Número 2: " + n2 + "\n" +
                "Número 3: " + n3 + "\n" +
                "Número 4: " + n4 + "\n" +
                "Número 5: " + n5 + "\n" +
                "Número 6: " + n6 + "\n" +
                "Número 7: " + n7 + "\n");
        
    } // Main
    
    public static int ReceberInt(String msg){
        try {
            return parseInt(showInputDialog(msg));
        } catch (Exception e) {
        }
        
        return 0;
         
    }
    
    public static void Exibir(String msg){
        showMessageDialog(null, msg);
    }
    
} // Class