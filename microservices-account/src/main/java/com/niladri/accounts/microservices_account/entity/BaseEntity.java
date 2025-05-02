package com.niladri.accounts.microservices_account.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@MappedSuperclass
@ToString
public class BaseEntity {
  @CreatedBy
  @Column(updatable = false)
  private String createdBy;

  @CreatedDate
  @Column(updatable = false)
  private String createdAt;

  @LastModifiedBy
  @Column(insertable = false)
  private String updatedBy;

  @LastModifiedDate
  @Column(insertable = false)
  private String updatedAt;
}
