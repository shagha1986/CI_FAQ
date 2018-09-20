import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
    private int id;
    private String name;
    private Map<String, String> answers;
    //private List<String> answers;
    //private List<Answer> answers;

    public Question() {
    }

    //public Question(int id, String name, List<Answer> answers) {
    public Question(int id, String name, Map<String, String> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
        System.out.println("answers are:");
        //Iterator<Answer> itr = answers.iterator();
        Set<Map.Entry<String, String>> set = answers.entrySet();
        Iterator<Map.Entry<String, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Answer:" + entry.getKey() + " Posted By:" + entry.getValue());
            //System.out.println(itr.next());
        }
    }
}
