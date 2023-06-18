public class Aresta {
    private Object verticeOrigem;
    private Object verticeDestino;
    private Object elemento;
    private boolean direcionada;


    public Aresta(Object verticeOrigem,Object verticeDestino){
        this.verticeOrigem = verticeOrigem;
        this.verticeDestino = verticeDestino;
        this.direcionada = false;
    }

    public void setElemento(Object elemento){
        this.elemento = elemento;
    }

    public Object getElemento(){
        return elemento;
    }

    public Object getVerticeOrigem(){
        return verticeOrigem;
    }

    public void setVerticeOrigem(Object verticeOrigem){
        this.verticeOrigem = verticeOrigem;
    }

    public void setVerticeDestino(Object verticeDestino){
        this.verticeDestino = verticeDestino;
    }

    public Object getVerticeDestino(){
        return verticeDestino;
    }

    public boolean ehDirecionada(){
        return direcionada;
    }

    public void setDirecionada(boolean direcionada) {
        this.direcionada = direcionada;
    }
}
