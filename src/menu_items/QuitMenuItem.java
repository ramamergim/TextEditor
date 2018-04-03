package menu_items;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class QuitMenuItem extends JMenuItem implements ActionListener {
	public QuitMenuItem(String label) {
		super(label);
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}