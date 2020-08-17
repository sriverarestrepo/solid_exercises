package dip.incorrect;

public class UserRepositoryFail {

    public UserFail getUser(int id) {
        //Logica para obtener usuario
        System.out.println("Getting User: " + id);

        return new UserFail(1,"CARLON","Carlos Londono","prueba@prueba.com");
    }

    public void saveUser(UserFail user){
        //Logica para guardar usuario
        System.out.println("Saving User: " + user.getId());

    }

    public void updateUser(UserFail user){
        //Logica para modificar usuario
        System.out.println("Updating User: " + user.getId());

    }

    public void deleteUser(int id){
        //Logica para eliminar usuario
        System.out.println("Deleting User: " + id);

    }


}
