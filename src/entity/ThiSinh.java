package entity;

import entity.action.PrintInfo;

public abstract class ThiSinh implements PrintInfo{
	String sbd;
	String HoTen;
	String diaChi;
	int mucUuTien;
	public String getSbd() {
		return sbd;
	}
	public void setSbd(String sbd) {
		this.sbd = sbd;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getMucUuTien() {
		return mucUuTien;
	}
	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}
	@Override
	public String toString() {
		return "ThiSinh [sbd=" + sbd + ", HoTen=" + HoTen + ", diaChi=" + diaChi + ", mucUuTien=" + mucUuTien + "]";
	}
	
}
