package menu_items;

import gui.EditModel;

import java.awt.event.ActionEvent;

public class CutMenuItem extends EditorMenuItem {
	public CutMenuItem(String label, EditModel model) {
		super(label, model);
	}

	public void actionPerformed(ActionEvent e) {
		getBuffer().cut();
	}
}