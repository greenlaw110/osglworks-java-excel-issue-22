package example;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import org.osgl.xls.ExcelReader;

public class Main {

  public static void main(String[] args) {

    List<Model> collect = ExcelReader.builder()
        .sheets("mySheet")
        .file(new File("mySheet.xlsx"))
        .build().read(Model.class).stream().filter(Model::getTestRunMode)
        .collect(Collectors.toList());

    System.out.println(collect);

  }

}
