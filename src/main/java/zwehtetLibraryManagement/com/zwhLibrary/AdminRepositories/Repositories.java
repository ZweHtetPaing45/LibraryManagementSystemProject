package zwehtetLibraryManagement.com.zwhLibrary.AdminRepositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zwehtetLibraryManagement.com.zwhLibrary.AdminLogin.LoginAdmin;

@Repository
public interface Repositories extends JpaRepository<LoginAdmin, Long> {

    Optional<LoginAdmin> findByUsername(String username);

}
