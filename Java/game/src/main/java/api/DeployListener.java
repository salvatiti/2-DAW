package api;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class DeployListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        int a = (int) (Math.random()*4);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
       
    }
}
