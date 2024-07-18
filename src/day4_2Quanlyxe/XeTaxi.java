package day4_2Quanlyxe;

public class XeTaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xe Taxi1 = new Xe();
		Taxi1.setLoaiXe("Toyota");
		Taxi1.setTenXe("KIA");
		Taxi1.setVanTocMax(320);
		System.out.println(Taxi1.getLoaiXe()+ ", "+ Taxi1.getTenXe()+ ", "+ Taxi1.getVanTocMax());
		
		Xe Taxi2 = new Xe();
		Taxi2.setLoaiXe("Toyota");
		Taxi2.setTenXe("KiaMorning");
		Taxi2.setVanTocMax(250);
		System.out.println(Taxi2.getLoaiXe()+ ", "+ Taxi2.getTenXe()+ ", "+ Taxi2.getVanTocMax());
		

	}

}
