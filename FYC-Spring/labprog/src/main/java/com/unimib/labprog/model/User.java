package com.unimib.labprog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class User /* implements Serializable */ {

    public User() { /* DEFAULT CONSTRUNCTOR */ }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "*Please provide your first name")
    private String firstName;

    @NotBlank(message = "*Please provide your last name")
    private String lastName;

    @Email(message = "*Please provide a valid Email")
    @NotBlank(message = "*Please provide an email")
    private String email;

    @Length(min = 5, message = "*Your password must have at least 5 characters")
    @NotBlank(message = "*Please provide your password")
    @Transient
    private String password;

    @ManyToOne
    @JoinColumn(name="PERSONALTRAINER")
    private User personalTrainer;

    /*
    @OneToOne
    @JoinColumn(unique = true)
    private RecordSet recordSet;
    */

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

    // Getters and Setters
}