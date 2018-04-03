package gui;

import java.awt.Font;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class EditModel extends JTextArea {

	public EditModel(String initialText, int rows, int cols) {
		super(initialText, rows, cols);
		setLineWrap(true);
		setFont(new Font("Courier", Font.PLAIN, 12));
	}

	public void clear() {
		setText("");
	}

	private int find(String s, int position) {
		String text = getText();
		int index = text.indexOf(s, position);
		if (index != -1) {
			setCaretPosition(index + s.length());
			moveCaretPosition(index);
		}
		return index;
	}

	public int findFromStart(String s) {
		return find(s, 0);
	}

	public int findFromCaret(String s) {
		return find(s, getCaretPosition());
	}
}