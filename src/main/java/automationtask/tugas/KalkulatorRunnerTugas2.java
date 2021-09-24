package automationtask.tugas;

public class KalkulatorRunnerTugas2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		KalkulatorImplementerTugas2 kalkulatorImplementer = new KalkulatorImplementerTugas2();
		
		System.out.println(kalkulatorImplementer.penjumlahan(20, 5));
		System.out.println(kalkulatorImplementer.pengurangan(20, 5));
		System.out.println(kalkulatorImplementer.perkalian(20, 5));
		System.out.println(kalkulatorImplementer.pembagian(20, 0));
	}

}
