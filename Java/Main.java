import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
                ArrayList<String> orgao = new ArrayList<String>();
                orgao.add("PR");
                orgao.add("BA");
                orgao.add("PI");
                orgao.add("RS");
                orgao.remove(1);
                orgao.set(1, "SC");
                System.out.println(orgao);
        }
}