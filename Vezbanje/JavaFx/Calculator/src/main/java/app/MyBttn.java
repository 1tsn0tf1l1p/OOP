package app;

import javafx.geometry.Insets;
import javafx.scene.control.Button;

public class MyBttn extends Button {

    public MyBttn(String text) {
        this.setText(text);
        this.setMaxHeight(Double.MAX_VALUE);
        this.setMaxWidth(Double.MAX_VALUE);
        this.setPadding(new Insets(10, 10, 10, 10));
    }

}
