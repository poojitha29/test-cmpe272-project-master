package edu.sjsu.cmpe.customerfeedback.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class Product {

	public Product() {
		
	}
	private int productId;
	private int ownerId;
	@NotEmpty
	private String productName;
	private boolean canReview = false;
	private boolean whichTemplate;
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public boolean isCanReview() {
		return canReview;
	}
	public void setCanReview(boolean canReview) {
		this.canReview = canReview;
	}
	/**
	 * @return the whichTemplate
	 */
	public boolean isWhichTemplate() {
		return whichTemplate;
	}
	/**
	 * @param whichTemplate the whichTemplate to set
	 */
	public void setWhichTemplate(boolean whichTemplate) {
		this.whichTemplate = whichTemplate;
	}
	
	
	

}
