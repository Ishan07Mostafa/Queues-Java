public class ListQueue implements Queue{
    int size;
    Node head;
    Node tail;

    public ListQueue(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    //The number of items on the queue
    public int size(){
        return this.size;
    }

    //Returns true if the queue is empty
    public boolean isEmpty(){
        if(this.size==0) return true;
        return false;
    }

    /*
    Adds a new element at the end of the queue. Throws
    QueueOverflowException if the queue is at maximum capacity. Does
    not throw any exception for an unbounded queue that dynamically
    adjusts its capacity
    */
    public void enQueue(Object element){
        Node n = new Node(element,null);
        if(this.size==0){
            this.head = n;
            this.tail = this.head;
        }
        else{
            this.tail.next = n;
            this.tail = this.tail.next;
        }
        this.size++;
    }

    /*
    Removes the element that is at the head of the queue. Throws
    QueueUnderflowException if the queue is empty
     */
    public Object deQueue() throws QueueUnderflowException{
        Object element = null;
        if(this.size<=0) throw new QueueUnderflowException();
        element = this.head.value;
        this.head = this.head.next;
        this.size--;
        return element;
    }

    /*
    Peeks at the element which is at the head of the queue. Throws
    QueueUnderflowException if the queue is empty
     */
    public Object peek() throws QueueUnderflowException{
        Object element = null;
        if(this.size<=0) throw new QueueUnderflowException();
        element = this.head.value;
        return element;
    }

    /*
    Returns a textual representation of the elements in the queue, using
    the format [ x y z ], where x and z are the items at the head and the tail
    of the queue respectively
     */
    public String toString(){
        String str = "[ ";
        for(Node n = this.head; n!=null; n = n.next){
            str = str + n.value + " ";
        }
        str = str + "]";
        return str;
    }

    /*
    Returns an array with elements of the queue, with the element at the
    head of the queue in the first slot, and the tail being in the last slot
     */
    public Object[] toArray(){
        Object[] array = new Object[this.size];
        Node n = this.head;
        for(int i = 0; i<array.length; i++){
            array[i] = n.value;
            n = n.next;
        }
        return array;
    }

    /*
    Searches for the given element in the queue, returning the offset
    from the head of the queue if the element is found, or -1 otherwise
     */
    public int search(Object element){
        int distance = 0;
        for(Node n = this.head; n!=null; n = n.next){
            if(n.value==element) return distance;
            else distance++;
        }
        return -1;
    }

}
