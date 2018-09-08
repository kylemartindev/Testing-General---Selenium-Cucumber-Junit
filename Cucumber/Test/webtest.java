package ConductQA.Cucumber;

import org.junit.Test;


public class webtest {

	
	@Test
	public void testhomepage( ) throws InterruptedException {
	
	
	bingmethods bingsearch = new bingmethods();
	bingsearch.setup();
	bingsearch.i_go_to_website("https://www.bing.com");
	bingsearch.i_search_for("football");
	bingsearch.i_am_taken_to_a_list_of_data_for_that_search();
	bingsearch.tearDown();
	
	
	
	}
	}

