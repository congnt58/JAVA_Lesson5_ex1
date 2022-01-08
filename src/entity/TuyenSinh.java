package entity;


import java.util.ArrayList;

import entity.action.ITuyenSinh;
import utils.ScannerUtil;

public class TuyenSinh implements ITuyenSinh {
	static int count = 1;

	ArrayList<ThiSinh> listThiSinh = new ArrayList<>();
	
	public TuyenSinh() {
		menu();
	}
	
	public void menu() {
		int selected;
		
		do {
			System.out.println("--------- Chon chuc nang: ------------");
			System.out.println("1 - them thi sinh");
			System.out.println("2 - in danh sach thi sinh");
			System.out.println("3 - tim thi sinh");
			System.out.println("4 - thoat");
			selected = ScannerUtil.scanInt();
			
			switch (selected) {
			case 1: {
				themThiSinh();
				break;
			}
			case 2: {
				inDanhSachThiSinh();
				break;
			}
			case 3: {
				System.out.println("------Tim thi sinh -------");
				System.out.print("Nhap vao so bao danh: ");
				timThiSinh(ScannerUtil.scanStr());
				break;
			}
			case 4: {
				System.out.println("------- Thoát chương trình ------");
				break;
			}
			default:
				System.err.println("Chọn sai chức năng chọn lại");
			}
			
		} while (selected != 4);
	}
	
	
	
	private void themThiSinh() {
		System.out.println("------ Thêm thí sinh --------");
		int n, select;
		System.out.println("Chọn số lượng thí sinh cần thêm: ");
		n = ScannerUtil.scanInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Chọn loại muốn thêm:");
			System.out.println("1 - thí sinh khối A");
			System.out.println("2 - thí sinh khối B");
			System.out.println("3 - thí sinh khối C");
			select = ScannerUtil.scanInt();
			switch (select) {
			case 1: {
				them(new ThiSinhKhoiA());
				break;
			}
			case 2: {
				them(new ThiSinhKhoiB());
				break;
			}
			case 3: {
				them(new ThiSinhKhoiC());
				break;
			}
			default:
				System.err.println("--> Chọn sai loại => thoát");
				return;
			}
			System.out.println("chọn 1 để nhập tiếp, chọn 0 để thoát");
			if (ScannerUtil.scanInt() == 0) {
				return;
			}
		}
		
	}



	@Override
	public void them(ThiSinh thiSinh) {
		thiSinh.setSbd("Thisinh-" + count++);
		listThiSinh.add(thiSinh);
	}

	@Override
	public void inDanhSachThiSinh() {
		for (ThiSinh thiSinh : listThiSinh) {
			thiSinh.inThongTin();
		}
		
	}

	@Override
	public void timThiSinh(String sbd) {
		for (ThiSinh thiSinh : listThiSinh) {
			if (sbd.toLowerCase().trim().replaceAll(" ", "").equals(thiSinh.getSbd().toLowerCase().trim().replaceAll(" ", ""))) {
				thiSinh.inThongTin();
				return;
			}
		}
		System.out.println("Khong tim thay thi sinh co sbd : " + sbd);	
	}

	@Override
	public void exits() {
		// TODO Auto-generated method stub
		
	}
	
	

}
