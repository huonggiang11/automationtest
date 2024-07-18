package day4_2Quanlyxe;

public class XeMay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe xeMay1= new Xe();
		xeMay1.setLoaiXe("Honda");
		xeMay1.setTenXe("Lead");
		xeMay1.setVanTocMax(120);
		System.out.println("Loại xe: "+ xeMay1.getLoaiXe()+ ", Tên xe: "+ xeMay1.getTenXe() + ", Vận tốc max: "+ xeMay1.getVanTocMax()); 
		
		Xe xeMay2= new Xe();
		xeMay2.setLoaiXe("Honda");
		xeMay2.setTenXe("Vision");
		xeMay2.setVanTocMax(110);
		System.out.println("Loại xe: "+ xeMay2.getLoaiXe()+ ", Tên xe: "+ xeMay2.getTenXe() + ", Vận tốc max: "+ xeMay2.getVanTocMax()); 

	}

}
