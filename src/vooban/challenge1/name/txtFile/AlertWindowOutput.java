package vooban.challenge1.name.txtFile;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import vooban.challenge1.name.NameOutputInterface;

public class AlertWindowOutput implements NameOutputInterface {
	
	public String newline = System.getProperty("line.separator");
	public StringBuilder finalOutput = new StringBuilder();


	@Override
	public void PrintOutput(List<String> namesListToPrint) {
		
		for (String line : namesListToPrint) {
			finalOutput.append(line);
			finalOutput.append(newline);
		}
		
		JTextArea textArea = new JTextArea(finalOutput.toString());
		JScrollPane scrollPane = new JScrollPane(textArea);  
		textArea.setLineWrap(true);  
		textArea.setWrapStyleWord(true); 
		scrollPane.setPreferredSize( new Dimension( 800, 600 ) );
		JOptionPane.showMessageDialog(null, scrollPane, "Result",JOptionPane.DEFAULT_OPTION);
	}

}
