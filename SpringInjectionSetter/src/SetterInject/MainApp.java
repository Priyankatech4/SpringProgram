package SetterInject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		FootballPlayer obj=(FootballPlayer)context.getBean("azar");
		FootballPlayer obj1=(FootballPlayer)context.getBean("kishore");
		//System.out.println(obj.getFootball());
		//System.out.println(obj1.getFootball());
		obj.play();
		obj1.play();
		

	}

}