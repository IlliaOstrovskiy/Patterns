package behavior_patterns.memento.editor;

import behavior_patterns.memento.Memento;

public class Snapshot implements Memento {
    private Editor editor;

    private String text;
    private String textStyle;
    private int textSize;
    private String textColor;

    public Snapshot(Editor editor, String text, String textStyle, int textSize, String textColor) {
        this.editor = editor;
        this.text = text;
        this.textStyle = textStyle;
        this.textSize = textSize;
        this.textColor = textColor;
    }

    @Override
    public void undo() {
        editor.setState(text,textStyle,textSize,textColor);
    }
}
