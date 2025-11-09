package WebView;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML private Button myBtn;
    @FXML private WebView myWebView;
    @FXML private TextField myTextField;

    private WebEngine engine;
    private double webZoom;
    private WebHistory history;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        engine = myWebView.getEngine();
        webZoom = 1;
        loadPage();
    }

    public void loadPage()
    {
//        engine.load("https://www.google.com");
        engine.load("http://"+myTextField.getText());
    }

    public void refreshPage()
    {
        engine.reload();
    }

    public void zoomIn()
    {
        webZoom += 0.5;
        myWebView.setZoom(webZoom);
    }

    public void zoomOut()
    {
        webZoom -= 0.5;
        myWebView.setZoom(webZoom);
    }

    public void displayHistory()
    {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();

        for (WebHistory.Entry entry : entries)
        {
            System.out.println(entry.getUrl()+ " " + entry.getLastVisitedDate());
        }
    }

    public void back()
    {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(-1);
        myTextField.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    public void forward()
    {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(1);
        myTextField.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

    public void executeJS()
    {
        engine.executeScript("window.location = \"https://www.youtube.com\";");
    }
}
