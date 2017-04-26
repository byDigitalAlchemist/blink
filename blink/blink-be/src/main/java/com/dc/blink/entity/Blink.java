package com.dc.blink.entity;

import java.math.BigInteger;

/**
 * @author Digital Alchemist
 *
 */
public class Blink {
	/**
	 * 
	 */
	private Long blinkId;
	private String source;
	private String header;
	private String imageURL;
	
	public Blink(Long blinkId, String source, String header, String imageURL) {
		this.blinkId = blinkId;
		this.source = source;
		this.header = header;
		this.imageURL = imageURL;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public Long getBlinkId() {
		return blinkId;
	}
	public void setBlinkId(Long blinkId) {
		this.blinkId = blinkId;
	}
	
	
	@Override
	public String toString() {
		return "Blink [blinkId=" + blinkId + ", source=" + source + ", header=" + header + ", imageURL=" + imageURL+ "]";
	}
	
	
}
