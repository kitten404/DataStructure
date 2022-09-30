package Queue;

//dynamic queue, linked list method
public class DynamicQueue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T data){
        var dataIn = new QueueNode(data);
        if(last != null){
            this.last.next = dataIn;
        }
        last = dataIn;
        if(this.first == null){
            first = last;
        }
    }

    public T remove() throws Exception {
        if(isEmpty()){
            System.out.println("queue is empty");
            throw new Exception("");
        }
        var removedData = this.first.data;
        this.first = this.first.next;
        if(first == null){
            last = null;
        }
        return removedData;
    }

    public T peek(){
        if(!isEmpty()){
            return this.first.data;
        }
        System.out.println("queue is empty");
        return null;
    }

    public boolean isEmpty(){
        return this.first == null;
    }
}
