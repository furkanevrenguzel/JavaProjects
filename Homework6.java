package HomeWorks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Homework6 extends JPanel {

    Connection con = null;
    int n = 0;
    public Homework6(){

        String[] BookNames = {"The Great Gatsby (Paperback)", "Divergent (Divergent, #1)", "The Fault in Our Stars (Hardcover)", "Insurgent (Divergent, #2) ", "Life of Pi (Paperback)",
            "Gone Girl (Paperback)", "Allegiant (Divergent, #3)", "Wild: From Lost to Found on the Pacific Crest Trail (Hardcover)",
            "The Catcher in the Rye (Paperback)", "Slaughterhouse-Five (Paperback)", "The Hobbit (Paperback)", "Looking for Alaska (Paperback)", "The Hunger Games (The Hunger Games, #1)", "The Ocean at the End of the Lane (Hardcover)",
            "The Book Thief (Hardcover) "};

        String[] Authors = {"F. Scott Fitzgerald", "Veronica Roth", "John Green", "Veronica Roth",
                "Yann Martel", "Gillian Flynn", "Veronica Roth", "Cheryl Strayed", "J.D. Salinger",
                "Kurt Vonnegut", "J.R.R. Tolkien", "John Green", "Suzanne Collins", "Neil Gaiman", "Markus Zusak"};

        setLayout(new BorderLayout());
        JPanel north = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel center = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel south = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JTextField jTextField = new JTextField(13);

        JButton button = new JButton("Search");

        JLabel jLabel = new JLabel("Enter Book Number");

        JTextArea jTextArea = new JTextArea(15,35);
        jTextArea.setEditable(false);

//        JScrollPane scroll = new JScrollPane (jTextArea,
//                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        north.add(jTextField);
        north.add(button);
        center.add(jLabel);
        south.add(jTextArea);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);

        try {

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            con = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net/sql12267239", "sql12267239", "uVRl6lrC6X");

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            con = DriverManager.getConnection("jdbc:mysql://den1.mysql2.gear.host/mouaz", "mouaz", "Hj0l63_G17P!");

            Statement s = con.createStatement();
            String mySql = "CREATE TABLE IF NOT EXISTS Book" +
                    "(id INTEGER," +
                    "name TEXT," +
                    "author TEXT)";
            s.executeUpdate(mySql);


            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Book");
            while (rs.next()) {
                n++;
            }

            if(n == 0){
                for(int i = 0; i < 15; i++){
                    String s1 = "INSERT INTO `Book` (`id`, `name`, author) VALUES (?, ?, ?);";
                    PreparedStatement pstmt = con.prepareStatement(s1);
                    pstmt.setInt(1, i);
                    pstmt.setString(2, BookNames[i]);
                    pstmt.setString(3, Authors[i]);
                    pstmt.execute();
                }
            }


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{
                        int num = Integer.parseInt(jTextField.getText());
                        if(num > n){
                            jTextArea.setText("number is out of range\n\n");
                        }
                        else {
                            PreparedStatement rps = con.prepareStatement("select * from Book where id=?");
                            rps.setInt(1, num);
                            ResultSet rrs = rps.executeQuery();

                            while (rrs.next()){
                                jTextArea.setText("Book id : " + rrs.getInt("id") + ", \nBook Name : " + rrs.getString("name") + ", \nBook Author : " + rrs.getString("author")+ "\n\n");
                            }
                        }

                    }catch (NumberFormatException ex){
                        jTextArea.setText("Wrong input\n");
                    } catch (SQLException e1) {
                        System.err.println("Exception: " + e1.getMessage());
                    }
                    jTextField.setText("");
                }
            });

        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Homework 6");
        frame.getContentPane().add(new Homework6());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 350);
        frame.setVisible(true);
    }
}