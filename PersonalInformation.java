public class PersonalInformation
   {
      private String name; 				// Name
      private String address; 			// Address
      private int age; 			  			// Age
      private Long phonenumber;			// Phone number   
      private String email;             //email
      private String personality ; //personality
      private boolean single ;       //single status
      private String gender;
      private Boolean membership;
      PersonalInformation(String Name, String Address, int Age, Long PhoneNumber,
                          String Email,String Personality, boolean Single, String Gender,Boolean Memebership)
      {
         name = Name;
         address = Address;
         age = Age;
         phonenumber = PhoneNumber;
         email=Email;
         personality= Personality;
         single= Single;
         gender = Gender;
         membership = Memebership;
      }
      public String getName()
      {
      		
      
         return name;
      }
   	
   
   
      public String getAddress()
      {
        
         return address;
      
      }
   
   
      public int getAge()
      {
      
      
         return age;
      }
   
   
      public long getPhoneNumber()
      {
      
         return phonenumber;
      }
      
   
      public String getEmail()
      {
      
      
         return email;

      }
       
   
      public String getPersonality()
      {
      
      
         return personality;
      }
      public String getGender()
      {
         return gender;
      }
       
      public String getSingle()
      {
      if(single) {
        return "single";}
        return "not single";
        
      }

      public boolean getMembership()
      {
      		
      
         return membership;
      }
   }