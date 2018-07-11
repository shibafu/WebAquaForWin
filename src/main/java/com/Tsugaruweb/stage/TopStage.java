package com.Tsugaruweb.stage;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class TopStage extends AbstractWebAquaStage {
	@Autowired
	ResourceLoader resource;
/**
 * トップステージ
 */
	public TopStage(){
		
		//ルートペイン
		Pane MainPane = null;
		try {
			MainPane = (Pane)FXMLLoader.load(resource.getResource("classpath:fxml/Tekito.fxml").getURL());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Scene x_scene;
		x_scene = new Scene(MainPane);
		this.setScene(x_scene);

	}
}
