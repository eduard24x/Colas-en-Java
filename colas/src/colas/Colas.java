package colas;//nombre del paquete

import java.util.LinkedList;//importamos las librerias
import java.util.Queue;

//nombre de la clase
public class Colas {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println(q);
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        System.out.println(q);
        
        System.out.println("elemnto siguiente: "
        +q.peek());
        System.out.println("Elemento siguiente y eliminarlo: "
        +q.poll());
        System.out.println(q);
        System.out.println("Tamaño de la cola: "
        +q.size());
        System.out.println("esta vacio: "
                +q.isEmpty());
        
        q.clear();
         System.out.println("Tamaño de la cola: "
        +q.size());
        System.out.println("esta vacio: "
                +q.isEmpty());
    }
    
}
