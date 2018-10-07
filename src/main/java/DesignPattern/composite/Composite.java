package DesignPattern.composite;

	import java.util.ArrayList;
	import java.util.List;
	
	public class Composite extends Composant {
		
	private List<Composant> composants=new ArrayList<Composant>();
	
	public Composite(String nom) { super(nom); }
	
	@Override
	public void operation() {
		
	String tab="";
	for(int i=0;i<level;i++) tab+="--";
	
	System.out.println(tab+"Opération sur un composite("+nom+")");
	
	/* Composite.java */
	for(Composant composant:composants)
	composant.operation();
	}
	
	public void add(Composant composant){
	composant.level=this.level+1;
	composants.add(composant);
	}
	
	public void remove(Composant composant){ composants.remove(composant); }
	
	public List<Composant> getChilds(){ return composants; }
	
	}


