public class Aresta {
    private Vertice verticeOrigem;
    private Vertice verticeDestino;
    private Object elemento;
    private boolean direcionada;


    public Aresta(Vertice verticeOrigem, Vertice verticeDestino, Object elemento, boolean direcionada){
        this.verticeOrigem = verticeOrigem;
        this.verticeDestino = verticeDestino;
        this.elemento = elemento;
        this.direcionada = false;
    }

    public void setElemento(Object elemento){
        this.elemento = elemento;
    }

    public Object getElemento(){
        return elemento;
    }

    public Vertice getVerticeOrigem(){
        return verticeOrigem;
    }

    public void setVerticeOrigem(Vertice verticeOrigem){
        this.verticeOrigem = verticeOrigem;
    }

    public void setVerticeDestino(Vertice verticeDestino){
        this.verticeDestino = verticeDestino;
    }

    public Vertice getVerticeDestino(){
        return verticeDestino;
    }

    public boolean ehDirecionada(){
        return direcionada;
    }

    public void setDirecionada(boolean direcionada) {
        this.direcionada = direcionada;
    }
}
