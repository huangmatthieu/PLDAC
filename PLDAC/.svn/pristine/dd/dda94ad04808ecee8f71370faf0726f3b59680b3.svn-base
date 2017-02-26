package lfi.tools;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

public class RewindableCSVParser {
	private String filename;
	private FileReader in;
	private CSVParser csvParser;

	
	
	
	public RewindableCSVParser(String filename) throws IOException {
		this.filename = filename;
		this.in = new FileReader(filename);
		this.csvParser = new CSVParser(in, CSVFormat.DEFAULT);
	}
	
	/**
	 * Initialise l'objet. Utile pour le rewind.
	 */
	private void init() {
		try {
			in.close();
			csvParser.close();
			in = new FileReader(filename);
			csvParser = new CSVParser(in, CSVFormat.DEFAULT);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	/**
	 * @return the in
	 */
	public FileReader getIn() {
		return in;
	}

	/**
	 * @param in the in to set
	 */
	public void setIn(FileReader in) {
		this.in = in;
	}

	public void rewind(){
			init();
	}

	/**
	 * @return the csvParser
	 */
	public CSVParser getCsvParser() {
		return csvParser;
	}

	/**
	 * @param csvParser the csvParser to set
	 */
	public void setCsvParser(CSVParser csvParser) {
		this.csvParser = csvParser;
	}
	
	public void close(){
		try {
			in.close();
			csvParser.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}