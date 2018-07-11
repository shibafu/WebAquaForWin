package com.Tsugaruweb;

import org.springframework.context.ApplicationContext;
import com.Tsugaruweb.stage.TopStage;

import javafx.application.Application;
import javafx.stage.*;


public class AppMain extends Application {

    // SpringのアプリケーションContext(static)
    public static ApplicationContext applicationContext;
	@Override
	public void start(Stage stage) {
		stage = new TopStage();
		stage.show();
		
	}
	
	public static void main(String args[]) {
		launch();
	}
}
