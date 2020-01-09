public class StringManipulations {

  private static StringBuilder stringBuilder = new StringBuilder("zebra");

  public static void main(String[] args) {

    stringBuilder.reverse();
    //reverses a string

    stringBuilder.replace(0, stringBuilder.length(), "new_string");
    //completely replaces a string, basically makes string mutable

    stringBuilder.append("_part2");
    //String Builder instead of + when large # of concats

    String exampleString = "this_is_an_example";
    exampleString.contains("example");
    //checks if the string has a substring in it
    exampleString.endsWith("example");
    //checks suffix of string




  }


}