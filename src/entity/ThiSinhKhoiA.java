package entity;

import entity.action.PrintInfo;
import utils.ScannerUtil;

public class ThiSinhKhoiA extends ThiSinh implements PrintInfo {
	final String monThi = "Toan, Ly, Hoa";
	
	public ThiSinhKhoiA() {
		nhapThongTinThiSinh();
	}
	
	@Override
	public void inMonThi() {
		System.out.println("Mon thi khoi A => " + monThi);
	}

	@Override
	public void inSoBaoDanh() {
		System.out.println("Thi sinh khoi A sbd : " + sbd);
	}
	
	@Override
	public void inThongTin() {
		System.out.println(toString() +" - Khoi A");
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

	/*
	 * Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, B, và khối C.
	 * Các thí sinh cần quản lý các thông tin sau: Số báo danh, họ tên, địa chỉ, mức
	 * ưu tiên.
	 * 
	 *  Thí sinh thi khối  A thi các môn: Toán, Lý, Hoá. 
	 *  Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh. 
	 *  Thí sinh thi khối C thi các môn: Văn, Sử, Địa.
	 * 
	 * a) Xây dựng các class để quản lý các thi sinh dự thi đại học. 
	 * 
	 * b) Xây dựng interface ITuyenSinh và class TuyenSinh có các chức năng: 
	 * a. Thêm mới thí sinh. 
	 * b. Hiện thị thông tin của thí sinh và khối thi của thí sinh. 
	 * c. Tìm kiếm theo số báo danh. 
	 * d. Thoát khỏi chương trình.
	 */

}
