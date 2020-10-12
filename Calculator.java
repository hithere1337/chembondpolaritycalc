
public class Calculator {
	private String element1;
	private String element2;
	private double ENdiff;
	
	public Calculator() {
	}

	/*
	 * returns the results (ENdiff) and description
	 * gives error message if necessary
	 */
	public String results() {
		ENdiff = (Math.abs((calcEN(element1) - calcEN(element2))));
		return "Electronegativity difference: "+String.format("%.2f", ENdiff);
	}
	
	/*
	 * calculates electronegativity of an element
	 * en: temporary electronegativity, changes for each element
	 * e : the element in uniform lower case
	 */
	public double calcEN(String element) {
		double en = 0; //temporary electronegativity, changes for each element
		String e = element.toLowerCase();
		
		//EN for all elements... not fun
		if(e.equals("h") || e.equals("pd") || e.equals("ru") || e.equals("os") || e.equals("ir") || e.equals("at")) {
			en = 2.20;
			return en;
		}
		else if(e.equals("li")) {
			en = 0.98;
			return en;
		}
		else if(e.equals("be")) {
			en = 1.57;
			return en;
		}
		else if(e.equals("b")) {
			en = 2.04;
			return en;
		}
		else if(e.equals("c") || e.equals("se")) {
			en = 2.55;
			return en;
		}
		else if(e.equals("n")) {
			en = 3.04;
			return en;
		}
		else if(e.equals("o")) {
			en = 3.44;
			return en;
		}
		else if(e.equals("f")) {
			en = 3.98;
			return en;
		}
		else if(e.equals("na")) {
			en = 0.93;
			return en;
		}
		else if(e.equals("mg")) {
			en = 1.31;
			return en;
		}
		else if(e.equals("al")) {
			en = 1.61;
			return en;
		}
		else if(e.equals("si") || e.equals("cu") || e.equals("tc") || e.equals("re")) {
			en = 1.90;
			return en;
		}
		else if(e.equals("p")) {
			en = 2.19;
			return en;
		}
		else if(e.equals("s")) {
			en = 2.58;
			return en;
		}
		else if(e.equals("cl")) {
			en = 3.16;
			return en;
		}
		else if(e.equals("k")) {
			en = 0.82;
			return en;
		}
		else if(e.equals("ca")) {
			en = 1.00;
			return en;
		}
		else if(e.equals("sc")) {
			en = 1.36;
			return en;
		}
		else if(e.equals("ti")) {
			en = 1.54;
			return en;
		}
		else if(e.equals("v")) {
			en = 1.63;
			return en;
		}
		else if(e.equals("cr")) {
			en = 1.66;
			return en;
		}
		else if(e.equals("mn")) {
			en = 1.55;
			return en;
		}
		else if(e.equals("fe")) {
			en = 1.83;
			return en;
		}
		else if(e.equals("co")) {
			en = 1.88;
			return en;
		}
		else if(e.equals("ni")) {
			en = 1.91;
			return en;
		}
		else if(e.equals("zn")) {
			en = 1.65;
			return en;
		}
		else if(e.equals("ga")) {
			en = 1.81;
			return en;
		}
		else if(e.equals("ge")) {
			en = 2.01;
			return en;
		}
		else if(e.equals("as")) {
			en = 2.18;
			return en;
		}
		else if(e.equals("br")) {
			en = 2.96;
			return en;
		}
		else if(e.equals("rb")) {
			en = 0.82;
			return en;
		}
		else if(e.equals("sr")) {
			en = 0.95;
			return en;
		}
		else if(e.equals("y")) {
			en = 1.22;
			return en;
		}
		else if(e.equals("zr")) {
			en = 1.33;
			return en;
		}
		else if(e.equals("nb")) {
			en = 1.60;
			return en;
		}
		else if(e.equals("mo")) {
			en = 2.16;
			return en;
		}
		else if(e.equals("rh")) {
			en = 2.28;
			return en;
		}
		else if(e.equals("ag")) {
			en = 1.93;
			return en;
		}
		else if(e.equals("cd")) {
			en = 1.69;
			return en;
		}
		else if(e.equals("in")) {
			en = 1.78;
			return en;
		}
		else if(e.equals("sn")) {
			en = 1.96;
			return en;
		}
		else if(e.equals("sb")) {
			en = 2.05;
			return en;
		}
		else if(e.equals("te")) {
			en = 2.10;
			return en;
		}
		else if(e.equals("i")) {
			en = 2.66;
			return en;
		}
		else if(e.equals("cs")) {
			en = 0.79;
			return en;
		}
		else if(e.equals("ba")) {
			en = 0.89;
			return en;
		}
		else if(e.equals("la")) {
			en = 1.10;
			return en;
		}
		else if(e.equals("ce")) {
			en = 1.12;
			return en;
		}
		else if(e.equals("pr")) {
			en = 1.13;
			return en;
		}
		else if(e.equals("nd")) {
			en = 1.14;
			return en;
		}
		else if(e.equals("pm")) {
			en = 1.13;
			return en;
		}
		else if(e.equals("sm")) {
			en = 1.17;
			return en;
		}
		else if(e.equals("eu") || e.equals("gd")) {
			en = 1.20;
			return en;
		}
		else if(e.equals("tb")) {
			en = 1.22;
			return en;
		}
		else if(e.equals("dy")) {
			en = 1.23;
			return en;
		}
		else if(e.equals("ho") || e.equals("er")) {
			en = 1.24;
			return en;
		}
		else if(e.equals("tm")) {
			en = 1.25;
			return en;
		}
		else if(e.equals("yt")) {
			en = 1.10;
			return en;
		}
		else if(e.equals("lu")) {
			en = 1.27;
			return en;
		}
		else if(e.equals("ta")) {
			en = 1.50;
			return en;
		}
		else if(e.equals("w")) {
			en = 2.36;
			return en;
		}
		else if(e.equals("pt")) {
			en = 2.28;
			return en;
		}
		else if(e.equals("au")) {
			en = 2.54;
			return en;
		}
		else if(e.equals("hg")) {
			en = 2.00;
			return en;
		}
		else if(e.equals("tl")) {
			en = 1.62;
			return en;
		}
		else if(e.equals("pb")) {
			en = 2.33;
			return en;
		}
		else if(e.equals("bi")) {
			en = 2.02;
			return en;
		}
		else if(e.equals("po")) {
			en = 2.00;
			return en;
		}
		else if(e.equals("fr")) {
			en = 0.70;
			return en;
		}
		else if(e.equals("ra")) {
			en = 0.89;
			return en;
		}
		else if(e.equals("ac")) {
			en = 1.10;
			return en;
		}
		else if(e.equals("pa")) {
			en = 1.50;
			return en;
		}
		else if(e.equals("u")) {
			en = 1.38;
			return en;
		}
		else if(e.equals("np")) {
			en = 1.36;
			return en;
		}
		else if(e.equals("pu")) {
			en = 1.28;
			return en;
		}
		else if(e.equals("hf") || e.equals("th") || e.equals("am") || e.equals("cm") || e.equals("bk") || e.equals("cf") || e.equals("es") || e.equals("fm") || e.equals("md") || e.equals("no")) {
			en = 1.30;
			return en;
		}
		//unknown EN values
		else if(e.equals("lr") || e.equals("rf") || e.equals("db") || e.equals("sg") || e.equals("bh") || e.equals("hs") || e.equals("mt") || e.equals("ds") || e.equals("rg") || e.equals("cn") || e.equals("nh") || e.equals("fl") || e.equals("mc") || e.equals("lv") || e.equals("ts") || e.equals("og")) {
			return 100;
		}
		//noble gases
		else if(e.equals("he") || e.equals("ne") || e.equals("ar") || e.equals("kr") || e.equals("xe") || e.equals("rn")) {
			return 100;
		}
		//if whole list searched and no value returned, element symbol does not exist.
		return -1;
	}
	
	public void resetAll() {
		element1 = element2 = "";
		ENdiff = 0;
	}

	/*
	 * Getter and Setter Methods
	 */
	
	public String getElement1() {
		return element1;
	}

	public void setElement1(String element1) {
		this.element1 = element1;
	}

	public String getElement2() {
		return element2;
	}

	public void setElement2(String element2) {
		this.element2 = element2;
	}

	public double getENdiff() {
		return ENdiff;
	}

	public void setENdiff(double eNdiff) {
		ENdiff = eNdiff;
	}
}
