package behavior_patterns.memento.editor;

import behavior_patterns.memento.Memento;

public interface EditorInterface {
     Memento save();
     void setState(String text,
                   String textStyle,
                   int textSize,
                   String textColor);
}
