package learningHibenet11;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sample {
	
@Override
	public String toString() {
		return "Sample [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
@Id
private int id;
private String name;
private long number;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
}
