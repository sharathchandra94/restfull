package com.hexarest.mod;

public class Admin {
	private String Fin;
	private String Docu;
	private String stg;

	public String getFin() {
		return Fin;
	}

	public void setFin(String fin) {
		Fin = fin;
	}

	public String getDocu() {
		return Docu;
	}

	public void setDocu(String docu) {
		Docu = docu;
	}

	public String getStg() {
		return stg;
	}

	public void setStg(String stg) {
		this.stg = stg;
	}

	public Admin() {

	}

	@Override
	public String toString() {
		return "Admin [Fin=" + Fin + ", Docu=" + Docu + ", stg=" + stg + "]";
	}

}
