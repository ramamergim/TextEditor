package menu_items;

import gui.EditModel;

import java.awt.event.ActionEvent;

public class CopyMenuItem extends EditorMenuItem {
	public CopyMenuItem(String label, EditModel model) {
		super(label, model);
	}

	public void actionPerformed(ActionEvent e) {
		getBuffer().copy();
	}
}