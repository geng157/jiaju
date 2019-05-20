package com.wyf.entity;

public class ProductInfo {
	private int productId;
	private String productName;
	private String productCaiZhi;
	private double productPrice;
	private double productMarketPrice;
	private String pinPai;
	private String zuZhuang;
	private String dingZhi;
	private String color;
	private String yuanSu;
	private String fengGe;
	private String kuanShi;
	private int classId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCaiZhi() {
		return productCaiZhi;
	}
	public void setProductCaiZhi(String productCaiZhi) {
		this.productCaiZhi = productCaiZhi;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getProductMarketPrice() {
		return productMarketPrice;
	}
	public void setProductMarketPrice(double productMarketPrice) {
		this.productMarketPrice = productMarketPrice;
	}
	public String getPinPai() {
		return pinPai;
	}
	public void setPinPai(String pinPai) {
		this.pinPai = pinPai;
	}
	public String getZuZhuang() {
		return zuZhuang;
	}
	public void setZuZhuang(String zuZhuang) {
		this.zuZhuang = zuZhuang;
	}
	public String getDingZhi() {
		return dingZhi;
	}
	public void setDingZhi(String dingZhi) {
		this.dingZhi = dingZhi;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getYuanSu() {
		return yuanSu;
	}
	public void setYuanSu(String yuanSu) {
		this.yuanSu = yuanSu;
	}
	public String getFengGe() {
		return fengGe;
	}
	public void setFengGe(String fengGe) {
		this.fengGe = fengGe;
	}
	public String getKuanShi() {
		return kuanShi;
	}
	public void setKuanShi(String kuanShi) {
		this.kuanShi = kuanShi;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public ProductInfo(int productId, String productName, String productCaiZhi,
			double productPrice, double productMarketPrice, String pinPai,
			String zuZhuang, String dingZhi, String color, String yuanSu,
			String fengGe, String kuanShi, int classId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCaiZhi = productCaiZhi;
		this.productPrice = productPrice;
		this.productMarketPrice = productMarketPrice;
		this.pinPai = pinPai;
		this.zuZhuang = zuZhuang;
		this.dingZhi = dingZhi;
		this.color = color;
		this.yuanSu = yuanSu;
		this.fengGe = fengGe;
		this.kuanShi = kuanShi;
		this.classId = classId;
	}
	public ProductInfo() {
		super();
	}
	@Override
	public String toString() {
		return "ProductInfo [productId=" + productId + ", productName="
				+ productName + ", productCaiZhi=" + productCaiZhi
				+ ", productPrice=" + productPrice + ", productMarketPrice="
				+ productMarketPrice + ", pinPai=" + pinPai + ", zuZhuang="
				+ zuZhuang + ", dingZhi=" + dingZhi + ", color=" + color
				+ ", yuanSu=" + yuanSu + ", fengGe=" + fengGe + ", kuanShi="
				+ kuanShi + ", classId=" + classId + "]";
	}
	
}
