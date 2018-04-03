package menu_items;

import gui.EditModel;

import java.awt.event.ActionEvent;

public class ClearMenuItem extends EditorMenuItem {
	public ClearMenuItem(String label, EditModel model) {
		super(label, model);
	}

	public void actionPerformed(ActionEvent e) {
		getBuffer().clear();
	}
}