package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import models.Patient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Controller
public class PatientController {
	
   @RequestMapping(value = "/patient", method = RequestMethod.GET)
   public ModelAndView patient() {
      return new ModelAndView("patient", "command", new Patient());
   }
   
   @RequestMapping(value = "/addPatient", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("MVCSpring")Patient patient, 
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
		session.persist(patient);//persisting the object
		
		t.commit();//transaction is commited
		session.close();
      model.addAttribute("name", patient.getName());
      model.addAttribute("age", patient.getAge());
      model.addAttribute("id", patient.getId());
      
      return "result";
   }
}