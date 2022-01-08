package entity;

import entity.action.PrintInfo;
import utils.ScannerUtil;

public class ThiSinhKhoiC extends ThiSinh implements PrintInfo {

	final String monThi = "Van, Su, Dia";
	
	public ThiSinhKhoiC() {
		nhapThongTinThiSinh();
	}

	@Override
	public void inMonThi() {
		System.out.println("Mon thi khoi C => " + monThi);
	}

	@Override
	public void inSoBaoDanh() {
		System.out.println("Thi sinh khoi C sbd : " + sbd);
	}

	@Override
	public void inThongTin() {
		System.out.println(toString() + " - Khoi C");
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
