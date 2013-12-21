package com.agilysys.pos.rules;

//import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.agilysys.pos.domainobjects.*;

/**
 * Simple rules test
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            // load up the knowledge base
    	    KieContainer kContainer = KieServices.Factory.get().getKieClasspathContainer();

            // Create an order and test various rules
        	Order order = CreateOrder() ; 

    	    KieSession kSession = kContainer.newKieSession("validation-rules");

        	kSession.insert(order);
        	
            System.out.println("firing validation rules");
            kSession.fireAllRules();
            
//            KieSession kSession2 = kContainer.newKieSession("check-rules");
//            kSession2.insert(order);
//
//            System.out.println("firing check rules");
//            kSession2.fireAllRules();
            
            System.out.println("all rules fired");
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    private static Order CreateOrder() {
    	Order order = new Order();

    	Item choicGroupItem = CreateMenuItemWithModifiers();
    	choicGroupItem.setId(1234);
    	order.addItem(choicGroupItem);
    	
    	Item anotherItem = CreateMenuItemWithModifiers(); 
    	anotherItem.setId(2345);
    	order.addItem(anotherItem);
    	
    	order.addCheck(new Check());
    	order.addCheck(new Check());
    	
    	return order;
    }
    
    private static Item CreateMenuItemWithModifiers() {
    	
    	Item choiceGroup = new Item();
    	choiceGroup.setName("Choice Group");
    	
    	Tag tag1 = new Tag();
    	tag1.setName("Modifier");
    	tag1.addAttribute("ChoiceType", "XOR");
    	choiceGroup.addTag(tag1);
    	
    	Item modifier1 = new Item();
    	modifier1.setName("rare");
    	modifier1.setSelected(false);
    	
    	Item modifier2 = new Item();
    	modifier2.setName("well done");
    	modifier2.setSelected(true);
    	
    	choiceGroup.addItem(modifier1);
    	choiceGroup.addItem(modifier2);
   	
    	return choiceGroup;
    }
}
