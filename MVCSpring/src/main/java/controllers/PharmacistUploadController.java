package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import models.Inventory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Controller
public class PharmacistUploadController {
	
   @RequestMapping(value = "/pharmacistUpload", method = RequestMethod.GET)
   public ModelAndView patient() {
      return new ModelAndView("pharmacistUpload", "command", new Inventory());
   }
   
   @RequestMapping(value = "/pharmacistUploadPost", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("MVCSpring")Inventory press, 
      ModelMap model) {
	 //creating configuration object
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating seession factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		
		//creating transaction object
		Transaction t=session.beginTransaction();
		
		session.persist(press);//persisting the object
		
		t.commit();//transaction is commited
		session.close();
      model.addAttribute("inventory_id", press.getInventory_id());
      model.addAttribute("cost", press.getCost());
      model.addAttribute("quantity", press.getQuantity());
      
      
      return "result_inventory";
   }
}