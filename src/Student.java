public class Student {
    protected String stringId;
    protected String studentName;
    protected String faculty;
    protected String major;
    
    public void enrollment(){
        System.out.println("student enrollment");
    }
    
    public void payment(){
        System.out.println("student payment");
    }
       
    public void addCourse (){
        System.out.println("student addCourse");
    }
     public void dropCourse(){
        System.out.println("student dropCourse");
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student arisa = new Student();
        System.out.println("Hello World");
        System.out.println("Odject = "+arisa);
        arisa.enrollment();
        arisa.dropCourse();
        arisa.addCourse();
        arisa.payment();
        
        
      
       
   
}
   


}//end class
