package com.company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice
{
    public static <T> Map<T, Long> getFreq(List<T> list)
    {
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
