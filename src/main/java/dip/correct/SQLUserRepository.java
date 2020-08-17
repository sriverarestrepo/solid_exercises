package dip.correct;


public class SQLUserRepository implements UserRepository{

    public User getUser(int id) {
        //Logica para obtener usuario
        System.out.println("Getting User: " + id);

        return new User(1,"CARLON","Carlos Londono","prueba@prueba.com");
    }

    public void saveUser(User user){
        //Logica para guardar usuario
        System.out.println("Saving User: " + user.getId());

    }

    public void updateUser(User user){
        //Logica para modificar usuario
        System.out.println("Updating User: " + user.getId());

    }

    public void deleteUser(int id){
        //Logica para eliminar usuario
        System.out.println("Deleting User: " + id);

    }


}
