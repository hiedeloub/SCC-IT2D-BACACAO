package bacacao;

import java.util.*;

public class Account {
    
    List<Account> acc;
    private int id;
    private Object username;

    public Account() {
        this.acc = new ArrayList<>();
    }

    Account(String user1, String password123) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    Account(String user1, String password123) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    Account(String user1, String password123) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public void getAccount(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Account Details:");
        
        boolean alreadyExist;
        
        
        do {
            System.out.print("ID: ");
            id = scan.nextInt();
            alreadyExist = false;
            for (Account acc1 : acc) {
                if (acc1.id == id) {
                    System.out.println("This ID already exists. Please enter a different ID.\n");
                    alreadyExist = true;
                    break;
                }
            }   
        } while (alreadyExist);
              
        System.out.print("First Name: ");
        String fs = scan.next();
        System.out.print("Last Name: ");
        String ls = scan.next();
        
        String email;
        do {
            System.out.print("Email: ");
            email = scan.next();
            alreadyExist = false;
            for (Account acc1 : acc) {
                if (!acc1.email.equals(email)) {
                } else {
                    System.out.println("This Email already exists.\n");
                    alreadyExist = true;
                    break;
                }
            }   
        } while (alreadyExist);
        
        String usern;
        do {
            System.out.print("Username: ");
            usern = scan.next();
            alreadyExist = false;
            for (Account acc1 : acc) {
                if (!acc1.username.equals(usern)) {
                } else {
                    System.out.println("This Username already exists.\n");
                    alreadyExist = true;
                    break;
                }
           }   
        } while (alreadyExist);      
        
        String pass;
        boolean validPass;
        do{ 
            System.out.print("Password: ");
            pass = scan.next();
            validPass = this.passwordVerify(pass);
            if(!validPass){
                System.out.println("Invalid Password, Try Again.\n");
            }          
        }while(!validPass);
        
        Accounts temp = new Accounts();
        temp.addAccount(id, fs, ls, email, usern, pass);
        
        
        System.out.println("");
        System.out.printf("%-5s %-15s %-15s %-25s %-15s\n",
                "ID", "First Name", "Last Name", "Email", "Username");
        acc.forEach(Account::viewAccount);
        System.out.println("");
        
    }
    
    public boolean passwordVerify(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        
        if (password.length() < 8){
            return false;
        }
        
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)){
                hasUppercase = true;
            }
            if (Character.isLowerCase(c)){
                hasLowercase = true;
            }
            if (!Character.isLetterOrDigit(c)){
                hasSpecialChar = true;
            }
        }

        return hasUppercase && hasLowercase && hasSpecialChar;
    }

    private void viewAccounts() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void viewAccount() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private class email {

        public email() {
        }
    }

    private class username {

        public username() {
        }
    }
}
