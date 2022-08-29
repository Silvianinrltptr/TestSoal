package Test5;

public class Tabungan {
	private String nasabah;
	private int nomorRekening;
	private int setoranAwal;
	private int saldo;

	public Tabungan(String nasabah, int nomorRekening, int setoranAwal) {
		this.nasabah = nasabah;
		this.nomorRekening = nomorRekening;
		this.setoranAwal = setoranAwal;
		this.saldo = setoranAwal;
	}

	public Tabungan(String nama, int noRek) {
		this.nasabah = nasabah;
		this.nomorRekening = nomorRekening;
		this.setoranAwal = 0;
		this.saldo = 0;
	}

	public void cekSaldo() {
		System.out.println("Saldo anda saat ini adalah " + this.saldo);
	}

	public void setor(int setor) {
		this.saldo = this.saldo + setor;
		System.out.println("Setoran sebesar " + setor + " berhasil dilakukan, saldo anda sekarang " + this.saldo);
	}

	public void tarik(int tarik) {
		if (this.saldo < tarik) {
			System.out.println("Penarikan tidak dapat dilakukan karena saldo anda tidak cukup");
		} else {
			this.saldo = this.saldo - tarik;
			System.out.println("Penarikan sebesar " + tarik + " berhasil dilakukan, saldo anda sekarang " + this.saldo);
		}

	}
}
