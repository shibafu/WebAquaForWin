package com.Tsugaruweb.stage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Tsugaruweb.springUtils.SpringInjector;

import javafx.stage.Stage;

/**
 * 親クラス。
 * このアプリに一つしか存在しないため、シングルトンパターン
 * @author nozawa
 *
 */
public class AbstractWebAquaStage extends Stage {

    // SpringのアプリケーションContext(static)
    public static ApplicationContext applicationContext;

	/**
	 * Springのアプリケーションコンテキストを有効化し、@Autowiredをインジェクション
	 */
	public void init() {
		applicationContext = new ClassPathXmlApplicationContext("spring/application-config.xml");
		SpringInjector si = applicationContext.getBean(SpringInjector.class);
		si.inject(this);
	}
	
	 public AbstractWebAquaStage() {
		this.init();
	    // 動作確認用としてコンソールへ出力
	    System.out.println("親ステージとしてインスタンスが生成されました。");
	  }
}
