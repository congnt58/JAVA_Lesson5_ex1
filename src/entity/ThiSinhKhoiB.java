package entity;

import entity.action.PrintInfo;
import utils.ScannerUtil;

public class ThiSinhKhoiB extends ThiSinh implements PrintInfo {

	final String monThi = "Toan, Hoa, Sinh";
	
	public ThiSinhKhoiB() {
		nhapThongTinThiSinh();
	}

	@Override
	public void inMonThi() {
		System.out.println("Mon thi khoi B => " + monThi);
	}

	@Override
	public void inSoBaoDanh() {
		System.out.println("Thi sinh khoi B sbd : " + sbd);
	}
	@Override
	public void inThongTin() {
		System.out.println(toString() +" - Khoi B");
	}
	
	@Override
	public void nhapThongTinThiSinh() {
		System.out.print("Nhap ten thi sinh: ");
		setHoTen(ScannerUtil.scanStr());
		System.out.print("Nhap dia chi:");
		setDiaChi(ScannerUtil.scanStr());
		System.out.print("Nhap muc uu tien:");
		setMucUuTien(ScannerUtil.scanInt());
	}
}
