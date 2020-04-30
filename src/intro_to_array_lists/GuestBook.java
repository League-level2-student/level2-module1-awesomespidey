package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) {
		  new GuestBook().createUI();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	ArrayList<String> guest = new ArrayList<String>();
	
 JFrame frame = new JFrame();
 JPanel panel = new JPanel();
 JButton button = new JButton("Add Name");
 JButton buttons = new JButton("View Names");

   void createUI() {
	frame.add(panel);
	panel.add(button);
	panel.add(buttons);
	button.addActionListener(this);
	buttons.addActionListener(this);
	frame.pack();
	frame.setVisible(true);
  
   }
 
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
if (arg0.getSource()== button) {
		String input = JOptionPane.showInputDialog("Enter any Name that you will like");
		guest.add (input);
	}
	else {
		for (int i = 0; i < guest.size(); i++) {
			
		}
		JOptionPane.showMessageDialog(null," Guest # " + (i+1) + guest.get(i));
	}
}
}