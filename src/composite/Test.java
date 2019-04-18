package composite;

/**
 * @author: 魏薏恩
 * @date: 2019/4/18 11:45
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        Folder folder = new Folder("文件夹");
        AbstractFile abstractFile = new ImageFile("图片文件");
        AbstractFile abstractFile1 = new TextFile("文字文件");
        folder.addFile(abstractFile);
        folder.addFile(abstractFile1);
        folder.addFile(folder);
        folder.operation();
    }
}
