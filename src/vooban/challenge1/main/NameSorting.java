package vooban.challenge1.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import vooban.challenge1.name.NameExtractionInterface;
import vooban.challenge1.name.NameWritingInterface;
import vooban.challenge1.name.txtFile.TxtFileReader;
import vooban.challenge1.name.txtFile.TxtFileWriter;

public class NameSorting {
	
	static List<String> namesList = new ArrayList<String>();

	public static void main(String... args)
	{
		NameExtractionInterface nameExtraction = new TxtFileReader();
		NameWritingInterface nameWriting = new TxtFileWriter();
		
		namesList = nameExtraction.ExtractNames();
		
		Collections.sort(namesList);
		
		nameWriting.WriteNames(namesList);
		
	}
	
}
