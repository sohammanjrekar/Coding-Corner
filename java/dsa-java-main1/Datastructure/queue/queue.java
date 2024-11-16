package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        // Queue<Integer> q= new LinkedList<>();
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(45);
        queue.add(56);
        queue.add(40);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.remove();
        queue.add(15);
        queue.add(36);
        queue.add(20);
        System.out.println(queue);
        System.out.println("Size of Queue: " + queue.size());
        System.out.println(" Remove from top : " + queue.poll());
        Iterator iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}

// add(int index, element) This method is used to add an element at a particular
// index in the queue. When a single parameter is passed, it simply adds the
// element at the end of the queue.
// addAll(int index, Collection collection) This method is used to add all the
// elements in the given collection to the queue. When a single parameter is
// passed, it adds all the elements of the given collection at the end of the
// queue.
// size() This method is used to return the size of the queue.
// clear() This method is used to remove all the elements in the queue. However,
// the reference of the queue created is still stored.
// remove() This method is used to remove the element from the front of the
// queue.
// remove(int index) This method removes an element from the specified index. It
// shifts subsequent elements(if any) to left and decreases their indexes by 1.
// remove(element) This method is used to remove and return the first occurrence
// of the given element in the queue.
// get(int index) This method returns elements at the specified index.
// set(int index, element) This method replaces elements at a given index with
// the new element. This function returns the element which was just replaced by
// a new element.
// indexOf(element) This method returns the first occurrence of the given
// element or -1 if the element is not present in the queue.
// lastIndexOf(element) This method returns the last occurrence of the given
// element or -1 if the element is not present in the queue.
// equals(element) This method is used to compare the equality of the given
// element with the elements of the queue.
// hashCode() This method is used to return the hashcode value of the given
// queue.
// isEmpty() This method is used to check if the queue is empty or not. It
// returns true if the queue is empty, else false.
// contains(element) This method is used to check if the queue contains the
// given element or not. It returns true if the queue contains the element.
// containsAll(Collection collection) This method is used to check if the queue
// contains all the collection of elements.
// sort(Comparator comp) This method is used to sort the elements of the queue
// on the basis of the given comparator.
// boolean add(object) This method is used to insert the specified element into
// a queue and return true upon success.
// boolean offer(object) This method is used to insert the specified element
// into the queue.
// Object poll() This method is used to retrieve and removes the head of the
// queue, or returns null if the queue is empty.
// Object element() This method is used to retrieves, but does not remove, the
// head of queue.
// Object peek() This method is used to retrieves, but does not remove, the head
// of this queue, or returns null if this queue is empty.