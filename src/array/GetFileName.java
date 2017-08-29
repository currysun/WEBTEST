package array;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * �����Ҫ��õ�ǰ�ļ��е��ļ���ֻ��ҪString [] fileName = file.list();�Ϳ����ˡ����Ҫ�����ļ��е��ļ����Ϳ����õݹ�ķ�ʽ�����������������ʵ�֡�
��������public static String [] getFileName(String path)��ֻ�õ���ǰ�ļ��е��ļ�����public static void getAllFileName(String path,ArrayList<String> fileName)�ǰ�����ǰ�ļ��������ļ����ļ�����
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