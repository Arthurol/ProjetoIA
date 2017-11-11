package coletadados;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterAPI {

	/**
	 * Falta usar a String parâmetro da função para montar a query
	 * 
	 * @throws TwitterException
	 */
	public QueryResult search (String keywords) throws TwitterException
	{
		Twitter twitter = autenticate(); //Twitter twitter = TwitterFactory.getSingleton();
	    Query query = new Query(keywords);
	    QueryResult result = twitter.search(query);
	    
	    for (Status status : result.getTweets()) {
	        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
	    }
	    
	    return result;
	}
	
	private Twitter autenticate()
	{
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("6qlFYC2pyYj193E9H4mQyRGyq")
		  .setOAuthConsumerSecret("lzYy9N8vMMYjXRDojK1A35FgsRShGOOC8D0WfSERRW5RjE2wIx")
		  .setOAuthAccessToken("928836138890080256-0mbm3EEud4oxItjFbpszeShJoBw31u5")
		  .setOAuthAccessTokenSecret("K9MlYFQutSA1OW3zsnTbkqNxDUy76bO9VXM8h6Bnt9NBj");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		
		return twitter;
	}
	
}
