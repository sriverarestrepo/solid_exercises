package dip.incorrect;

public class UserManagerFail {


    public void showUser(){
        UserRepositoryFail userRepo = new UserRepositoryFail();
        UserFail user = userRepo.getUser(1);

        System.out.println("ID:       " + user.getId());
        System.out.println("USERNAME: " + user.getUsername());
        System.out.println("NAME:     " + user.getName());
        System.out.println("EMAIL:    " + user.getEmail());

    }
}
