package com.sise.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Files.
 * @author lenm
 */
public class Files extends FileParent {

    /**
     * The File inter face list.
     */
    public List<FileParent> fileInterFaceList = new ArrayList<>();

    @Override
    public Files add(FileParent fileParent) {
        fileInterFaceList.add(fileParent);
        System.out.println(fileParent.fileName);
        return this;
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

    /**
     * 文件清洗
     */
    public void clearFile() {
        for (FileParent fileParent : fileInterFaceList) {
            System.out.println("正在识别文件名称-------------" + fileParent.fileName);
        }
    }
}
