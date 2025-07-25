package zwehtetLibraryManagement.com.zwhLibrary.admin_three.threeService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import zwehtetLibraryManagement.com.zwhLibrary.admin_three.three.three;
import zwehtetLibraryManagement.com.zwhLibrary.admin_three.threeRepo.threeRepo;

@Service
public class threeService {

    @Autowired
    private threeRepo threerepo;

     public void saveThree(MultipartFile file) throws IOException{
        three three=new three();
        three.setName(file.getOriginalFilename());
        three.setType(file.getContentType());
        three.setData(file.getBytes());
        threerepo.save(three);
    }

}
