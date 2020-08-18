package dip.correct;


public class UserManagerSecodForm {

    private UserRepository userRepository;

    public UserManagerSecodForm(UserRepository userRepo) {
        this.userRepository = userRepo;
    }

    public void showUser(){
        User user = userRepository.getUser(1);

        System.out.println("ID:       " + user.getId());
        System.out.println("USERNAME: " + user.getUsername());
        System.out.println("NAME:     " + user.getName());
        System.out.println("EMAIL:    " + user.getEmail());

    }
}
