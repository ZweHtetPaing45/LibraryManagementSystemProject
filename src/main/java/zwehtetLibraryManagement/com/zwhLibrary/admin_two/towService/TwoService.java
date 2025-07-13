package zwehtetLibraryManagement.com.zwhLibrary.admin_two.towService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import zwehtetLibraryManagement.com.zwhLibrary.admin_two.two.Two;
import zwehtetLibraryManagement.com.zwhLibrary.admin_two.twoRepo.TwoRepo;

@Service
public class TwoService {

    @Autowired
    private TwoRepo twoRepo;

     public void saveTwo(MultipartFile file) throws IOException{
        Two two=new Two();
        two.setName(file.getOriginalFilename());
        two.setType(file.getContentType());
        two.setData(file.getBytes());
        twoRepo.save(two);
    }

}