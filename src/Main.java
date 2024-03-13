import editor.TextEditor;
import model.Text;
import strategy.BoldFormatter;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new BoldFormatter());
        textEditor.formatText(new Text("Hello"));
    }
}