package vooban.challenge1.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vooban.challenge1.name.NameInputInterface;
import vooban.challenge1.name.NameOutputInterface;
import vooban.challenge1.name.txtFile.AlertWindowOutput;
import vooban.challenge1.name.txtFile.TxtFileReader;
import vooban.challenge1.name.txtFile.TxtFileWriter;

public class NameSorting {
	
	static List<String> namesList = new ArrayList<String>();

	public static void main(String... args)
	{
		NameInputInterface namesExtraction = new TxtFileReader();
		
		List<NameOutputInterface> outputNamesMethodList = new ArrayList<NameOutputInterface>();
		outputNamesMethodList.add(new TxtFileWriter());
		outputNamesMethodList.add(new AlertWindowOutput());
		
		namesList = namesExtraction.ExtractNames();
		
		Collections.sort(namesList);
		for (NameOutputInterface outputNamesMethod : outputNamesMethodList) {
			outputNamesMethod.PrintOutput(namesList);
		}
		
	}
	
}
