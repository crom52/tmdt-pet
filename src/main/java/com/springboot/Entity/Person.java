package com.springboot.Entity;
public class Person {
    private long id;
    private String userName;
    private String password;
    private String email;
    private String role;
    private int active;
    
 
    public Person() {
    }
    public Person(String userName, String password, String email, int active, String role) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.active = active;
        this.role = role;
    }
    public String getuserName() {
        return userName;
    }
    public void setuserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
    }
    public void setRole(String role) {
		this.role = role;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
    }
    public long getId() {
		return id;
	}
}
//
//package com.springboot.Entity;
//
//import java.util.Set;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.*;
//
//@Entity
//@Table(name = "person")
//public class Person {
//	 @Id
//	    @GeneratedValue(strategy = GenerationType.AUTO)
//	    @Column(name = "id")
//	    private int id;
//	 
//	    @Column(name = "email")
//	    private String email;
//	    
//	    @Column(name = "password")
//	    private String password;
//	    
//	    @Column(name = "name")
//	    private String name;
//	    
//	    @Column(name = "userName")
//	    private String userName;
//	    
//	    @Column(name = "active")
//	    private int active;
//	    
//	    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	    
//	    @JoinTable(name = "role", joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name = "roleid"))
//	    
//	    
//	    private Set<Role> roles;
//
// 
//    public Person() {
//    }
//    public Person(String userName, String password, String email, int active) {
//        this.userName = userName;
//        this.password = password;
//        this.email = email;
//        this.active = active;
//     
//    }
//    
//    public Person (Person person) {
//        this.active = person.getActive();
//        this.email = person.getEmail();
//        this.roles = person.getRoles();
//        this.name = person.getName();
//        this.lastName =person.getLastName();
//        this.id = person.getId();
//        this.password = person.getPassword();
//    }
//    public Person(Person person) {
//		// TODO Auto-generated constructor stub
//	}
//	public String getuserName() {
//        return userName;
//    }
//    public void setuserName(String userName) {
//        this.userName = userName;
//    }
//    public String getPassword() {
//        return password;
//    }
//    public void setPassword(String password) {
//        this.password = password;
//    }
// 
//    public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	
//	public int getActive() {
//		return active;
//	}
//
//	public void setActive(int active) {
//		this.active = active;
//    }
//    public long getId() {
//		return id;
//	}
//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.roles = roles;
//    }
//}
//}