package gui;

import gui.EditModel;
import gui.ReplaceFrame;
import menu_items.*;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;

public class EditFrame extends JFrame {
	private EditModel buffer = new EditModel("", 15, 50);

	public EditFrame() {
		ReplaceFrame secondFrame = new ReplaceFrame(buffer);
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		JMenuBar mbar = new JMenuBar();
		JMenu file = new JMenu("File");
		file.add(new ClearMenuItem("New", buffer));
		file.add(new QuitMenuItem("Quit"));
		mbar.add(file);
		JMenu edit = new JMenu("Edit");
		edit.add(new CutMenuItem("Cut", buffer));
		edit.add(new CopyMenuItem("Copy", buffer));
		edit.add(new PasteMenuItem("Paste", buffer));
		edit.addSeparator();
		JMenu search = new JMenu("Find");
		search.add(new FindMenuItem("Find", buffer));
		search.add(new ReplaceMenuItem("Replace", secondFrame));
		edit.add(search);
		mbar.add(edit);
		setJMenuBar(mbar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JScrollPane sp = new JScrollPane(buffer);
		cp.add(sp, BorderLayout.CENTER);
		setTitle("Text Editor");
		pack();
		setVisible(true);
	}
}