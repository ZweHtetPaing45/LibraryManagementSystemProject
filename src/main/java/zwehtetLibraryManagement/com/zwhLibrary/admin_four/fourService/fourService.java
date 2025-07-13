package zwehtetLibraryManagement.com.zwhLibrary.admin_four.fourService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import zwehtetLibraryManagement.com.zwhLibrary.admin_four.four.four;
import zwehtetLibraryManagement.com.zwhLibrary.admin_four.fourRepo.fourRepo;

@Service
public class fourService {

    @Autowired
    private fourRepo fourrepo;

    
     public void saveFour(MultipartFile file) throws IOException{
        four four=new four();
        four.setName(file.getOriginalFilename());
        four.setType(file.getContentType());
        four.setData(file.getBytes());
        fourrepo.save(four);
    }

}
