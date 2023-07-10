package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pancard {
@Id
private int id;
private String address;
private String Mobileno;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileno() {
	return Mobileno;
}
public void setMobileno(String mobileno) {
	Mobileno = mobileno;
}

}
