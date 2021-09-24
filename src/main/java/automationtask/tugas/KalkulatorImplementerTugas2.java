package automationtask.tugas;

public class KalkulatorImplementerTugas2 implements KalkulatorInterfaceTugas2 {

	@Override
	public int penjumlahan(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			return a+b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			throw new Exception("input tidak sesuai");
		}
		
	}

	@Override
	public int pengurangan(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		try {
			return a-b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			throw new Exception("input tidak sesuai");
		}
	}

	@Override
	public int pembagian(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		try {
			return a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.getMessage();
			throw new Exception("input tidak sesuai");
		}
	}

	@Override
	public int perkalian(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		try {
			return a*b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
			throw new Exception("input tidak sesuai");
		}
	}

}
