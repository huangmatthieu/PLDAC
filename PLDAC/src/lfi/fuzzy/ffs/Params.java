/**
 * 
 */
package lfi.fuzzy.ffs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Properties;

import lfi.fuzzy.tnorms.TNorm;
import lfi.fuzzy.tnorms.TNormFact;
import lfi.fuzzy.tnorms.TType;


/**
 * Contient les paramètres récupérés de la ligne de commande
 * @author Gilles
 *
 */
public class Params {

	private Properties propertyFile;

	private String dataFileName;
	private String quantifFileName;
	private String lvFileName;
	private String linksFileName;
	private double ts = 0.5;
	private double supp = 0;
	private int mdef = 5;
	private double fuz = 0.5;
	private int n = -1;
	private int skip = 0;
	private String dataFormat ="EN";
	private String tnorm = "P";
	private String entities = "";
	private String verbBe = "";
	private String verbHave = "";
	//private String csvDelim;

	/**
	 * Construit l'objet Params à partir des éléments de la ligne de commande
	 * @param args
	 */
	public Params(String fileName) {
		propertyFile = new Properties();
		try {
			propertyFile.load(new FileInputStream(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(String key : propertyFile.stringPropertyNames()) {
			switch (key)
			{
			case "supp":
				this.supp = Double.parseDouble(propertyFile.getProperty(key));
				break;
			case "dataFileName":
				this.dataFileName = propertyFile.getProperty(key);
				break;
			case "quantifFileName":
				this.quantifFileName = propertyFile.getProperty(key);
				break;
			case "lvFileName":
				this.lvFileName = propertyFile.getProperty(key);
				break;
			case "linksFileName":
				this.linksFileName = propertyFile.getProperty(key);
				break;
			case "ts":
				this.ts = Double.parseDouble(propertyFile.getProperty(key));
				break;
			case "mdef":
				this.mdef = Integer.parseInt(propertyFile.getProperty(key));
				break;
			case "fuz":
				this.fuz = Double.parseDouble(propertyFile.getProperty(key));
				break;
			case "n":
				this.n = Integer.parseInt(propertyFile.getProperty(key));
				break;
			case "skip":
				this.skip = Integer.parseInt(propertyFile.getProperty(key));
				break;
			case "tnorm":
				this.tnorm = propertyFile.getProperty(key);
				break;
			case "entities":
				this.entities = propertyFile.getProperty(key);
				break;
			case "verbBe":
				this.verbBe = propertyFile.getProperty(key);
				break;
			case "verbHave":
				this.verbHave = propertyFile.getProperty(key);
				break;
			/*case "csvDelim":
				csvDelim = propertyFile.getProperty(key);
				break; */
			default:
				System.out.println("Propriété non affectée ! : " + key);
			}
		}
	}

	/**
	 * @return the propertyFile
	 */
	public Properties getPropertyFile() {
		return propertyFile;
	}

	/**
	 * @return the dataFileName
	 */
	public String getDataFileName() {
		return dataFileName;
	}

	/**
	 * @return the quantifFileName
	 */
	public String getQuantifFileName() {
		return quantifFileName;
	}

	/**
	 * @return the lvFileName
	 */
	public String getLvFileName() {
		return lvFileName;
	}

	/**
	 * @return the linksFileName
	 */
	public String getLinksFileName() {
		return linksFileName;
	}

	/**
	 * @return the ts
	 */
	public double getTs() {
		return ts;
	}

	/**
	 * @return the supp
	 */
	public double getSupp() {
		return supp;
	}

	/**
	 * @return the mdef
	 */
	public int getMdef() {
		return mdef;
	}

	/**
	 * @return the fuz
	 */
	public double getFuz() {
		return fuz;
	}

	/**
	 * @return the n
	 */
	public int getN() {
		return n;
	}

	/**
	 * @return the skip
	 */
	public int getSkip() {
		return skip;
	}

	/**
	 * @return the tnorm
	 */
	public String getTnorm() {
		return tnorm;
	}
	/**
	 * @return tNorm as object
	 */
	public TNorm getTnormAsObj() {
		switch(FFS.params.getTnorm()){
		case "P":
			return TNormFact.build(TType.Proba);
		case "Z":
			return TNormFact.build(TType.Zadeh);
		case "L":
			return TNormFact.build(TType.Luka);
		default:
			return TNormFact.build(TType.Zadeh);
		}
	}
	

	/**
	 * @return the entities
	 */
	public String getEntities() {
		return entities;
	}

	/**
	 * @return the verbBe
	 */
	public String getVerbBe() {
		return verbBe;
	}

	/**
	 * @return the verbHave
	 */
	public String getVerbHave() {
		return verbHave;
	}
	
	/**
	 * @return the dataFormat
	 */
	public String getDataFormat() {
		return dataFormat;
	}

	/**
	 * @return the linksFormat
	 */
	/*public String getCSVDelim() {
		return csvDelim;
	} */
	public TNorm getTNorm(){
		TNorm tNorm;
		switch(tnorm){
		case "P":
			tNorm = TNormFact.build(TType.Proba);
			break;
		case "Z":
			tNorm = TNormFact.build(TType.Zadeh);
			break;
		case "L":
			tNorm = TNormFact.build(TType.Luka);
			break;
		default:
			tNorm = TNormFact.build(TType.Zadeh);
		}
		return tNorm;
	}
	
	public static String getAsDecimal(double aValue ) {
		return new DecimalFormat("0.00").format(aValue);
	}
}
