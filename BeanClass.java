package com.dms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_dms")
public class Doctor {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private String age;

	@Column(name = "email")
	private String email;

	@Column(name = "special")
	private String special;

	@Column(name = "contact")
	private String contact;

	@Column(name = "location")
	private String location;

	public Doctor() {
		super();
		}

	public Doctor(int id, String name, String age, String email, String special, String contact, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.special = special;
		this.contact = contact;
		this.location = location;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", special=" + special
				+ ", contact=" + contact + ", location=" + location + "]";
	}

}
