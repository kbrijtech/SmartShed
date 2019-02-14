package com.kbrij.division;
import  javax.persistence.*;
import com.kbrij.common.info.*;
import com.kbrij.organization.*;
@Entity
@Table(name="DIVISION_TABLE")
public class Division 
{
    @Id
    @GeneratedValue
	int id;
    @Column(name ="division_name")
    String divisionName;
    @Column(name="no_of_sheds")
    int  noOfSheds;
    @Column(name="no_of_workshops")
    int  noOfWorkshops;
    @OneToOne(mappedBy="Division")
    States state;
    @OneToOne(mappedBy="Division")
    Zone zone;
    
    
    
	
	
}
