package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] stuff;
	public ArrayList() {
		stuff=(T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return stuff[loc];
	}
	
	public void add(T val) {
		T[] newStuff=(T[]) new Object[stuff.length+1];
		for (int i = 0; i < stuff.length; i++) {
			newStuff[i]=stuff[i];
		}
		newStuff[stuff.length]=val;
		stuff=newStuff;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newStuff=(T[]) new Object[stuff.length+1];
		for (int i = 0; i < stuff.length; i++) {
			if(i<loc) {
				newStuff[i]=stuff[i];
			}else {
				newStuff[i+1]=stuff[i];
			}
		}
		newStuff[loc]=val;
		stuff=newStuff;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		stuff[loc]=val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newStuff=(T[]) new Object[stuff.length-1];
		for (int i = 0; i < newStuff.length; i++) {
			if(i<loc) {
				newStuff[i]=stuff[i];
			}else {
				newStuff[i]=stuff[i+1];
			}
		}
		stuff=newStuff;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < stuff.length; i++) {
			if(val.equals(stuff[i])) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return stuff.length;
	}
}