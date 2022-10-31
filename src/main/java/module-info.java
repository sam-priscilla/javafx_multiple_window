module sam.priscilla {
    requires javafx.controls;
    requires javafx.fxml;

    opens sam.priscilla to javafx.fxml;
    exports sam.priscilla;
}
