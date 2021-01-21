package com.sise.组合模式;

/**
 * The type Text file.
 * @author lenm
 */
public class TextFile extends FileParent {

    /**
     * Instantiates a new Text file.
     *
     * @param name the name
     */
    public TextFile(String name) {
        super.fileName = name;
    }

    @Override
    public Files add(FileParent fileParent) {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void clear() {

    }

    @Override
    public FileParent getChild() {
        return null;
    }
}
