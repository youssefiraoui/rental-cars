package DesignPattern.composite;

public class App {

	public static void main(String[] args) {

		Composite racine=new Composite("Composite 1");
		Composite composite2=new Composite("Composite 2");
		racine.add(composite2);
		racine.add(new Element("Elément 11"));
		racine.add(new Element("Elément 12"));
		racine.add(new Element("Elément 13"));
		composite2.add(new Element("Elément 21"));
		composite2.add(new Element("Elément 22"));
		racine.operation();
	}

}
