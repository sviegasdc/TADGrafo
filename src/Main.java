
public class Main {
    public static void main(String[] args) {
        TADGrafo grafo = new TADGrafo();
        Vertice v1 = grafo.inserirVertice("vertice1");
        Vertice v2 = grafo.inserirVertice("vertice2");
        System.out.println(grafo.vertices());
        grafo.inserirAresta(v1, v2, "aresta1", true);
        System.out.println(grafo.arestas());
        Vertice v3 = grafo.inserirVertice("vertice3");
        Aresta a1 = grafo.inserirAresta(v1,v3,"aresta2", false);
        System.out.println(grafo.arestas());
        System.out.println(grafo.ehDirecionada(a1));
    }
}