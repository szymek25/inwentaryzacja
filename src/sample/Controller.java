package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


	public Button testBtn;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void OnClickTest(javafx.event.ActionEvent actionEvent) throws IOException, InterruptedException {

		Runtime r = Runtime.getRuntime();
		Process p = r.exec("open -a \"Microsoft Excel\" /Users/wladysylawziomek/Desktop/inw/Wagi.xlsx");
		p.waitFor();
		BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = "";

		while ((line = b.readLine()) != null) {
			System.out.println(line);
		}

		b.close();
	}
}
