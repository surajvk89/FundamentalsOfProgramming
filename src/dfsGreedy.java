//DFS for graph

import java.util.Iterator;
import java.util.LinkedList;

class Graph{
    int nV;
    boolean visited[];
    LinkedList<Integer> adjc[];
    Graph(int nV){
        this.nV = nV;
        adjc = new LinkedList[nV];
        for(int i=0;i<nV;i++)
            adjc[i] = new LinkedList();
    }

    public void addEdge(int s,int e){
        adjc[s].add(e);
//        adjc[e].add(s);   //this is valid only in case of undirected graph
    }

    private void DFSVisit(int v,boolean visited[]){
        visited[v] = true; //mark as visited
        System.out.print(v + " "); //print its value

        //create iterator for linkedlist
        Iterator<Integer> itr = adjc[v].listIterator();
        while(itr.hasNext()){
            int node = itr.next();
            if(!visited[node]){
                DFSVisit(node,visited);
            }
        }
    }

    public void DFS(int RN){
        visited = new boolean[nV];
        DFSVisit(RN,visited);
    }

}


public class dfsGreedy {
    public static void main(String[] args) {
        Graph g = new Graph(5);

        g.addEdge(0,4);
        g.addEdge(0,2);
        g.addEdge(2,1);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,2);

        g.DFS(4);
    }
}





