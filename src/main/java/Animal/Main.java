package Animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
     public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
	/*	Tiger tiger=(Tiger)ac.getBean("tiger");
		Monkey monkey=(Monkey)ac.getBean("monkey");*/
		
		Zoo zoo=(Zoo)ac.getBean("zoo");
		System.out.println(zoo.toString());
		
	}
}
