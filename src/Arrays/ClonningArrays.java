package Arrays;

public class ClonningArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primes = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };
		int[] backup;	

		/*
		 * No es obligatorio castearlo si ambos arrays tienen los mismos tipos
		 */
		backup = (int[]) primes.clone();
		backup[0] = 0;

		System.out.println("Primes: ");
		for (int i = 0; i < primes.length; i++)
			System.out.print(" " + primes[i]);

		System.out.println("\nBackup: With first Element Modified");
		for (int j = 0; j < backup.length; j++)
			System.out.print(" " + backup[j]);
	}

}
