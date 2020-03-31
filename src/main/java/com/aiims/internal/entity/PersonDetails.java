/**
 * 
 */
package com.aiims.internal.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author faza
 *
 */
@Entity
@Getter
@Setter
@ToString
@Table(name="person-detail")
@NoArgsConstructor
@AllArgsConstructor
public class PersonDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
	private Integer id;
	
    @Column(name = "first_name", length = 100)
    private String firstName;
    
    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "address", length = 1000)
    private String address;
    
    @Column(name = "contact_number", length = 12)
    private Integer contactNumber;
    
  
    
    
}
