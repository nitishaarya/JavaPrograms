import javax.swing.JOptionPane;
public class project1 {
    public static void main(String[] aegs)
    {
        String name = JOptionPane.showInputDialog("Enter you name");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null, "You are "+age +" years old ");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm"));
        JOptionPane.showMessageDialog(null, "You are "+height+ "cm tall ");




    }
    
}
