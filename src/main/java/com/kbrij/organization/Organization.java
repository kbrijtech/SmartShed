package com.kbrij.organization;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity 
@Table(name="organizaion_table")
public class Organization 
{   @Id
	@GeneratedValue
	int  id  ;
    @Column(name ="organization_name")
	String name ;
	@Override
	
	
	
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + "]";
	}
	
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	public Organization() {
		super();
	}
	public Organization(String name) {
		super();
		this.name = name;
	}
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
   
    
    
}
