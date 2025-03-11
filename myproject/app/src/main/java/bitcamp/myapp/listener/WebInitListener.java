package bitcamp.myapp.listener;

import bitcamp.myapp.config.AppConfig;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;

public class WebInitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // ServletContext:
        ServletContext ctx = sce.getServletContext();

        // 1) DispatcherServlert이 사용할 IoC 컨테이너(Bean 컨테이너) 준비
        AnnotationConfigWebApplicationContext beanContainer = new AnnotationConfigWebApplicationContext();
        beanContainer.register(AppConfig.class);
        beanContainer.refresh();

        // 2) DispacherServlet을 준비
        DispatcherServlet servlet = new DispatcherServlet(beanContainer);
        ServletRegistration.Dynamic registration = ctx.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/app/*");
    }
}
