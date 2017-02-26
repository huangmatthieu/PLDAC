package lfi.fuzzy.summaries;

import java.util.ArrayList;

public class Summary {

	private ArrayList<QPSummary> qpSummaries = new ArrayList<QPSummary>();
	private ArrayList<QRPSummary> qrpSummaries = new ArrayList<QRPSummary>();


	public ArrayList<QPSummary> getQPSummaries(){
		return qpSummaries;
	}

	public ArrayList<QRPSummary> getQRPSummaries(){
		return qrpSummaries;
	}

	public String getQPSentence(int i){
		return qpSummaries.get(i).getSentence();
	}
	public String getQRPSentence(int i){
		return qrpSummaries.get(i).getSentence();
	}

}
