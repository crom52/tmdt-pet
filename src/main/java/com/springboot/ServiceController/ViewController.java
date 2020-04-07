package com.springboot.ServiceController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.Entity.Person;
import com.springboot.mapper.PersonMapper;


@Controller
public class ViewController {
	@Autowired PersonMapper personMapper;

    @RequestMapping(value = { "/index"  , ""})
	    public String welcomeView(Model model) {
    	Person person = new Person();
    	model.addAttribute("loginUser", person);
	        return "index";
	    }

	@RequestMapping(value = { "/personList" })
	    public String personListView() {
	        return "personList";
		}
		@RequestMapping(value = { "/home" })
	    public String homePage() {
	        return "home";
	    }

	@RequestMapping(value = { "/registrationForm" })
   public String registerView() {
       return "registrationForm";
   }

	// @PostMapping("/loginSubmit")
	// public String login(@ModelAttribute("loginUser") Person person ) {
	// 	String userName = person.getuserName();
	// 	String password = person.getPassword();
	// 	List<Person> personList = personMapper.selectAllPerson(); 
	// 	for (int i = 0; i<personList.size() ; i++) 
	// 		if (personList.get(i).getuserName().equals(userName) 
	// 		 && personList.get(i).getPassword().equals(password)) {
	// 		return "redirect:personList";
	// 		}
	// 	return "redirect:index";
	// }
}