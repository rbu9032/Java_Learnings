package com.rbu.restaurant.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "delivery_partners")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deliveryPartnerId;

	private String deliveryPartnerName;

	private String aadharNo;

	private String phoneNo;

	private String email;

	private boolean isAvailable;

	private double rating;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "delivery_partner_id")
	private List<DeliveryAssignment> deliveryAssignments;

	public DeliveryPartner(String deliveryPartnerName, String aadharNo, String phoneNo, String email,
			boolean isAvailable, double rating, List<DeliveryAssignment> deliveryAssignments) {
		super();
		this.deliveryPartnerName = deliveryPartnerName;
		this.aadharNo = aadharNo;
		this.phoneNo = phoneNo;
		this.email = email;
		this.isAvailable = isAvailable;
		this.rating = rating;
		this.deliveryAssignments = deliveryAssignments;
	}

}
