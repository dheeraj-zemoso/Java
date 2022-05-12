package Assignments;

import java.io.File;

public class Assignment1
{
    public static void main(String[] args)
    {
        File directory = new File("/home");
        File[] files = directory.listFiles();
        for (File f : files)
        {
            search(f);
        }
    }
    public static void printIfMatched(File file)
    {
        String path = file.getAbsolutePath();
        if (path.matches(".*file[0-9]+.*"))
        {
            System.out.println(path);
        }
    }
    public static void printPath(File file)
    {
        printIfMatched(file);
    }
    public static void search(File directory)
    {
        if (directory.isDirectory()&&directory.listFiles()!=null)
        {
            for (File file : directory.listFiles()) {
                search(file);
            }
        }
        else
        {
            printPath(directory);
        }
    }
}
