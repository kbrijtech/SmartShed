package com.kbrij.common.info;
import javax.persistence.*;
@Entity
@Table(name="STATE_TABLE")
public class States 
{
 @Id
 @GeneratedValue
 int id ;
 @Column(name="name")
 String name;
 
@Override
public String toString() {
	return "States [id=" + id + ", name=" + name + "]";
}
public States() {
	super();
}
public States(String name) {
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
