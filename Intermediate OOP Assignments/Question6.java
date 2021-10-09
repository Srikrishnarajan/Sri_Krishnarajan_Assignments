//Program to check whether the data is saved in a file or in database
package co.skr;

abstract class Persistence {
    abstract public String persist();
}

class FilePersistence extends Persistence {
    @Override public String persist() {
    	return "Data is saved in a file";
    }
}

class DatabasePersistence extends Persistence{
    @Override public String persist() {
    	return "Data is saved in a database";
    }
}

public class Question6 {

	public static void main(String[] args) {
		Persistence file = new FilePersistence();
    	Persistence db = new DatabasePersistence();
    	
    	System.out.println(file.persist());
    	System.out.println(db.persist());
	}

}
