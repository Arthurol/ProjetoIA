import java.util.Scanner;

import coletadados.TwitterAPI;
import twitter4j.TwitterException;

public class Execucao {

	public static void main(String[] args) {
		
		// Teste Busca usando query na Twitter API
		Scanner reader = new Scanner(System.in); 
		System.out.println("Faça uma busca: ");
		String query = reader.next(); 
		reader.close(); 
		
		try
		{
			TwitterAPI twitterApi = new TwitterAPI();
			twitterApi.search(query);
			
		} catch (TwitterException tE)
		{
			System.out.println("Falha na busca: " + tE.getMessage());
		}
		//Fim Teste
	}

}
