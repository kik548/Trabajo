package pepe;

/**
 * ejercicio3
 * Algoritmo Sillas Musicales  (q)
 * 
 * while  q.size()>1
 * posicion= numero random entre 1 y q.size()
 * for i=1  to posicion
 *    q.enqueue(q.dequeue)
 * end for
 * q.dequeue()
 * end while
 * return q.front()
    fin algoritmo
 */

/**
 * ejercicio3
 */

import java.util.*;
import java.util.concurrent.*;
public class ejercicio3 {
public static void main(String[] args) {
Queue<Integer> q=new LinkedBlockingDeque();

}
    public T play(Queue<T> q) {
    Random aux =new Random();
    int posicion=0;
    while(q.size()>1){
    posicion=aux.nextInt(q.size())+1;

        for(int i=1;i<=posicion;i++)
            q.offer(q.remove());
        q.remove();
        
    }

return q.peek();
}


}