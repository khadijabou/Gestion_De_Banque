
package com.zsmart.GestionDeBanque.bean;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("V")
public class Verement extends Operation {

	public Verement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Verement(Date dateOperation, double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Verement";
	}
  
}