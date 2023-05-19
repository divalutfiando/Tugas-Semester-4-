package com.ibik.library.app.model;

public class User {
	private int ID;
	private Long NIK;
	private String FullName;
	private String PlaceBirth;
	private String BirthDate;
	private String Gender;
	private String Address;
	private String Email;
	private String Password;
	
//	Long NIK2 = Long.parseLong(NIK);
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
//	public String getNIK() {
//		return NIK;
//	}
//	public void setNIK(String nik) {
//		NIK = nik;
//	}
	public Long getNIK2() {
		return NIK;
	}
	public void setNIK2(Long nik) {
		NIK = nik;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getPlaceBirth() {
		return PlaceBirth;
	}
	public void setPlaceBirth(String placeBirth) {
		PlaceBirth = placeBirth;
	}
	public String getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

}