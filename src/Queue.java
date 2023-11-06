public interface Queue {
    //The number of items on the queue
    public int size();
    //Returns true if the queue is empty
    public boolean isEmpty();
    /*
    Adds a new element at the end of the queue. Throws
    QueueOverflowException if the queue is at maximum capacity. Does
    not throw any exception for an unbounded queue that dynamically
    adjusts its capacity
    */
    public void enQueue(Object e) throws QueueOverflowException;
    /*
    Removes the element that is at the head of the queue. Throws
    QueueUnderflowException if the queue is empty
     */
    public Object deQueue() throws QueueUnderflowException;
    /*
    Peeks at the element which is at the head of the queue. Throws
    QueueUnderflowException if the queue is empty
     */
    public Object peek() throws QueueUnderflowException;
    /*
    Returns a textual representation of the elements in the queue, using
    the format [ x y z ], where x and z are the items at the head and the tail
    of the queue respectively
     */
    public String toString();
    /*
    Returns an array with elements of the queue, with the element at the
    head of the queue in the first slot, and the tail being in the last slot
     */
    public Object[] toArray();
    /*
    Searches for the given element in the queue, returning the offset
    from the head of the queue if the element is found, or -1 otherwise
     */
    public int search(Object e);
}
