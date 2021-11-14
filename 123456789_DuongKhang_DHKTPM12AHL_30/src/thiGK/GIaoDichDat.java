package thiGK;

import java.util.Date;

public class GIaoDichDat extends GiaoDich {
	private String loaiDat;
	
	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	@Override
	public double thanhTien() {
		// TODO Auto-generated method stub
		return 0;
	}
	// Hàm tạo

	public GIaoDichDat(String maGD, Date ngayGD, double donGia, double dienTich, String loaiDat) throws Exception {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	public GIaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GIaoDichDat(String maGD, Date ngayGD, double donGia, double dienTich) throws Exception {
		super(maGD, ngayGD, donGia, dienTich);
		// TODO Auto-generated constructor stub
	}
	
	

}
