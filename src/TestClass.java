public class TestClass {
    public static void main(String[] args) {
       Grade grade = new Grade();
        System.out.println("historia ocen studenta: "
                + grade.studyGroupA.getFirstName()+" "
                +grade.studyGroupA.getLastName()+", ocena w grupie studenckiej A: "
                +grade.studyGroupA.grade);
        System.out.println(",ocena w grupie studenckiej B: "
        +grade.studyGroupB.grade);
    }
}
