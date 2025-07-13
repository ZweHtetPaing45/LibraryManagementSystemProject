package zwehtetLibraryManagement.com.zwhLibrary.admin_tho.ThoService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import zwehtetLibraryManagement.com.zwhLibrary.admin_tho.THo.Tho;
import zwehtetLibraryManagement.com.zwhLibrary.admin_tho.ThoRepo.ThoRepo;

@Service
public class ThoService {

    @Autowired
    private ThoRepo thoRepo;

     public void saveTho(MultipartFile file) throws IOException{
        Tho tho=new Tho();
        tho.setName(file.getOriginalFilename());
        tho.setType(file.getContentType());
        tho.setData(file.getBytes());
        thoRepo.save(tho);
    }

}
