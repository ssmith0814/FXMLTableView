package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.text.Format;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    public class FormattedTableCellFactory<S, T>
            implements Callback<TableColumn<S, T>, TableCell<S, T>> {
        private TextAlignment alignment;
        private Format format;

        public TextAlignment getAlignment() {
            return alignment;
        }

        public void setAlignment(TextAlignment alignment) {
            this.alignment = alignment;
        }

        public Format getFormat() {
            return format;
        }

        public void setFormat(Format format) {
            this.format = format;
        }

        @Override
        public TableCell<S, T> call(TableColumn<S, T> param) {
            return null;
        }
    }
}