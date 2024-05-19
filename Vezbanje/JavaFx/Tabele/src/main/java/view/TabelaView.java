package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import model.Person;

public class TabelaView extends VBox {

    private Label tabela;
    private TableView<Person> tableView;
    private TableColumn<Person, String> nameColumn;
    private TableColumn<Person, Integer> ageColumn;
    private ObservableList<Person> people;

    public TabelaView() {
        initElements();
        addElements();
    }

    private void addElements() {
        tableView.getColumns().addAll(nameColumn, ageColumn);
        tableView.setItems(people);
        this.getChildren().addAll(tableView);

    }

    private void initElements() {
        tabela = new Label("Tabela");
        nameColumn = new TableColumn<>("Name");
        ageColumn = new TableColumn<>("Age");
        people = FXCollections.observableArrayList(
                new Person("Pera", 20),
                new Person("Zoki", 21),
                new Person("Miroslav", 33)
        );
    }
}
