package lfi.fuzzy.ffs.vocabulary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import lfi.fuzzy.linguistic.LingVar;
import lfi.tools.RewindableCSVParser;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class LinksParser {
	private CSVParser parser;
	
	public ArrayList<LingVar<?>> readLinks(String filename, HashMap<String,LingVar<?>>lin) throws IOException{
		RewindableCSVParser rparser = new RewindableCSVParser(filename);
		parser = rparser.getCsvParser();
		final ArrayList<LingVar<?>> result = new ArrayList<LingVar<?>>();
		for ( CSVRecord list : parser ){
			result.add(lin.get(list.get(1)));
		}
		return result; 
	}
}