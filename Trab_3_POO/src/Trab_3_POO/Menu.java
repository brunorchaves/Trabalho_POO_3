package Trab_3_POO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner; 
import java.util.Map;
public class Menu 
{
	
	public HashMap<String,Usuario> mapUsuarios = new HashMap<String,Usuario>();
	public Usuario userList = new Usuario(null,null,null,null,null,null) ;
	ArrayList<String> initSeguidores = new ArrayList(); 
	ArrayList<String> initSeguindo = new ArrayList(); 
	
	public String login;
	public String nome;
	public String email ;
	public String dataNascimento;
	
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
					mapUsuarios.put(login,new Usuario(login,nome,email,dataNascimento,initSeguidores,initSeguindo));
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
					//Alterar
					System.out.println("Digite o login do usuario que iremos alterar");
					login = stringScan.nextLine();
					userList	= mapUsuarios.get(login);
					if(userList != null)
					{
						System.out.println("Digite o nome");
						nome = stringScan.nextLine();
						System.out.println("Digite o email");
						email = stringScan.nextLine();
						System.out.println("Digite a data de Nascimento");
						dataNascimento = DataToString();
						mapUsuarios.get(login).setNome(nome); 
						mapUsuarios.get(login).setEmail(email);
						mapUsuarios.get(login).setDataNascimento(dataNascimento);
						System.out.println("Os dados do usuário "+login+" foram alterados \n");
					}
					else
						System.out.println("Nao existem usuarios com esse login\n");
					
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
		
		String loginSeguir,loginSeguido;

		System.out.println("Escolha uma das opcoes abaixo: ");
		System.out.println("1.Seguir:");
		System.out.println("2.Cancelar Seguir");
		System.out.println("3.Mostrar seguidores");
		System.out.println("4.Mostrar os que seguem");
		System.out.println("5.Sair");
		opcoes = in.nextInt();	
		
		ArrayList<String> seguidores = new ArrayList();
		ArrayList<String> seguindo = new ArrayList();
		
		switch(opcoes)
		{
			case 1:

				System.out.println("Digite o login do usuario: ");
				loginSeguir = stringScan.nextLine();//usuario 1
				userList	= mapUsuarios.get(loginSeguir);
				if(userList != null)
				{
					System.out.println("Digite o login do usuario a ser seguido: ");
					loginSeguido = stringScan.nextLine();//usuario 2
					userList	= mapUsuarios.get(loginSeguido);
					if(userList != null)
					{
						mapUsuarios.get(loginSeguir).addSeguindo(loginSeguido);//Adiciona na lista de seguindo do usuario 1
						mapUsuarios.get(loginSeguido).addSeguidor(loginSeguir);//Adiciona na lista de seguidores do usuario 2
					}
					else
						System.out.println("Nao existem usuarios com esse login\n");
					
				}
				else
				{
					System.out.println("Nao existem usuarios com esse login\n");
				}
				
				break;
			case 2:
				
				break;
			case 3:
				System.out.println("Digite o login do usuario: ");
				loginSeguir = stringScan.nextLine();
				seguidores = mapUsuarios.get(loginSeguir).getSeguidores();
		
			    for (int i=0; i<seguidores.size(); i++) 
			    {
			      System.out.printf("Posição %d- %s\n", i, seguidores.get(i));
			    }
				break;
			case 4:
				System.out.println("Digite o login do usuario: ");
				loginSeguido = stringScan.nextLine();
				seguindo = mapUsuarios.get(loginSeguido).getSeguindo();
				
			    for (int i=0; i<seguindo.size(); i++) 
			    {
			      System.out.printf("Posição %d- %s\n", i, seguindo.get(i));
			    }
				
				break;
			case 5:
				
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
