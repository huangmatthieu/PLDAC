package lfi.fuzzy.ffs.vocabulary;

import java.util.ArrayList;
import java.util.HashMap;

import lfi.fuzzy.linguistic.LingVar;
import lfi.fuzzy.linguistic.Quantifier;


public class Vocabulary {
	private ArrayList<LingVar<?>> lingVars;
	private HashMap<String,LingVar<?>> lingVarsByName = new HashMap<String,LingVar<?>>();
	private ArrayList<Quantifier> quantifiers;
	private ArrayList<LingVar<?>> links;

	

 public Vocabulary(String aLVFile,String aQuantifFile,String aLinkFile){
		QuantifParser qp = new QuantifParser();
		LingVarsParser lvp = new LingVarsParser();
		LinksParser lp = new LinksParser();
		try {
			this.lingVars = lvp.readLingVar(aLVFile);
			this.quantifiers = qp.readQuantif(aQuantifFile);
			for(int i = 0 ; i < lingVars.size() ; i++){
				lingVarsByName.put(lingVars.get(i).getName(), lingVars.get(i));
			}
			this.links = lp.readLinks(aLinkFile, lingVarsByName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 	
 	public LingVar<?> getLV(int i){
 		return lingVars.get(i);
 	}
 	
 	public LingVar<?> getLV(String name){
 		return lingVarsByName.get(name);
 	}
 	
 	public LingVar<?> getLVInCol(int i){
 		return links.get(i);
 	}

	public ArrayList<Quantifier> getQuantifiers() {
		return quantifiers;
	}

	/**
	 * @return the lingVars
	 */
	public ArrayList<LingVar<?>> getLingVars() {
		return lingVars;
	}

	/**
	 * @return the links
	 */
	public ArrayList<LingVar<?>> getLinks() {
		return links;
	}
	
	public int getLVSize(){
		return lingVars.size();
	}

	
	
}