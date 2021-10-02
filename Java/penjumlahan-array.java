import java.util.Scanner;

class PenjumlahanArray
{
	public static void main(String args[])
	{
		Scanner scInt = new Scanner(System.in);
		int MatrikJumlah, X=3, Y=4;
		int[][] MatrikA = new int [X][Y];
		int[][] MatrikB = new int [X][Y];

		for(int baris=0; baris<X; baris++)
		{
			for(int kolom=0; kolom<Y; kolom++)
			{
				System.out.print("Masukkan nilai MatrikA ke-["+baris+"]["+kolom+"] : ");
				MatrikA[baris][kolom] = scInt.nextInt();
			}
			System.out.println();
		}
		System.out.println();

		for(int baris=0; baris<X; baris++)
		{
			for(int kolom=0; kolom<Y; kolom++)
			{
				System.out.print("Masukkan nilai MatrikB ke-["+baris+"]["+kolom+"] : ");
				MatrikB[baris][kolom] = scInt.nextInt();
			}
			System.out.println();
		}

		System.out.println("Hasil MatrikA:");

		for(int baris=0; baris<X; baris++)
		{
			for(int kolom=0; kolom<Y; kolom++)
			{
				System.out.print(MatrikA[baris][kolom] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Hasil MatrikB:");

		for(int baris=0; baris<X; baris++)
		{
			for(int kolom=0; kolom<Y; kolom++)
			{
				System.out.print(MatrikB[baris][kolom] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("Hasil Penjumlahan MatrikA dan MatrikB : ");
		for(int baris=0; baris<X; baris++)
		{
			for(int kolom=0; kolom<Y; kolom++)
			{
				MatrikJumlah = MatrikA[baris][kolom] + MatrikB[baris][kolom];
				System.out.print(MatrikJumlah + "\t");
			}
			System.out.println();
		}
	}
}
