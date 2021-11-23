package com.albares.game.utils;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


@WebListener
public class DeployListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        Parameters.match.generateNewNum();
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
       
    }
}
