package Trab_3_POO;
import java.util.HashMap;
import java.util.Scanner; 
import java.util.Map;
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
		
			
		String login;
		String nome;
		String email ;
		String dataNascimento;
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		HashMap<String,Usuario> mapUsuarios = new HashMap<String,Usuario>();
		Usuario userList = new Usuario(null,null,null,null) ;
		do
		{	
			
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1.Cadastrar");
			System.out.println("2.Excluir");
			System.out.println("3.Pesquisar");
			System.out.println("4.Alterar");
			System.out.println("5.Listar");
			System.out.println("6.Sair");
			opcoes = in.nextInt();
			switch(opcoes)
			{
				case 1:
					System.out.println("Digite o login");
					login = stringScan.nextLine();
					System.out.println("Digite o nome");
					nome = stringScan.nextLine();
					System.out.println("Digite o email");
					email = stringScan.nextLine();
					System.out.println("Digite a data de Nascimento");
					dataNascimento = DataToString();
					//HashMap
					mapUsuarios.put(login,new Usuario(login,nome,email,dataNascimento));
					break;
				case 2:
					//Excluir
					System.out.println("Digite o login do usuario que quer excluir");
					login = stringScan.nextLine();
					userList	= mapUsuarios.get(login);
					if(userList != null)
					{
						mapUsuarios.remove(login);
						System.out.println("Esse usuario foi removido");
					}  
					else
						System.out.println("Nao existem usuarios com esse login");
					break;
				case 3:
					//Pesquisar
					System.out.println("Digite o login do usuario que quer pesquisar");
					login = stringScan.nextLine();
					userList	= mapUsuarios.get(login);
					if(userList != null)
					{
						System.out.println("Esses sao os dados do usuario de login" + login+ "\n");
						System.out.println(userList.getLogin() +"\n"+userList.getNome()+"\n"+userList.getEmail()+"\n"+userList.getDataNascimento());
					}
					else
						System.out.println("Nao existem usuarios com esse login");
					break;
				case 4:
					
					break;
				case 5:
					//listar
					String key;
					 for (Map.Entry me : mapUsuarios.entrySet())
					 {
				          key = (String) me.getKey();
				          userList	= mapUsuarios.get(key);
				          System.out.println(userList.getLogin() +"\n"+userList.getNome()+"\n"+userList.getEmail()+"\n"+userList.getDataNascimento());
				          System.out.println("\n");
					 }
					break;
				case 6:
					
					break;
				default:
					break;
			}
		}while(opcoes !=6);
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
	public String DataToString()
	{
		String dia,mes,ano;
		String data,barra="/";
		Scanner stringScan = new Scanner (System.in);
       
		System.out.println("Digite o dia");
		dia = stringScan.nextLine();
		System.out.println("Digite o mes");
		mes = stringScan.nextLine();
		System.out.println("Digite o Ano");
		ano = stringScan.nextLine();
		data =dia + barra + mes + barra +ano ;
		return data;
	}
}
