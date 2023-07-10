package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patientdto {
 @Id
 private int pid;
 private String pname;
 private String Padd;
 private long pnumber;
 private String date;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPadd() {
	return Padd;
}
public void setPadd(String padd) {
	Padd = padd;
}
public long getPnumber() {
	return pnumber;
}
public void setPnumber(long pnumber) {
	this.pnumber = pnumber;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "Patientdto [pid=" + pid + ", pname=" + pname + ", Padd=" + Padd + ", pnumber=" + pnumber + ", date=" + date
			+ "]";
}
 
}
