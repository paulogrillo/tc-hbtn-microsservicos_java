package com.example.product.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Product {
	
	//id (Long), code (String), name (String), description (String), price (BigDecimal), createdOne (LocalDateTime), status(Boolean)

	private Long id;
	
	private String code;
	
	private String name;
	
	private String description;
	
	private BigDecimal price;
	
	private LocalDateTime createdOne;
	
	private Boolean status; 
	
	public Product () {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public LocalDateTime getCreatedOne() {
		return createdOne;
	}

	public void setCreatedOne(LocalDateTime createdOne) {
		this.createdOne = createdOne;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, createdOne, description, id, name, price, status);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(code, other.code) && Objects.equals(createdOne, other.createdOne)
				&& Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(status, other.status);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description + ", price="
				+ price + ", createdOne=" + createdOne + ", status=" + status + "]";
	}
	
	

}
