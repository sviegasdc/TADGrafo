import java.util.Vector;

public class TADGrafo {
    private Vector<Vertice> vertices;
    private Vector<Aresta> arestas;

    public TADGrafo(){
        vertices = new Vector<>();
        arestas = new Vector<>();
    }

    public Object finalVertices(Object arrayVertices){
        return null;
    }

    public Object oposto(Object vertice, Object aresta){
        return null;
    }

    public boolean ehAdjacente(Object vertice1,Object vertice2){
        return true;
    }
    public void substituirElementoVertice(Object elemento1, Object elemento2){

    }

    public void substituirElementoAresta(Object elemento1, Object elemento2){

    }

    public Object inserirVertice(Object elemento){
        return null;
    }

    public Object inserirAresta(Object vertice1, Object vertice2, Object elemento){
        return null;
    }

    public Object removeVertice(Object VerticeParaRemover){
        return null;
    }

    public Object removeAresta(Object arestaParaRemover){
        return null;
    }

    public Object arestasIncidentes(Object vertice){
        return null;
    }

    public Object vertices(){
        return null;
    }

    public Object arestas(){
        return null;
    }

    public boolean ehDirecionada(Object aresta){
        return true;
    }

    public Object inserirArestaDirecionada(Object verticeOrigem, Object verticeDestino, Object elemento){
        return null;
    }

    private class Vertice{
        private Object nome;

        public Vertice(Object nome) {
            this.nome = nome;
        }
    }
}
