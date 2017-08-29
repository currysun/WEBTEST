package array;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 如果想要获得当前文件中的文件名只需要String [] fileName = file.list();就可以了。如果要包括文件中的文件名就可以用递归的方式。下面是两个具体的实现。
　　其中public static String [] getFileName(String path)是只得到当前文件中的文件名。public static void getAllFileName(String path,ArrayList<String> fileName)是包括当前文件及其子文件的文件名。
 */
public class GetFileName
{
    public static String [] getFileName(String path)
    {
        File file = new File(path);
        String [] fileName = file.list();
        return fileName;
    }
    public static void getAllFileName(String path,ArrayList<String> fileName)
    {
        File file = new File(path);
        File [] files = file.listFiles();
        String [] names = file.list();
        if(names != null)
        fileName.addAll(Arrays.asList(names));
        for(File a:files)
        {
            if(a.isDirectory())
            {
                getAllFileName(a.getAbsolutePath(),fileName);
            }
        }
    }
    public static void main(String[] args)
    {
        String [] fileName = getFileName("C:\\Documents\\DSExport\\Submission\\FED\\0004\\20160629");
        for(String name:fileName)
        {
            System.out.println(name);
        }
        System.out.println("--------------------------------");
        ArrayList<String> listFileName = new ArrayList<String>(); 
        getAllFileName("C:\\Documents\\DSExport\\Submission\\FED\\0004\\20160629",listFileName);
        for(String name:listFileName)
        {
            System.out.println(name);
        }
         
    }
}