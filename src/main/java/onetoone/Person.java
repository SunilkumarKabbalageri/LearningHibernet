package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
@Id
private String pname;
@OneToOne
Pancard p;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Pancard getP() {
	return p;
}
public void setP(Pancard p) {
	this.p = p;
}
}
