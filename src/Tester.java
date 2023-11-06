import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int selection;
        while(true){
            try{
                System.out.println("Select: \n1 for array based queue \n2 for linked list based queue");
                selection = sc.nextInt();
                if(selection!=1 && selection!=2) System.err.println("Wrong Selection. Please, try again.");
                else break;
            }
            catch(Exception e){
                System.err.println("Input Format Mismatch. Please, try again.");
                sc.next();
            }
        }

        Queue queue;
        if(selection==1) queue = new ArrayQueue();
        else queue = new ListQueue();
        System.out.println("Is the queue empty?\nAns: "+queue.isEmpty());
        for(int i = 0; i<=12; i+=2){
            try{
                queue.enQueue(i);
            }
            catch(QueueOverflowException e){
                System.err.println("Queue full\n"+e);
            }
        }

        System.out.println("toString Output: "+queue.toString());
        Object[] array = queue.toArray();
        for(int i =0; i<array.length; i++) System.out.println("=> "+array[i]);
        System.out.println("Size: "+queue.size());
        System.out.println("Is the queue empty?\nAns: "+queue.isEmpty());
        Object x = array[array.length-1];
        System.out.println("Distance of "+x+" from the head of the queue: "+queue.search(x));

        try{
            System.out.println("Dequeued: "+queue.deQueue());
        }
        catch(QueueUnderflowException e){
            System.err.println("Queue empty\n"+e);
        }
        try{
            System.out.println("Dequeued: "+queue.deQueue());
        }
        catch(QueueUnderflowException e){
            System.err.println("Queue empty\n"+e);
        }
        try{
            System.out.println("Dequeued: "+queue.deQueue());
        }
        catch(QueueUnderflowException e){
            System.err.println("Queue empty\n"+e);
        }
        System.out.println("Size: "+queue.size());
        System.out.println("Is the queue empty?\nAns: "+queue.isEmpty());
        x = array[array.length-1];
        System.out.println("Distance of "+x+" from the head of the queue: "+queue.search(x));

        array = queue.toArray();
        for(int i = 0; i<array.length; i++) System.out.println("=> "+array[i]);
        try{
            System.out.println("Peeked: "+queue.peek());
        }
        catch(QueueUnderflowException e){
            System.err.println("Queue empty\n"+e);
        }
        System.out.println("toString Output: "+queue.toString());

        try{
            System.out.println("Dequeued: "+queue.deQueue());
        }
        catch(QueueUnderflowException e){
            System.err.println("Queue empty\n"+e);
        }
        try{
            System.out.println("Dequeued: "+queue.deQueue());
        }
        catch(QueueUnderflowException e){
            System.err.println("Queue empty\n"+e);
        }
        try{
            System.out.println("Dequeued: "+queue.deQueue());
        }
        catch(QueueUnderflowException e){
            System.err.println("Queue empty\n"+e);
        }
        try{
            System.out.println("Peeked: "+queue.peek());
        }
        catch(QueueUnderflowException e){
            System.err.println("Queue empty\n"+e);
        }

        array = queue.toArray();
        for(int i =0; i<array.length; i++) System.out.println("=> "+array[i]);
        System.out.println("toString Output: "+queue.toString());
        System.out.println("Size: "+queue.size());
        System.out.println("Is the queue empty?\nAns: "+queue.isEmpty());
        x = array[array.length-1];
        System.out.println("Distance of "+x+" from the head of the queue: "+queue.search(x));
    }
}
