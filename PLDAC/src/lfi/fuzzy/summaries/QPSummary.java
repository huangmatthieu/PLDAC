package lfi.fuzzy.summaries;

import java.text.DecimalFormat;

import lfi.fuzzy.ffs.FFS;
import lfi.fuzzy.ffs.Params;
import lfi.fuzzy.linguistic.LingVar;
import lfi.fuzzy.linguistic.Quantifier;

public class QPSummary {
	
	protected Quantifier q;
	protected LingVar<?> p;
	protected int modP;
	protected double truthVal;
	protected String verbBe, verbHave, entities;
	
	public QPSummary(Quantifier q, LingVar<?> p, int modP, double truthVal,String verbBe, String verbHave, String entities){
		this.q = q;
		this.p = p;
		this.modP = modP;
		this.truthVal = truthVal;
		this.entities = entities;
		this.verbHave = verbHave;
		this.verbBe = verbBe;
	}
	
	protected String getQBloc(){
		return q.getLingForm();
	}
	
	protected String getPBloc(){
		return p.getPForm(modP);
	}
	
	public Quantifier getQ(){
		return q;
	}
	
	public LingVar<?> getP(){
		return p;
	}
	
	public double gettruthVal(){
		return truthVal;
	}
	
	public String getSentence(){
		String sentence = this.getPBloc();
		String newSentence = replace(sentence,"%verbBe%",verbBe);
		String newSentence2 = replace(newSentence,"%modality%",p.getModalities().get(modP).toLowerCase());
		String newSentence3 = replace(newSentence2,"%verbHave%",verbHave);
		return this.getQBloc()+" "+FFS.params.getEntities()+" "+newSentence3+
				" ("+Params.getAsDecimal(truthVal)+")";
	}

	public int getModP() {
		return modP;
	}

	public void setModP(int modP) {
		this.modP = modP;
	}
	
	protected String replace(String originalText,String subStringToFind, String subStringToReplaceWith) {
		int s = 0;
		int e = 0;
		StringBuffer newText = new StringBuffer();
		while ((e = originalText.indexOf(subStringToFind, s)) >= 0) {

			newText.append(originalText.substring(s, e));
			newText.append(subStringToReplaceWith);
			s = e + subStringToFind.length();
		}
		newText.append(originalText.substring(s));
		return newText.toString();
	}
}
