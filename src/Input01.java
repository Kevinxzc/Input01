
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane,caixa de diálogo
        
        String[] acceptableValues = {"Choice 1", "Choice 2","Choice 3"};
        var string = (String)JOptionPane.showInputDialog(null,
        "Está é uma pergunta",
        "Título da caixa de diálogo",
        2,
        null,
        acceptableValues,
        acceptableValues[1]);
        
     
        

        
    }
}
