package mvc;


import javafx.stage.Stage;

public class AnwendungssystemControl {
	private AnwendungssystemModel anwModel;
	private AnwendungssystemView anwView;
	
	public AnwendungssystemControl(Stage primaryStage) {
		this.anwModel = new AnwendungssystemModel();
		this.setAnwView(new AnwendungssystemView(this, primaryStage, anwModel));
	}

	public AnwendungssystemView getAnwView() {
		return anwView;
	}

	public void setAnwView(AnwendungssystemView anwView) {
		this.anwView = anwView;
	}
	
	public void schriebInDatei(String text) {
		try {
			anwModel.schreibInDatei(text);
			anwView.zeigErfolgMeldung();
			
		} catch (Exception e) {
			anwView.zeigFehleran();
		}
	}
	
	
	

}
