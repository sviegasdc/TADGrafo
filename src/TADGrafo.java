import java.util.ArrayList;
import java.util.Vector;

public class TADGrafo {
    private Vector<Vertice> vertices;
    private Vector<Aresta> arestas;

    public TADGrafo(){
        vertices = new Vector<>();
        arestas = new Vector<>();
    }

    public ArrayList<Vertice> finalVertices(Aresta aresta){
        ArrayList<Vertice> arrayVertices = new ArrayList<Vertice>();
        for(Aresta a : arestas){
            if(a == aresta){
                arrayVertices.add(aresta.getVerticeDestino());
            }
        }
        return arrayVertices;
    }

    public Vertice oposto(Vertice vertice, Aresta aresta) throws InvalidGrafoException {
        if (aresta.getVerticeOrigem() == vertice) {
            return aresta.getVerticeDestino();
        } else if (aresta.getVerticeDestino() == vertice) {
            return aresta.getVerticeOrigem();
        }
        else{
            throw new InvalidGrafoException("Não é inciedente a v");
        }
    }

    public boolean ehAdjacente(Vertice vertice1,Vertice vertice2){
        for( Aresta aresta : arestas){
            if(aresta.getVerticeOrigem() == vertice1 && aresta.getVerticeOrigem() == vertice2){
                return true;
            } else if (aresta.getVerticeDestino() == vertice1 && aresta.getVerticeDestino() == vertice2) {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
    public void substituirElementoVertice(Vertice vertice, Object novoElemento){
        vertice.setElemento(novoElemento);
    }
    public void substituirElementoAresta(Aresta aresta, Object novoElemento){
        aresta.setElemento(novoElemento);
    }
    public Vertice inserirVertice(Object elemento){
        // criando o novo vertice
        Vertice novoVertice = new Vertice(elemento);
        // adicionando o vertice ao vector
        this.vertices.add(novoVertice);
        return novoVertice;
    }

    public Aresta inserirAresta(Vertice vertice1, Vertice vertice2, Object elemento, boolean direcionada){
        Aresta novoAresta =  new Aresta(vertice1,vertice2,elemento,direcionada);
        this.arestas.add(novoAresta);
        return novoAresta;
    }

    public Object removeVertice(Vertice verticeParaRemover){
        Object elementoRemovido = verticeParaRemover.getElemento();
        // achar a aresta incidente para elimina-lá
        for (Aresta aresta : arestas){
            if(aresta.getVerticeOrigem()  == verticeParaRemover || aresta.getVerticeDestino()  == verticeParaRemover){
                aresta.setVerticeDestino(null);
                aresta.setVerticeOrigem(null);
                aresta.setElemento(null);
                arestas.remove(aresta);
            }
        }
        verticeParaRemover.setElemento(null);
        vertices.remove(verticeParaRemover);
        return elementoRemovido;
    }

    public Object removeAresta(Aresta arestaParaRemover){
        Object elementoRemovido = arestaParaRemover.getElemento();
        arestaParaRemover.setVerticeDestino(null);
        arestaParaRemover.setVerticeOrigem(null);
        arestaParaRemover.setElemento(null);
        arestas.remove(arestaParaRemover);
        return elementoRemovido;
    }

    public Object arestasIncidentes(Vertice vertice){
        // checar as arestas que estão ligadas oa vertice
        for (Aresta aresta : arestas){
            if(aresta.getVerticeOrigem()  == vertice || aresta.getVerticeDestino()  == vertice){
                System.out.println("Vértice "+ vertice +" tem as seguintes arestas incidentes: ");
                return aresta.getElemento();
            }
        }
        return null;
    }

    public Object vertices(){
        return this.vertices;
    }

    public Object arestas(){
        return this.arestas;
    }

    public boolean ehDirecionada(Aresta aresta){
        return aresta.ehDirecionada();
    }

}
