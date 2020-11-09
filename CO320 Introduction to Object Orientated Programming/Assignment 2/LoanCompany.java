import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * A class to store a list of StudentLoan objects.
 * 
 * 
 * @By Dylan Danga Dje Oleko
 */
public class LoanCompany
{
    private ArrayList<StudentLoan> loans;
    private LinkedList<StudentLoan> list;
    //A class is a data type.    
    //Stores a collection of values for student loans.

    /**
     * Constructor for objects of class LoanCompany
     */
    public LoanCompany()
    {
        loans = new ArrayList<>();        
        //Used to set the first value for the student loan.
    }

    public void addLoan(StudentLoan additionalLoan)
    {
        loans.add(additionalLoan);
        //Allows us to add more StudentLoan objects to the loans list.
    }

    public int getNumberOfLoans()
    {
        return loans.size();
        //Lists all the loans.
    }

    public boolean repay(int index, int amount)
    {
        if (index < loans.size() && index >= 0)
        //Index can't be equal loan size and it has to be a positive number
        {            
            StudentLoan currentLoan = loans.get(index);
            //Creates a variable of type StudentLoan called currentLoan. The variable currentLoan is assigned the value
            //loans.get(index).
            //Essentially value on the left becomes the same as the value on the right.
            
            currentLoan.payOff(amount);
            //We always have to create a variable before calling a method from another class.
            //Once we input index for example 1 it gives you the object from the index numbering 1.
            //Think of it like loans.get(index).payOff(amount).
            //We put the amount in and it then uses the payOff method from the studentLoan class.
            
            return true;
        }else{
            return false;
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public StudentLoan removeLoan(int index)
    {
        if(index >= 0 && index < loans.size()) {
            StudentLoan eraseLoan = loans.get(index);
            //Creating called eraseLoan.
            //It is the same thing as the object you are looking at. 
            
            loans.remove(index);
            //We are removing the index that the object belongs to!!!
            
            return eraseLoan;
            //Same thing as returning loans.get(index);
        }else{
            return null;
        }
    }

    public void list()
    {
        for(StudentLoan loanName : loans) {
            System.out.println(loanName.getDetails());
            //.getDetails() calls the method from StudentLoan class.            
            //loanName says every single loan that happens to be of type StudentLoan in the collection loans.
            //This outputs all elements in the loans ArrayList, using a "for-each" loop.
            
            //Limitations of for-each loop
            //1) For-each loops are not appropriate when you want to modify the ArrayList.
            //2) For-each loops do not keep track of index. So we can not obtain ArrayList index using For-Each loop.
            //3) For-each only iterates forward over the ArrayList in single steps.
            //4) For-each cannot process two decision making statements at once.
            //5) It iterates through the entire ArrayList, we can't stop halfway through.
        }
    }

    public void showOutstanding()
    {
        for (StudentLoan loanName : loans) {
            if (loanName.getAmount() != 0){
                System.out.println(loanName.getDetails());  
            }
            //Calls the getAmount method from StudentLoan class.
            //If the amount is equal to zero then the student's detail is printed.
            //!= means not equal to.
        }
    }

    public StudentLoan find(String studentID)
    //Method is of type StudentLoan because you are returning StudentLoan object. If you were returning intger object it would be of type int.
    {
        int index = 0;
        //Creates a local variable call index.
        
        StudentLoan iD;
        //Creating variable called iD of type StudentLoan.
        
        while (index < loans.size())
        //Error checking which makes sure index isn't bigger then the size.
        {
            iD = loans.get(index);
            //iD will be equal to the current object in the list. 
            //So when index is zero then iD will be the object stored in zero.
            
            if (iD.getStudentID().equals(studentID)){
                return iD;
            } else{
                index++;
                //Increments through the list until it finds an object that matches the studentID.
            }
        }
        return null;
        //If it goes through the whole loop and doesn't find a match it returns null.
        //It is essentially a search method as it searches through the list.
    }

    public LinkedList removeClearedLoans()
    {
        list = new LinkedList<>();
        Iterator<StudentLoan> it = loans.iterator();
        //It is an iterate for the loans so it removes from the arraylist
        
        while(it.hasNext()) 
        //It returns true if Iterator has more element to iterate.
        { 
            StudentLoan loan = it.next();
            if(loan.getAmount() == 0){
                list.add(loan);
                //Adding loan to the LinkedList
                
                it.remove();
                //Removes from the array
            }
        }
        return list;
    }
}
