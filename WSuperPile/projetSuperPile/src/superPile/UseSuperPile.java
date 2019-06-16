
package superPile;

public class UseSuperPile
	{

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		remplirPile(7);
		System.out.println();

		SuperPile.getInstance().taille();
		SuperPile.getInstance().sommet();
		SuperPile.getInstance().sousSommet();
		System.out.println();

		viderPile(8);
		SuperPile.getInstance().taille();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	private static void remplirPile(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().empiler(i);
			}
		}

	private static void viderPile(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().depiler();
			}
		}
	}
