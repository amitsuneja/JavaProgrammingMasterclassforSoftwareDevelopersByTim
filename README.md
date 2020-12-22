# JavaProgrammingMasterclassforSoftwareDevelopersByTim
This Repo is to for Java Basics .
Udmey Course Java Programming Master Class For Software Developers By Tim


Tip:
ArrayList will only contain object . You cant create 

ArrayList<int> numbersInArrayList = new ArrayList<int>
  
This is incorrect. 

Instead create a class which have int variable and then create object  of call using its consutructor and store it in ArrayList.

Public class myIntClass {
  
  // declaring class variables
  Private int myIntVar;
  
  // Creating constuctor
  Public myIntClass(int myIntVar){
         this.myIntVar = myIntVar;
  }
  
  
  // create setter
  Public setmyIntVar(int myIntVar){
        this.myIntVar = myIntVar
  }


}


