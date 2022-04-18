package interview;

import java.util.HashMap;
import java.util.Map;

public final class ImutableClass {
    private final String name;
    private final int regNo;
    private final Map<String, String> studentInfo;

    public ImutableClass(String name, int regNo, Map<String, String> studentInfo) {
        this.name = name;
        this.regNo = regNo;

        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
                studentInfo.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.studentInfo = tempMap;

    }

    public String getName() { return name; }

    public int getRegNo() { return regNo; }

    public Map<String, String> getMetadata()
    {

        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.studentInfo.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public static void main(String[] args)
    {

        // Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();

        map.put("1", "first");
        map.put("2", "second");

        ImutableClass s = new ImutableClass("ABC", 101, map);

        // Calling the above methods 1,2,3 of class1
        // inside main() method in class2 and
        // executing the print statement over them
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());

        // Uncommenting below line causes error
        // s.regNo = 102;

        map.put("3", "third");
               // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetadata());
        s.getMetadata().put("4", "fourth");
            // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata());
    }
}
