public class ArrayQueue implements Queue{
    int size;
    Object[] data;

    public ArrayQueue(){
        this.size = 0;
        this.data = new Object[5];
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
    public void enQueue(Object element) throws QueueOverflowException{
        if(this.size>=this.data.length) throw new QueueOverflowException();
        this.data[size] = element;
        size++;
    }

    /*
    Removes the element that is at the head of the queue. Throws
    QueueUnderflowException if the queue is empty
     */
    public Object deQueue() throws QueueUnderflowException{
        Object element = null;
        if(this.size<=0) throw new QueueUnderflowException();
        else {
            element = this.data[0];
            for(int i = 0; i < this.data.length - 1; i++){
                this.data[i] = this.data[i + 1];
                this.data[i+1] = null;
            }
            this.size--;
        }
        return element;
    }

    /*
    Peeks at the element which is at the head of the queue. Throws
    QueueUnderflowException if the queue is empty
     */
    public Object peek() throws QueueUnderflowException{
        Object element = null;
        if(this.size<=0) throw new QueueUnderflowException();
        else element = this.data[0];
        return element;
    }

    /*
    Returns a textual representation of the elements in the queue, using
    the format [ x y z ], where x and z are the items at the head and the tail
    of the queue respectively
     */
    public String toString(){
        String str = "[ ";
        for(int i = 0; i<this.size; i++){
            str = str + this.data[i] + " ";
        }
        str = str + ']';
        return str;
    }

    /*
    Returns an array with elements of the queue, with the element at the
    head of the queue in the first slot, and the tail being in the last slot
     */
    public Object[] toArray(){
        Object[] array;
        if(this.size==0){
            array = new Object[1];
            array[0] = null;
        }
        else{
            array = new Object[this.size];
            for(int i = 0; i<array.length; i++){
                array[i] = this.data[i];
            }
        }
        return array;
    }

    /*
    Searches for the given element in the queue, returning the offset
    from the head of the queue if the element is found, or -1 otherwise
     */
    public int search(Object element){
        int distance = 0;
        for(int i = 0; i<this.size; i++){
            if(this.data[i]==element) return distance;
            else distance+=1;
        }
        return -1;
    }

}
