package com.sise.组合模式;

/**
 * 抽象文件接口
 * @author lenm
 */
public abstract class FileParent {
    /**
     * The File name.
     */
    public String fileName;

    /**
     * Add files.
     *
     * @param fileParent the file parent
     * @return the files
     */
    public abstract Files add(FileParent fileParent);

    /**
     * Remove.
     */
    public abstract void remove();

    /**
     * Clear.
     */
    public abstract void clear();

    /**
     * Gets child.
     *
     * @return the child
     */
    public abstract FileParent getChild();
}
