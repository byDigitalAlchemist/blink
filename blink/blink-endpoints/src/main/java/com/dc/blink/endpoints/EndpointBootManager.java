package com.dc.blink.endpoints;

import static spark.Spark.get;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dc.blink.endpoints.controller.BlinkController;

/**
 * EndpointBootManager
 */
public class EndpointBootManager {
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EndpointBootManager.class);
	
    public static void main( String[] args ){
    	LOGGER.info( "Hello World!" );
        
        get("/hello", (req, res) -> "Hello World اردو" + "<br/ >" + "اُردو پوائنٹ کا باقاعدہ آغاز 14اگست 2000ء میں ہوا۔ اُردو پوائنٹ سے قبل یہ سائیٹ ’’اُردو کارڈز‘‘ کے نام سے مشہور تھی، جسکا آغاز 1998میں ہوا تھا۔ ’’اُردو کارڈز‘‘ پر پہلے اُردو میں کارڈز بھیجنے کی سہولت تھی، لیکن قارئین کی فرمائش پر اس میں شاعری کا اضافہ کیا گیا،جسکی بھرپور کامیابی اور شہرت کے بعد’’ اُردو پوائنٹ‘‘ کو تخلیق کیا گیا۔ آغاز میں اُردو پوائنٹ پر 12سیکشن تھے، اور یہ سادہ طریقے سے اپ ڈیٹ ہوتی تھی۔ اس میں کسی جدید ٹیکنالوجی کا استعمال نہیں کیا گیا تھا، سادہ HTMLصفحات کے ساتھ اس سائیٹ کوکئی سال چلایا جاتا رہا۔");

        
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
        /*get("/:username", (req, res) -> { 
        	String name = req.params("username");
        	return "Username : "+name;
        });*/
        
        
        get("/blinks", (req, res) -> { 
        	return new BlinkController().getAllBlinks();
        });
    }
}
