package com.sece;

public class Customer {
	private int id;
    private String name;
    private String contactInfo;

 // Modify the Customer constructor to exclude ID
    public Customer(String customerName, String customerContact) {
        this.name = customerName;
        this.contactInfo = customerContact;
        // ID will be auto-generated by the database
    }

    // Getters and setter
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

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
}
