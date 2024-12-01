package ia;

import java.util.LinkedList;


public class Grafo {
	public LinkedList<Aristas> aristas;
	public LinkedList<Vertice> vertice;

	public Grafo() {
		aristas = new LinkedList<>();
		vertice = new LinkedList<>();
	}
	//Metodos para crear el grafo
	public void ponerVertice(String nombre,String linea) {
		Vertice v = new Vertice(nombre,linea);
		vertice.add(v);
	}
	//El vertice que este mas a la izquierda o más arriba sera name1
	// y name2 el que este más a la derecha o mas abajo
	public void ponerAristaEntre(String name1,String name2,String linea1,String linea2, float peso) throws Exception {
		if(!existeVertice(name1) || !existeVertice(name2)) {
			throw new Exception("Algunos de los vertices no existen");
		}else{
			Vertice v1 = devuelveVertice(name1,linea1);
			Vertice v2 = devuelveVertice(name2,linea2);
			Aristas arista = new Aristas(v1,v2,peso);
			aristas.add(arista);
			int n1 = vertice.indexOf(v1);
			int n2 = vertice.indexOf(v2);
			vertice.get(n1).getAristas().add(arista);
			vertice.get(n2).getAristas().add(arista);
		}
	}

	//Getters, Setters y toString
	public LinkedList<Aristas> getAristas() {
		return aristas;
	}

	public void setAristas(LinkedList<Aristas> aristas) {
		this.aristas = aristas;
	}

	public LinkedList<Vertice> getVertices() {
		return vertice;
	}

	public void setVertices(LinkedList<Vertice> vertice) {
		this.vertice = vertice;
	}


	public void dibujarGrafo() {

	}

	//Metodos Privados
	//Devuelve true si el vertice existe
	public boolean existeVertice(String name) {
		boolean enc=false;
		int i = 0;
		while(i<vertice.size() && !enc) {
			if(vertice.get(i).getNombre().equals(name)) {
				enc=true;
			}else {
				i++;
			}
		}
		return enc;
	}
	//Devuelve el objeto vertice dado el nombre
	public Vertice devuelveVertice(String name,String linea) {
		Vertice v = null;
		int i =0;
		boolean enc = false;
		while(i<vertice.size() && !enc) {
			if(vertice.get(i).getNombre().equals(name) && 
					vertice.get(i).getLinea().equals(linea)) {
				enc=true;
			}else {
				i++;
			}
		}
		if(enc=true) v = vertice.get(i);
		return v;
	}
}
