import java.awt.*;  
import java.awt.event.*; // Import needed for ActionListener

public class AWTExample1 extends Frame {
    
    AWTExample1() {  
           
        Button b = new Button("Click Me!!");  
          
        b.setBounds(100,100,80,30);  
           
        add(b);  

        
        Button exitButton = new Button("Exit");  
        exitButton.setBounds(100, 150, 80, 30);  
        add(exitButton);   

        
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); 
            }
        });

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); 
            }
        });

           
        setSize(300, 300);  

        
        setTitle("This is our basic AWT example");

          
        setLayout(null);   

       
        setVisible(true);  
    }      
}
