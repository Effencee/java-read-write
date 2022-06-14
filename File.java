package stream_z3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class File {
    private static final String INPUT_FILE_NAME = "corruptedText.txt";
    private static final String OUTPUT_FILE_NAME = "correctText.txt";

    public List<String> fileRead(){
        List<String> list = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE_NAME))) {
            for (String s: bufferedReader.readLine().split(" ")) {
                list.add(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeFile(List<String> list){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME))) {
            for (String s: list) {
                bufferedWriter.write(s+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
