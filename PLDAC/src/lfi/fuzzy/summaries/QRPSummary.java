package lfi.fuzzy.summaries;

import lfi.fuzzy.ffs.FFS;
import lfi.fuzzy.ffs.Params;
import lfi.fuzzy.linguistic.LingVar;
import lfi.fuzzy.linguistic.Quantifier;

public class QRPSummary extends QPSummary {
	
	private LingVar<?> r;
	private int modR;

	public QRPSummary(Quantifier q, LingVar<?> p, LingVar<?> r, int modP, int modR, double truthVal,String verbBe, String verbHave, String entities) {
		super(q, p, modP, truthVal,verbBe, verbHave, entities);
		this.r = r;
		this.modR = modR;
	}
	
	private String getRBloc(){
		return r.getRForm(modR);

	}

	@Override
	public String getSentence(){
		String sentenceP = this.getPBloc();
		String newSentenceP = replace(sentenceP,"%verbBe%",verbBe);
		String newSentenceP2 = replace(newSentenceP,"%modality%",p.getModalities().get(modP).toLowerCase());
		String newSentenceP3 = replace(newSentenceP2,"%verbHave%",verbHave);
		String sentenceR = this.getRBloc();
		String newSentenceR = replace(sentenceR,"%entities%",entities);
		String newSentenceR2 = replace(newSentenceR,"%modality%",r.getModalities().get(modR).toLowerCase());
		String newSentenceR3 = replace(newSentenceR2,"%verbHave%",verbHave);
		return getQBloc()+" "+newSentenceR3+" "+newSentenceP3+" ("+Params.getAsDecimal(truthVal)+")";
	}

	public LingVar<?> getR() {
		return r;
	}

}
