package clinic.programming.training;

 import java.util.ArrayList;
 import java.util.List;
 import org.apache.commons.lang3.StringUtils;

public class Application {

      public int countWords(Strings words){
          String[] separetedWords = StringUtils.split(words, ' ');
          return (separetedWords == null) ? 0 : separetedWords.length ;
      }
      public void greet(){
      List<String>greetings = new ArrayList<>();
      greetings.add("hello");

        for (String greetings : greetings ){
          System.out.println("Greeings :" + greeting );

      }
      }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	     Application app = new Application();
       app.greet();
       int count = app.countWords("I have four words");
       System.out.println("Word Count:  " + count);
    }
}
