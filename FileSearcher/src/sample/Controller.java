package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.Scanner;


public class Controller {
    private static Scanner kb = new Scanner(System.in);
    // crate variables for the text fields and the text output

    @FXML
    private TextField textPath;
    @FXML
    private TextField textFileName;
    @FXML
    private TextField textFileExt;
    @FXML
    private TextField textContent;
    @FXML
    private TextField textDate;
    @FXML
    private TextField textOutput;

    // this method will perform all the file search operations
    public void handleButtonAction(ActionEvent actionEvent)
    {
        String path = textPath.getText();
        //System.out.println("Im in controller\n\n");

        String filesFound = FileSearch.findAllFiles(path);
        //System.out.println(filesFound);

        // TODO: work displaying every file in a new line becuase its not working feel like a champion boy
        // textOutput.append // I think this is the way to go

        textOutput.setText(filesFound);
    }


}
