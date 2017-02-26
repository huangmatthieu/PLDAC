package lfi.fuzzy.tnorms;

public class TNormFact {

	public static TNorm build(TType type){
		switch(type){
		case Zadeh:
			return new TZadeh();
		case Proba : 
			return new TProba();
		case Luka : 
			return new TLuka();
		default:
			return new TZadeh();
		}
	}
}
