package com.github.perschola;

import com.github.perschola.dictionary.CMUDictionary;
import com.github.perschola.dictionary.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leonhunter
 * @created 04/06/2020 - 4:24 PM
 */
public class SwypeKeyboard {
    private static final List<String> dictionary = CMUDictionary
            .DICTIONARY
            .getWordList()
            .stream()
            .map(Word::getSpelling)
            .collect(Collectors.toList());

    public List<String> getSuggestedWords(String input) {
        List<String> result = new ArrayList<>();
        for (String dictionaryEntry : dictionary) {
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
        for (int i = 0; i < dictionaryEntry.length(); i++) {
            String dictionaryEntryCharacter = dictionaryEntry.split("")[i];
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
