package composite;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 11:41
 * @description:
 */
public class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("文字文件:" + this.name);
    }
}
