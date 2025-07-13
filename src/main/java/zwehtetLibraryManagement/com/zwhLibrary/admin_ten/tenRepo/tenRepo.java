package zwehtetLibraryManagement.com.zwhLibrary.admin_ten.tenRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zwehtetLibraryManagement.com.zwhLibrary.admin_ten.ten.ten;

@Repository
public interface tenRepo extends JpaRepository<ten, Long> {

}
