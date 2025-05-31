/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Munzhedzi Munyadziwa Petrus
 */
@Entity
public class Survey implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "PARTICIPATOR_NAME")
    private String participatorName;
    
    @Column(name = "EMAIL_ADDRESS")
    private String email_Address;
    
    @Column(name = "DATE_OF_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    
    @Column(name = "AGE")
    private int age;
    
    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;
    
    @Column(name = "FAVOURAT_FOOD")
    private String favourateFood;
    
    @Column(name = "MOVIE_RATING")
    private int movieRating;
    
    @Column(name = "RADIO_RATING")
    private int radioRating;
    
    @Column(name = "EAT_OUT_RATING")
    private int eatOutRating;
    
    @Column(name = "WATCH_TV_RATING")
    private int watchTvRating;
    
    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    public Survey() {
    }
    

    public Survey(String participatorName, String email_Address, Date dateOfBirth, int age, String contactNumber, String favourateFood, int movieRating, int radioRating, int eatOutRating, int watchTvRating) {
        this.participatorName = participatorName;
        this.email_Address = email_Address;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.contactNumber = contactNumber;
        this.favourateFood = favourateFood;
        this.movieRating = movieRating;
        this.radioRating = radioRating;
        this.eatOutRating = eatOutRating;
        this.watchTvRating = watchTvRating;
        this.creationDate = new Date();
    }

    public String getParticipatorName() {
        return participatorName;
    }

    public void setParticipatorName(String participatorName) {
        this.participatorName = participatorName;
    }

    public String getEmail_Address() {
        return email_Address;
    }

    public void setEmail_Address(String email_Address) {
        this.email_Address = email_Address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFavourateFood() {
        return favourateFood;
    }

    public void setFavourateFood(String favourateFood) {
        this.favourateFood = favourateFood;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    public int getRadioRating() {
        return radioRating;
    }

    public void setRadioRating(int radioRating) {
        this.radioRating = radioRating;
    }

    public int getEatOutRating() {
        return eatOutRating;
    }

    public void setEatOutRating(int eatOutRating) {
        this.eatOutRating = eatOutRating;
    }

    public int getWatchTvRating() {
        return watchTvRating;
    }

    public void setWatchTvRating(int watchTvRating) {
        this.watchTvRating = watchTvRating;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Survey)) {
            return false;
        }
        Survey other = (Survey) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Survey[ id=" + id + " ]";
    }
    
}
