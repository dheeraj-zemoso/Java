package Assignments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment3
{
    public static void main(String[] args) throws IOException {
        int number = 6;
        String host = "www.google.com";
        getMedianOfPings(number, host);
    }
    public static void getMedianOfPings(int number, String host) throws IOException {
        if (number<1)
        {
            return;
        }
        ArrayList<Double> pings = getPing(number, host);
        System.out.println("Pings to "+host+" are "+pings);
        System.out.println("The median is "+getMedian(pings));
    }
    public static ArrayList<Double> getPing(int n, String host) throws IOException
    {
        ProcessBuilder build = new ProcessBuilder();
        ArrayList<String> commands = new ArrayList<>();
        commands.add("ping");
        commands.add("-n");
        commands.add("-c");
        commands.add(Integer.toString(n));
        commands.add(host);
        ArrayList<Double> pings = new ArrayList<>();
        build.command(commands);
        Scanner inputCommand;
        Process process = build.start();
        inputCommand = new Scanner(process.getInputStream());
        String outputCommand;
        while(inputCommand.hasNext())
        {
            outputCommand = inputCommand.nextLine();
            if (outputCommand.contains("time="))
            {
                System.out.println(outputCommand);
                int from = outputCommand.indexOf("time=")+5;
                int to = outputCommand.indexOf(" ms");
                double time = Double.parseDouble(outputCommand.substring(from, to));
                System.out.println("Ping Time : "+time);
                pings.add(time);
            }
        }
        return pings;
    }

    public static double getMedian(List<Double> pings)
    {
        int n = pings.size();
        Collections.sort(pings);
        System.out.println("Sorted ping times = "+pings);
        if (n%2==0)
        {
            double ans = (pings.get((n/2)-1)+pings.get((n/2)))/2;
            return ans;
        }
        return pings.get(n/2);
    }
}