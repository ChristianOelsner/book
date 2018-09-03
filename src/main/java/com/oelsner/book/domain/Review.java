/*
Created by:
  User: oelsner
  Date: 9/3/18
  Time: 7:09 PM
*/


package com.oelsner.book.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String review;

    public Review() {
    }

    public Review(String review) {
        this.review = review;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review1 = (Review) o;

        if (id != null ? !id.equals(review1.id) : review1.id != null) return false;
        return review != null ? review.equals(review1.review) : review1.review == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, review);
    }

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", review='" + review + '\'' +
                '}';
    }
}
