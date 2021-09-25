
public class ChildSelectionSort {
	private Child[] children;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public ChildSelectionSort(int size) {
		this.children = new Child[size];
		this.nItems = 0;
	}
	
	
	/**
	 * Inserting new child into the children array
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public void addChild(String firstName, String lastName, int age) {
		this.children[this.nItems] = new Child(firstName, lastName, age);
		this.nItems ++;
	}
	
	/**
	 * Displaying all children in the array
	 */
	public void displayChildren() {
		for(Child child: children) {
			System.out.println("Fullname: "+child.getFullName()+" | Age: "+child.getAge());
		}
	}
	
	
	/**
	 * Sorting children array using selection sort algorithm
	 */
	public void selectionSort() {
		int outerValue, innerValue, minValue;
		for(outerValue = 0; outerValue < this.nItems -1; outerValue ++) {
			minValue = outerValue;
			for(innerValue = outerValue + 1; innerValue < this.nItems; innerValue ++) {
				if(this.children[innerValue].getAge() < this.children[minValue].getAge()) {
					minValue = innerValue;
				}
				swap(outerValue, minValue);
			}
		}
	}
	
	
	/**
	 * Swapping two values
	 * @param outerValue
	 * @param innerValue
	 */
	public void swap(int outerValue, int innerValue) {
		Child temp = this.children[innerValue];
		this.children[innerValue] = this.children[outerValue];
		this.children[outerValue] = temp;
	}
	
	
}
