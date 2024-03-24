//package learning.java.features.java8.streams;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class MapFlatMapDemo2 {
//
//
//    public static void main(String[] args) {
//
//        StudentData studentData1 = new StudentData("James", 15, Map.of("Science", 80, "Language", 85));
//        StudentData studentData2 = new StudentData("Harry", 15, Map.of("Science", 30, "Language", 85));
//        StudentData studentData3 = new StudentData("Renold", 15, Map.of("Science", 80, "Language", 25));
//
//        List<StudentData> studentDatas = List.of(studentData1, studentData2, studentData3);
//
//        studentDatas.stream().flatMap(studentData ->
//        {
//            studentData.getMarksReport().values().stream().collect(Collectors.g)
//        })
//                .
//
//    }
//
//
//}
//
//class StudentData {
//
//    private int age;
//    private String name;
//    private String department;
//    private Map<String, Integer> marksReport;
//
//    StudentData(String name, int age, Map<String, Integer> marksReport) {
//        this.name = name;
//        this.age = age;
//        this.marksReport = marksReport;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Map<String, Integer> getMarksReport() {
//        return marksReport;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//}
