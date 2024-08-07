import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       // if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
       // Test test = (Test) o;
        //return id == test.id && Objects.equals(name, test.name);
        return true;
    }

    @Override
    public int hashCode() {
        //return Objects.hash(id, name);
        return 1;
    }

    int id;
        String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Test(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class TestExample{
    public static void main(String[] args) {
        Test t1 = new Test(1, "Deepshikha");
        Test t2 = new Test(2, "Jyotin");
        Test t3 = new Test(3, "Shikha");

        Map<Test, String> map = new HashMap<>();
        map.put(t1, "Developer");
        map.put(t2, "Analyst");
        map.put(t3, "Coder");

        System.out.println("map.size() - > " + map.size());
        for(Map.Entry<Test,String> mp : map.entrySet()){
            System.out.println(mp.getKey() + " ---> " + mp.getValue());
        }




    }
}
