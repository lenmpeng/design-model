package com.sise.组合模式;

/**
 * The type Video file.
 * @author lenm
 */
public class VideoFile extends FileParent {

    /**
     * Instantiates a new Video file.
     *
     * @param name the name
     */
    public VideoFile(String name) {
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
