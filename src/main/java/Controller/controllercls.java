package Controller;

import java.util.Scanner;

import dao.patientdao;
import dto.Patientdto;

public class controllercls {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	while(flag){
	System.out.println("Enter the required value");
	System.out.println("1.insert\n2.update\n3.remove\n4.fetchall\n5.delete");
	System.out.println("Enter the valuue");
	int n=sc.nextInt();
	patientdao patientdao=new patientdao();
	switch(n){
	case 1:{
		System.out.println("Enter the pid");
		int pid=sc.nextInt();
		System.out.println("Enter the pname");
		String pname=sc.next();
		System.out.println("Enter the padd");
		String Padd=sc.next();
		System.out.println("Enter the pnumber");
		long pno=sc.nextLong();
		System.out.println("Enter the date");
		String date=sc.next();
		patientdao.insert(pid,pname,Padd,pno,date);
	}
	break;
	case 2:{
		System.out.println("Enter the id");
		int pid=sc.nextInt();
		System.out.println("Enter the pname ");
		String pname=sc.next();
		System.out.println("Enterr pnumber");
		long pnumber=sc.nextLong();
		patientdao.Update(pid,pname,pnumber);
		
	}
	break;
	case 3:{
		System.out.println("Enter the pid");
		int pid=sc.nextInt();
		patientdao.Remove(pid);
	}
	break;
	case 4:{
		patientdao.fetchAll();
	}
	break;
	case 5:{
		patientdao.deleteAll();
	}
	break;
	case 6:{
		flag=false;
		break;
	}
	default:{
		System.out.println("Data in valid");
	}
	}
	
}
}
}
