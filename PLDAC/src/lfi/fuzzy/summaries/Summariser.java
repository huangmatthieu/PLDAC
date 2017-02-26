package lfi.fuzzy.summaries;


import lfi.fuzzy.ffs.vocabulary.Vocabulary;
import lfi.fuzzy.tnorms.TNorm;
import lfi.tools.RewindableCSVParser;

/**
 * Classe mère abstraite des summarisers.
 * 
 * @author Gilles
 * 
 */
public abstract class Summariser {
	protected RewindableCSVParser data;
	protected Vocabulary vocab;
	protected TNorm tNorm;
	protected String verbBe,verbHave, entities;
	
	public Summariser(Vocabulary v, RewindableCSVParser data){
		this.vocab = v;
		this.data= data;
	}

	public Vocabulary getVocab() {
		return vocab;
	}

	public abstract Summary summarise();

	public RewindableCSVParser getData() {
		return data;
	}

	public void setData(RewindableCSVParser data) {
		this.data = data;
	}

	/**
	 * @return the verbBe
	 */
	public String getVerbBe() {
		return verbBe;
	}

	/**
	 * @param vocab the vocab to set
	 */
	public void setVocab(Vocabulary vocab) {
		this.vocab = vocab;
	}

	/**
	 * @return the verbHave
	 */
	public String getVerbHave() {
		return verbHave;
	}

	/**
	 * @param verbHave the verbHave to set
	 */
	public void setVerbHave(String verbHave) {
		this.verbHave = verbHave;
	}

	/**
	 * @param verbBe the verbBe to set
	 */
	public void setVerbBe(String verbBe) {
		this.verbBe = verbBe;
	}

	/**
	 * @return the entities
	 */
	public String getEntities() {
		return entities;
	}

	/**
	 * @param entities the entities to set
	 */
	public void setEntities(String entities) {
		this.entities = entities;
	}

}
