package stream_z3;

import java.util.List;
import java.util.stream.Collectors;

public class TextService {
    private File file = new File();

    public void createCorrectFile(){
        List<String> list = file.fileRead();
        file.writeFile(list.stream()
                .map(elem -> elem.replace(".", ""))
                .map(elem -> elem.replace(",", ""))
                .filter(elem -> elem.length()>4)
                .collect(Collectors.toList()));

    }
}
