package com.training.utility;

public interface Driver {
	// KEYS 
	String CHROME ="webdriver.chrome.driver"; 
	String FIREFOX ="webdriver.firefox.marionette"; 
	String IE ="webdriver.ie.driver";
	// phantom is used because it is a headless browser
	//it is not an actual driver it just imitates browser
	//it is mainly used when load testing is done on the server 
	//it does not give stress to server
	String PHANTOM="phantomjs.binary.path";
	
	// PATH 
	String CHROME_PATH="C:\\Selenium\\chromedriver.exe";
	String FIREFOX_PATH ="";
	String ID="";
	String PHANTOM_PATH="";
	
}