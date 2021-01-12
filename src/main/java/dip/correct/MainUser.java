package dip.correct;

public class MainUser {


    public static void main(String[] args) {
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        showUserFromLocalRepo();

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        showUserFromRemoteRepo();

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        showUserFromSQLRepo();
    }


    private static void showUserFromLocalRepo(){
        UserManagerSecodForm userManagerSecodForm = new UserManagerSecodForm(new LocalUserRepository());
        userManagerSecodForm.showUser(1);
    }

    private static void showUserFromRemoteRepo(){
        UserManagerSecodForm userManagerSecodForm = new UserManagerSecodForm(new RemoteUserRepository());
        userManagerSecodForm.showUser(1);
    }

    private static void showUserFromSQLRepo(){
        UserManagerSecodForm userManagerSecodForm = new UserManagerSecodForm(new SQLUserRepository());
        userManagerSecodForm.showUser(2);
    }
}
