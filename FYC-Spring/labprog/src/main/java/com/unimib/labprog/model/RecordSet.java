package com.unimib.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "recordset")
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE) // Hibernate L2 Cache
public class RecordSet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DecimalMin(value = "0")
    @Column(name = "benchpress")
    private Double benchpress;
}
