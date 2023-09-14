package amber.noida.springDay1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
//    	Tight coumpling
//        Student s1 = new Student("Sohan");
//        s1.display();
//        
//        AmberStudent amber1 = new AmberStudent();
//        amber1.display();
    	
//    	Loose coumpling
//    	Student1 st1 = new AmberStudent1();
//    	st1.display();
    	
//    	ApplicationContext is an interface
//    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//    	
//    	NewEmp emp = (NewEmp)context.getBean("newEmp"); 
//    	System.out.println(emp);
    	
    	
    	ApplicationContext context1 = new ClassPathXmlApplicationContext("file.xml");
    	
    	Sample sample = (Sample)context1.getBean("sample");
    	sample.setName("Rohan");
    	System.out.println("My Name is: "+sample.getName());
    	
    	Sample sample1 = (Sample)context1.getBean("sample");
    	sample1.setName("Sohan");
    	System.out.println("My Name is: "+sample1.getName());
    	
    	System.out.println(sample == sample1);
    	
       	
//    	Student1 st2;
//    	type casting amberstudent2 obj to student interface reference
//    	st2 = (Student1)context.getBean("amberstudent1"); ;
//    	st2.display();
    	
    	
        
    }
}
