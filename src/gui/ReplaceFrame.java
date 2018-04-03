package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ReplaceFrame extends JFrame implements ActionListener {
	private EditModel model;
	private JButton replace = new JButton("Replace");
	private JButton close = new JButton("Quit");
	private JTextField findText = new JTextField("", 20);
	private JTextField replaceText = new JTextField("", 20);

	public ReplaceFrame(EditModel m) {
		model = m;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new GridLayout(2, 1));
		JPanel p11 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p11.add(new JLabel("Replace "));
		p11.add(findText);
		p1.add(p11);
		JPanel p12 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		p12.add(new JLabel("with "));
		p12.add(replaceText);
		p1.add(p12);
		cp.add(p1, BorderLayout.CENTER);
		JPanel p2 = new JPanel(new FlowLayout());
		p2.add(replace);
		p2.add(close);
		cp.add(p2, BorderLayout.SOUTH);
		replace.addActionListener(this);
		close.addActionListener(this);
		setTitle("Replace Frame");
		pack();
		setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == close) {
			setVisible(false);
		} else if (e.getSource() == replace) {
			String find = findText.getText();
			int location = model.findFromCaret(find);
			if (location == -1) {
				JOptionPane.showMessageDialog(this, "String " + find + " is not found");
			} else {
				model.replaceRange(replaceText.getText(), location, location + find.length());
			}
		}
	}
}
