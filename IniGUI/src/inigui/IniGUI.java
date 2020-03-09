package inigui;
import javax.swing.*;

public class IniGUI {

    public static void main(String[] args) {
        biodata g = new biodata();
    }
}

class biodata extends JFrame {
    final JTextField fAlamat = new JTextField(100);
    
    JLabel ljudul = new JLabel("BIODATA DIRI");
    JLabel lGambar = new JLabel(new ImageIcon(getClass().getResource(("gambar.jpg"))));
    
    JLabel lnama = new JLabel("LARRY MINION");
    JLabel lalamat = new JLabel("London, 11 Jun 2015");
    
    String[] namaAgama =
            {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);
    
    JRadioButton rbLk = new JRadioButton("L");
    JRadioButton rbPr = new JRadioButton("P");
    
    JLabel lblAlamat = new JLabel("Alamat");
    
    JButton btnEdit = new JButton("Edit");
    JButton btnSave = new JButton("Save");
    
    public biodata() {
        setTitle("BIODATA");
        setDefaultCloseOperation(3);
        setSize(270,700);
        
        setLayout(null);
        add(ljudul);
        add(lGambar);
        add(lnama);
        add(lalamat);
        add(cmbAgama);
        add(rbLk);
        add(rbPr);
        add(lblAlamat);
        add(fAlamat);
        add(btnEdit);
        add(btnSave);
        
        ljudul.setBounds(70, 10, 100, 20);
        lGambar.setBounds(20, 40, 200, 220);
        lnama.setBounds(70, 270, 100, 20);
        lalamat.setBounds(50, 300, 150, 20);
        cmbAgama.setBounds(20, 330, 200, 20);
        rbLk.setBounds(20, 360, 50, 20);
        rbPr.setBounds(120, 360, 50, 20);
        lblAlamat.setBounds(80, 390, 100, 20);
        fAlamat.setBounds(20, 410, 200, 100);
        btnEdit.setBounds(20, 520, 80, 20);
        btnSave.setBounds(120, 520, 80, 20);
        
        //pack();
        setVisible(true);
       
    }
}
