package lfi.fuzzy.ffs.factories;

/**
 * 
 * Factorie de Quantificateur
 * 
 * @author David
 *
 */

import org.apache.commons.csv.CSVRecord;
import lfi.fuzzy.general.SFS;
import lfi.fuzzy.general.Trapezoid;
import lfi.fuzzy.general.ZFS;
import lfi.fuzzy.linguistic.QType;
import lfi.fuzzy.linguistic.Quantifier;

public class QuantFact {

	private static int qi=1;

	public static Quantifier build(CSVRecord spec) throws Exception{
		/*String separateur;
		if(FFS.params.getDataFormat().equals("EN"))
			separateur = ",";
		else
			separateur = ";";
		String[] format=spec.split(separateur);*/
		Quantifier q=new Quantifier();
		if(spec.get(0).equals("")){
			q.setName("Q_"+qi);
			qi++;
		}else{
			q.setName(spec.get(0).trim());
		}
		switch(spec.get(1).trim().toLowerCase()){		 
		case "r":
			q.setType(QType.RELATIVE);				 
			break;
		case "a":
			q.setType(QType.ABSOLUTE);
			break;

		default:
			throw new Exception("Type inconnu : " + spec);
		}
		switch(spec.get(2).trim().toLowerCase()){
		case "s":
			String[] valeur=spec.get(3).split("[|]");
			if(valeur.length != 2 ) throw new Exception("nombre de valeur attendu non trouvé");
			q.setFs(new SFS(Double.parseDouble(valeur[0]),Double.parseDouble(valeur[1])));
			break;
		case "z":
			String[] valeur1=spec.get(3).split("[|]");
			if(valeur1.length != 2 ) throw new Exception("nombre de valeur attendu non trouvé");
			q.setFs(new ZFS(Double.parseDouble(valeur1[0]),Double.parseDouble(valeur1[1])));
			break;
		case "t":
			String[] valeur11=spec.get(3).split("[|]");
			if(valeur11.length != 4 ) throw new Exception("nombre de valeur attendu non trouvé");
			q.setFs(new Trapezoid(Double.parseDouble(valeur11[0]),Double.parseDouble(valeur11[1]),Double.parseDouble(valeur11[2]),Double.parseDouble(valeur11[3])));
			break;
		default :
			throw new Exception("forme inconnue : " + spec);
		}
		if(spec.get(4).trim().isEmpty())
			q.setLingForm(spec.get(0).trim());
		else
			q.setLingForm(spec.get(4).trim());
		return q;
	}
}