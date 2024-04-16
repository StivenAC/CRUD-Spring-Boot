package CRUD_Prueba.Expo.repositories;

import CRUD_Prueba.Expo.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long> {


}
