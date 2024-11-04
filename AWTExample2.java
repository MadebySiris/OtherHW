import java.awt.*;    
import java.awt.event.*; // Import needed for ActionListener and WindowAdapter

public class AWTExample2 extends Frame {
    // initializing using constructor  
    AWTExample2() {  
        // creating a Frame  
        Frame f = new Frame();  

        // creating a Label  
        Label l = new Label("Employee id:");   

        // creating a Button  
        Button b = new Button("Submit");  

        // creating a TextField  
        TextField t = new TextField();  

        // setting position of above components in the frame  
        l.setBounds(20, 80, 80, 30);  
        t.setBounds(20, 100, 80, 30);  
        b.setBounds(100, 100, 80, 30);  

        // adding components into frame    
        f.add(b);  
        f.add(l);  
        f.add(t);  

        // Change 1: Create an "Exit" button
        Button exitButton = new Button("Exit");  
        exitButton.setBounds(200, 100, 80, 30);  
        f.add(exitButton); // Add "Exit" button to the frame  

       
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        });

       
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); 
            }
        });

          
        f.setSize(400, 300);  

          
        f.setTitle("Employee info");   

          
        f.setLayout(null);   

      
        f.setVisible(true);  
    }    
 
}
