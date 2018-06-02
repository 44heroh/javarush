package task17.task1708;

import java.util.ArrayList;
import java.util.List;

/*
Заметки для всех
*/

public class Solution {

    public static void main(String[] args) {
        Note note = new Note();
        note.addNote(0, "Заметка 1");
        List<String> notes = note.getNotes();
        for (String noteEl : notes) {
            System.out.println(noteEl);
        }
    }

    public static class Note {

        public volatile List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }

        public List<String> getNotes(){
            return notes;
        }
    }
}
