package tymex.itw;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {
    private final List<Student> students;

    public Room(List<Student> students) {
        this.students = students;
    }

    // find the youngest student in the list.
    // list is sorted randomly, so we need to iterate through the list to find the youngest.
    public Student findYoungest(List<Student> students){
        if (students.isEmpty()){
            return null;
        }
        Student yst = students.getFirst();
        for (Student std :students){
            if (std.getAge() < yst.getAge()){
                yst = std;
            }
        }
        return yst;
    }

    // count the number of stds of each age.
    // I'll implement hashmap<Age, int> to store the count of each age.
    public Map<Integer, Integer> groupAgeCount(List<Student> students){
        Map<Integer, Integer> ageCount = new HashMap<>();
        if (students.isEmpty()){
            return ageCount;
        }
        for (Student std : students){
            // insert new age key if it doesn't exist.
            if (!ageCount.containsKey(std.getAge())){
                ageCount.put(std.getAge(), 1);
            }
            // increment the count of the age key.
            else{
                ageCount.put(std.getAge(), ageCount.get(std.getAge())+1);
            }
        }
        return ageCount;
    }

    // Check student existence by id.
    public boolean isStudentExist(String id){
        for (Student std : students){
            if (std.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
