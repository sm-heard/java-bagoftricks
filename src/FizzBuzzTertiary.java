public class FizzBuzzTertiary {

  public static void main(String[] args) {

    for (int i = 1; i < 1000; i++) {
      System.out.println(fizzBuzValue(i));
    }
  }

  private static String fizzBuzValue(int i){

    return (i % 3 == 0) ? ((i % 5 == 0) ?  "FizzBuzz" : "Fizz") :
        ((i % 5 == 0) ? "Buzz" : String.valueOf(i));
  }
}
