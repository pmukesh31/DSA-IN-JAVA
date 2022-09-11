// class Queue{
//     int []arr;
//     int cap,front,size;
//     public Queue(int c){
//         arr=new int[c];
//         cap=c;
//         front=0;
//         size=0;
//     }
//     boolean isFull()
//     {
//         return (size==cap);
//     }
//     boolean isEmpty()
//     {
//         return (size==0);
//     }
//     int getFront()
//     {
//         if(isEmpty())
//         return -1;

//         return front;
//     }
//     int getRear()
//     {
//         if(isEmpty())
//         return -1;
//         else
//         return (front+size-1)%cap;
//     }
//     void enqueue(int x)
//     {
//         if(isFull())
//         return;
//         int rear=getRear();
//         rear=(rear+1)%cap;
//         arr[rear]=x;
//         size++;
//     }
//     void dequeue()
//     {
//         if(isEmpty())
//         return;
//         front=(front+1)%cap;
//         size--;
//     }


// }


// public class queueWithArray{
//     public static void main(String args[])
//     {
//         Queue q=new Queue(4);
//         q.enqueue(10);
//         q.enqueue(20);
//         q.enqueue(30);
//         System.out.println(q.getFront());
//         System.out.println(q.getRear());
//         q.dequeue();
//         q.dequeue();
//         System.out.println(q.getFront());
//         System.out.println(q.getRear());
//         q.enqueue(40);
//         q.dequeue();
//         System.out.println(q.getFront());
//         System.out.println(q.getRear());


//     }
    
// }
