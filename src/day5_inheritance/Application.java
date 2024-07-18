package day5_inheritance;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SinhVien sv1 = new SinhVien();
	sv1.setHoTen("Nguyen Van A");
	sv1.setMaSV("SV01");
	sv1.setNgaySinh("01/01/2008");
	sv1.setSoTinchi("20");
	System.out.println("Sinh vien:" + sv1.getHoTen()+ "," + sv1.getMaSV()+ ", " + sv1.getNgaySinh() + ","+ sv1.getSoTinchi());
	sv1.diChoi();
	sv1.diHoc();
	
	System.out.println("=======");
	
	GiaoVien gv1 = new GiaoVien();
	gv1.setHoTen("Nguyen Van A");
	gv1.setMaGV("GV01");
	gv1.setNgaySinh("01/01/1999");
	gv1.setSoNamKN(2);
	System.out.println("Giao vien:" + gv1.getHoTen()+ "," + gv1.getMaGV()+ ", " + gv1.getNgaySinh() + "," + gv1.getSoNamKN());
	gv1.diChoi();
	gv1.diDay();	
	}
}
