package vooban.challenge1.name.txtFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;




import vooban.challenge1.name.NameExtractionInterface;

public class TxtFileReader implements NameExtractionInterface {
	
	private final String txtFileName = "res/prenom.txt";
	
	@Override
	public List<String> ExtractNames(){
		
		List<String> txtFileLines = new ArrayList<String>();
		Path file = Paths.get(txtFileName);
		
		try {
			for (String line : Files.readAllLines(file)) {
				line.replaceAll("\\s+",""); //Replace all whitespace from the line to calculate the number of character correctly
				if(line.length()%2 == 0){
					txtFileLines.add(line);
				}
			}
		} catch (IOException e) {
			System.out.println("Could not read "+txtFileName+" file.");
		}
		
		return txtFileLines;
		
	}

}
