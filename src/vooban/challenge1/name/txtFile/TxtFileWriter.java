package vooban.challenge1.name.txtFile;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import vooban.challenge1.name.NameWritingInterface;

public class TxtFileWriter implements NameWritingInterface {
	
	private final String txtFileName = "res/sortie.txt";
	@Override
	public void WriteNames(List<String> namesListToPrint){
		
		Path file = Paths.get(txtFileName);
		
		try {
			Files.write(file, namesListToPrint, Charset.forName("UTF-8"));
		} 
		catch (IOException e) {
			System.out.println("Could not write in "+txtFileName+" file.");
		}

			
		
	}
}
