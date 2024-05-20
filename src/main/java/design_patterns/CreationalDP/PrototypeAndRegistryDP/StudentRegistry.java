package design_patterns.CreationalDP.PrototypeAndRegistryDP;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    /*
         This is student registry class therefore its map is storing Student object in its Value.
         If it would have been general Registry Class ( like Spring Container), the map would have been defined as
         Map<String, Object> hm = new HashMap<>();
         THis way we make it more generalised registry class which can store any object prototype.
     */

    Map<String, Student> map = new HashMap<>();

    void register(String key, Student student) {
        map.put(key, student);
    }

    Student get(String key) {
        return map.get(key);
    }
}