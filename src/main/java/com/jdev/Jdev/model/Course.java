package com.jdev.Jdev.model;

import com.jdev.Jdev.model.Category;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String subTitle;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String creator;

    @Column(nullable = false)
    private Integer assessments;

    @Column(nullable = false)
    private String releaseYear;

    @Column(nullable = false)
    private Integer amountHours;

    @Column(nullable = false)
    private Integer downloadableResouces;

    @Column(nullable = false)
    private Integer amountExercises;

    @Column(nullable = false)
    private Boolean certificate;

    @Column(nullable = false)
    private Boolean lifeTimeAccess;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private String language;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getCreator() {
        return creator;
    }

    public Integer getAssessments() {
        return assessments;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public Integer getAmountHours() {
        return amountHours;
    }

    public Integer getDownloadableResouces() {
        return downloadableResouces;
    }

    public Integer getAmountExercises() {
        return amountExercises;
    }

    public Boolean getCertificate() {
        return certificate;
    }

    public Boolean getLifeTimeAccess() {
        return lifeTimeAccess;
    }

    public Double getPrice() {
        return price;
    }

    public String getLanguage() {
        return language;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setAssessments(Integer assessments) {
        this.assessments = assessments;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setAmountHours(Integer amountHours) {
        this.amountHours = amountHours;
    }

    public void setDownloadableResouces(Integer downloadableResouces) {
        this.downloadableResouces = downloadableResouces;
    }

    public void setAmountExercises(Integer amountExercises) {
        this.amountExercises = amountExercises;
    }

    public void setCertificate(Boolean certificate) {
        this.certificate = certificate;
    }

    public void setLifeTimeAccess(Boolean lifeTimeAccess) {
        this.lifeTimeAccess = lifeTimeAccess;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(id, course.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
