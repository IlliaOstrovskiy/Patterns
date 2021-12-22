package behavior_patterns.memento.start.point;

import behavior_patterns.memento.editor.Editor;
import behavior_patterns.memento.editor.EditorInterface;
import behavior_patterns.memento.editor.SnapshotManager;

public class Main {
    public static void main(String[] args) {
        SnapshotManager manager = new SnapshotManager();
        EditorInterface editor = new Editor("Text","Times New Roman",8,"Black");
        System.out.println(editor);

        manager.addSnapshot(editor.save());

        editor.setState("Some new text","King`s Indian",10,"Red");

        System.out.println(editor);

        manager.addSnapshot(editor.save());

        manager.undo();

        System.out.println(editor);


    }
}
