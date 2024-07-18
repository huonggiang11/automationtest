package day4;

public class Motobike_Object {
	static String hangXe;
	static String mauXe;
	static String bienSoXe;
	static String ngayDangky;
	
	public static String getInformation() {
		return("Hang xe la: "+ hangXe + ", mau xe: "+ mauXe + ", bien so xe: "+ bienSoXe + ", ngay dang ky: "+ ngayDangky);
		
	}
	public static void main(String[] args) {
		Motobike_Object xe1= new Motobike_Object();
		xe1.hangXe= "Lead";
		xe1.mauXe= "Xam";
		xe1.bienSoXe = "30A-12345";
		xe1.ngayDangky= "01/02/2000";
		System.out.println(xe1.getInformation());
		 
		Motobike_Object xe2= new Motobike_Object();
		xe2.hangXe= "Vision";
		xe2.mauXe= "Den";
		xe2.bienSoXe = "30A-12645";
		xe2.ngayDangky= "10/03/2000";
		System.out.println(xe2.getInformation());
		 

	}

}
