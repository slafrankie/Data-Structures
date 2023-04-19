/*
	Stephen LaFrankie
	4/26/18
	simple queue implementation using integers
*/
public class Queue<T>
{
	private Object[] queue;	//
	private int size;
	private int head = 0;
	private int tail = 0;
	private boolean empty = true;

	public Queue(int size)
	{
		this.queue = new Object[size];
		this.size = size;
	}
	//loads values into queue and throws exception if queue is full
	public void enqueue(T elem) throws Exception
	{
		if(head == tail && !empty)
		{
			throw new Exception("Cannot enqueue " + elem);
		}
		queue[tail] = elem;
		tail = (tail + 1) % size;
		empty = false;
	}

	//removes elements from queue and returns them
	public T dequeue() throws Exception
	{
		if(empty)
		{
			throw new Exception("The queue is empty");
		}
		//if queue is not empty
		T elem = (T) queue[head];
		head = (head + 1) % size;
		empty = (head == tail);
		return elem;
	}
	public static void main(String[] args) throws Exception
	{
		//create a queue of integers
		Queue<Integer> q = new Queue<Integer>(4);
		//queue items
		q.enqueue(52);
		q.enqueue(79);
		q.enqueue(45);
		q.enqueue(42);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}