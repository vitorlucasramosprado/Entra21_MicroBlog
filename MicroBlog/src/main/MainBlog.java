package main;

import java.util.ArrayList;

import entity.Administrator;
import entity.Pruu;
import entity.User;

public class MainBlog {

	public static void main(String[] args) {
		
		
		User vitor = new User("Vitor", "vitor@gmail.com", "415.904.258-98");
		Pruu VitorPruu1 = new Pruu("Primeiro pruu do Vitor");
		Pruu VitorPruu2 = new Pruu("Segundo pruu do Vitor");
		Pruu VitorPruu3 = new Pruu("prupruuu ");
		ArrayList<Pruu> pruusDoVitor = new ArrayList<Pruu>();
		pruusDoVitor.add(VitorPruu1);
		pruusDoVitor.add(VitorPruu2);
		vitor.setPruu(pruusDoVitor);
		pruusDoVitor.add(VitorPruu3);
		
		
		User lucas = new User("Lucas", "lucas@gmail.com", "514.094.358-10");
		Pruu lucasPruu1 = new Pruu("Pruuuuuuu do lucas");
		Pruu lucasPruu2 = new Pruu("Lucas pruu pruu");
		ArrayList<Pruu> pruusDoLucas = new ArrayList<Pruu>();
		pruusDoLucas.add(lucasPruu1);
		pruusDoLucas.add(lucasPruu2);
		lucas.setPruu(pruusDoLucas);	
		
		
		Administrator ramos = new Administrator("Ramos", "ramos@gmail.com", "541.409.852-89");
		Pruu ramosPruu1 = new Pruu("Pruu, o pruu viu ");
		Pruu ramosPruu2 = new Pruu("Nunca mais eu vou pruu pruu");
		ArrayList<Pruu> pruusDoRamos = new ArrayList<Pruu>();
		pruusDoRamos.add(ramosPruu1);
		pruusDoRamos.add(ramosPruu2);
		ramos.setPruu(pruusDoRamos);

		
		ArrayList<User>listUsers = new ArrayList<User>();
		listUsers.add(vitor);
		listUsers.add(lucas);
		listUsers.add(ramos);
		
		listPruus(listUsers);
		
		pruuUser(vitor);
		
		lucasPruu2.setLikes();
		
		ramos.blockPruu(VitorPruu2);

		listPruus(listUsers);
		
	}
	
	public static void listPruus(ArrayList<User> listUser) {
		System.out.println("             TODOS OS PRUUS");
		for (int i = 0; i < listUser.size(); i++) {
			int qtyPruu = listUser.get(i).getPruu().size();
			System.out.println("Nome: "+listUser.get(i).getName().toUpperCase());
			
			for (int j = 0; j < qtyPruu; j++) {
				System.out.print(listUser.get(i).getPruu().get(j).toString());
			}
			System.out.println("----------------------------------------");
		}
	}
	
	public static void pruuUser(User user) {
		System.out.println("             USUARIO ESPECIFICO");
		int qtyPruu = user.getPruu().size();
		
		System.out.println("Nome: "+ user.getName().toUpperCase());
		
		for (int j = 0; j < qtyPruu; j++) {
			System.out.print(user.getPruu().get(j).toString());
		}
		System.out.println("----------------------------------------");
	
	}
	
}
