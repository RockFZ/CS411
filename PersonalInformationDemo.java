import java.util.Scanner; 	// imports the package necessary to use the Scanner class.
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class PersonalInformationDemo
   {// START --- search functions
   public static ArrayList<String> getrequirement(){
      Scanner keyboard1 = new Scanner(System.in);
      System.out.println("Please fill in the filter information in order to search for desired partners");
      System.out.println("Lower bound for age:");
      String a = keyboard1.nextLine();
      System.out.println("Upper bound for age:");
      String b = keyboard1.nextLine();
      System.out.println("Gender: (female/male)");
      String c = keyboard1.nextLine();
      System.out.println("City:");
      String d = keyboard1.nextLine();
      System.out.println("Personality: (introvert/extrovert)");
      String e = keyboard1.nextLine();
      ArrayList<String> require = new ArrayList<String>(Arrays.asList(a,b,c,d,e));
      keyboard1.close();
      return require;
   }
      public static ArrayList<String> search_with_filter(ArrayList<PersonalInformation> all_users, 
                                                                      ArrayList<String> requirement)
      {
         ArrayList<String> list_of_qualified_user = new ArrayList<String>();
         for (int i = 0; i< all_users.size(); i++){
            //compare single
            if (all_users.get(i).getSingle() == "not single"){
               break;
            }
            //compare age 
            int low_age = Integer.parseInt(requirement.get(0));
            int high_age = Integer.parseInt(requirement.get(1));
            int user_age = all_users.get(i).getAge();
            if (low_age<=user_age && user_age<=high_age){
            //compare gender 
               if (requirement.get(2).equals(all_users.get(i).getGender())){
            //compare city 
                  if (requirement.get(3).equals(all_users.get(i).getAddress())){
                  //compare personality 
                     if (requirement.get(4).equals(all_users.get(i).getPersonality())){
                        list_of_qualified_user.add(all_users.get(i).getName());
                     }
                  }
               }
            }
         }
         return list_of_qualified_user;
      }

      public static void printtt(String is_search,PersonalInformation person){
         if (is_search.equals("yes")){
            ArrayList<String> requirements = getrequirement();
            ArrayList<PersonalInformation> all_users = new ArrayList<PersonalInformation>() ;
            all_users.add(person);
            ArrayList<String> result = search_with_filter(all_users, requirements);
            System.out.println(result.toString());}
         
            else {System.out.println("Thanks for using JustDate!");}
      }
      // END --- search functions
public static void main(String[] args)
   {
	boolean Single=true;
   String Name;			// Name
   String Address;		// Address
   String Personality;
   String Email;
   String Gender;       
   int Age;					// Age
   Long PhoneNumber;    // Phone number
   boolean membership = false;	
   String is_search;
   Scanner keyboard = new Scanner(System.in);
			// Get the user's name.
   ArrayList<String> names = new ArrayList<String>();
   names.add("Ada");
   names.add("Bob");
   names.add("Cake");
   names.add("Dave");
   ArrayList<String> cities = new ArrayList<String>();
   cities.add("Boston");
   cities.add("New York");
   cities.add("Beijing");
   cities.add("LA");
   ArrayList<String> personalities = new ArrayList<String>();
   personalities.add("Introvert");
   personalities.add("Extrovert");
   ArrayList<String> genders = new ArrayList<String>();
   genders.add("Make");
   personalities.add("Female");
   ArrayList<PersonalInformation> simulated_database = new ArrayList<PersonalInformation>();
   int i = 0;
   while (i < 4){
      String name = names.get(i);
      String city = cities.get(i);
      int randomPersonality = ThreadLocalRandom.current().nextInt(0,1);
      int randomGender = ThreadLocalRandom.current().nextInt(0,1);
      String personality = personalities.get(randomPersonality);
      String gender = genders.get(randomGender);
      int age = ThreadLocalRandom.current().nextInt(18,40);
      long phonenumber = ThreadLocalRandom.current().nextLong(0,999999999);
      PersonalInformation newP = new PersonalInformation(name, city, age, phonenumber, 
                                       "N/A", personality, true, gender, false);
      simulated_database.add(newP);
      i++;
   }
   

   System.out.print("What is your name? ");
   Name = keyboard.nextLine();
   System.out.print("What is your full address? ");
   Address =  keyboard.nextLine();
   System.out.print("One word to desribe your personality:  ");
   Personality = keyboard.nextLine();	
   System.out.print("What is your gender? ");
   Gender = keyboard.nextLine();
   System.out.print("What is your Email Address? ");
   Email = keyboard.nextLine();
   System.out.print("What is your age? ");
   Age = keyboard.nextInt();
   System.out.print("Type your 10-digit phone number: ");
   PhoneNumber = keyboard.nextLong();
   System.out.print("Do you want to search for someone?");
   is_search = keyboard.nextLine();
   
   PersonalInformation person = new PersonalInformation( Name, Address, Age, PhoneNumber, 
                                                            Email, Personality, Single, Gender, false);
                                                            printtt(is_search, person);                                            
                                                           
   System.out.println("Your name is " + person.getName());
   System.out.println("Your gender is " + person.getGender());
   System.out.println("Your address is " + person.getAddress());			
   System.out.println("Your age is " + person.getAge());		
   System.out.println("Your phone number is " + person.getPhoneNumber());
   System.out.println("Your personality is " + person.getPersonality());
   System.out.println("Your email address is " + person.getEmail());
   System.out.println("Your single statue is " + person.getSingle());
   System.out.println("Congradulation! you are now official a user of JustDate!");
   System.out.println("Do you want to search for someone?");
   is_search = keyboard.nextLine();
                        printtt(is_search, person);
   
   }					
}