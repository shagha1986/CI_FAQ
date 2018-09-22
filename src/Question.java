import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
    private int id;
    private String name;
   private Map<User, Answer> answers;
   // private Map<String, String> answers;
    //private List<String> answers;
    //private List<Answer> answers;

    public Question() {
    }

    //public Question(int id, String name, List<Answer> answers) {
    public Question(int id, String name, Map<User, Answer> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println("Question_id: "+ id + " Question-> " + name);
        System.out.println("answers are:");
        //Iterator<Answer> itr = answers.iterator();
        Set<Map.Entry<User, Answer>> set = answers.entrySet();
        Iterator<Map.Entry<User, Answer>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<User, Answer> entry = itr.next();
            System.out.println("User info: " + entry.getKey() + "\n Answer Info: -->" + entry.getValue());
            //System.out.println(itr.next());
        }
    }
}
