package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 11:41
 * @description:
 */
public class Folder implements AbstractFile {
    private String name;
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(AbstractFile abstractFile) {
        this.list.add(abstractFile);
    }

    public void removeFile(int index) {
        this.list.remove(index);
    }

    public AbstractFile getChild(int index) {
        return this.list.get(index);
    }

    @Override
    public void operation() {
        list.stream().forEach(AbstractFile::operation);
    }
}
