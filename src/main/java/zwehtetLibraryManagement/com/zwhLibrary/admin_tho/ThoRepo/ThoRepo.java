package zwehtetLibraryManagement.com.zwhLibrary.admin_tho.ThoRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zwehtetLibraryManagement.com.zwhLibrary.admin_tho.THo.Tho;

@Repository
public interface ThoRepo  extends JpaRepository<Tho, Long> {
    
}
