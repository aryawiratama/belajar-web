/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.domain.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Artha
 */
@Entity
@Table(name = "m_item")
public class Item {
    
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String  id;
    
    @Column(name = "code", columnDefinition = "VARCHAR(15)", nullable = false)
    @NotNull
    @Size(max = 15)
    private String code;
    
    @Column(name = "name")
    @NotNull
    private String name;
    
    @Column(name = "quantity")
    private BigDecimal quantitiy;
    
    @Column(name = "price", columnDefinition = "DECIMAL (19,2) UNSIGNED")
    @Min(0)
    private BigDecimal price;
    
    @Column(name = "cost", columnDefinition = "DECIMAL (19,2) UNSIGNED")
    @Min(0)
    private BigDecimal cost;
    
    @Column(name = "expired_date")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private DateTime expiredDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getQuantitiy() {
        return quantitiy;
    }

    public void setQuantitiy(BigDecimal quantitiy) {
        this.quantitiy = quantitiy;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public DateTime getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(DateTime expiredDate) {
        this.expiredDate = expiredDate;
    }
    
    
}
