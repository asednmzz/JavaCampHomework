
public class Main {

	public static void main(String[] args) {
		

		Course course1=new Course(1 , "Java + React", "Engin Demiroð" , "%56 Tamamlandý.");
		Course course2=new Course(2,"C# + Angular", "Engin Demiroð", "%80 tamamlandý.");
		Course course3=new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demiroð","%25 tamamlandý.");
		
		Course[] courses= {course1, course2,course3};
		
		for(Course course:courses) 
		{
			System.out.println("Kurs Adý:"+course.CourseName);
			System.out.println("Kurs tamamlanma yüzdesi:"+course.CourseComplete);
			
			
		}
		
		
		System.out.println("---------------------------------------------");
		
		User user1=new User(1,"Aslýcan Dönmez", "aslicandonmezz@outlook.com");
		User user2=new User(2,"Beyza Öztürk", "beyzanurozturk@gmail.com");
		
		User[] users={user1,user2};
	for(User user:users) {
	
		System.out.println("Kullanýcý adý:"+user.UserName);
		System.out.println("Kullanýcý iletiþim:"+user.UserMail);
	}
	
	
	
	CourseRegister courseRegister=new CourseRegister();
	courseRegister.Register(course1);
	courseRegister.Register(course2);
	courseRegister.RegisterExit(course3);
		
		
	}
	
	
	
	
}
