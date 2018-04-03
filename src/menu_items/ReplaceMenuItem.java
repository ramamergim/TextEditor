package menu_items;

import gui.ReplaceFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public class ReplaceMenuItem extends JMenuItem implements ActionListener {
	private ReplaceFrame view;

	public ReplaceMenuItem(String label, ReplaceFrame v) {
		super(label);
		view = v;
		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		view.setVisible(true);
	}
}