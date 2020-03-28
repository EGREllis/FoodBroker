/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.broker.food.model;

/**
 *
 * @author jedidiahmay
 */
public class User {
    
    int userId;
    String firstName;
    String lastName;
    String photo;
    String address;
    int donorPoints;
    String socialMediaProfile;

    public String getSocialMediaProfile() {
        return socialMediaProfile;
    }

    public void setSocialMediaProfile(String socialMediaProfile) {
        this.socialMediaProfile = socialMediaProfile;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDonorPoints() {
        return donorPoints;
    }

    public void setDonorPoints(int donorPoints) {
        this.donorPoints = donorPoints;
    }
    
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
}
