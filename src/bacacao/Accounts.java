package bacacao;

class Accounts {
    int id;
    String firstName;
    String lastName;
    String email;
    String username;
    String password;
    
    public void addAccounts(int id, String fs, String ls, String email, String usern, String pass){
        this.id = id;
        this.firstName = fs;
        this.lastName = ls;
        this.email = email;
        this.username = usern;
        this.password = pass;
    }
    
    public void viewAccounts(){
        System.out.printf("%-5d %-15s %-15s %-30s %-15s\n",
                this.id, this.firstName, this.lastName, this.email, this.username);
    }      

    void addAccount(Account account) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addAccount(int id, String fs, String ls, String email, String usern, String pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}