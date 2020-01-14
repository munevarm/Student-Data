package namebackwards;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println("Type in: ");
        
//        char letter [] = new char [word.length()];
//        for( int i = word.length()-1 ; i >= 0 ; i--){
//            letter[i] = word.charAt(i);
//            System.out.println(letter[i]);
//        }
//        System.out.println(letter);

//
//        StudentData names = new StudentData();
//        String student [] = new String[5];
//        
//        for(int i = 0; i<student.length;i++){
//            System.out.print("Enter name: ");
//            names.setName(input.nextLine());
//            student [i] = names.getName();
//            
//        }
//        for(int i = 0; i<student.length;i++){
//            System.out.println(student[i]);
//        }
        
//      Class 2
        StudentData [] student = new StudentData[2];
        
        for (int i = 0; i < student.length ; i++) {
            
            student[i] = new StudentData();
            
            System.out.println("Type id:");
            student[i].setId(input.nextInt());
            
            System.out.println("Type name:");
            student[i].setName(input.next());
            
        }
        
        for(StudentData students: student){
        System.out.println("Name: " + students.getName() + " - ID: " + students.getId());
        }
    }
}
