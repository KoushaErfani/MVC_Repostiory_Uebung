package mvc;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AnwendungssystemView {
	private AnwendungssystemControl anwControl;
	private AnwendungssystemModel anwModel;
	private TextField text;
	private Button btnTest;
	
	
	public AnwendungssystemView(AnwendungssystemControl anwControl,Stage primaryStage, AnwendungssystemModel anwModel) {
		this.anwControl = anwControl;
		this.setAnwModel(anwModel);
		
		primaryStage.setTitle(anwModel.getUeberschrift());
		FlowPane root = new FlowPane();
		Scene scene = new Scene(root,400,400);
		text = new TextField();
		btnTest = new Button("Test");
		root.getChildren().addAll(text,btnTest);
		root.setAlignment(Pos.CENTER);
		buttonClicker();
		
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void buttonClicker(){
		btnTest.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				anwControl.schriebInDatei(text.getText());
			}
		});
	}
	public void zeigErfolgMeldung() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Confirmation");
		alert.setContentText("Der Text wurde in die Datei geschrieben!");
		alert.showAndWait();
	}
	public void zeigFehleran() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Fehler");
		alert.setContentText("Es gibt einen Fehler!");
		alert.showAndWait();
	}

	public AnwendungssystemModel getAnwModel() {
		return anwModel;
	}

	public void setAnwModel(AnwendungssystemModel anwModel) {
		this.anwModel = anwModel;
	}
	

	

}
