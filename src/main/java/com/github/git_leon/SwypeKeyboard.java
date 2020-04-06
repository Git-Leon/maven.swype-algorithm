package com.github.git_leon;

import com.github.git_leon.dictionary.CMUDictionary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leonhunter
 * @created 04/06/2020 - 4:24 PM
 */
public class SwypeKeyboard {
    private List<String> dictionary;

    public SwypeKeyboard() {
        this(CMUDictionary.DICTIONARY.getWordList());
    }

    public SwypeKeyboard(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> getSuggestedWords(String input) {
        List<String> result = new ArrayList<>();
        for (String dictionaryEntry : this.dictionary) {
            // ensure that the input occur in the order that dictionaryEntry occur in
            if (occursInOrder(input, dictionaryEntry)) {
                result.add(dictionaryEntry);
            }
        }
        return result;

    }

    // ensure characters in input occur in the order dictionaryEntry
    private Boolean occursInOrder(String input, String dictionaryEntry) { // TODO
        String[] path = input.split("");
        String[] dictionaryEntryCharacters = dictionaryEntry.split("");
        for (int i = 0; i < dictionaryEntry.length(); i++) {
            String dictionaryEntryCharacter = dictionaryEntryCharacters[i];
            for (int j = i; j < path.length; j++) {
                String pathChar = path[j];
                if (dictionaryEntryCharacter == pathChar) {
                    return true;
                }
            }
        }
        return false;
    }

}
