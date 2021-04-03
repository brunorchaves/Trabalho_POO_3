package Trab_3_POO;
import java.util.Scanner; 
public class Menu 
{
	public Menu() 
	{
		
	}
	public void menuPrincipal()
	{
		int opcoes = 0;
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		do
		{
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1.Usuario");
			System.out.println("2.Seguidores");
			System.out.println("3.Mensagens");
			System.out.println("4.Rede");
			System.out.println("5.Sair");
			opcoes = in.nextInt();
			switch(opcoes)
			{
				case 1:
					menuUsuario();
					break;
				case 2:
					menuSeguidores();
					break;
				case 3:
					menuMensagens();
					break;
				case 4:
					menuRede();
					break;
				case 5:
					
					break;
				default:
					break;
			}
		}while(opcoes!=5);
	}
	public void menuUsuario()
	{
		int opcoes = 0;
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		System.out.println("Escolha uma das opcoes abaixo: ");
		System.out.println("1.Cadastrar");
		System.out.println("2.Excluir");
		System.out.println("3.Pesquisar");
		System.out.println("4.Alterar");
		System.out.println("5.Sair");
		opcoes = in.nextInt();
		switch(opcoes)
		{
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			default:
				break;
		}
	}
	public void menuSeguidores()
	{
		int opcoes = 0;
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		System.out.println("Escolha uma das opcoes abaixo: ");
		System.out.println("1.Seguir:");
		System.out.println("2.Cancelar Seguir");
		System.out.println("3.Sair");
		opcoes = in.nextInt();;
		switch(opcoes)
		{
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				break;
		}
	}
	public void menuMensagens()
	{
		int opcoes = 0;
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		System.out.println("Escolha uma das opcoes abaixo: ");
		System.out.println("1.Registrar mensagem");
		System.out.println("2.Comentar mensagem");
		System.out.println("3.Ver mensagens");
		System.out.println("4.Sair");
		opcoes = in.nextInt();
		switch(opcoes)
		{
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				break;
		}
	}
	public void menuRede()
	{
		int opcoes = 0;
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		System.out.println("Escolha uma das opcoes abaixo: ");
		System.out.println("1.Ver seguidores:");
		System.out.println("2.Seguidos:");
		System.out.println("3.Sair");
		opcoes = in.nextInt();;
		switch(opcoes)
		{
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				break;
		}
	}
	
}
