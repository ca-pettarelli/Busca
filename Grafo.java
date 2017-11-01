package Exercicio2;

import es.usc.citius.hipster.algorithm.Hipster;
import es.usc.citius.hipster.graph.GraphBuilder;
import es.usc.citius.hipster.graph.GraphSearchProblem;
import es.usc.citius.hipster.graph.HipsterDirectedGraph;
import es.usc.citius.hipster.graph.HipsterGraph;
import es.usc.citius.hipster.model.problem.SearchProblem;

public class Grafo {

		public static void main(String[] args) {

			//grafo (A) não direcionado
			    
			HipsterGraph<String,Double> grafoNDirA = GraphBuilder.<String,Double>create().connect("A").to("B").withEdge(2d).connect("A").to("C").withEdge(2d).connect("A").to("D").withEdge(2d).connect("B").to("C").withEdge(2d).connect("B").to("E").withEdge(2d).connect("B").to("G").withEdge(2d).connect("C").to("E").withEdge(2d).connect("C").to("F").withEdge(2d).connect("D").to("F").withEdge(2d).connect("E").to("F").withEdge(2d).connect("E").to("G").withEdge(2d).connect("F").to("H").withEdge(2d).connect("G").to("H").withEdge(2d).connect("G").to("J").withEdge(2d).connect("H").to("I").withEdge(2d).connect("I").to("J").withEdge(2d).createUndirectedGraph(); //atribuindo as arestas sem orientação aos respectivos vertices
			   
			SearchProblem problema = GraphSearchProblem.startingFrom("C").in(grafoNDirA).takeCostsFromEdges().build(); //iniciando no vertice C do grafo (A)

			
			//grafo (B) direcionado
			
			HipsterDirectedGraph<String,Double> grafoDirB = GraphBuilder.<String,Double>create().connect("A").to("B").withEdge(2d).connect("A").to("C").withEdge(2d).connect("A").to("D").withEdge(2d).connect("C").to("B").withEdge(2d).connect("C").to("E").withEdge(2d).connect("C").to("G").withEdge(2d).connect("D").to("A").withEdge(2d).connect("D").to("E").withEdge(2d).connect("E").to("H").withEdge(2d).connect("F").to("B").withEdge(2d).connect("G").to("D").withEdge(2d).connect("G").to("F").withEdge(2d).connect("G").to("H").withEdge(2d).createDirectedGraph(); //atribuindo as arestas orientadas aos respectivos vertices
		
			SearchProblem problem = GraphSearchProblem.startingFrom("C").in(grafoDirB).takeCostsFromEdges().build();  //iniciando no vertice C do grafo (B) 
			
			
			
			//resposta alternativa a) grafo (A)
			System.out.println("a)  ordem de visita dos vértices em uma BUSCA EM LARGURA no grafo (A) a partir de C: \n");
			System.out.println(Hipster.createBreadthFirstSearch(problema).search(""));         //varrendo o grafo (A) por B. em largura
			System.out.println("\n");
			
			//resposta alternativa a) grafo(B)
			System.out.println("a)  ordem de visita dos vértices em uma BUSCA EM LARGURA no grafo (B) a partir de C: \n");
			System.out.println(Hipster.createBreadthFirstSearch(problem).search(""));         //varrendo o grafo (B) por B. em largura
			System.out.println("\n");
			
			//resposta alternativa b) grafo (A)
			System.out.println("b)  ordem de visita dos vértices em uma BUSCA EM PROFUNDIDADE no grafo (A) a partir de C: \n");
			System.out.println(Hipster.createDepthFirstSearch(problema).search(""));         //varrendo o grafo (A) por B. em profundidade
			System.out.println("\n");   
			
			//resposta alternativa b) grafo(B)
			System.out.println("b)  ordem de visita dos vértices em uma BUSCA EM PROFUNDIDADE no grafo (B) a partir de C: \n");
			System.out.println(Hipster.createDepthFirstSearch(problem).search(""));         //varrendo o grafo (B) por B. em profundidade
			System.out.println("\n");   
			
			//resposta alternativa c) grafo (A)
			System.out.println("c) BUSCA EM LARGURA do grafo (A) a partir de C até A: \n");
			System.out.println(Hipster.createBreadthFirstSearch(problema).search("A"));     //buscando o vertice A do grafo (A) por B. em largura
			System.out.println("\n");
			
			System.out.println("c) BUSCA EM PROFUNDIDADE do grafo (A) a partir de C até A: \n");
			System.out.println(Hipster.createDepthFirstSearch(problema).search("A"));       //buscando o vertice A do grafo (A) por B. em profundidade
			System.out.println("\n");   
			
			System.out.println("c) BUSCA EM A* do grafo (A) a partir de C até A: \n");
			System.out.println(Hipster.createAStar(problema).search("A"));                  //buscando o vertice A do grafo (A) por B. em A*
			System.out.println("\n");
			   
			//resposta alternativa c) grafo (B)
			System.out.println("c) BUSCA EM LARGURA do grafo (B) a partir de C até A: \n");
			System.out.println(Hipster.createBreadthFirstSearch(problem).search("A"));      //buscando o vertice A do grafo (B) por B. em largura
			System.out.println("\n");
			
			System.out.println("c) BUSCA EM PROFUNDIDADE do grafo (B) a partir de C até A: \n");
			System.out.println(Hipster.createDepthFirstSearch(problem).search("A"));        //buscando o vertice A do grafo (B) por B. em profundidade
			System.out.println("\n");   
			
			System.out.println("c) BUSCA EM A* do grafo (B) a partir de C até A: \n");
			System.out.println(Hipster.createAStar(problem).search("A"));                   //buscando o vertice A do grafo (B) por B. em A*
			System.out.println("\n");
		}   
	}
