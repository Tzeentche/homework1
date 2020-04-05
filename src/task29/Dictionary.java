package task29;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Dictionary {

    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new FileReader("C:\\JAVA\\Projects\\homework1\\src\\task29\\Text.txt"));
        String line;
        Map <String, AtomicInteger> classByCount = new HashMap<>();

        while ((line = reader.readLine()) != null) {

            final String[] lineArray = line.split("\\s");
            String clazz = lineArray[lineArray.length-1];
            AtomicInteger count = classByCount.get(clazz);

            if(count == null)classByCount.put(clazz, (count = new AtomicInteger(0)));
            count.incrementAndGet();
        }

        for (Map.Entry <String, AtomicInteger> entry:classByCount.entrySet())
            System.out.printf("class '%s':%d\n", entry.getKey(), entry.getValue().get());
    }
}