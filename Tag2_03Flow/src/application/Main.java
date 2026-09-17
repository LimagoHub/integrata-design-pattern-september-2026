package application;


import subscriber.EndSubscriber;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws Exception{
		

		
		List<String> liste = List.of("1","2","drei","4","fuenf","1","2","drei","4","fuenf");
		
		EndSubscriber<String> endSubscriber = new EndSubscriber<>();

		
		
		SubmissionPublisher<String> publisher ;
		
		publisher = new SubmissionPublisher<String>(/*service, 100*/);
		
		
		publisher.subscribe(endSubscriber);
		
		liste.forEach(publisher::submit);
		
		publisher.close();	
		
		Thread.sleep(2000);
		
		System.out.println("Ende");
		
	}

}
