package ch04;

public class Star2 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)

		{

			for (int j = 0; j <= 10 - i; j++)

			{

				System.out.print("   ");

			}

			for (int k = 0; k <= 2 * i; k++)

			{

				if (k == 0 || 2 * i == k)

				{

					System.out.print("¡Ù");

				}

				else

					System.out.print("   ");

			}

			System.out.println();

			if (i == 9)

			{

				System.out.print(" ");

				for (int f = 0; f < 15; f++)

				{

					System.out.print(" ¡Ù");

				}

			}

		}

	}

}
