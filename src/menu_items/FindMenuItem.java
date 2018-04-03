package menu_items;

import gui.EditModel;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class FindMenuItem extends EditorMenuItem {
	public FindMenuItem(String label, EditModel model) {
		super(label, model);
	}

	public void actionPerformed(ActionEvent e) {
		String s = JOptionPane.showInputDialog(this, "Teksti qe kerkohet:");
		if (s != null) {
			int index = getBuffer().findFromCaret(s);
			if (index == -1) {
				int response = JOptionPane.showConfirmDialog(this,
						"Teksti nuk u gjet. Te fillohet kerkimi nga fillimi?");
				if (response == JOptionPane.YES_OPTION) {
					index = getBuffer().findFromStart(s);
					if (index == -1) {
						JOptionPane.showMessageDialog(this, "Teksti nuk u gjet");
					}
				}
			}
		}
	}
}