package ua.lpnuai.oop.slavchanyk09;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Container  implements Serializable {
	private String [] text;
	private int start;
	private int end;

	public Container(String [] text) {
		this.text = text;
		this.start = 0;

		this.end = text.length - 1;

		if(this.text.length == 0) {
			System.out.println("Text is empty");
		}
	}

	public void add (String toAdd){
		if(this.end >= this.text.length - 1){
			this.text = resize(this.text);
		}
		this.end ++;
		this.text[this.end] = toAdd;
	}

	public void clear (){
		this.text = null;
	}

	private int find (String toFind){
		for (int i = 0; i <= this.end; i++){
			if (this.text[i].equals(toFind)){
				return i;
			}
		}
		return -1;
	}

	public boolean contains (String toFind){
		if (find(toFind) == -1){
			return false;
		} else return true;
	}

	public boolean remove (String toRemove) {
		String[] strArr = new String[this.text.length];
		int index = find(toRemove);
		if (index != -1) {
			for (int i = 0; i <= this.end; i++) {
				if (i < index) {
					strArr[i] = this.text[i];
				}
				if (i > index) {
					strArr[i - 1] = this.text[i];
				}
			}
			this.text = strArr;
			this.end--;
			return true;
		} else return false;
	}

	public Object[] toArray(){
		String[] result = new String[this.end+1];
		for (int i = 0; i <= this.end; i++){
			result[i] = this.text[i];
		}
		return result;
	}

	public int size() {
		return this.end + 1;
	}

	public boolean containsAll (String[] toFind){
		int coutResult = 0;
		for (String target : toFind) {
			if(find(target) != -1){
				coutResult ++;
			}
		}

		if (coutResult == toFind.length){
			return true;
		} else return false;
	}


	public Iterator<String> iterator() {
		return new ContainerIterator();
	}

	@Override
	public String toString() {
		return "Container{" +
				"text=" + Arrays.toString(this.text) +
				", start='" + this.start + '\'' +
				", end='" + this.end + '\'' +
				'}';
	}

	private String [] resize(String[] text) {
		//int incrSize = text.length/4;
		String [] textArr = new String[this.text.length * 2];
		for (int i = 0; i < this.text.length; i++){
			textArr[i] = this.text[i];
		}
		return textArr;
	}

	class ContainerIterator implements Iterator<String> {
		private String cursor;
		private int position;

		public ContainerIterator() {
			this.cursor = text[position];
			this.position = 0;
		}

		public boolean hasNext() {
			return this.position <= end;
		}

		public String next() {
			String current = cursor;
			if(position == end){
				position++;
				return current;
			} else {
				position++;
				cursor = text[position];
				return current;
			}
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

		@Override
		public String toString() {
			return cursor;
		}
	}
}
