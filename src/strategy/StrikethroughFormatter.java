package strategy;

import model.Text;

public class StrikethroughFormatter implements IFormatter{
    @Override
    public void format(Text text) {
        System.out.println("Formatting text:" + text.getContent() + "to strike");
    }
}
