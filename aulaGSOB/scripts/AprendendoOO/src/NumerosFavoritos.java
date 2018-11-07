import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Float.parseFloat;
import static java.lang.String.valueOf;

public class NumerosFavoritos{
    public static void main(String[] args) {
        int[] n = new int[7];
        String msg = "";
        
        for(int i = 0; i < n.length; i++){
            n[i] = ReceberInt("Insira o " + (i+1) + " número: ");
        }
       
        for (int i = 0; i < n.length; i++) {
            msg += "Número favorito: " + (i + 1) + ": " + n[i] + "\n";
        }
        
        Exibir(msg);
        
        
        
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