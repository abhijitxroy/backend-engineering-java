public class Student implements DailySession{

    private Attendance attendance;

   
    Student(Attendance attendance){
        this.attendance = attendance;
    }
    @Override
    public void attendDailySession(){
    System.out.println("Attending the daily session...");
    }
    
    public Attendance getAttendance() {
        return attendance;
    }
    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }   
}
