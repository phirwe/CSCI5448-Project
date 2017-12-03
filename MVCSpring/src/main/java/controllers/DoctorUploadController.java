package controllers;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import models.Prescription;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;
import org.hibernate.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;

@Controller
public class DoctorUploadController {
	
	
   @RequestMapping(value = "/doctorPrescriptionUpload", method = RequestMethod.GET)
   public ModelAndView patient() {
	  
      return new ModelAndView("doctorPrescriptionUpload", "command", new Prescription());
   }
   
   @RequestMapping(value = "/doctorPrescriptionUploadPost", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("MVCSpring")Prescription press, 
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
      model.addAttribute("patient_id", press.getPatient_id());
      model.addAttribute("prescription_id", press.getPrescription_id());
      model.addAttribute("inventory_id", press.getInventory_id());
      
      
      return "result_prescription";
   }
}