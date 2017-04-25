package com.dc.blink.endpoints;

import static spark.Spark.get;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * EndpointBootManager
 */
public class EndpointBootManager {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EndpointBootManager.class);
	
    public static void main( String[] args ){
    	LOGGER.info( "Hello World!" );
        
        get("/hello", (req, res) -> "Hello World");

        /**
         * URL : http://localhost:4567/greetings?username=DC
         */
        get("/greeting", (req, res) -> { 
        	String name = req.queryParams("username");
        	return "Hello "+name;
        });
        
        /**
         * URL : http://localhost:4567/greetings?username=DC
         * here :username is the path variable
         */
        get("/:username", (req, res) -> { 
        	String name = req.params("username");
        	return "Username : "+name;
        });
    }
}
