package composite;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 11:40
 * @description:
 */
public class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("图片文件:" + this.name);
    }
}
