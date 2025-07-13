package zwehtetLibraryManagement.com.zwhLibrary.admin_six.sixService;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import zwehtetLibraryManagement.com.zwhLibrary.admin_six.six.six;
import zwehtetLibraryManagement.com.zwhLibrary.admin_six.sixRepo.sixRepo;

@Service
public class sixService {

    @Autowired
    private sixRepo sixrepo;

    public void saveSix(MultipartFile file) throws IOException{
        six six=new six();
        six.setName(file.getOriginalFilename());
        six.setType(file.getContentType());
        six.setData(file.getBytes());
        sixrepo.save(six);
    }
}
