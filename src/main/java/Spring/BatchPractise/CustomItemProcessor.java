package Spring.BatchPractise;

import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Report,Report> {

	public Report process(Report item) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Processing...."+item);
		return item;
	}
	
	
}
