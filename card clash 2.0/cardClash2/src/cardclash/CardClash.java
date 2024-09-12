
package cardclash;


public class CardClash {

    public static void main(String[] args) {
       introFrame intro = new introFrame();
       intro.setVisible(true);//This is to make the login pop up 
       intro.pack();
       intro.setLocationRelativeTo(null);//This places it in the center
       intro.setSize(900, 600);  // setSize
       intro.setResizable(false);  // Prevent resizing by the user
       intro.setLocationRelativeTo(null); 
       
      
      
    }
    
}
