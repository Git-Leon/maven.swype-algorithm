package com.github.git_leon.dictionary;

import java.util.*;
import java.util.stream.Collectors;

public enum CMUDictionary {
    DICTIONARY;

    private final List<String> wordList;

    CMUDictionary() {
        this("cmudict.0.7a.txt");
    }

    CMUDictionary(String filePath) {
        FileParser fileParser = new FileParser(filePath);
        this.wordList = new ArrayList<>();
        for (String line : fileParser
                .toListOfLines()
                .stream()
                .filter(line -> !line.startsWith(";;;"))
                .collect(Collectors.toList())) {
            String[] wordAndPhoneme = line.split(" {2}");
            String wordAsString = wordAndPhoneme[0];
            wordList.add(wordAsString);
        }
    }

    public List<String> getWordList() {
        return wordList;
    }
}
