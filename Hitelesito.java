import javax.swing.JOptionPane;

public class Hitelesito {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Felhasználónév");
        String password = JOptionPane.showInputDialog("Jelszó");

        if(
            username != null && password != null && 
            (username.equals("BGERGO7") && password.equals("Geri2006"))
        ){
            JOptionPane.showMessageDialog(null, "Bent vagy!");
        }else{
            JOptionPane.showMessageDialog(null, "Hibás felhasználó név vagy jelszó");
        }
    }
}