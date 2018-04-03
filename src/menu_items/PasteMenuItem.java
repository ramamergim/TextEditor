package menu_items;

import gui.EditModel;

import java.awt.event.ActionEvent;

public class PasteMenuItem extends EditorMenuItem {
	public PasteMenuItem(String label, EditModel model) {
		super(label, model);
	}

	public void actionPerformed(ActionEvent e) {
		getBuffer().paste();
	}
}