package dip.correct;


public class UserManager {


    public void showUser(){
        UserRepository userRepository = UserFactory.create();
        User user = userRepository.getUser(1);

        System.out.println("ID:       " + user.getId());
        System.out.println("USERNAME: " + user.getUsername());
        System.out.println("NAME:     " + user.getName());
        System.out.println("EMAIL:    " + user.getEmail());

    }
}
