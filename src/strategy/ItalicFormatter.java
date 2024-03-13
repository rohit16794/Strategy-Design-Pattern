package strategy;

import model.Text;

public class ItalicFormatter implements IFormatter{
    @Override
    public void format(Text text) {
        System.out.println("Formatting text:" + text.getContent() + "to italic");
    }
}
