package editor;

import model.Text;
import strategy.IFormatter;

public class TextEditor {
    private final IFormatter formatter;

    public TextEditor(IFormatter formatter) {
        this.formatter = formatter;
    }

    public void formatText(final Text text) {
        if(formatter==null) {
            System.out.println("No formatting needed");
        } else formatter.format(text);
    }
}
