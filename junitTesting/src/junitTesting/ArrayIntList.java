package junitTesting;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntList {
	List<Integer> list = null;
	
	public ArrayIntList() {
		list = new ArrayList<Integer>();
	}
	
	public ArrayIntList(int val) {
		list = new ArrayList<Integer>();
		list.add(val);
	}
	
	public void add(int val) {
		list.add(val);
	}
	
	public void remove(int pos) {
		list.remove(pos);
	}
	
	public int size() {
		return list.size();
	}
	
	public int indexOf(int val) {
		return list.indexOf(val);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public boolean contains(int val) {
		return list.contains(val);
	}
	
	public int get(int pos) {
		return list.get(pos);
	}
	
	public String toString() {
		return list.toString();
	}
	
	
	
}
