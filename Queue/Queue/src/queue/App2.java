package queue;
import stack.ArrayBoundedStack;

public class App2 {

    //print Queue elements
    public static <T> void printQueue(ArrayBoundedQueue<T> q) {
        ArrayBoundedQueue<T> t = new ArrayBoundedQueue();
        System.out.println("\n" + "--- The Elements are ---\n");
        while (!q.isEmpty()) {
            T e = q.dequeue();
            System.out.println(e + "\t");
            t.enqueue(e);
        }
        while (!t.isEmpty()) {
            q.enqueue(t.dequeue());
        }
    }

    //count Queue elements
    public static int CountElements(ArrayBoundedQueue<Integer> q) {
        int counter = 0;
        ArrayBoundedQueue<Integer> t = new ArrayBoundedQueue();
        while (!q.isEmpty()) {
            t.enqueue(q.dequeue());
            counter++;
        }
        while (!t.isEmpty()) {
            q.enqueue(t.dequeue());
        }
        return counter;
    }

    //count odd numbers 
    public static int CountOddNumbers(ArrayBoundedQueue<Integer> q) {
        int oddCounter = 0;
        ArrayBoundedQueue<Integer> t = new ArrayBoundedQueue();
        while (!q.isEmpty()) {
            int element = q.dequeue();
            t.enqueue(element);
            if (element % 2 != 0) {

                oddCounter++;
            }

        }
        while (!t.isEmpty()) {
            q.enqueue(t.dequeue());
        }
        return oddCounter;
    }

    //Delete last element
    public static void DeleteLast(ArrayBoundedQueue<Integer> q) {

        ArrayBoundedQueue<Integer> t = new ArrayBoundedQueue();
        int item = q.dequeue();
        t.enqueue(item);
        while (!q.isEmpty()) {
            item = q.dequeue();
            t.enqueue(item);

        }
        t.dequeue();
        while (!t.isEmpty()) {
            q.enqueue(t.dequeue());
        }

    }

    //Swap the first and the last element
    public static void SwapFirstLast(ArrayBoundedQueue<Integer> q) {
        ArrayBoundedQueue<Integer> t = new ArrayBoundedQueue();
        int fItem = q.dequeue();
        int lItem = 0;
        while (!q.isEmpty()) {
            lItem = q.dequeue();
            t.enqueue(lItem);
        }

        q.enqueue(lItem);//put the last item firstly
        t.dequeue();
        while (!t.isEmpty()) {

            int item = t.dequeue();
            q.enqueue(item);

        }
        q.enqueue(fItem);
    }
    // Merge two queues

    public static void mergeQueues(ArrayBoundedQueue<Integer> q1, ArrayBoundedQueue<Integer> q2) {

        ArrayBoundedQueue<Integer> qMerge = new ArrayBoundedQueue();
        while (!q1.isEmpty()) {
            qMerge.enqueue(q1.dequeue());
        }
        while (!q2.isEmpty()) {
            qMerge.enqueue(q2.dequeue());
        }
        printQueue(qMerge);
    }
    // calculate the average

    public static double getAverage(ArrayBoundedQueue<Double> f) {
        ArrayBoundedQueue<Double> temp = new ArrayBoundedQueue();
        double sum = 0;
        int count = 0;
        while (!f.isEmpty()) {
            Double e = f.dequeue();
            sum += e;
            count++;
            temp.enqueue(e);
        }
        while (!temp.isEmpty()) {
            f.enqueue(temp.dequeue());
        }

        return sum / count;
    }
    //split two queues

    public static void splitNegPos(ArrayBoundedQueue<Double> f) {
        ArrayBoundedQueue<Double> temp = new ArrayBoundedQueue<>();
        ArrayBoundedQueue<Double> qNeg = new ArrayBoundedQueue<>();
        ArrayBoundedQueue<Double> qPos = new ArrayBoundedQueue<>();
        while (!f.isEmpty()) {
            Double e = f.dequeue();
            if (e < 0) {
                qNeg.enqueue(e);
            } else {
                qPos.enqueue(e);
            }
            temp.enqueue(e);
        }

        while (!temp.isEmpty()) {
            f.enqueue(temp.dequeue());
        }

        printQueue(qNeg);
        printQueue(qPos);
    }
   // reverse a queue
    public static void reverseQueue(ArrayBoundedQueue<Double> q)
     {
         ArrayBoundedStack<Double> s = new ArrayBoundedStack();
         while (!q.isEmpty()){
             s.push(q.dequeue());
             //System.out.println("HHH");
         } 
         while(!s.isEmpty())
         {
             q.enqueue(s.top());
             //System.out.println("KKK");
             s.pop();
         }
         printQueue(q);
    }
    public static void main(String[] args) {
        ArrayBoundedQueue<Integer> bq = new ArrayBoundedQueue(5);
        bq.enqueue(15);
        bq.enqueue(52);
        bq.enqueue(25);
        bq.enqueue(53);
        bq.enqueue(55);
        //bq.enqueue(75);=>QueueOverFlowException
//        bq.dequeue();
//        bq.dequeue();
//        bq.dequeue();
//        bq.dequeue();
//        bq.dequeue();

        //bq.dequeue();=>QueueUnderFlowException
        printQueue(bq);
        System.out.println("All elements :" + CountElements(bq));
        System.out.println("Odd elements :" + CountOddNumbers(bq));
        //DeleteLast(bq);
        //printQueue(bq);
        SwapFirstLast(bq);
        printQueue(bq);
    }
}
