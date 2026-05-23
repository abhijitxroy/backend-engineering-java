public class StudentProxy extends Student{

    Attendance attendance;

    StudentProxy(Attendance attendance) {
        super(attendance);
    }

    @Override
    public void attendDailySession(){
        if(super.getAttendance().isPresent()){
            
            super.attendDailySession();
        }
        else{
            System.out.println("Absent for the daily session...");
        }
        
    }
    
}
