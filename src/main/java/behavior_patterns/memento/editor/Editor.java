package behavior_patterns.memento.editor;

import behavior_patterns.memento.Memento;

public class Editor implements EditorInterface{
    private String text;
    private String textStyle;
    private int textSize;
    private String textColor;

    public Editor(String text, String style, int size, String color) {
        this.text = text;
        this.textStyle = style;
        this.textSize = size;
        this.textColor = color;
    }

    @Override
    public void setState(String text,
                         String textStyle,
                         int textSize,
                         String textColor)
    {
        this.text = text;
        this.textStyle = textStyle;
        this.textSize = textSize;
        this.textColor = textColor;
    }

    @Override
    public Memento save() {
        return new Snapshot(this,text,textStyle,textSize,textColor);
    }
}
