package com.example.jiexi;

public class Data_head {

	private String url;
	private String total;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Data_head [url=" + url + ", total=" + total + "]";
	}

	public Data_head(String url, String total) {
		super();
		this.url = url;
		this.total = total;
	}
}
