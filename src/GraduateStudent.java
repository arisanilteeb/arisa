public class GraduateStudent extends Student {
    
    private String studentLevel;
    private String thesisAdviser;
    
    public void oralExamination(){
        System.out.println("student oralExamination");
    }
    public void thesisExamination(){
        System.out.println("student thesisExamination");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        GraduateStudent arisa = new GraduateStudent ();
        System.out.println("Object = "+arisa);
        arisa.oralExamination();
        arisa.thesisExamination();
        
        arisa.enrollment();
        arisa.dropCourse();
        arisa.addCourse();
        arisa.payment();
       
    }
    
}//end