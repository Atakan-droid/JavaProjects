package atakandroid.hrms.core.utilities.imageService.cloudinary;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class ClaudinaryService {

	 Cloudinary cloudinary;
	    private Map<String,String> valuesMap=new HashMap<>();

	    public ClaudinaryService(){
	        valuesMap.put("cloud_name","ddnscmo6g");
	        valuesMap.put("api_key", "596729127544394");
	        valuesMap.put("api_secret","Ig6ghveKrCu8KY5qb0D1faMjQnk");
	        cloudinary=new Cloudinary(valuesMap);
	    }

	    public Map upload(MultipartFile multipartFile) throws IOException{
	        File file= convert(multipartFile);
	        Map result=cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
	        file.delete();
	        return result;
	    }

	    public Map delete(String id) throws IOException{
	        Map result= cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
	        return result;
	    }

	    public File convert(MultipartFile multipartFile) throws IOException {
	        File file=new File(multipartFile.getOriginalFilename());
	        FileOutputStream stream=new FileOutputStream(file);
	        stream.write(multipartFile.getBytes());
	        stream.close();
	        return file;
	    }
}
