package menu_items;

import gui.EditModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

public abstract class EditorMenuItem extends JMenuItem implements ActionListener {
	private EditModel buffer;

	public EditorMenuItem(String label, EditModel model) {
		super(label);
		buffer = model;
		addActionListener(this);
	}

	public EditModel getBuffer() {
		return buffer;
	}

	public abstract void actionPerformed(ActionEvent e);
}