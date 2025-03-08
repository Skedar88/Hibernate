package com.qsp;

import java.time.LocalDateTime;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.NaturalIdCache;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "teacher_table")
@Cacheable
public class Teacher {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)  //for auto incrementing id  
	
	private int id;
	@Column(name = "teacher_name")
	private String name;
	
	@Column(nullable = false, unique = true, updatable = false)
	private long phno;
	
	@CreationTimestamp
	private LocalDateTime createTime;
	
	@UpdateTimestamp
	private LocalDateTime updateTime;

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

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	public Teacher() {
		super();
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", phno=" + phno + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}
	
	
}
