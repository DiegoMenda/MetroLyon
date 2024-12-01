package ia;


import java.util.ArrayList;
import java.util.Comparator;

import java.util.HashSet;

import java.util.PriorityQueue;



public class Main {
	
	public static void main(String[] args) throws Exception {
		Grafo grafo = new Grafo();
		
		grafo.ponerVertice("Vaulx-en-Velin La Soie","A");
		grafo.ponerVertice("Laurent Bonnevay Atroballe","A");
		grafo.ponerVertice("Cusset","A");
		grafo.ponerVertice("Flachet","A");
		grafo.ponerVertice("Gratte-Ciel","A");
		grafo.ponerVertice("Republique Villeurbanne","A");
		grafo.ponerVertice("Charpennes Charles Hernu","A");
		grafo.ponerVertice("Massena","A");
		grafo.ponerVertice("Foch","A");
		grafo.ponerVertice("Hotel de Ville Louis Pradel","A");
		grafo.ponerVertice("Cordeliers","A");
		grafo.ponerVertice("Bellecour","A");
		grafo.ponerVertice("Ampere Victor Hugo","A");
		grafo.ponerVertice("Perrache","A");
		grafo.ponerVertice("Oullins Gare","B");
		grafo.ponerVertice("Stade de Gerland","B");
		grafo.ponerVertice("Debourg","B");
		grafo.ponerVertice("Place Jean Jaures","B");
		grafo.ponerVertice("Jean Mace","B");
		grafo.ponerVertice("Saxe Gambetta","B");
		grafo.ponerVertice("Place Guichard Bourse de Travail","B");
		grafo.ponerVertice("Gare Part-Dieu Vivier Merle","B");
		grafo.ponerVertice("Brotteaux","B");
		grafo.ponerVertice("Charpennes Charles Hernu","B");
		grafo.ponerVertice("Cuire","C");
		grafo.ponerVertice("Henon","C");
		grafo.ponerVertice("Croix-Rousse","C");
		grafo.ponerVertice("Croix-Paquet","C");
		grafo.ponerVertice("Hotel de Ville Louis Pradel","C");
		grafo.ponerVertice("Gare de Vaise","D");
		grafo.ponerVertice("Valmy","D");
		grafo.ponerVertice("Gorge de Loup","D");
		grafo.ponerVertice("Vieux Lyon Cathedrale St Jean", "D");
		grafo.ponerVertice("Bellecour","D");
		grafo.ponerVertice("Guillotiere","D");
		grafo.ponerVertice("Saxe Gambetta","D");
		grafo.ponerVertice("Garibaldi","D");
		grafo.ponerVertice("Sans-Souci","D");
		grafo.ponerVertice("Monsplaisir-Lumiere","D");
		grafo.ponerVertice("Grange Blanche","D");
		grafo.ponerVertice("Laennec","D");
		grafo.ponerVertice("Mermoz Pincel","D");
		grafo.ponerVertice("Parilly","D");
		grafo.ponerVertice("Gare de Venissieux","D");
		
		
		grafo.ponerAristaEntre("Vaulx-en-Velin La Soie","Laurent Bonnevay Atroballe","A","A", 2);
		grafo.ponerAristaEntre("Laurent Bonnevay Atroballe","Cusset","A","A", 1);
		grafo.ponerAristaEntre("Cusset","Flachet","A","A",2 );
		grafo.ponerAristaEntre("Flachet","Gratte-Ciel","A","A",1);
		grafo.ponerAristaEntre("Gratte-Ciel","Republique Villeurbanne","A","A",1);
		grafo.ponerAristaEntre("Republique Villeurbanne","Charpennes Charles Hernu","A","A",2);
		grafo.ponerAristaEntre("Charpennes Charles Hernu","Massena","A","A",1);
		grafo.ponerAristaEntre("Massena","Foch","A","A",1);
		grafo.ponerAristaEntre("Foch","Hotel de Ville Louis Pradel","A","A",1);
		grafo.ponerAristaEntre("Hotel de Ville Louis Pradel","Cordeliers","A","A",1 );
		grafo.ponerAristaEntre("Cordeliers","Bellecour","A","A",2);
		grafo.ponerAristaEntre("Bellecour","Ampere Victor Hugo","A","A",1 );
		grafo.ponerAristaEntre("Ampere Victor Hugo","Perrache","A","A", 1);
		
		grafo.ponerAristaEntre("Oullins Gare", "Stade de Gerland", "B", "B", 4);
		grafo.ponerAristaEntre("Stade de Gerland", "Debourg", "B", "B", 1);
		grafo.ponerAristaEntre("Debourg", "Place Jean Jaures", "B", "B", 2);
		grafo.ponerAristaEntre("Place Jean Jaures", "Jean Mace", "B", "B", 1);
		grafo.ponerAristaEntre("Jean Mace", "Saxe Gambetta", "B",  "B", 2);
		grafo.ponerAristaEntre("Saxe Gambetta", "Place Guichard Bourse de Travail", "B", "B", 1);
		grafo.ponerAristaEntre("Place Guichard Bourse de Travail", "Gare Part-Dieu Vivier Merle", "B", "B", 2);
		grafo.ponerAristaEntre("Gare Part-Dieu Vivier Merle", "Brotteaux", "B", "B", 1);
		grafo.ponerAristaEntre("Brotteaux", "Charpennes Charles Hernu", "B", "B", 2);
		
		grafo.ponerAristaEntre("Cuire","Henon","C","C",3);
		grafo.ponerAristaEntre("Henon","Croix-Rousse","C","C",2);
		grafo.ponerAristaEntre("Croix-Rousse","Croix-Paquet","C","C",2);
		grafo.ponerAristaEntre("Croix-Paquet","Hotel de Ville Louis Pradel","C","C",2);
		
		grafo.ponerAristaEntre("Gare de Vaise", "Valmy", "D", "D", 2);
        grafo.ponerAristaEntre("Valmy", "Gorge de Loup", "D", "D", 2);
        grafo.ponerAristaEntre("Gorge de Loup", "Vieux Lyon Cathedrale St Jean", "D", "D", 2);
        grafo.ponerAristaEntre("Vieux Lyon Cathedrale St Jean", "Bellecour", "D", "D", 1);
        grafo.ponerAristaEntre("Bellecour", "Guillotiere", "D", "D", 1);
        grafo.ponerAristaEntre("Guillotiere", "Saxe Gambetta", "D", "D", 1);
        grafo.ponerAristaEntre("Saxe Gambetta", "Garibaldi", "D", "D", 1);
        grafo.ponerAristaEntre("Garibaldi", "Sans-Souci", "D", "D", 1);
        grafo.ponerAristaEntre("Sans-Souci", "Monsplaisir-Lumiere", "D", "D", 1);
        grafo.ponerAristaEntre("Monsplaisir-Lumiere", "Grange Blanche", "D", "D", 1);
        grafo.ponerAristaEntre("Grange Blanche", "Laennec", "D", "D", 1);
        grafo.ponerAristaEntre("Laennec", "Mermoz Pincel", "D", "D", 1);
        grafo.ponerAristaEntre("Mermoz Pincel", "Parilly", "D", "D", 2);
        grafo.ponerAristaEntre("Parilly", "Gare de Venissieux", "D", "D", 3);
        
        
        //Correspondencia
        
        grafo.ponerAristaEntre("Bellecour", "Bellecour", "D", "A", 2);
        grafo.ponerAristaEntre("Saxe Gambetta", "Saxe Gambetta", "D", "B", 1);
        grafo.ponerAristaEntre("Hotel de Ville Louis Pradel", "Hotel de Ville Louis Pradel", "C", "A", 1);
        grafo.ponerAristaEntre("Charpennes Charles Hernu", "Charpennes Charles Hernu", "A", "B", 2);
		
        
        Main main = new Main();
        String origen = args[0] ;
        String origen_linea = origen.substring(origen.length()-1, origen.length());
        origen = origen.substring(0, origen.length()-2);
        String destino = args[1];
        
        destino = destino.substring(0, destino.length()-2);
        
        main.AStar(grafo, origen, origen_linea, destino);
		
	}
	
	
	
