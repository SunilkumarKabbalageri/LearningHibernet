package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
@Entity
class Institutes{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int inst_no;
	private String inst_loc;
	private String inst_head;
	private int fee;
	public int getInst_no() {
		return inst_no;
	}
	public void setInst_no(int inst_no) {
		this.inst_no = inst_no;
	}
	public String getInst_loc() {
		return inst_loc;
	}
	public void setInst_loc(String inst_loc) {
		this.inst_loc = inst_loc;
	}
	public String getInst_head() {
		return inst_head;
	}
	public void setInst_head(String inst_head) {
		this.inst_head = inst_head;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
}
@Entity
class Branches{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int I_id;
	private String Br_name;
	private int no_of_std;
	private String location;
	@ManyToMany
	List<Institutes> a1;
	public List<Institutes> getA1() {
		return a1;
	}
	public void setA1(List<Institutes> a1) {
		this.a1 = a1;
	}
	public int getI_id() {
		return I_id;
	}
	public void setI_id(int i_id) {
		I_id = i_id;
	}
	public String getBr_name() {
		return Br_name;
	}
	public void setBr_name(String br_name) {
		Br_name = br_name;
	}
	public int getNo_of_std() {
		return no_of_std;
	}
	public void setNo_of_std(int no_of_std) {
		this.no_of_std = no_of_std;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
@Entity
 class Testyantra{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String o_name;
@OneToMany
List<Branches> l1;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getO_name() {
	return o_name;
}
public void setO_name(String o_name) {
	this.o_name = o_name;
}
public List<Branches> getL1() {
	return l1;
}
public void setL1(List<Branches> l1) {
	this.l1 = l1;
}
}
public class Driver13{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Institutes i1=new Institutes();
		i1.setFee(35000);
		i1.setInst_head("Shankar_sir");
		i1.setInst_loc("2nd_block_Rajajinagar");
		//i1.setInst_no(123);
		
		Institutes i2=new Institutes();
		i2.setFee(35600);
		i2.setInst_head("Pradeep_sir");
		i2.setInst_loc("3rd_Main_RajainagarNew_Building");
		//i2.setInst_no(143);
		
		Institutes i3=new Institutes();
		i3.setFee(30000);
		i3.setInst_head("Kumar_sir");
		i3.setInst_loc("1st_block_Rajajinagar_PySpider");
		//i3.setInst_no(153);
		
		List<Institutes> m1=new ArrayList<Institutes>();
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		
		Branches b1=new Branches();
		b1.setA1(m1);
		b1.setBr_name("JSP_RAJAJINAGAR");
		//b1.setI_id(1);
		b1.setLocation("Rajajinagar");
		b1.setNo_of_std(1500);
		
		Branches b2=new Branches();
		b2.setA1(m1);
		b2.setBr_name("JSP_BASAVANAGUDI");
		//b2.setI_id(3);
		b2.setLocation("NATIONAL_COLLEGE");
		b2.setNo_of_std(1800);
		
		Branches b3=new Branches();
		b3.setA1(m1);
		b3.setBr_name("JSP_BTM");
		//b3.setI_id(2);
		b3.setLocation("BTM_LAYOUT");
		b3.setNo_of_std(1700);
		
		List<Branches> br=new ArrayList<Branches>();
		br.add(b1);
		br.add(b2);
		br.add(b3);
		
		Testyantra t1=new Testyantra();
		t1.setO_name("Testyantra");
		t1.setL1(br);
		
		entityTransaction.begin();
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(b3);
		entityManager.persist(i1);
		entityManager.persist(i2);
		entityManager.persist(i3);
		entityManager.persist(t1);
		entityTransaction.commit();
		
		
	}
}
