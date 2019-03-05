
public class Stack<E> implements IStack<E> {

	private int maxSize;
	   private String[] stack;
	   private int top;
	   
	   public Stack(int length) {
		   
		   this.maxSize = length;
		   this.stack = new String[maxSize];
		   this.top = -1;
	   }
	public void push(String j) {
		// TODO Auto-generated method stub
		this.stack[++top] = j;
		
	}

	@Override
	public String pop() {
		// TODO Auto-generated method stub
		return stack[top--];
	}

	@Override
	public int height() {
		// TODO Auto-generated method stub	
		return maxSize - 1;
	}

}
