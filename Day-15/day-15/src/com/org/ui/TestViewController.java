package com.org.ui;
import com.org.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestViewController {

	public static void main(String[] args) {
		// starts the spring ioc container - ApplicationContext
				ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
				// how to get the object from the container
				// <bean id = "empService" class = "com.org.service.EmployeeServiceImpl">
				EmployeeServiceImpl service = (EmployeeServiceImpl) context.getBean("employeeServiceImpl"); 
				service.save(); // similar to save() -> dao.store()
				service.remove();// similar to remove()-> dao.remove()
				//closing the context
				ClassPathXmlApplicationContext cpx = (ClassPathXmlApplicationContext)context;
				cpx.close();
	}
}

