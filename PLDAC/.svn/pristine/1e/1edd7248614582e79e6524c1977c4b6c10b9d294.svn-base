package lfi.fuzzy.partitions;

/**
 * Classe permettant de renvoyer l'appartenance d'un x à 1 ou 2 modalités dans une partition de Ruspini  
 * @author LIP6 / LFI
 *
 */
public class MShips {
	int nMod, k1, k2;
	double mu1, mu2;

	/**
	 * Constructeur par défaut 
	 */
	public MShips() {
		nMod = 0;
		k1 = 0;
		k2 = 0;
		mu1 = 0;
		mu2 = 0;
	}
	
	/** Constructeur avec paramètres
	 * @param an nombre de modalités activées (1 ou 2)
	 * @param ak1 n° de la 1ère modalité
	 * @param amu1 appartenance à la 1ère modalité
	 * @param ak2 n° de la 2ème modalité
	 * @param amu2 appartenance à la 2ème modalité

	 */
	public MShips(int an, int ak1, double amu1, int ak2, double amu2) {
		nMod = an;
		k1 = ak1;
		k2 = ak2;
		mu1 = amu1;
		mu2 = amu2;
	}

	/**
	 * Remplit un objet MShips avec une seule modalité activée
	 * @param ak1
	 * @param amu1
	 * @return le MShips mis à jour
	 */
	public MShips fill1Mod(int ak1, double amu1) {
		nMod = 1;
		k1 = ak1;
		mu1 = amu1;
		k2 = 0;
		mu2 = 0;
		return this;
	}

	/**
	 * Remplit un objet MShips avec deux modalités activées
	 * Seuls k1 et mu1 doivent être spécifés, car k2=k1+1 et mu2=1-mu1
	 * @param ak1
	 * @param amu1
	 * @return le MShips mis à jour 
	 */
	public MShips fill2Mod(int ak1, double amu1) {
		nMod = 2;
		k1 = ak1;
		mu1 = amu1;
		k2 = ak1 + 1;
		mu2 = 1 - amu1;
		return this;		
	}

	/**
	 * Remplit un objet MShips avec deux modalités activées, sans supposer que k2=k1+1 et mu2=1-mu1 
	 * @param anMod
	 * @param ak1
	 * @param amu1
	 * @param ak2
	 * @param amu2
	 * @return le MShips mis à jour 
	 */
	public MShips fillGeneral(int anMod, int ak1, double amu1, int ak2, double amu2) {
		nMod = anMod;
		k1 = ak1;
		mu1 = amu1;
		k2 = ak2;
		mu2 = amu2;
		return this;		
	}


	public int getNmod() {
		return nMod;

	}

	public int getK1() {
		return k1;
	}

	public int getK2() {
		return k2;
	}

	public void setNmod(int nMod) {
		this.nMod = nMod;

	}

	public void setK1(int k1) {
		this.k1 = k1;
	}

	public void setK2(int k2) {
		this.k2 = k2;
	}

	public double getMu1() {
		return mu1;

	}

	public double getMu2() {
		return mu2;
	}

	public void setMu1(double mu1) {
		this.mu1 = mu1;

	}

	public void setMu2(double mu2) {
		this.mu2 = mu2;
	}
}