	public ArrayList<String> AStar (Grafo grafo, String inicio, String linea, String destino)
	{
		HashSet<Vertice> cerrados =  new HashSet<Vertice>();
		
		Vertice init = grafo.devuelveVertice(inicio, linea);
		Coordenadas mapa = new Coordenadas();  // luego lo miramos
		PriorityQueue<Vertice> abiertos = new PriorityQueue<Vertice>(20, new Comparator<Vertice>() {
            public int compare(Vertice i, Vertice j) {
                if (i.f > j.f ) {
                    return 1;
                } else if (i.f < j.f) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
		
		init.f = mapa.HaversineFormula(inicio, destino);
		init.g = 0;
		abiertos.add(init);
		Vertice actual;
		while(!abiertos.isEmpty())
		{
			actual = abiertos.peek();
			if (actual.getNombre().equals(destino)) 
			{
				Vertice temp = actual;
				double tiempo = 0;
				ArrayList<Vertice> lista = new ArrayList<Vertice>();
				
				while(temp != null)
				{
					lista.add(0, temp);
					//lista.addFirst(temp); // funciona solo para 21
					if(temp.padre != null)
					{
					tiempo += temp.getAristaQueContiene(temp.padre).getPeso();
					}

					temp = temp.padre;
					
				}
				
				ArrayList<String> lista_nombres = new ArrayList<String>();
				for(Vertice x : lista)
				{
					lista_nombres.add(x.getNombre() + " " + x.getLinea());
				}
				System.out.println(lista_nombres);
				System.out.println("="+tiempo);
				return lista_nombres; //que devuelva la cadena
				
				
				
			}
			cerrados.add(abiertos.poll());
			
			for (Aristas AVecinos: actual.getAristas())
			{
				Vertice vecino = AVecinos.getVX(actual);
				if(cerrados.contains(vecino))
				{
					continue;
				}
				double costo_G = actual.g + AVecinos.getPeso(); // mirar el cast
				if( costo_G < vecino.g)  //vecino.g != null &&
				{
					vecino.g = costo_G;
					
					vecino.f = mapa.HaversineFormula( destino, vecino.getNombre()) + costo_G;
					
					/*vecino.f = h.get(vecino.getNombre()) + costo_G;*/
					vecino.padre = actual;
					if(!abiertos.contains(vecino)) abiertos.add(vecino);
				}
			}
		}
		return null;
		
		
	}
	
	
	
}
