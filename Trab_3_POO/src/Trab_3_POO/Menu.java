package Trab_3_POO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner; 
import java.util.Map;

public class Menu 
{
	
	public HashMap<String,Usuario> mapUsuarios = new HashMap<String,Usuario>();
	public HashMap<String,Mensagens> mapMensagens = new HashMap<String,Mensagens>();
	public Usuario userList = new Usuario(null,null,null,null,null,null) ;
	
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
			System.out.println("Menu principal");
			System.out.println("--------------------------");
			System.out.println("1.Cadastrar Usuario");
			System.out.println("2.Seguir Usuario");
			System.out.println("3.Postar,comentar ou ver mensagens");
			System.out.println("4.Visualizar conexoes");
			System.out.println("5.Sair do programa");
			System.out.println("--------------------------");
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
		String key;
			
		
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		
		do
		{	
			System.out.println("------------------------");
			System.out.println("Relacionado Ao Usuario");
			System.out.println("1.Cadastrar ");//FEITO
			System.out.println("2.Deletar  ");//FEITO
			System.out.println("3.Pesquisar ");//FEITO
			System.out.println("4.Editar ");//FEITO
			System.out.println("5.Listar ");//FEITO
			System.out.println("6.Voltar ao menu anterior");
			System.out.println("------------------------");
			opcoes = in.nextInt();
			switch(opcoes)
			{
				case 1:
					System.out.println("Crie um login");
					login = stringScan.nextLine();
					System.out.println("Digite o seu nome");
					nome = stringScan.nextLine();
					System.out.println("Digite o seu email");
					email = stringScan.nextLine();
					System.out.println("Digite seu data de Nascimento");
					dataNascimento = DataToString();
					System.out.println("--------------------------------");
					System.out.println("USUARIO CADASTRADO COM SUCESSO!");
					System.out.println("--------------------------------");
					//HashMap
					ArrayList<String> initSeguidores = new ArrayList<String>(); 
					ArrayList<String> initSeguindo = new ArrayList<String>(); 
					mapUsuarios.put(login,new Usuario(login,nome,email,dataNascimento,initSeguidores,initSeguindo));
					ArrayList<ArrayList<String>> initMensagem = new ArrayList<ArrayList<String>>();
					mapMensagens.put(login,new Mensagens(initMensagem));//Cria lista de publica��es associada a cada usuario
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
					
					 for (Map.Entry me : mapUsuarios.entrySet())
					 {
				          key = (String) me.getKey();
				          //Remove da lista de seguidores
				          if(mapUsuarios.get(key).getSeguidores().contains(login))
				          {
				        	  mapUsuarios.get(key).getSeguidores().remove(login);
				          }
				          //Remove da lista de seguidos
				          if(mapUsuarios.get(key).getSeguidos().contains(login))
				          {
				        	  mapUsuarios.get(key).getSeguidos().remove(login);
				          }
				          
					 }
					 
					//Remove listas publicacoes
					 mapMensagens.remove(login);
					 
			         /* //Remove comentarios em publicacoes
			         for (Map.Entry me : mapMensagens.entrySet())
					 {
				          key = (String) me.getKey();
				          //Remove da lista de seguidores
				          if(mapUsuarios.get(key))
				          {
				        	  
				          }
				         
				          
					 }*/
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
						System.out.println("Os dados do usu�rio "+login+" foram alterados \n");
					}
					else
						System.out.println("Nao existem usuarios com esse login\n");
					
					break;
				case 5:
					//listar

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
		
		
		System.out.println("-----------------------------------");
		System.out.println("Crie conexoes e expanda a sua rede!");
		System.out.println("1.Comecar a Seguir:");//FEITO
		System.out.println("2.Deixar de Seguir");//FEITO
		System.out.println("3.Voltar ao menu anterior");
		System.out.println("-----------------------------------");
		opcoes = in.nextInt();	
		
		String user1=" ",user2="";
		int index = 0;
		switch(opcoes)
		{
			case 1:
				
				System.out.println("Digite o seu login: ");
				user1 = stringScan.nextLine();//usuario 1
				if( mapUsuarios.get(user1) != null)
				{
					System.out.println("Digite o login da pessoa que voc� quer seguir: ");
					user2 = stringScan.nextLine();//usuario 2
					
					if(mapUsuarios.get(user2) != null)
					{
						mapUsuarios.get(user2).addSeguidores(user1);
						mapUsuarios.get(user1).addSeguidos(user2);
						System.out.println("-----------------------------");
						System.out.println("Voce comecou a seguir "+user2);
						System.out.println("-----------------------------");
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
				System.out.println("Digite o login do usuario de quem que cancelar um seguimento : ");
				user1 = stringScan.nextLine();//usuario 1
				
				if(mapUsuarios.get(user1) != null)
				{
					for(int i = 0; i< mapUsuarios.get(user1).getSeguidores().size();i++)
					{
						System.out.printf("%d =",i);
						System.out.println(mapUsuarios.get(user1).getSeguidores().get(i));
						System.out.println("");
					}
				}
				System.out.println("Digite a posicao do usuario que vai remover : ");
				index = in.nextInt();
				mapUsuarios.get(user1).getSeguidores().remove(index);
				System.out.println("O usuario escolhido foi removido ");
				
				break;
		
			case 3:
				
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

		System.out.println("----------------------------------------- ");
		System.out.println("  PUBLICACOES: ");
		System.out.println("1.Postar Mensagem");//FEITO 
		System.out.println("2.Comentar Publicacao");//FEITO
		System.out.println("3.Ver Publicacoes");//FEITO
		System.out.println("4.Voltar para menu anterior");
		System.out.println("----------------------------------------- ");
		opcoes = in.nextInt();
		
		String user1=" ",user2="";
		int index = 0,tamanhoString,endIndex = 140;
		String mensagem;
		String subMensagem=" ";
		
		switch(opcoes)
		{
			case 1:
		
				System.out.println("Digite o seu login: ");
				user1 = stringScan.nextLine();//usuario 1
				if( mapUsuarios.get(user1) != null)
				{
					mensagem = user1+ " ";
					System.out.println("Digite sua publicacao: ");
					subMensagem += stringScan.nextLine();
					tamanhoString = subMensagem.length();
					if(tamanhoString > 140) {
						mensagem += subMensagem.subSequence(0, 140) + userList.getHourNow();
						System.out.println("A sua publicacao e grande de mais, por isso ela foi reduzida.");
					}
					else
						mensagem += subMensagem + userList.getHourNow();
					ArrayList<String> listaPublicacoes = new ArrayList<String>();//Lista de publicacoes nova
					listaPublicacoes.add(mensagem);
					
					mapMensagens.get(user1).getPubliComent().add(listaPublicacoes);
					System.out.println("----------------------------------------- ");	
					System.out.println("Sua Mensagem foi publicada com sucesso! \n ");
					System.out.println("----------------------------------------- ");
					
					
					
					}
				else
				{
					System.out.println("Nao existem usuarios com esse login\n");
				}
				break;
			case 2:
				System.out.println("Digite o login do usuario de quem vai comentar as mensagens: ");
				user1 = stringScan.nextLine();
				if( mapUsuarios.get(user1) != null)
				{
					System.out.println("Essas sao as publicacoes do usuario "+user1);
					for(int i = 0; i< mapMensagens.get(user1).getPubliComent().size();i++)
					{

						System.out.println("----------------------------------------- ");
						System.out.printf("Publicacao %d do %s :",i,user1);
						System.out.println(mapMensagens.get(user1).getPubliComent().get(i).get(0));
						System.out.println("");
						System.out.println("----------------------------------------- ");
					}
					System.out.println("Escolha a publicacao que vai comentar: ");
					index = in.nextInt();
					System.out.println("Digite o login do usuario vai comentar as publicacao: ");
					user2 = stringScan.nextLine();
					if( mapUsuarios.get(user2).getSeguidos().contains(user1)) 
					{
						

							if( mapUsuarios.get(user2) != null)
							{
								mensagem = user2 + " ";
								System.out.println("Digite seu comentario: ");
								mensagem += stringScan.nextLine();
								mensagem += userList.getHourNow();
								tamanhoString = mensagem.length();
							if(tamanhoString > 140) {
								mapMensagens.get(user1).addComentario(mensagem.substring(0, 140),index);
								System.out.println("O seu comentario e muito grande, por isso ele foi reduzido.");
							}
							else
								mapMensagens.get(user1).addComentario(mensagem,index);
						}
							else
							{
								System.out.println("Nao existem usuarios com esse login\n");
							}
					}
					else
					{
						System.out.println("Voce nao esta seguindo essa pessoa para fazer comentarios\n");
					}
					
				}
				else
				{
					System.out.println("Nao existem usuarios com esse login\n");
				}
				
				
				break;
			case 3:
				System.out.println("Digite o login da pessoa que deseja ver as mensagens: ");
				user1 = stringScan.nextLine();//usuario 1
				ArrayList<ArrayList<String>> verListas = new ArrayList<ArrayList<String>>();
				
				if( mapUsuarios.get(user1) != null)
				{
					verListas =  mapMensagens.get(user1).getPubliComent();
					
					for(int i = 0; i< verListas.size();i++)
					{

						System.out.println("----------------------------------------- ");
						System.out.printf("Publicacao %d do %s :",i,user1);
						System.out.println(verListas.get(i).get(0));
						System.out.println("");
						System.out.println("----------------------------------------- ");
					}
					System.out.println("Escolha  a publicacao que voce quer expandir");
					index = in.nextInt();
					for(int i = 0; i< verListas.get(index).size();i++)
					{
						System.out.println(verListas.get(index).get(i));
					}
					
				}
				else
				{
					System.out.println("Nao existem usuarios com esse login\n");
				}
				
				
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
		System.out.println("----------------------------------------- ");
		System.out.println("ConexOes: ");
		System.out.println("1.Ver meus Seguidores:");//FEITO
		System.out.println("2.Ver quem estou Seguindo:");//FEITO
		System.out.println("3.Mais influente:");//FEITO
		System.out.println("4.Ocorrencia de assunto:");//0%
		System.out.println("5.Voltar para menu anterior");
		System.out.println("----------------------------------------- ");
		opcoes = in.nextInt();
		String user1=" ",user2="";
		switch(opcoes)
		{
			case 1:
				System.out.println("Digite o login do usuario de quem que vai ver os seguidores : ");
				user1 = stringScan.nextLine();//usuario 1
				
				if(mapUsuarios.get(user1) != null)
				{
					for(int i = 0; i< mapUsuarios.get(user1).getSeguidores().size();i++)
					{
						System.out.printf("%d =",i);
						System.out.println(mapUsuarios.get(user1).getSeguidores().get(i));
						System.out.println("");
					}
				}
				else
				{
					System.out.println("Nao existem usuarios com esse login\n");
				}
				break;
			case 2:
				System.out.println("Digite o login do usuario de quem que vai ver os seguidos : ");
				user1 = stringScan.nextLine();//usuario 1
				
				if(mapUsuarios.get(user1) != null)
				{
					for(int i = 0; i< mapUsuarios.get(user1).getSeguidos().size();i++)
					{
						System.out.printf("%d =",i);
						System.out.println(mapUsuarios.get(user1).getSeguidos().get(i));
						System.out.println("");
					}
				}
				else
				{
					System.out.println("Nao existem usuarios com esse login\n");
				}
				break;
			case 3:
				String key;
				String nomeUser = "";
				int max=0;
				int numeroSeguidores =0;
				
				for (Map.Entry me : mapUsuarios.entrySet())
				{
			          key = (String) me.getKey();
			          numeroSeguidores= mapUsuarios.get(key).getNumeroSeguidores();
			          if(numeroSeguidores>=max )
			          {
			        	  max = numeroSeguidores;
			        	  nomeUser = key;
			          }
				 }
				if(max != 0)
					System.out.println("O usuario com mais seguidores e o "+nomeUser+" com "+ max +" seguidores");
				else
					System.out.println("Nao temos usuarios mais influentes");
				 
				break;
			case 4:
				ArrayList<ArrayList<String>> verListas = new ArrayList<ArrayList<String>>();
				String expressao =" ";
				int ocorrencia =0;
				String mensagem=" ";
				
				System.out.println("Entre com a expressao que vc quer analisar a ocorrencia de assunto: ");
				expressao = stringScan.nextLine();
				
				//Percorre todos os usuarios
				for (Map.Entry me : mapMensagens.entrySet())
				{
					
					
					key = (String) me.getKey();
					verListas =  mapMensagens.get(key).getPubliComent();
					//Percorre todas as publicacoces dos usuarios
					  for(int i=0;i< verListas.size();i++ )
					  {
						 
						 for(int j=0;j< verListas.get(i).size();j++)
						 {
							 mensagem = verListas.get(i).get(j);
							 if(mensagem.contains(expressao))
								 ocorrencia++;
						 }
						 
					  }
				 }
				System.out.println("A expressao "+expressao+" ocorreu "+ocorrencia+" vezes");
				break;
			default:
				break;
		}
	}
	public void progresso()
	{
		int opcoes = 0;
		Scanner in = new Scanner (System.in);
		Scanner stringScan = new Scanner (System.in);
		System.out.println("----------------------------------------- ");
		System.out.println("Cadastros: ok! ");
		System.out.println("Seguidores: ok!");
		System.out.println("Mensagens e comentarios: ok!");
		System.out.println("Rede: 75%");
		System.out.println("Restricoes:");
		System.out.println("-Usuario so pode comentar mensagem de outro :  ok!");
		System.out.println("-Maximo de 140 caracteres : ok!");
		System.out.println("Apagar comentarios e remover seguidores quando usuario excluido : 75%");
		System.out.println("----------------------------------------- ");
		
	}
	public String DataToString()
	{
		String dia,mes,ano;
		String data,barra="/";
		Scanner stringScan = new Scanner (System.in);
       
		System.out.println("Digite o dia do nascimento:");
		dia = stringScan.nextLine();
		System.out.println("Agora digite o mes: de 1 a 12");
		mes = stringScan.nextLine();
		System.out.println("Digite o Ano");
		ano = stringScan.nextLine();
		data =dia + barra + mes + barra +ano ;
		return data;
	}
}
