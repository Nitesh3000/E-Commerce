package com.nitesh.ecom_proj.model;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autogenerate the id
	private int id;
	private String name;
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
	public String getdescription() {
		return description;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isProductAvailable() {
		return productAvailable;
	}
	public void setProductAvailable(boolean productAvailable) {
		this.productAvailable = productAvailable;
	}
	public int getstockQuantity() {
		return stockQuantity;
	}
	public void setstockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	private String description; 
	private String brand;
	private BigDecimal price;
	private String category;
	
	@Column(name = "release_date")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date releaseDate;
	private boolean productAvailable;
	public byte[] getImageDate() {
		return imageDate;
	}
	public void setImageDate(byte[] imageDate) {
		this.imageDate = imageDate;
	}
	private int stockQuantity;
	private String imageName;
	private String imageType;
	@Lob
	private byte[] imageDate;
	
}
