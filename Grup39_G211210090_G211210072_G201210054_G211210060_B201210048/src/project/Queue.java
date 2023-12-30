package project;
import java.util.LinkedList;

public class Queue {
        private LinkedList<Process> queue = new LinkedList<Process>();

    public void PushQueue(Process process) {
        queue.addLast(process);

    }

    public Process RemoveQueue() {
        return queue.remove();
    }

    public Process RemoveByIdQueue(int id) {
        return queue.remove(id);
    }

    public Process Get(int index)
    {
        return queue.get(index);
    }

    public boolean isQueueEmpty() {
        return queue.isEmpty();
    }

    public int QueueSize()
    {
        return queue.size();
    }

}