package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import javafx.scene.control.ListView;

import java.util.ArrayList;

/**
 * Created by QuantumCat on 31.10.2016.
 */
public class ControlFilms {

    @FXML
    ListView<String> listGenre =new ListView();
    ArrayList<String> listItems =new ArrayList<>();
    public void setListGenre()
    {
        listItems.add("asdsadasasd");
        listItems.add("sdsadasdas");
        listGenre.setItems((ObservableList<String>) listItems);
    }
}
