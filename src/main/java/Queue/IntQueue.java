package Queue;

public class IntQueue {
    private Integer[] integerQueue;
    private int size;

    public IntQueue(){
        this.integerQueue = new Integer[size];
        this.size = 0;
    }

    private boolean isFull(){
        if(this.integerQueue.length == size) {
            return true;
        }
        return false;
    }

    private boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }

    public void display(){
        for(int i=0; i<size; i++) {
            System.out.println(this.integerQueue[i]);
        }
    }

    public void addTail(Integer element){
        if(!this.isFull()) {
            this.integerQueue[size] = element;
            this.size++;
        } else {
            System.out.println("Queue has reached its full capacity");
        }
    }

    public Integer removeTail() {
        Integer removedInt = -1;
        if(!this.isEmpty()) {
            removedInt = this.integerQueue[0];
            for(int i = 0; i<this.size-1; i++){
                this.integerQueue[i] = this.integerQueue[i+1];
            }
            this.size--;
        } else {
            System.out.println("Queue is already empty");
        }
        return removedInt;
    }

}
