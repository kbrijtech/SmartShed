package com.kbrij.organization;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.kbrij.common.info.*;
@Entity 
@Table(name="organizaion_table")
public class Zone 
{   
    @Id
	@GeneratedValue
	int  id  ;
    
	@Column(name="zone_name")
    String name ;
    
	@OneToOne(mappedBy="Zone")
	States state ;
	
	@Column(name="no_of_divisions")
	int noOfDivisions;

	@Column(name="head_quater")
	String headQuater;
	
	
	
   
}
