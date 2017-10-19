package com.baeldung.polymorphism;

public class TextFile extends GenericFile {
    private int wordCount;

    public TextFile(String name, String content, String version) {
        String[] words = content.split(" ");
        this.setWordCount(words.length > 0 ? words.length : 1);
        this.setContent(content.getBytes());
        this.setName(name);
        this.setVersion(version);
        this.setExtension(".txt");
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public String getFileInfo() {
        return super.getFileInfo() + "Word Count: " + wordCount;
    }

    public String read() {
        return this.getContent()
            .toString();
    }

}
