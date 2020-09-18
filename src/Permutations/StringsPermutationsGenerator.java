package Permutations;

import java.util.ArrayList;

public class StringsPermutationsGenerator {
    private char start;
    private char end;
    private int stringsLength;

    public StringsPermutationsGenerator(int stringsLength) {
        this(stringsLength, 'a', 'z');
    }

    public StringsPermutationsGenerator(int stringsLength, char start, char end) {
        this.stringsLength = stringsLength;
        this.start = start;
        this.end = end;
    }

    public void fillWithPermutations(ArrayList<ArrayList<Character>> permutations) {
        fillWithPermutations(stringsLength, permutations, new char[stringsLength]);
    }

    private void fillWithPermutations(int depth, ArrayList<ArrayList<Character>> permutations, char[] chars) {
        if (depth == 0)
            permutations.add(convertToArrayList(chars));
        else if (depth > 0)
            for (char c = start; c < end; c++) {

                chars[depth - 1] = c;

                fillWithPermutations(depth - 1, permutations, chars);
            }
    }

    private ArrayList<Character> convertToArrayList(char[] chars) {
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : chars) characters.add(c);
        return characters;
    }

    public char getStart() {
        return start;
    }

    public void setStart(char start) {
        this.start = start;
    }

    public char getEnd() {
        return end;
    }

    public void setEnd(char end) {
        this.end = end;
    }

    public int getStringsLength() {
        return stringsLength;
    }

    public void setStringsLength(int stringsLength) {
        this.stringsLength = stringsLength;
    }
}
