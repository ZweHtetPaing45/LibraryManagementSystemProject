package zwehtetLibraryManagement.com.zwhLibrary.admin_ten.tenService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import zwehtetLibraryManagement.com.zwhLibrary.admin_ten.ten.ten;
import zwehtetLibraryManagement.com.zwhLibrary.admin_ten.tenRepo.tenRepo;

@Service
public class tenService {

    @Autowired
    private tenRepo tenrepo;

    public void saveTen(MultipartFile file) throws IOException{
        ten ten=new ten();
        ten.setName(file.getOriginalFilename());
        ten.setType(file.getContentType());
        ten.setData(file.getBytes());
        tenrepo.save(ten);
    }

}
