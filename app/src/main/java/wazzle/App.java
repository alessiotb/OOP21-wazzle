/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wazzle;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Screen;
import javafx.stage.Stage;
import wazzle.view.controller.MainMenuView;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.geometry.Rectangle2D;

public final class App extends Application {

	public void start(Stage stage) {
			Rectangle2D screenViewport = Screen.getPrimary().getBounds();
			stage.setWidth(screenViewport.getWidth()*0.75);
			stage.setHeight(screenViewport.getHeight()*0.75);
			MainMenuView mainMenuController;
			try {
				mainMenuController = new MainMenuView(stage);
				FXMLLoader loader = new FXMLLoader(ClassLoader.getSystemResource("layouts/mainMenu.fxml"));
				loader.setController(mainMenuController);
				Parent root = loader.load();
				Scene scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
			} catch (IOException e) {
				Alert alert = new Alert(AlertType.NONE);
				alert.setContentText("Non so che ca**o sia successo. RIPROVA GRAZIE :)");
				ButtonType exitButton = new ButtonType("Ok riprovo ma non urlare");
				alert.getButtonTypes().setAll(exitButton);
				alert.showAndWait();
			}
	}
	
    public static void main(final String... args) {
        launch();
    }

}
