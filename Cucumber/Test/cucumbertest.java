package ConductQA.Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



import org.junit.Test;


@RunWith(Cucumber.class)
@CucumberOptions(
        features={"C:\\Users\\Admin\\eclipse-workspace\\"}
)

public class cucumbertest {
	
	@Test
	public void pushitemtostack() {
		
		cucumberinfo methods = new cucumberinfo();
		stackexample objects = new stackexample();
		methods.an_empty_stack();
		methods.I_push_an_item_into_the_stack();
		methods.the_stack_contains_one_item();
		
		
		
	}
	
	@Test
	public void addtwoitemstostack() {
		
		cucumberinfo methods = new cucumberinfo();
		stackexample objects = new stackexample();
		methods.an_empty_stack();
		methods.I_push_an_item_into_the_stack();
		methods.I_push_another_item_into_the_stack();
		methods.the_stack_contains_two_items();
		
		
	}
	
	@Test
	public void popanitemintostack() {
		
		
		cucumberinfo methods = new cucumberinfo();
		stackexample objects = new stackexample();
		methods.an_empty_stack();
		methods.I_push_an_item_into_the_stack();
		methods.I_pop_from_the_stack();
		methods.I_get_the_same_item_back();
		
		
		
		
	}
	
	@Test
	public void popanitemintofullstack() throws Throwable {
		cucumberinfo methods = new cucumberinfo();
		stackexample objects = new stackexample();
		methods.a_full_stack();
		methods.I_push_an_item_into_the_stack();
		methods.I_pop_from_the_stack();
		methods.I_get_the_same_item_back();
		
		
		
		
	}
	

}
