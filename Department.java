package assignment1;


public class Department {

	protected String name;
	protected int numberOfWorker;

	public static int number;


	// Do not change anything in this method
	public String getName() {
		return name;
	}


	// Fill in the blanks. 666
	public Department(String department, int numberOfWorker) {
		this.name = department;
		this.numberOfWorker = numberOfWorker;

	}
	// Erase the content. Fill in the blanks. If name and numberOfWorker are equal, it returns true666
	@Override
	public boolean equals(Object obj) {

		return this.name.equals(((Department)obj).name) && this.numberOfWorker==((Department)obj).numberOfWorker ;

	}
	// Erase the content. Fill in the blanks. Format: [name]/[numberOfWorker]
	// For example: Android/number of worker : 30
	@Override
	public String toString() {
		
		//return " ";
		return name + "/number of worker : " + numberOfWorker ;

	}

		
		

}
